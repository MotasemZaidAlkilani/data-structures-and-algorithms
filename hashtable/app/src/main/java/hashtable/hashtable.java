package hashtable;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.Objects;

public class hashtable<K,V> {
    private ArrayList<hashNode<K, V>> bucketArray;
    int buckets;
    int size;

    hashtable() {
        bucketArray = new ArrayList<>();
        buckets = 10;

        for (int i = 0; i < buckets; i++) {
            bucketArray.add(null);
        }
    }


    int hashCode(K key) {
        return Objects.hashCode(key);
    }
    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);
        int arrayIndex = hashCode % buckets;

        if (arrayIndex < 0) {
            arrayIndex = arrayIndex * -1;
        }

        System.out.println("The index of => " + key + " is => " + arrayIndex);

        return arrayIndex;
    }
    public void set(K key, V value) {


        // find the index of where we should put the value in
        // the bucket array
        int index = getBucketIndex(key);
        int hashcode = hashCode(key);

        // create head and make it point to where the index is
        hashNode<K, V> head = bucketArray.get(index);

        hashNode<K, V> newNode = new hashNode<>(key, value, hashcode);


        if (head == null) {
            bucketArray.set(index, newNode);
        } else {
            newNode.setNext(head.getNext());
            head.setNext(newNode);
        }
        size++;

        // If load factor goes beyond threshold, then
        // double hash table size
        if ((1.0 * size) / buckets >= 0.7) {
            ArrayList<hashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            buckets = 2 * buckets;
            size = 0;
            for (int i = 0; i < buckets; i++)
                bucketArray.add(null);

            for (hashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    set(headNode.getKey(), headNode.getValue());
                    headNode = headNode.getNext();
                }
            }
        }
    }
    public String get(K key) {
        boolean KeyNoExistsYet = true;
        for (int i = 0; i < bucketArray.size() && KeyNoExistsYet; i++) {
            if (bucketArray.get(i) != null) {
                hashNode pointer = bucketArray.get(i);
                boolean condition = true;
                while (condition) {
                    if (pointer.getKey() == key) {
                        condition = false;
                        KeyNoExistsYet = false;
                        return pointer.getValue().toString();
                    } else if (pointer.getNext() == null) {
                        condition = false;

                    }
                    pointer = pointer.getNext();


                }
            }


        }
        return "null";
    }
    public boolean contains(K key) {
        boolean KeyNoExistsYet = true;
        for (int i = 0; i < bucketArray.size() && KeyNoExistsYet; i++) {
            if (bucketArray.get(i) != null) {
                hashNode pointer = bucketArray.get(i);
                boolean condition = true;
                while (condition) {
                    if (pointer.getKey() == key) {
                        condition = false;
                        KeyNoExistsYet = false;
                        return true;
                    } else if (pointer.getNext() == null) {
                        condition = false;

                    }
                    pointer = pointer.getNext();


                }
            }


        }
        return false;
    }
    public String keys() {
        String result = "";
        for (int i = 0; i < bucketArray.size(); i++) {
            if (bucketArray.get(i) != null) {
                hashNode pointer = bucketArray.get(i);
                boolean condition = true;
                result = result + "BUCKET " + i + "=[";
                int j = 0;
                while (condition) {
                    if (j == 0) {
                        result = result + pointer.getKey() + ":" + pointer.getValue();
                        j++;
                    } else {
                        result = result + "-->" + pointer.getKey() + ":" + pointer.getValue();
                        j++;
                    }
                    if (pointer.getNext() == null) {
                        condition = false;
                        result = result + "]" + "\n";
                    }
                    pointer = pointer.getNext();

                }
            }


        }
        return result;
    }
    public int hash(K key) {
        int result = -1;
        boolean KeyNoExistsYet = true;
        for (int i = 0; i < bucketArray.size() && KeyNoExistsYet; i++) {
            if (bucketArray.get(i) != null) {
                hashNode pointer = bucketArray.get(i);
                boolean condition = true;
                while (condition) {
                    if (pointer.getKey() == key) {
                        condition = false;
                        KeyNoExistsYet = false;
                        return i;
                    }

                    if (pointer.getNext() == null) {
                        condition = false;
                    }
                    pointer = pointer.getNext();

                }
            }


        }
        return result;
    }
    public String AllUniqueKeys() {
        String result = "";
        for (int i = 0; i < bucketArray.size(); i++) {
            if (bucketArray.get(i) != null) {
                hashNode pointer = bucketArray.get(i);
                boolean condition = true;
                    result = result + "BUCKET " + i + "=[";
                int j = 0;
                while (condition) {
                    if(keyCount((K) pointer.getKey())==1) {

                        if (j == 0) {
                            result = result + pointer.getKey() + ":" + pointer.getValue();
                            j++;
                        } else {
                            result = result + "-->" + pointer.getKey() + ":" + pointer.getValue();
                            j++;
                        }
                    }
                    if (pointer.getNext() == null) {
                        condition = false;
                        result = result + "]" + "\n";
                    }
                    pointer = pointer.getNext();

                }
            }


        }
        return result;
    }
    public int keyCount(K key) {
        int count = 0;
        hashNode pointer = bucketArray.get(getBucketIndex(key));
        boolean condition = true;
        while (condition) {
            if (pointer.getKey() == key) {
                count = count + 1;
            }
            if (pointer.getNext() == null) {
                condition = false;

            }
            pointer = pointer.getNext();


        }
        return count;


    }
}

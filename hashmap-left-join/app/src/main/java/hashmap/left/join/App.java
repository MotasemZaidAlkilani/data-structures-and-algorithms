/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashmap.left.join;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class App {


    public static void main(String[] args) {



    }



    static ArrayList left_join(HashMap firstHashMap, HashMap secondHashMap) {

        ArrayList theFinalResult = new ArrayList();

        for (Object FirstkeyHash : firstHashMap.keySet()) {


                if (secondHashMap.containsKey(FirstkeyHash)) {

                    String[] array =
                            {FirstkeyHash.toString(), firstHashMap.get(FirstkeyHash).toString(), secondHashMap.get(FirstkeyHash).toString()};
                    theFinalResult.add(array);
                }else {
                    String[] array =
                            {FirstkeyHash.toString(), firstHashMap.get(FirstkeyHash).toString(), "null"};
                    theFinalResult.add(array);

                }

        }
        return theFinalResult;
    }
}


public class app {
    public static void main(String[] args) {

    }

    public static String repeated_word(String sentence) {
        String result="";
        int indexMinumum=100;
        String []sentence_divide=sentence.split(" ");
        for(int i=0;i<sentence_divide.length;i++){
            int currentIndex;
            for(int j=0;j<sentence_divide.length;j++){

                if(sentence_divide[i].toLowerCase().replaceAll("[^a-zA-Z0-9]","")
                        .matches(sentence_divide[j].toLowerCase().replaceAll("[^a-zA-Z0-9]",""))&&i!=j){
                    if(j>i){
                        currentIndex=j;
                    }
                    else{
                        currentIndex=i;

                    }
                    if(indexMinumum>currentIndex){//100//19>7
                        result=sentence_divide[i].toLowerCase().replaceAll("[^a-zA-Z0-9]","");//was//summer
                        indexMinumum=currentIndex;//19//7

                    }
                    break;
                }

            }

        }
    return result;
    }
}
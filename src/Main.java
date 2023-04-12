import java.util.*;

public class Main {
    public static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    public static String str = "За свою карьеру я пропустил более 9000 бросков, проиграл почти 300 игр. " +
            "26 раз мне доверяли сделать финальный победный бросок, и я промахивался. " +
            "Я терпел поражения снова, и снова, и снова. И именно поэтому я добился успеха.";

    public static String dbl = "Собирала Маргарита маргаритки на горе, " +
            "Растеряла Маргарита маргаритки во дворе";

    public static void main(String[] args) {
        printOddNumbers(nums);
        System.out.println();
        printUniqueEvenNumbers(nums);
        System.out.println();
        printUniqueWords(str);
        System.out.println();
        countOfRepetition(dbl);
    }

    public static void printOddNumbers(List<Integer> integerList){
        for(int i=0; i<integerList.size(); i++){
            if(integerList.get(i)%2!=0){
                if(i!=integerList.size()-1) {
                    System.out.print(integerList.get(i) + " ");
                } else{
                    System.out.print(integerList.get(i));
                }
            }
        }
    }

    public static void printUniqueEvenNumbers(List<Integer> integerList){
        Set<Integer>evenList = new TreeSet<>();
        for (Integer integer : integerList) {
            if (integer % 2 == 0) {
                evenList.add(integer);
            }
        }
        System.out.println(evenList);
    }

    public static void printUniqueWords(String s){
        String lowerS = s.toLowerCase();
        Set<String> wordsSet = new HashSet<>(List.of(lowerS.split("[\\s,.]")));
        System.out.println(wordsSet);
    }

    public static void countOfRepetition(String s){
        String lowerS = s.toLowerCase();
        Map<String,Integer> wordsMap = new HashMap<>();
        List<String> allWordsList = new ArrayList<> (List.of(lowerS.split("[\\s,.]")));
        for (String item : allWordsList) {
            if (!wordsMap.containsKey(item)) {
                wordsMap.put(item, 1);
            } else {
                int value = wordsMap.get(item);
                value++;
                wordsMap.put(item, value);
            }
        }

        for(int num: wordsMap.values()){
            if(num>1){
                System.out.print(num + " ");
            }
        }
    }
}
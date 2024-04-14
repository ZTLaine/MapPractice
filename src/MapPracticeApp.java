import java.util.*;

public class MapPracticeApp {
    public static void main(String[] args) {
        final String SOUGHT_HAND = "FLUSH";
        FileService fileService = new FileService();
        List<String> pokerHandList = fileService.populateSet(new ArrayList<>());
        pokerHandList = fileService.populateSet(pokerHandList);
        Map<String, Integer> pokerMap = new HashMap<>();
        for(String line:pokerHandList){
            String player = line.split(",")[0];
            String hand = line.split(",")[1];
            if(pokerMap.containsKey(player)){
                if(hand.contains(SOUGHT_HAND)){
                    pokerMap.compute(player, (k, v) -> v + 1);
                }
            }
            else{
                if(hand.contains(SOUGHT_HAND)){
                    pokerMap.put(player,1);
                }
                else{
                    pokerMap.put(player,0);
                }

            }


        }
        System.out.println(pokerMap);
    }
}

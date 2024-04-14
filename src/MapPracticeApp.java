import java.util.ArrayList;
import java.util.List;

public class MapPracticeApp {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        List<String> pokerHands = fileService.populateSet(new ArrayList<>());
//        pokerHands = fileService.populateSet(pokerHands);

    }
}

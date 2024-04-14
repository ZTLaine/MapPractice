import java.io.*;
import java.util.*;

public class FileService {
    private String FILE_NAME = "PokerHands.csv";

    public List<String> populateSet(List<String> list){
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))){
            String[] row = new String[2];

            //yeet the header into the abyss from whence it came
            br.readLine();
            while((row[0] = br.readLine()) != null) {
//                row = row[0].split(",");
                list.add(row[0]);
            }
        }
        catch (IOException e){
            System.out.println("File not found: " + e.getMessage());
        }
        return list;
    }
}
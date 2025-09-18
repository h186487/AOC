
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;



//checksum = twice * trice

//bababc =+ twice & trice
//abbcde += twice
//abcccd += trice
//aabcdd += twice
//abcdee += twice
//ababab += trice

public class dayTwoPartOne{

    public static void main(String[] args){
        try {
            List<String> lines = Files.readAllLines(Paths.get("dayTwo.txt"));
            contains(lines);
            System.out.println("Checksum = " + twice * trice);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    static int twice = 0, trice = 0;

    public static void contains(List<String> lines){
        for (String line : lines){
            HashMap<Character, Integer> frequencyMap = new HashMap<>();
            for (char letter : line.toCharArray()){
                int count = frequencyMap.getOrDefault(letter, 0);
                frequencyMap.put(letter, count + 1);


            }
            boolean containsTwice = false, containsTrice = false;

            for (int count : frequencyMap.values()){
                if (count == 2){
                    containsTwice = true;
                } else if (count == 3){
                    containsTrice = true;
                }
            }

            if (containsTwice){
                twice++;
            }
            if(containsTrice){
                trice++;
            }
        }
    }  
}
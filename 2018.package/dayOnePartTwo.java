import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;

public class dayOnePartTwo {
    public static void main (String[] args){

        try {    

            List<String> lines = Files.readAllLines(Paths.get("dayOne.txt"));
            HashSet<Integer> seenFrequencies = new HashSet<>();
            int currentFrequency = 0;

            while (true) { 
                
                for (String line : lines){
                    currentFrequency += Integer.parseInt(line.trim());
                    if (seenFrequencies.contains(currentFrequency)){
                        System.out.println("First repeated frequency: " + currentFrequency);
                        return;
                    } else {
                        seenFrequencies.add(currentFrequency);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


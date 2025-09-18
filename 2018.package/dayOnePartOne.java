import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class dayOnePartOne {
    public static void main (String[] args){

        try {

        List<String> lines = Files.readAllLines(Paths.get("dayOne.txt"));

        int frequency = 0;
        for (String line : lines){
            frequency += Integer.parseInt(line.trim());
        }
        System.out.println("Frequency: " + frequency);
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
            
    }
}
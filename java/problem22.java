import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class problem22 {
    public static String readNames() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("c:/Users/James/workspace/HelloWorld/src/p022_names.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;
            br.close();
            return line;
        }
        br.close();
        return "";
    }
    
    public static int alphabetValue(char c) {
    	return c - 'A' + 1; 
    }
    
    public static int nameScore(String name, int position) {
    	int nameScore = 0;
    	for(int i = 0; i < name.length(); i++) {
    		nameScore += alphabetValue(name.charAt(i));
    	}
    	return position * nameScore;
    }
    
    public static void main(String[] args) {
    	String namesStr = "";
		double sumNameScore = 0;
		try {
			namesStr = readNames();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	String[] names = namesStr.split(",");
    	Arrays.sort(names);
    	for(int i = 0; i < names.length; i++) {
    		names[i] = names[i].replaceAll("\"", "");
    		sumNameScore += nameScore(names[i], i+1);
    	}
    	System.out.printf("ans: %f\n", sumNameScore);
    	
    	
    }
}
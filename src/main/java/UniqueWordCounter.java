import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordCounter {

    public static void main(String[] args) throws IOException {
        String[] words = FileUtils.readFileToString(new File("src/main/resources/input.txt"), "UTF-8").toLowerCase().split("\\W+");
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        FileUtils.writeStringToFile(new File("src/main/resources/output.txt"), "Unique words count: " + uniqueWords.size(), "UTF-8");
    }
}

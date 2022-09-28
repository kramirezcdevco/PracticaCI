package KarenRamirez;

import org.karenramirez.practicaci.counter.WordCounter;
import org.karenramirez.practicaci.model.Summary;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class pruebasmell implements WordCounter {
    @Override
    public Summary process(String pathFile) throws IOException{

        Path path = Paths.get(pathFile);
        long numberOfLines = Files.lines(path).count();
        long numberOfWords = Files.lines(path).map(line -> line.split(" ")).mapToInt(wordsOfLine -> wordsOfLine.length).sum();

        return new Summary(numberOfLines, numberOfWords);
    }

}

package org.karenramirez.practicaci.counter;

import org.karenramirez.practicaci.model.Summary;

import java.io.IOException;

public interface WordCounter {
    Summary process (String pathFile) throws IOException;
}

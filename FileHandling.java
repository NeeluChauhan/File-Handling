package FIleHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import static java.nio.file.Files.*;

public class FileHandling {

    public static void main(String[] args) {
        Path destination= Path.of("StudentMove.txt");
        try {
            Files.deleteIfExists(Path.of("StudentCopy.txt"));
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

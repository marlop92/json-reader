package pl.mlopatka;

import com.fasterxml.jackson.databind.ObjectMapper;
import pl.mlopatka.model.Upper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Path path = Paths.get(".\\src\\main\\resources\\simple.json");
        Upper upper = mapper.readValue(path.toFile(), Upper.class);
        System.out.println(upper);
    }
}

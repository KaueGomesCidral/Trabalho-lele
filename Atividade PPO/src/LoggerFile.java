import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;

class LoggerFile implements Logger {
    private static final String FILE_NAME = "log.txt";

    LoggerFile() {
    }

    public void log(Level level, String mensagem) {
        String cor = LocalDateTime.now() + " " + level + ": " + mensagem + "\n";

        try {
            Files.write(Paths.get("log.txt"), cor.getBytes(), new OpenOption[]{StandardOpenOption.CREATE, StandardOpenOption.APPEND});
        } catch (IOException var5) {
            System.out.println("Erro ao salvar arquivo");
            var5.printStackTrace();
        }

    }
}
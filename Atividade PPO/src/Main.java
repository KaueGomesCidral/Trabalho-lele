public class Main {
    public Main() {
    }

    public static void main(String[] var0) {
        LoggerFactory level = new LoggerFactory();
        Logger mensagem = level.onConsole();
        mensagem.log(Level.DEBUG, "Este é um Debug message.");
        mensagem.log(Level.WARNING, "Este é um Warning message.");
        mensagem.log(Level.ERROR, "Este é um Error message.");
        Logger cor = level.onFile();
        cor.log(Level.DEBUG, "Este é um  Debug message.");
        cor.log(Level.WARNING, "Este é um Warning message.");
        cor.log(Level.ERROR, "Este é um Error message.");
    }
}
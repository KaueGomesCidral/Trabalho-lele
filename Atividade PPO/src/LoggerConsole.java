class LoggerConsole implements Logger {
    LoggerConsole() {
    }

    public void log(Level level, String mensagem) {
        String cor;
        switch (level) {
            case DEBUG:
                cor = "\u001b[32m";
                break;
            case WARNING:
                cor = "\u001b[33m";
                break;
            case ERROR:
                cor = "\u001b[31m";
                break;
            default:
                cor = "\u001b[0m";
        }

        System.out.println(cor + level + ": " + mensagem + "\u001b[0m");
    }
}
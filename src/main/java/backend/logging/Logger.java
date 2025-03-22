package main.java.backend.logging;

public class Logger implements LoggerInterface {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";

    @Override
    public void log(String string) {
        System.out.println("[log] > " + string);
    }

    @Override
    public void err(Exception e) {
        System.err.println(ANSI_RED + "\n[ERROR] > " + e.getMessage() + "\n > " + e.getCause() + ANSI_RESET);
    }

    @Override
    public void dbg(String string) {
        System.out.println(ANSI_GREEN + "[debug] >>> " + string + "\n" + ANSI_RESET);
    }
}

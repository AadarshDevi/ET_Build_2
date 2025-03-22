package main.java.backend.logging;

public class ConsoleLogger extends Logger {

    public void log(Object object, String string) {
        System.out.println("[log:" + object.getClass() + "] > " + string);
    }

    public void err(Object object, Exception e) {
        System.err.println(Logger.ANSI_RED + "\n[ERROR:" + object.getClass() + "] > " + e.getMessage() + "\n > "
                + e.getCause() + "\n" + Logger.ANSI_RESET);
    }

    public void dbg(Object object, String string) {
        System.out.println(Logger.ANSI_GREEN + "[debug:" + object.getClass() + "] >>> " + string + "\n"
                + Logger.ANSI_RESET);
    }

}

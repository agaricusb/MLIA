package net.minecraft.crash;

public class CrashReport {
    private String message;
    private Throwable throwable;

    public CrashReport(String message, Throwable throwable) {
        this.message = message;
        this.throwable = throwable;
    }

    public String toString() {
        return "CrashReport: " + this.message + ", throwable = " + this.throwable;
    }
}

package se.somath.pickled;

import org.apache.maven.plugin.logging.Log;

public class Main {
    private Log log;

    public Main(Log log) {
        this.log = log;
    }

    public void publish() {
        log.info("Publish the Living Documentation");
    }
}
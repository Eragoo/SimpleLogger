package com.yevheniikukhol.Logger.Loggers;

import com.yevheniikukhol.Logger.Behaviours.SimpleLogBehaviour;
import com.yevheniikukhol.Logger.Logger;

public class SimpleLogger extends Logger {

    public SimpleLogger(String pathToFile) {
        this.logBehaviour = new SimpleLogBehaviour();
        this.pathToFile = pathToFile;
    }

    public void startLogging(String text) {
        this.logBehaviour.write(this.pathToFile, text);
    }
}

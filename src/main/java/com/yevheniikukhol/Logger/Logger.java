package com.yevheniikukhol.Logger;

import com.yevheniikukhol.Logger.Behaviours.SimpleLogBehaviour;
import com.yevheniikukhol.Logger.interfaces.LogBehaviour;

public class Logger {
    protected String pathToFile;
    protected LogBehaviour logBehaviour;

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public void setLogBehaviour(LogBehaviour logBehaviour) {
        this.logBehaviour = logBehaviour;
    }

}
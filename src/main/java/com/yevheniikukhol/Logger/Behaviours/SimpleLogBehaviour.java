package com.yevheniikukhol.Logger.Behaviours;

import com.yevheniikukhol.Logger.interfaces.LogBehaviour;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleLogBehaviour implements LogBehaviour{

    @Override
    public void write(String pathToFile, String str) {
        System.out.println("Changes recorded...");
        writeToFile(pathToFile, str);
    }

    private void writeToFile(String file, String text){
        try(FileWriter writer = new FileWriter(file, true)){
            writer.write(formatData(text));
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }

    private String formatData(String text) {
        String header = "At:\n" + getDate();
        String content = "Content: \n" + text;
        String separator = "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@";

        return header + "\n" + content + "\n\n" + separator + "\n\n";
    }

    public String getDate() {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }


}
package com.microoffice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class WordGenerationApp {
	public static void main(String[] args) {
		String[] configfile = readConfigurationFromFile("testlist.txt");

        for (String wordGeneration : configfile) {
            AbstractWordFactory fctry = null; 

            int cnt = SingletonValidator.getNumberOfInstances(wordGeneration);

            if (wordGeneration.equals("Word90")) {
                fctry = new Word90Factory();
            } else if (wordGeneration.equals("Word00")) {
            	fctry = new Word00Factory(); 
            }else if (wordGeneration.equals("Word10")) {
            	fctry = new Word10Factory(); 
            }else if (wordGeneration.equals("Word21")) {
            	fctry = new Word21Factory(); 
            }
            
            if (fctry != null) {
                AbstractPanel panel = fctry.makePanel();
                AbstractButton button = fctry.makeButton();
                AbstractTextbox textbox = fctry.makeTextbox();

                panel.display();
                button.display();
                textbox.display();
            }
        }
    }
	
	private static String[] readConfigurationFromFile(String fileName) {
        List<String> configList = new ArrayList<>();
        
        InputStream in = null;
		try {
			in = WordGenerationApp.class.getResourceAsStream("/resources/"+fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        InputStreamReader streamReader = new InputStreamReader(in, StandardCharsets.UTF_8);

        try (BufferedReader br = new BufferedReader(streamReader)) {
            String line;
            while ((line = br.readLine()) != null) {
                configList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return configList.toArray(new String[0]);
    }
}

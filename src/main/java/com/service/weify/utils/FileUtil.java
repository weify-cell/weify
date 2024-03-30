package com.service.weify.utils;

import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class FileUtil {

    public static Set<String> readWordList(String path){
        Set<String> wordSet = new HashSet<>();
        try{
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8);

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line = "";
            while ( (line =  bufferedReader.readLine()) != null){
                wordSet.add(line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return wordSet;
    }
}

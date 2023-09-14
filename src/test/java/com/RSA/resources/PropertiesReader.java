package com.RSA.resources;

import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Objects;
import java.util.Properties;

public class PropertiesReader {
    static Properties prop=null;
    static FileInputStream fis=null;
    static HashMap<String, String> PROP_KV = new HashMap<>();

    static{
        String path = System.getProperty("user.dir")+"/src/test/java/com/RSA/resources/global.properties";

        try{
            prop = new Properties();
            fis = new FileInputStream(new File(path));
            prop.load(fis);

            for(Object key: prop.keySet()){
                PROP_KV.put(String.valueOf(key),prop.getProperty(String.valueOf(key)));
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                if(Objects.nonNull(fis)){
                    fis.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static String getValue(String key) throws Exception {
        if(prop.getProperty(key)!=null&&key!=null)
                return prop.getProperty(key);
        else
            throw new Exception("Property not found!!");
    }

}

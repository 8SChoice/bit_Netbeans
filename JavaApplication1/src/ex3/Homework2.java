/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import java.io.File;

/**
 *
 * @author BIT-USER
 */
public class Homework2 {
    public String Homework3(String path) {
       
        String dirName = path;
        File dir = new File(dirName);
        StringBuffer res= new StringBuffer();
        File[] files2 = dir.listFiles();
        
        try {
            for(File f: files2){
            String str = f.getAbsolutePath();
            
       
            if(f.isDirectory()){
                res.append("[Directory]=>"+str+"\n");
            }else{ 
                res.append("[File]=>"+str+"\t"+"\n");
                }
               
            }
            
        } catch (Exception e) {
            return "틀린경로";
        }
        
           
        
        return res.toString();
       
    }
    
}

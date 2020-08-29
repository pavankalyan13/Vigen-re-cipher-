
/**
 * Write a description of tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import edu.duke.*;

public class tester {
    
    public void TestMethod()
    {
        /*
        int[] keys = {17,14,12,4};
        
        VigenereCipher myvc = new VigenereCipher(keys);
        
        
        
        String st = fr.asString();
        
        String stres = myvc.encrypt(st);
        
        System.out.println(stres);
        
        */
        
        
        VigenereBreaker myvb = new VigenereBreaker();
        
        // System.out.println(myvb.sliceString("abcdefghijklm",0,3));
        /*
        FileResource fr = new FileResource();
        String st = fr.asString();
        int[] ke = myvb.tryKeyLength(st,4,'e');
       
        for(int i : ke)
        {
            System.out.println(i);
        }
        
        */
        myvb.breakVigenere();
    }

}

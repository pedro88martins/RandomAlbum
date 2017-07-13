/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomalbum;

import java.awt.Desktop;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author Pedro
 */
public class RandomAlbum {

    public static void main(String[] args) throws IOException {
       
        //System.out.println(System.getProperty("user.dir"));
        File currentDirectory = new File(System.getProperty("user.dir"));
        
        String[] directories = currentDirectory.list(new FilenameFilter() {
        @Override
        public boolean accept(File current, String name) {
                return new File(current, name).isDirectory();
        } 
        });
        
        //System.out.println(Arrays.toString(directories));
        int len = directories.length;

        //Desktop.getDesktop().open(new File(currentDirectory+"\\"+directories[num]));
        //Runtime.getRuntime().exec("explorer "+currentDirectory+"\\"+directories[num]);
        //Runtime.getRuntime().exec("C:\\Program Files (x86)\\foobar2000\\foobar2000.exe /add "+hardCodedSong+"");        

        Random rand = new Random();
        int rnd = rand.nextInt(len) + 1;
        String playingDir = currentDirectory+"\\"+directories[rnd];
        
        Process process = new ProcessBuilder("C://Program Files//MPC-HC//mpc-hc64.exe",playingDir).start();
        System.out.println("Currently playing: "+playingDir);
        //Runtime.getRuntime().exec("C://Program Files//MPC-HC//mpc-hc64.exe "+hard);
        
    }
    
}

package com.comp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileThing {
    public static void main(String[] args) {
        twenty9();
    }
    public static void twenty4() {
        String s = "";
        int n = 0;
        try{
            Scanner file = new Scanner(new File("C:\\Users\\legen\\Desktop\\java01\\src\\com\\comp\\data.txt"));
            while(file.hasNext()){
            s = file.nextLine();
            try {
                Integer.parseInt(s);
                System.out.println(Integer.parseInt(s));
            }
            catch (NumberFormatException e){
            }}
        }
        catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    public static void twenty5(){
        Scanner parse = new Scanner("A-B-C-D");
        parse.useDelimiter("-");
        String s = "";
        while (!s.equals("C")){
            s = parse.next();
        }
        System.out.println(s);
    }
    public static void twenty6(){
        try{
        Scanner file = new Scanner(new File("C:\\Users\\legen\\Desktop\\java01\\src\\com\\comp\\data.txt"));
        System.out.println(file.nextLine());
        System.out.println(file.nextLine());
        } catch (IOException o){}
    }
    public static void twenty7(){
        try{
            Scanner file = new Scanner(new File("C:\\Users\\legen\\Desktop\\java01\\src\\com\\comp\\data.txt"));
            String g = file.nextLine();
            String r;
            System.out.println(2);
            while (file.hasNext()){
                r = file.nextLine();
                if (g.compareTo(r)>0)
                    g = r;
                System.out.println(1);
            }
            System.out.println(3);
            System.out.println(g);
        }
        catch (InvalidPathException ipe){}
        catch (IOException ioe){}
        catch (SecurityException se){};
    }
    public static void twenty8(){
        try{
            Scanner file = new Scanner(new File("C:\\Users\\legen\\Desktop\\java01\\src\\com\\comp\\data.txt"));
            String result = "";
            while (file.hasNext()){
                result += file.nextLine() + " ";
            }
            System.out.println(result);
        }
        catch(IOException ioe){ioe.printStackTrace();}
    }
    public static void twenty9(){
        try{
            Scanner file = new Scanner(new File("C:\\Users\\legen\\Desktop\\java01\\src\\com\\comp\\data.txt"));
            String result = "";
            while (file.hasNext()){
                result = file.nextLine();
                if (result.substring(0, 2).equals("Sp"))
                    System.out.println(result);
            }
        }
        catch(IOException ioe){ioe.printStackTrace();}
    }

}

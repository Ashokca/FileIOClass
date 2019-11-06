import java.util.*;
import java.io.*;
import java.lang.reflect.*;
public class readFile
{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in); //initializing scanner
        BufferedReader f = new BufferedReader(new FileReader("hi.java"));
        BufferedReader a = new BufferedReader(new FileReader("hi.java"));//initializing Bufferedreader with our java program
        
        String l;
        String W; //initializing Variables 
        int s;
        
        l = f.readLine(); //making the string variable get a line from the read file
        while(l != null)
        { 
            if (l.contains("static")) //seeing if it is a method
                System.out.println(l); //printing out the method
            l = f.readLine(); //getting the next line
        } 
        l = a.readLine(); //getting the start of the file
        System.out.println("Choose a method"); 
        W = scan.nextLine(); //getting user input for what method they want
        while(l != null) //while loop for looping
        { 
            if(l.contains(W)) //if the string has the word static in it, then it will print out all the code
            { 
        if(l.contains("static")) //making sure it is a method
        { 
            while(!l.trim().equals(""))  //making sure line is not empty
            { 
                System.out.println(l); //priniting line
                l=a.readLine();  //getting the next line
     
            }
		} 	
            }
            l = a.readLine(); //it will keep reading another line to advance the loop
        }
        
      
        
        f.close(); //closing the connection from the file
    }
}



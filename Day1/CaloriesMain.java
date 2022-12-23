package Day1;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;


public class CaloriesMain{



public static void main(String[] args) {
        int mostCalElf = 0; 
        int currentElf = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        try{
            File file = new File("C:\\Users\\Mraxj\\OneDrive\\Skrivbord\\Skola\\elf.txt");
            Scanner scan = new Scanner(file);
            while(scan.hasNextLine()){
                String cal = scan.nextLine();
                
                if(!cal.isEmpty()){
                currentElf = currentElf + Integer.parseInt(cal);
                }

                if(cal.isEmpty()){
                    list.add(currentElf);
                    if(currentElf > mostCalElf){
                        mostCalElf = currentElf;
                    }
                    currentElf = 0; 
                }
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        list.sort((o1, o2) -> o2.intValue() - o1.intValue());
        int sum = 0; 
        for(int i = 0; i < 3; i++){
            sum = list.get(i) + sum;
            System.out.println(list.get(i));
        }
        System.out.println("Summan: " + sum);
    }   
}
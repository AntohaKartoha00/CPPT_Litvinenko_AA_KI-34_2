import java.io.*;
import java.util.*;

public class Laba1 {
    public static void main(String[] args) throws FileNotFoundException {
    	
    	File dataFile = new File("MyFile.txt");
        PrintWriter Data = new PrintWriter(dataFile);
        
    	String filler;
    	Scanner scan = new Scanner(System.in);
    	System.out.print("\nВведіть символ-заповнювач: ");
        filler = scan.nextLine();
        
    	
        Scanner in = new Scanner(System.in);
        System.out.print("Введіть розір матриці: " + "\n");
        int size = scan.nextInt();
        
        
        String [] [] Arr;
        Arr = new String[size][size];
        for(int i = 0; i < size; i++)	
        {
        	for( int j = 0; j < size; j++){
        		if(filler.length() == 1)
        		{
        			if (i == 0 || i == size-1 || j == 0 || j == size-1) {
                		Arr[i][j] = filler;
                		System.out.print(" " + Arr[i][j] + " ");
                        Data.print(" " + Arr[i][j] + " ");
                		}
                        else {
                        	Arr[i][j] = " ";
                        	System.out.print(" " + Arr[i][j] + " ");
                        	Data.print(" " + Arr[i][j] + " ");
                        }
        		}
        		else if (filler.length() == 0)
        		{
        		System.out.print("\nНе введено символ заповнювач");
        		Data.print("\nНе введено символ заповнювач");
        		break;
        		}
        		else
        		{
        		System.out.print("\nЗабагато символів заповнювачів");
        		Data.print("\nЗабагато символів заповнювачів");
        		break;
        		}
        	}
        	System.out.print("\n");
        	Data.print("\n");
        }
        Data.close();
        
    }
}

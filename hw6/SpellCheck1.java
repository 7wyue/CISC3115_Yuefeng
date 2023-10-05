import java.io.*;
import java.util.Scanner;

class Dictionary{
	private String filename;
	
	public Dictionary(String filename){
		this.filename=filename;
		}
	public boolean found(String a)throws FileNotFoundException{
		Scanner sc= new Scanner(new File(this.filename));
		while(sc.hasNext()){
			
			if(sc.next().toLowerCase().equals(a.toLowerCase())){
				sc.close();
				return true;
			
				}
			
			
			}
		
		sc.close();
		return false;
		}
	
	
	}
public class SpellCheck1{
	public static void main(String[] args)throws FileNotFoundException{
		Dictionary obj = new Dictionary("Dictionary");
		int count =0;
		Scanner sc = new Scanner(new File("paper"));
		while(sc.hasNextLine()){
			count++;
			String line = sc.nextLine(); 
			Scanner sc1 = new Scanner(line);
			while(sc1.hasNext()){
				String word=sc1.next();
				if(!obj.found(word)){
					System.out.printf("Line %4d: %s\n",count,word);
					}
				
				}
			
			
			}
		
		}
	
	}	
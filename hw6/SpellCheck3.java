import java.io.*;
import java.util.Scanner;

class Dictionary{
	private String[] words;
	public Dictionary(String filename)throws FileNotFoundException{
		Scanner sc= new Scanner(new File(filename));
		int count=0;
		while(sc.hasNext()){
			count++;
			sc.next();
			
			}
		sc.close();
		this.words = new String[count];
		sc = new Scanner(new File(filename));
		int index=0;
		while(sc.hasNext()){
			words[index]=sc.next().toLowerCase();
			index++;
			}
		
		}
	public boolean found(String a){
		
		for(int i =0; i<words.length;i++){
			
			if(a.toLowerCase().equals(words[i])){

				return true;
			
				}
			
			
			}
		
		return false;
		}
	
	
	}
public class SpellCheck3{
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
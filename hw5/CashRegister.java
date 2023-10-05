import java.util.Scanner;
import java.io.*;
class Money{
	
	
	private int cents;
	private static int transac=0;
	public int getCents(){return this.cents;}
	public Money(){
		this.cents=0;
		}
	public Money(Scanner scnr){
		String us_Money = scnr.next();
		this.cents = Integer.parseInt(us_Money.replace("$","").replace(".",""));
		
		}
	public String toString(){return "$"+cents/100+"."+(cents%100<10? "0"+cents%100:cents%100);}
	public boolean equals(Money money){
		
		return this.cents==money.getCents()? true:false;
		}
	public void add(Money money){
		
		this.cents+=money.getCents();
		transac+=money.getCents();
		}
	public static String getTransaction(){
		return "$"+transac/100+"."+(transac%100<10? "0"+transac%100:transac%100);
		}
	
	}
public class CashRegister{
	public static void main(String[] agrs)throws Exception{
		
		Scanner sc = new Scanner(new File("balance"));
		Money a = new Money(sc);
		
		System.out.println("Starting balance: "+a.toString());
		Scanner sc1 = new Scanner(new File("transactions"));
		int count=0;
		while(sc1.hasNext()){
			Money b = new Money(sc1);
			a.add(b);
			count++;
			}
		System.out.println(count+" transactions");
		PrintWriter out = new PrintWriter(new File("balance"));
		out.println(a.toString());
		out.close();
		System.out.println("Transaction Total: "+Money.getTransaction());
		System.out.println("Closing balance: "+a.toString());
		}
	
	
	
	
	
	}	
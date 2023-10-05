import java.util.Scanner;
class Point2D{
	private double x,y;
	private String label;
	
	public double sqr(double a){
		return a*a;}
	public double distance(Point2D point){
		return Math.sqrt(sqr(point.x-this.x)+sqr(point.y-this.y));
		}

	public String getLabel(){return this.label;}
	public String toString(){return this.label+"("+x+","+y+")";}
	public Point2D(){this.x=0;this.y=0;this.label="";}
	public Point2D(String label,double x,double y){this.label=label;this.x=x;this.y=y;}
	public Point2D(Scanner scnr){
		this.label=scnr.next();
		this.x=scnr.nextDouble();
		this.y=scnr.nextDouble();
		
		}
	public Point2D(String label,Scanner scnr){
		this.label=label;
		this.x=scnr.nextDouble();
		this.y=scnr.nextDouble();
		}
	
}
class Path3{
	
	private String label;
	private Point2D st,it,ed;
	public String toString(){
		return st.getLabel()+"-"+it.getLabel()+"-"+ed.getLabel();
		}
	public double length(){return st.distance(it)+it.distance(ed);}
	public String getLabel(){return this.label;}
	public Path3(String label,Point2D st, Point2D it, Point2D ed){
			this.label=label;
			this.st=st;
			this.it=it;
			this.ed=ed;
		}
	public Path3(Scanner scnr){
		this.label=scnr.next();
		this.st=new Point2D(this.label,scnr);
		this.it=new Point2D(this.label,scnr);
		this.ed=new Point2D(this.label,scnr);
		}
	
	
	
	}
	
public class ShortestPath{
	
	public static void main(String[] args){
		Scanner scnr = new Scanner(System.in);
		Path3 a = new Path3(scnr);
		Path3 b = new Path3(scnr);
		double a1 = a.length();
		double b1 = b.length();
		System.out.println(a.getLabel()+": "+a1);
		System.out.println(b.getLabel()+": "+b1);
		System.out.println("shortest path: "+ (a1>b1? b.getLabel():a.getLabel()));
		
		
		}
	}
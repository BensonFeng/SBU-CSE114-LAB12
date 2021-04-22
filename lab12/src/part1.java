import java.util.Scanner;

public class part1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a,b,c : ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();	
		
		QuadraticEquation root;
		root = new QuadraticEquation(a,b,c);
		
		if (root.getDiscriminant()>=1) {
			System.out.print("The equation has two roots " + root.getRoot1() + " and "+ root.getRoot2());	
		}
		else if (root.getDiscriminant()==0) {
			System.out.print("The equation has one root " + root.getRoot1());
		}	
		else {
			System.out.print("The equation has no real root");
		}
	}
}
class  QuadraticEquation {
	private double a;
	private double b;
	private double c;	
	public QuadraticEquation(double x, double y, double z) {
		a = x;
		b = y;
		c = z;
	}
	public double getA() {
		return a;
		}
	public double getB() {
		return b;
		}
	public double getC() {
		return c;
		}
	
	public double getDiscriminant() {
		return (Math.pow(b,2)-4*a*c);
		}
	
	public double getRoot1() {
		return ((-b+Math.sqrt(getDiscriminant()))/(2*a));
		}
	public double getRoot2() {
		return ((-b-Math.sqrt(getDiscriminant()))/(2*a));
		}
	}

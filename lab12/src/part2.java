import java.util.Scanner;
public class part2 {
	public static void main(String[] args) {
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		java.util.Scanner input = new Scanner(System.in);
		
		double[][] x = new double[4][4];

		for (int i = 0; i < x.length; i++) {//iterate 2d array and store user input
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = input.nextDouble();
				}
			}
		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(x));//print result
		}
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
			}
		return sum;
		}
	}
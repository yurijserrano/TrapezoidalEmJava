import java.util.Scanner;

public class Trapezoidal{
	
	
	
	private double a, b; //extremos de integração
	private int    n;  //numero de iterações
	private double h;
	
	public Trapezoidal(int iteracao){
		//Inicializa intervalos
		a = 0.5;
		b = 1.0;
		n = iteracao;
		h = (b - a) / n;
	}
	
	public double f(double x){
		return Math.pow(x,4);
	}
	
	public double calcula (){
		double fj = 0;
		double xj = 0;
		for (int j=1; j<=n-1; j++){
			xj = a + (j*h);
			fj = fj + f(xj);
		}
		// fórmula do trapézio
		return ((h/2) * (f(a) + (2*fj) + f(b)));
	}
	
	public static void main(String args[]){
		int x;
		Scanner c = new Scanner(System.in);
		
		System.out.println("Digite numero de iteracoes: ");
		x = c.nextInt();
		
		Trapezoidal M = new Trapezoidal(x);
		System.out.println("Solucao: " + M.calcula());
	}
}
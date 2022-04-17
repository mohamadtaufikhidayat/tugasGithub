package NewGitHub;
import java.util.Scanner;

public class Soal2 {
	public Scanner scan = new Scanner(System.in);
//	public int inputN(){
//		System.out.println("Masukan Nilai masukan uang Andi:");
//		
//		int n= scan.nextInt();
//		return n;
//	}
	public int [][] ArrayItem(){
		int arrayItem [][]=new int [2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				if(i==0) {
					System.out.println("Masukan hasukan harga kaca mata:"+(j+1));
					arrayItem[i][j]=scan.nextInt();
				}else {
					System.out.println("Masukan hasukan harga baju:"+(j+1));
					arrayItem[i][j]=scan.nextInt();
				}
			}
		}
		return arrayItem;
	}
	public void hasilSum() {
		System.out.println("Masukan Nilai masukan uang Andi:");
		int a=0;int b=0,m=0;int q=0,p=0;
		int uangAndi= scan.nextInt();
		int [][] arrayItem = ArrayItem();
		int [][] arraySum = new int [3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				int	sum=Integer.valueOf(arrayItem[0][i])+Integer.valueOf(arrayItem[1][j]);
				arraySum [i][j]=sum;
				if(arraySum[i][j]<=uangAndi&&arraySum[i][j]>a) {
				a=arraySum[i][j];
				 b= arrayItem[0][i];
				 m=arrayItem[1][j];
				 q=i;p=j;
				}
			}
		}
		System.out.println("hasil ini adalah hasil penjumlahan dari "+"kacamata ke "+(q+1)+" harga "+b+" dengan baju ke "+(p+1)+" harga "+m);
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		Soal2 run =new Soal2();
		run.hasilSum();	
	}

}


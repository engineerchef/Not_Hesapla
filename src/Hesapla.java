import java.util.Scanner;

public class Hesapla {
	private static Scanner scan;

	public static void main(String[] args) {
		double not[][]=new double [1][2];
		double ort[][]=new double [4][3];
		String harf[][]=new String [4][3];
		scan = new Scanner(System.in);
		int m;

		for(int i=0; i<4; i++) {
			System.out.printf("%d. Ogrencinin derslerinin notlari giriliyor...\n",i+1);
			for(int j=0; j<3; j++) {
				System.out.printf(" %d. dersin vize ve final notunu giriniz: ",j+1);
				for(int k=0; k<2; k++) {
					not[0][k]=scan.nextDouble();
					ort[i][j]=not[0][0]*0.4+not[0][1]*0.6;
					harf[i][j]=harfNotuCevir(ort[i][j] );
				}
			}
		}

		for(int i=0; i<3; i++) {
			System.out.printf("\n%d. dersin durumu:",i+1);
			for(int j=0; j<4; j++) {
				System.out.printf("\n\t%d. ogrenci: ",j+1);
				m=0;
				if(m<4) {
					System.out.print("  |  Durum: "+durumBelirle(ort[j][i]));
					System.out.print("  |  Harf: "+harf[j][i]);
					System.out.printf("  |  Ortalama:%.2f",ort[j][i]);
					m++;
				}
			}
		}
	}/*end main*/

	private static String durumBelirle(double d) {
		String durum;
		if(d>=60) durum="GECTI";
		else durum="KALDI";
		return durum;
	}

	private static String harfNotuCevir(double d) {
		String harf = null;
		if(d>89 && d<=100) harf="AA";
		else if(d>84 && d<=89) harf="BA";
		else if(d>74 && d<=84) harf="BB";
		else if(d>69 && d<=74) harf="CB";
		else if(d>59 && d<=69) harf="CC";
		else if(d>54 && d<=59) harf="DC";
		else if(d>49 && d<=54) harf="DD";
		else if(d>39 && d<=49) harf="FD";
		else if(d>=0 && d<=39) harf="FF";
		return harf;
	}
}/*end class*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int[] notlar = new int[6];
        int toplam=0;
        int YuksekNot =Integer.MIN_VALUE;
        int DusukNot = Integer.MAX_VALUE;
        boolean DusukNotVar = false;

        for (int i=1; i<6; i++){
            System.out.print(i+" Dersin notunu giriniz: ");
            notlar[i]= scanner.nextInt();
            toplam +=notlar[i];

            if (notlar[i]>YuksekNot){
                YuksekNot=notlar[i];
            }
            if (notlar[i]<DusukNot){
                DusukNot = notlar[i];
            }
            if (notlar[i]< 30){
                DusukNotVar = true;
            }
        }
        double ortalama= toplam/5.0 ;
        if (ortalama>50){
            System.out.println("Geçtiniz! ");
        }
        else {
            System.out.println("Kaldınız!");
        }
        if (DusukNotVar){
            System.out.println("Düşük not aldığınız dersler var!");
        }
        System.out.println("En yüksek not: "+YuksekNot);
        System.out.println("En düşük not: "+DusukNot);

        scanner.close();

    }
}
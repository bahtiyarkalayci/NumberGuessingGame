import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int number=random.nextInt(100);
        System.out.println(number);
        int right=0;
        int[] wrong=new int[5];


        while (right<5){
            Scanner scanner=new Scanner(System.in);
            System.out.println("lütfen 0-100 arasında tahmininizi giriniz");
            int estimate=scanner.nextInt();
            if (estimate==number){
                System.out.println("tebrikler doğru tahmin ettiniz, tahmininiz:"+number);
                break;

            }else {
                if (estimate<number){
                    System.out.println("küçük bir sayı, daha büyük dene :)");
                }else {
                    System.out.println("büyük bir sayı,daha küçüğünü dene:)");

                }

               wrong[right]=estimate;
                right++;
                System.out.println("kalan hakkınız:"+(5-right));

            }



        }
        System.out.println("hatalarınız:"+ Arrays.toString(wrong));

    }
}
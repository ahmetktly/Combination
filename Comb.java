import java.util.Scanner;
public class Comb{
    public static void main(String[] args) {
        
        int i, j , k , num1 , num2 , factorial1 = 1 , factorial2 = 1 , factorial3 = 1, comb;

        Scanner inp=new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz");
        num1 = inp.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        num2 = inp.nextInt();

        int num3 = ( num1 - num2 ) ; 

        if( num1 >= num2 && num1 > 0 && num2 > 0){

            for(i = 1 ; i <= num1 ; i++){

                factorial1 *= i ;

            }
            
            for(j = 1 ; j <= num2 ; j++){

                factorial2 *= j ;

            }
            
              for(k = 1 ; k <= num3 ; k++){

                factorial3 *= k ;

            }
                        
                comb = factorial1 / ( factorial2 * (factorial3));

                System.out.println("Kombinasyon sonucu = " + comb );

        }
        else{

            System.out.println("ilk sayı ikinci sayıdan büyük ve iki sayıda pozitif olmalıdır");
        }       
    }
}
import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        int k, total = 0, totalNumbers = 0 ;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.println(" Give me a Number : ");
        k = input.nextInt();

        for (int i = 0; i <= k; i++){
            if ((i %3 ==0 ) && (i %4 == 0)){
                System.out.println("The number is : " + i);
                total += i;
                totalNumbers++ ;
            }
        }
        average = (total / (totalNumbers - 1 ));
        System.out.println("The average is : " + average);
                }
            }





import java.util.Scanner;
public  class Main {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter n1 number : ");
    int n1 = scan.nextInt();

    System.out.println("Enter n2 number : ");
    int n2 = scan.nextInt();

    int ebob = 1;
    int i =1;
    while (i <= n1 && i <= n2) {
        if (n1 % i == 0 && n2 % i == 0) {
            ebob = i;


        }
        i++;
    }

    System.out.println("EBOB:" +  ebob);
    int ekok = (n1*n2) / ebob;
    while (i <= n1 && i <= n2 ) {
        if (n1 % i == 0 && n2 % i == 0) {
            System.out.println(i);

        }
        i++;

    }
    System.out.println("EKOK : " + ekok);

}
}
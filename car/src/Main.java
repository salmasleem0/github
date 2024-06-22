import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SUV s =new SUV("Honda" ," CR-V",2020);
        Sedan ss =new Sedan("Toyota" ," Camry",2019);
        s.isrented=true;
        ss.isrented=false;
        System.out.println("for Honda CR-V 2020 press:1 Toyota camry 2019 press:2");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if(choice==1){
            System.out.println("enter number of days :");
            int days = scanner.nextInt();
            s.caclrentalcost(days);
            s.rent();
          ;
        }else if (choice==2){
            System.out.println("enter number of days:");
            int days = scanner.nextInt();
            ss.caclrentalcost(days);
            ss.returncar();


        }else System.out.println("Choose again");


         }
    }

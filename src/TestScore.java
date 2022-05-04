import java.util.Scanner;

public class TestScore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Name a number between 0 and 100 ");
        int num1 = scanner.nextInt();
        
        if (num1 > 90) {
            System.out.println("Your grade is a A.");
    }   
       else if (num1 > 80) {
        System.out.println("Your grade is a B");
       
    } else if (num1 > 70) {
        System.out.println("Your grade is a C");
       
    }
    else if (num1 > 60) {
        System.out.println("Your grade is a D");
       
    }
    else if (num1 > 50) {
        System.out.println("Your grade is a E");

    }
    else if (num1 > 40) {
        System.out.println("Your grade is a F");
        
    }
    else if (num1 > 30) {
        System.out.println("Your grade is a G ");

    }
    else if (num1 > 20) {
        System.out.println("Your grade is a H");
    }  else { System.out.println("You failed :(");
}

}

}

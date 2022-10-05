import java.util.Scanner;
public class ForceMassAcceleration{
    public static void main(String[]args)throws InterruptedException{
        int k=0;
        Scanner sc = new Scanner(System.in);
        while(k==0){
        System.out.println("Type and Enter the following according to what u want to find [F] for force, [A] for Acceleration, [M] for Mass, [E] for exit.");
        char imp = sc.next().charAt(0);
        double f,m,a;
        if(imp=='F'||imp=='f'){
            System.out.print("Enter Mass: ");
            m = sc.nextDouble();
            System.out.print("Enter Acceleration: ");
            a = sc.nextDouble();
            f = m*a;
            System.out.println("The magnitude of force is "+f+"N");
        }
        else if(imp=='M'||imp=='m'){
            System.out.print("Enter Force: ");
            f = sc.nextDouble();
            System.out.print("Enter Acceleration: ");
            a = sc.nextDouble();
            m = f/a;
            System.out.println("Mass is "+m+"kg");
        }
        else if(imp=='A'||imp=='a'){
            System.out.print("Enter Force: ");
            f = sc.nextDouble();
            System.out.print("Enter Mass: ");
            m = sc.nextDouble();
            a = f/m;
            System.out.println("Accleration is "+a+"m/s²");
        }
        else if(imp=='E'||imp=='e'){
            System.out.println("Exiting.");
            Thread.sleep(500);
            System.out.println("Exiting..");
            Thread.sleep(500);
            System.out.println("Exiting...");
            Thread.sleep(500);
            System.out.println("DONE");
            System.exit(0);
        }
        else{
            System.out.println("You entered some wrong value");
        }
    }
}
}
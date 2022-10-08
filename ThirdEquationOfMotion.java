import java.util.Scanner;
public class ThirdEquationOfMotion{
    public static void main(String[]args)throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        double v,u,a,s;
        int k = 0;
            System.out.println("----------TYPE and ENTER ; What you want to calculate?----------");
        while(k==0){
            System.out.println("[V]=Final Velocity, [U]=Initial Velocity, [A]=Acceleration, [S]=Distance, [E]=Exit");
            char imp = sc.next().charAt(0);
            if(imp=='V'||imp=='v'){
                System.out.print("Enter Initital Velocity (u): ");
                u = sc.nextDouble();
                System.out.print("Enter Acceleration (a): ");
                a = sc.nextDouble();
                System.out.print("Enter Distance (s): ");
                s = sc.nextDouble();
                System.out.println("--------------------------------------------------");
                System.out.println("Now,\nusing, v²=u²+2as\n=>v²="+u+"² + 2*"+a+"*"+s);
                v = Math.sqrt(Math.pow(u,2)+2*a*s);
                System.out.println("v= "+v+" m/s");
            }
            else if(imp=='U'||imp=='u'){
                System.out.print("Enter Final Velocity (v): ");
                v = sc.nextDouble();
                System.out.print("Enter Acceleration (a): ");
                a = sc.nextDouble();
                System.out.print("Enter Distance (s): ");
                s = sc.nextDouble();
                System.out.println("--------------------------------------------------");
                System.out.println("Now,\nusing, u²=v²-2as\nu²=>"+v+"² - 2*"+a+"*"+s);
                u = Math.sqrt(Math.pow(v,2)-2*a*s);
                System.out.println("u= "+u+" m/s");
            }
            else if(imp=='A'||imp=='a'){
                System.out.print("Enter Final Velocity (v): ");
                v = sc.nextDouble();
                System.out.print("Enter Initial Velocity (u): ");
                u = sc.nextDouble();
                System.out.print("Enter Distance (s): ");
                s = sc.nextDouble();
                System.out.println("--------------------------------------------------");
                System.out.println("Now,\nusing, a=(v²-u²)/2s\na=> ("+v+"² - "+u+"²)/("+2+"*"+s+")");
                a=(Math.pow(v,2)-Math.pow(u,2))/(2*s);
                System.out.println("a= "+a+" m/s²");
            }
            else if(imp=='S'||imp=='s'){
                System.out.print("Enter Final Velocity (v): ");
                v = sc.nextDouble();
                System.out.print("Enter Initial Velocity (u): ");
                u = sc.nextDouble();
                System.out.print("Enter Acceleration (a): ");
                a = sc.nextDouble();
                System.out.println("--------------------------------------------------");
                System.out.println("Now,\nusing, s=(v²-u²)/2a\ns=> ("+v+"² - "+u+"²)/("+2+"*"+a+")");
                s=(Math.pow(v,2)-Math.pow(u,2))/(2*a);
                System.out.println("s= "+s+" m");
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

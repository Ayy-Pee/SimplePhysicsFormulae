import java.util.Scanner;
public class SecondEquationOfMotion{
    public static void main(String[]args)throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        double s,u,t,a;
        int k=0;
        System.out.println("----------TYPE and ENTER ; What you want to calculate?----------");
        while(k==0){
            System.out.println("[S]=Distance, [U]=Initial Velocity, [T]=Time, [A]=Acceleration, [E]=Exit");
            char imp = sc.next().charAt(0);
            if(imp=='S'||imp=='s'){
                System.out.print("Enter Initital Velocity (u): ");
                u = sc.nextDouble();
                System.out.print("Enter Time (t): ");
                t = sc.nextDouble();
                System.out.print("Enter Acceleration (a): ");
                a = sc.nextDouble();
                System.out.println("--------------------------------------------------");
                System.out.println("Now,\nusing, s=ut+½at²\n=>s="+u+"*"+t+"+"+"½"+a+"*"+t+"²");
                s = u*t+0.5*a*Math.pow(t,2); // 1/2 is taken as 0.5 because java does 1/2 == 0 because of both the values being integer
                System.out.println("s= "+s+" m");
            }
            else if(imp=='U'||imp=='u'){
                System.out.print("Enter Distance(s): ");
                 s = sc.nextDouble();
                System.out.print("Enter Time (t): ");
                t = sc.nextDouble();
                System.out.print("Enter Acceleration (a): ");
                a = sc.nextDouble();
                System.out.println("--------------------------------------------------");
                System.out.println("Now,\nusing, u=(s-½at²)/t\n=>u= ("+s+"- ½"+a+"*"+t+"²)/"+t);
                u = (s-0.5*a*Math.pow(t,2))/t; // 1/2 is taken as 0.5 because java does 1/2 == 0 because of both the values being integer
                System.out.println("u= "+u+" m/s");
            }
            else if(imp=='T'||imp=='t'){
                System.out.print("Enter Distance(s): ");
                s = sc.nextDouble();
                System.out.print("Enter Initial Velocity (u): ");
                u = sc.nextDouble();
                System.out.print("Enter Acceleration (a): ");
                a = sc.nextDouble();
                System.out.println("--------------------------------------------------");
                double v = Math.sqrt(Math.pow(u,2)+2*a*s);
                System.out.println("Now,\nusing, v=u²+2as \tv= "+v+"\nusing t=2s/u+v");
                t = (2*s)/(u+v);
                System.out.println("t= "+t+" s");
            }
            else if(imp=='A'||imp=='a'){
                System.out.print("Enter Distance(s): ");
                s = sc.nextDouble();
                System.out.print("Enter Initial Velocity (u): ");
                u = sc.nextDouble();
                System.out.print("Enter Time (t): ");
                t = sc.nextDouble();
                System.out.println("--------------------------------------------------");
                System.out.println("Now,\nusing,a=2(s-ut)/t² \n=> a=2("+s+"-"+u+"*"+t+")/"+t+"²");
                a = (2*(s-u*t))/Math.pow(t,2);
                System.out.println("a= "+a+" m/s²");
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
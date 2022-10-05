import java.util.Scanner;
public class FirstEquationOfMotion{
    public static void main(String[]args)throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        double v,u,a,t;
        int k = 0;
        while(k==0){
            System.out.println("----------TYPE and ENTER ; What you want to calculate?----------");
            System.out.println("[V]=Final Velocity, [U]=Initial Velocity, [A]=Acceleration, [T]=Time, [E]=Exit");
            char imp = sc.next().charAt(0);
            if(imp=='V'||imp=='v'){
                System.out.print("Enter Initital Velocity (u): ");
                u = sc.nextDouble();
                System.out.print("Enter Acceleration (a): ");
                a = sc.nextDouble();
                System.out.print("Enter Time (t): ");
                t = sc.nextDouble();
                System.out.println("--------------------------------------------------");
                System.out.println("Now,\nusing, v=u+at\n=>v="+u+"+"+a+"*"+t);
                v = u+a*t;
                System.out.println("v= "+v+" m/s");
            }
            else if(imp=='U'||imp=='u'){
                System.out.print("Enter Final Velocity (v): ");
                v = sc.nextDouble();
                System.out.print("Enter Acceleration (a): ");
                a = sc.nextDouble();
                System.out.print("Enter Time (t): ");
                t = sc.nextDouble();
                System.out.println("--------------------------------------------------");
                System.out.println("Now,\nusing, v=u+at\n=>u=v-at\nu="+v+"-"+a+"*"+t);
                u = v-a*t;
                System.out.println("u= "+u+" m/s");
            }
            else if(imp=='A'||imp=='a'){
                System.out.print("Enter Final Velocity (v): ");
                v = sc.nextDouble();
                System.out.print("Enter Initial Velocity (u): ");
                u = sc.nextDouble();
                System.out.print("Enter Time (t): ");
                t = sc.nextDouble();
                System.out.println("--------------------------------------------------");
                System.out.println("Now,\nusing, v=u+at\n=>a=v-u/t\na="+v+"-"+u+"/"+t);
                a=(v-u)/t;
                System.out.println("a= "+a+" m/s²");
            }
            else if(imp=='T'||imp=='t'){
                System.out.print("Enter Final Velocity (v): ");
                v = sc.nextDouble();
                System.out.print("Enter Initial Velocity (u): ");
                u = sc.nextDouble();
                System.out.print("Enter Acceleration (a): ");
                a = sc.nextDouble();
                System.out.println("--------------------------------------------------");
                System.out.println("Now,\nusing, v=u+at\n=>t=v-u/a\nt="+v+"-"+u+"/"+a);
                t=(v-u)/a;
                System.out.println("t= "+t+" s");
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
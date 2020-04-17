package FootInch;

import com.sun.java.accessibility.util.EventID;

import java.util.Scanner;

public class App {
    
    // Static Method , Algorythme , playing ,Problemen Oplossen en nog bezig zij met Static methids 

    private static int foot;
    private static int inch;
    private static float foot_to_meter;
    private static float foot_to_centimeter;
    private static float inch_to_centimeter;
    private static float inch_to_meter;

    private static void read(){
        System.out.println("FOOT");
        foot =( new Scanner(System.in)).nextInt();
        System.out.println("INCH");
        inch = new Scanner(System.in).nextInt();
    }

    private static void Calculate(){
        foot_to_meter = 0.3048f * foot;
        foot_to_centimeter = 100 * foot_to_meter;
        inch_to_meter = (float)(1.0f / 12) * inch;
        inch_to_centimeter = 100 * inch_to_meter;

    }

    private static void write(){
        System.out.printf("The %1$s foor is %2S$ meter" + "\r\n" ,foot , foot_to_meter);
        System.out.printf(" The %1$s foot is %2$s Centimeter" + "\r\n"  ,foot,foot_to_centimeter);
        System.out.printf(" The %1$s Inch is %2$s Meter" + "\r\n"  ,inch,inch_to_meter);
        System.out.printf(" The %1$s Inch is %2$s Centimeter" + "\r\n"  ,inch,inch_to_centimeter);


    }
    public static void main ( String [] args){
        read();
        Calculate();
        write();
    }

}

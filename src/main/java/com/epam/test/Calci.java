package com.epam.test;
import java.util.Scanner;

public class Calci {

    public void display1() {
        System.out.println("1.ADDITION\n2.SUBSTRACTION\n3.MULTIPLICATION\n4.DIVISION\n5.EXIT");
    }

    public void display2() {
        System.out.println("1.INTEGERS\n2.FLOAT\n3.DOUBLE\n4.LONG");
    }

public void switchCase(int ch1,int ch2)
{
    Scanner scan = new Scanner(System.in);
    switch(ch2)
    {
        case 1:
            System.out.println("enter two integer inputs:");
            int op1 = scan.nextInt();
            int op2 = scan.nextInt();
            switch(ch1)
            {
                case 1 : addition(op1,op2);
                    break;
                case 2 : subtraction(op1,op2);
                    break;
                case 3 : multiplication(op1,op2);
                    break;
                case 4 : division(op1,op2);
                    break;
                default:
                    System.out.println("enter correct choices ");
            }
            break;
        case 2:System.out.println("enter two float inputs:");

            float ope1 = scan.nextFloat();
            float ope2 = scan.nextFloat();
            switch(ch1)
            {
                case 1 : addition(ope1,ope2);
                    break;
                case 2 : subtraction(ope1,ope2);
                    break;
                case 3 : multiplication(ope1,ope2);
                    break;
                case 4 : division(ope1,ope2);
                    break;
                default:
                    System.out.println("enter correct choices ");
            }
            break;
        case 3:System.out.println("enter two double inputs:");
            double opr1 = scan.nextDouble();
            double opr2 = scan.nextDouble();
            switch(ch1)
            {
                case 1 : addition(opr1,opr2);
                    break;
                case 2 :
                    System.out.println("subtraction is risky in double and double variables");
                    break;
                case 3 : multiplication(opr1,opr2);
                    break;
                case 4 : division(opr1,opr2);
                    break;
                default:
                    System.out.println("enter correct choices ");
            }
            break;
        case 4: System.out.println("enter two long inputs:");
            long opd1 = scan.nextLong();
            long opd2 = scan.nextLong();
            switch(ch1)
            {
                case 1 : addition(opd1,opd2);
                    break;
                case 2 : subtraction(opd1,opd2);
                    break;
                case 3 : multiplication(opd1,opd2);
                    break;
                case 4 : division(opd1,opd2);
                    break;
                default:
                    System.out.println("enter correct choices ");
            }
            break;

        default:
            System.out.println("enter correct choices");
    }
}

    public int addition(int op1, int op2) {
        System.out.println("Addition of " + op1 + " and " + op2 + " is " + (op1 + op2));
		return op1+op2;
    }

    public double addition(double op1, double op2) {
        System.out.println("Addition of " + op1 + " and " + op2 + " is " + (op1 + op2));
		return op1+op2;
    }

    public float addition(float op1, float op2) {
        System.out.println("Addition of " + op1 + " and " + op2 + " is " + (op1 + op2));
		return op1+op2;
    }

    public long addition(long op1, long op2) {
        System.out.println("Addition of " + op1 + " and " + op2 + " is " + (op1 + op2));
        return op1+op2;
    }

    public int subtraction(int op1, int op2) {
        System.out.println("Subtraction of " + op1 + " and " + op2 + " is " + (op1 - op2));
        return op1-op2;
    }
    public double subtraction(double op1, int op2) {
        System.out.println("Subtraction of " + op1 + " and " + op2 + " is " + (op1 - op2));
        return op1-op2;
    }
    public float subtraction(float op1, float op2) {
        System.out.println("Subtraction of " + op1 + " and " + op2 + " is " + (op1 - op2));
        return op1-op2;
    }
    public long subtraction(long op1, long op2) {
        System.out.println("Subtraction of " + op1 + " and " + op2 + " is " + (op1 - op2));
        return op1-op2;
    }
    public int multiplication(int op1,int op2)
    {
        System.out.println("Multiplication of " + op1 + " and " + op2 + " is " + (op1 * op2));
        return op1*op2;
    }
    public float multiplication(float op1,float op2)
    {
        System.out.println("Multiplication of " + op1 + " and " + op2 + " is " + (op1 * op2));
        return op1*op2;
    }
    public double multiplication(double op1,double op2)
    {
        System.out.println("Multiplication of " + op1 + " and " + op2 + " is " + (op1 * op2));
        return op1*op2;
    }
    public long multiplication(long op1,long op2)
    {
        System.out.println("Multiplication of " + op1 + " and " + op2 + " is " + (op1 * op2));
        return op1*op2;
    }
    public int division(int op1,int op2)
    {
        try {
            System.out.println("Division of " + op1 + " and " + op2 + " is " + (op1 / op2));
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
		return op1/op2;
    }
    public float division(float op1,float op2)
    {
        try {
            System.out.println("Division of " + op1 + " and " + op2 + " is " + (op1 / op2));
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return op1/op2;
    }
    public double division(double op1,double op2)
    {
        try {
            System.out.println("Division of " + op1 + " and " + op2 + " is " + (op1 / op2));
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return op1/op2;
    }
    public long division(long op1,long op2)
    {
        try {
            System.out.println("Division of " + op1 + " and " + op2 + " is " + (op1 / op2));
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        return op1/op2;
    }

}
class Result
{
    public static void main(String[] args)
    {
        Calci  myCalci = new Calci();
        while(true) {
            myCalci.display1();
            System.out.println("select any option to continue:");

            Scanner s = new Scanner(System.in);
            int ch1 = s.nextInt();
            if(ch1==5)
                break;
            myCalci.display2();
            System.out.println("select data types of values:");
            int ch2 = s.nextInt();
            myCalci.switchCase(ch1,ch2);

        }
    }
}


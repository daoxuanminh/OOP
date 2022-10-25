import java.util.Scanner;

import javax.swing.JOptionPane;

public class Slove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1: Giai phuong trinh bac nhat");
        System.out.println("2: Giai he phuong trinh bac nhat");
        System.out.println("3: Giai phuong trinh bac hai");
        System.out.print("Nhap lua chon cua ban: ");
        int choose = input.nextInt();
        // System.out.println(choose);
        if (choose == 1) {
            double a, b;
            System.out.println("Giai phuong trinh bac nhat!\tax+b=0 (a!=0)");
            System.out.print("Nhap he so a: ");
            a = input.nextDouble();
            System.out.print("Nhap he so b: ");
            b = input.nextDouble();
            System.out.printf("x = %f", -b / a);
        } else if (choose == 2) {
            double a11, a12, a21, a22, b1, b2;
            System.out.println("Giai he phuong trinh bac nhat!\na11x+a12y=b1\na21x+a22y=b2");
            System.out.print("Nhap he so a11: ");
            a11 = input.nextDouble();
            System.out.print("Nhap he so a12: ");
            a12 = input.nextDouble();
            System.out.print("Nhap he so b1: ");
            b1 = input.nextDouble();
            System.out.print("Nhap he so a21: ");
            a21 = input.nextDouble();
            System.out.print("Nhap he so a22: ");
            a22 = input.nextDouble();
            System.out.print("Nhap he so b2: ");
            b2 = input.nextDouble();
            double D = a11 * a22 - a21 * a12;
            double Dx = b1 * a22 - b2 * a12;
            double Dy = a11 * b2 - a21 * b1;
            if (D == 0) {
                if (Dx + Dy == 0) {
                    System.out.println("He phuong trinh vo so nghiem!");
                } else {
                    System.out.println("He phuong trinh vo nghiem!");
                }

            } else {
                double x = Dx / D;
                double y = Dy / D;
                System.out.printf("He phuong trinh co nghiem (x, y) = (%f, %f)", x, y);
            }
        }
    }
}

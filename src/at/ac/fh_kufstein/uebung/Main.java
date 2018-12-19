package at.ac.fh_kufstein.uebung;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("gimme something");
        String b = JOptionPane.showInputDialog("gimme something");
        String c = JOptionPane.showInputDialog("gimme something");

       if(a.substring(0,3).equals(b.substring(0,3)))
           System.out.println("Die ersten drei Zeichen sind gleich");
       else if(b.substring(0,3).equals(c.substring(0,3)))
            System.out.println("Die ersten drei Zeichen sind gleich");
       else if(a.substring(0,3).equals(c.substring(0,3)))
            System.out.println("Die ersten drei Zeichen sind gleich");
       else
           System.out.println("Die ersten drei Zeichen waren nicht gleich");

    }
}

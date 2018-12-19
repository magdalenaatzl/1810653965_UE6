package at.ac.fh_kufstein.uebung.Aufgabe2;

public class Main {
    public static void main(String[] args) {
        int [] array = new int[10];

        for (int i = 0; i<array.length; i++){
            array[i]=i+1;

        }
        for (int item : array)
            System.out.println(item);

    }
}

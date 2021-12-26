package lab5;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.ArrayList;


import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = 0;
        System.out.println("Number of elements");
        N = in.nextInt();

        if (N >= 1) {
            ArrayList<Integer> Alist = new ArrayList<>();
            try {
                System.out.println("Enter the array elements");
                for (int i = 0; i < N; i++) {
                    Alist.add(i, in.nextInt());
                }
            } catch (InputMismatchException e) {
                System.out.println("Error");
                System.exit(1);
            }
            LinkedList<Integer> AlistNew = new LinkedList<>();
            AlistNew.addAll(Alist);
            int X = 0;
            System.out.println("Entered value");
            X = in.nextInt();
            in.close();

            for (int j = 0; j < N; j++) {
                if (AlistNew.get(j) == X) {
                    AlistNew.remove(j);
                    N--;
                    j--;
                }
            }
            int raz = AlistNew.size();
            if (raz >= 1) {
                System.out.println("Source array");
                System.out.println(Alist);
                System.out.println("Fixed array");
                System.out.println(AlistNew);
            } else {
                System.out.println("Source array");
                System.out.println(Alist);
                System.out.println("Error.The list is empty");
            }
        }
    }
}

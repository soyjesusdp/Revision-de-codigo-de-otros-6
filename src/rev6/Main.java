package rev6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] n = new int[20];

        for (int i = 0; i < 20; i++) {
            n[i] = (int)(Math.random() * 381) + 20;
            //System.out.print(n[i] + " ");
        }

        System.out.println("\n¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        Scanner sc = new Scanner(System.in);
        int option = sc. nextInt();
        //int option = Integer.parseInt(System.console().readLine());

        int multiple = ((option == 1) ? 5 : 7);

        for (int e : n) {
            if (e % multiple == 0) {
                System.out.print("[" + e + "] ");
            } else {
                  System.out.print(e + " ");
                }
            }
        }
    }

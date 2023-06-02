import controller.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Controller controller = new Controller(sc);
        while (true) controller.selectMode();
    }
}

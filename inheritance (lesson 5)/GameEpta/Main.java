package GameEpta;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int slot = scanner.nextInt();
        Player player = new Player();
       System.out.format("У игрока %d слотов с оружием, "
                + " ведите номер, чтобы выстрелить "
                + ",-1 чтобы выйти%n", player.getSlotsCount());

        while (slot != -1) {
            player.shotWithWeapons(slot);
            slot = scanner.nextInt();
        }
        System.out.println("Вы вышли из игры ");
    }
}

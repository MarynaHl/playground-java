import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створюємо карту кораблів (64 біти = 8x8)
        long map = 0b11110000_00000111_00000000_00110000_00000010_01000000_00000000_00000000L;

        // Створюємо об'єкт гри
        Battleship8x8 battle = new Battleship8x8(map);

        // Робимо постріли
        List<String> shots = List.of("A1", "B2", "C3", "D4");
        shots.forEach(battle::shoot);

        // Виводимо карту стану
        System.out.println(battle.state());
    }
}

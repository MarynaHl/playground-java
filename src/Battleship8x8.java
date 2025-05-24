public class Battleship8x8 {
    private long ships;
    private long shots;

    public Battleship8x8(long ships) {
        this.ships = ships;
        this.shots = 0L;
    }

    public boolean shoot(String shot) {
        int row = shot.charAt(1) - '1';
        int col = shot.charAt(0) - 'A';
        int bitIndex = row * 8 + col;
        long mask = 1L << (63 - bitIndex);
        shots |= mask;
        return (ships & mask) != 0;
    }

    public String state() {
        StringBuilder result = new StringBuilder();
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                int bitIndex = row * 8 + col;
                long mask = 1L << (63 - bitIndex);
                boolean ship = (ships & mask) != 0;
                boolean shot = (shots & mask) != 0;

                if (ship && shot) result.append("☒");
                else if (ship) result.append("☐");
                else if (shot) result.append("×");
                else result.append(".");
            }
            result.append("\n");
        }
        return result.toString();
    }
}

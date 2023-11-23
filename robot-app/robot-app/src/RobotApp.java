import java.util.Scanner;

class Layout {
    private char icon;
    private int maxX;
    private int maxY;

    public Layout(int maxX, int maxY, char icon) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.icon = icon;
    }

    public char getIcon() {
        return icon;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }
}

class Position {
    private int x;
    private int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class Robot {
    private char icon;
    private Position position;

    public Robot(char icon, Position position) {
        this.icon = icon;
        this.position = position;
    }

    public char getIcon() {
        return icon;
    }

    public Position getPosition() {
        return position;
    }

    public void move(char direction, int steps, Layout layout) {
        int newX = position.getX();
        int newY = position.getY();

        switch (direction) {
            case 'd': // Kanan
                newX += steps;
                break;
            case 'a': // Kiri
                newX -= steps;
                break;
            case 'w': // Atas
                newY -= steps;
                break;
            case 's': // Bawah
                newY += steps;
                break;
            default:
                System.out.println("Instruksi tidak valid. Gunakan d=kanan/a=kiri/w=atas/s=bawah{jumlah langkah}");
                return;
        }

        if (newX >= 0 && newX < layout.getMaxX() && newY >= 0 && newY < layout.getMaxY()) {
            position.setX(newX);
            position.setY(newY);
        } else {
            System.out.println("Robot tidak boleh keluar dari area permainan.");
        }
    }
}

public class RobotApp {
    public static void main(String[] args) {
        new RobotApp();
    }

    private Layout layout;
    private Robot robot;
    private Scanner scanner;

    public RobotApp() {
        this.layout = new Layout(10, 10, '*');
        this.robot = new Robot('o', new Position(0, 0));
        this.scanner = new Scanner(System.in);
        String instruction = "";

        System.out.println("-------- Permainan Dimulai --------");
        do {
            draw();
            instruction = waitInstruction();
            processInstruction(instruction);
        } while (!instruction.equals("x"));
        System.out.println("-------- Permainan Selesai --------");
    }

    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'ke atas 3 langkah'");
        System.out.print("Masukan instruksi: ");
        return scanner.nextLine();
    }

    private void processInstruction(String instruction) {
        char direction = instruction.charAt(0);
        int steps = Integer.parseInt(instruction.substring(1));
        robot.move(direction, steps, layout);
    }

    private void draw() {
        System.out.println("------ Posisi Terbaru ------");

        for (int y = 0; y < layout.getMaxY(); y++) {
            for (int x = 0; x < layout.getMaxX(); x++) {
                if (robot.getPosition().getX() == x && robot.getPosition().getY() == y) {
                    System.out.print(robot.getIcon());
                } else {
                    System.out.print(layout.getIcon());
                }
            }
            System.out.println();
        }
    }
}

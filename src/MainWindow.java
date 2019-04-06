import javax.swing.*;

public class MainWindow extends JFrame {
    public static void main(String[] args) {
        MainWindow mainWindow = new MainWindow();
    }

    public MainWindow() {
        setTitle("Змейка"); // название
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // выход из программы при закрытии окна
        setSize(320, 345);
        setLocation(400, 400);
        add(new GameField()); // добавление игрового поля на окно
        setVisible(true);
    }
}

package GUI;

public class Tester {
    public static void main(String arg[]) {
        java.awt.EventQueue.invokeLater(() -> {
            PaintWindow p = PaintWindow.getInstance();
            p.setVisible(true);
        });
    }
}

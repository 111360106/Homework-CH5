import java.awt.*;
import javax.swing.*;

public class ex1 extends JFrame {
    public ex1() {
        setTitle("簡單的 Applet 範例");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(50, 50, 100, 100); // 繪製矩形
        g.drawOval(200, 50, 100, 100); // 繪製圓形
        g.drawString("Hello, Applet!", 100, 200); // 繪製文字
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ex1 applet = new ex1();
            applet.setVisible(true);
        });
    }
}















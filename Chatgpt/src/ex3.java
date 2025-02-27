import java.awt.*;
import java.awt.event.*;

public class ex3 extends Frame implements ActionListener {
    private Button button;
    private Label label;

    public ex3() {
        setLayout(new FlowLayout());
        setTitle("按鈕點擊範例");
        setSize(300, 200);

        button = new Button("點擊我");
        label = new Label("尚未點擊按鈕");

        button.addActionListener(this);

        add(button);
        add(label);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("按鈕已被點擊！");
    }
    public static void main(String[] args) {
        new ex3();
    }
}

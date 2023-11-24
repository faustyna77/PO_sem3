package scrollbar_example;


import javax.swing.*;
        import java.awt.event.AdjustmentEvent;
        import java.awt.event.AdjustmentListener;
public class ScrollBar extends JFrame {
    private JPanel JPanel;
    private JScrollBar scrollBar1;
    private JPanel panel1;
    private JLabel label;

    public static void main(String[] args) {
        ScrollBar example = new ScrollBar();
        example.setVisible(true);
    }

    public ScrollBar() {
        super("JScrollBar");
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        scrollBar1.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Vertical Scrollbar value is:" +
                        scrollBar1.getValue());
            }
        });
    }
}

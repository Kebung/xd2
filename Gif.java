import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class Gif extends JFrame
{
    public Gif()
    {
        this.setTitle("Rysowanie");
        this.setBounds(250, 200, 570, 600);
        PanelRysowiak panelDoRysowania = new PanelRysowiak();
        this.getContentPane().add(panelDoRysowania);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {
        new Gif().setVisible(true);
    }

}
class PanelRysowiak extends JPanel
{
        public PanelRysowiak()
        {
            JButton button1 = new JButton("MonkaS");
            button1.addActionListener(this::actionPerformed);
            add(button1);
            setVisible(true);
        }


        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawString("MonkaS", 0, 0);
            g.drawImage(new ImageIcon("src/monkas.jpg").getImage(), 0, 30, null);
            g.drawRect(0, 600, 570, 499);
            g.drawLine(100, 100, 100, 100);
            setBackground(Color.black);
            Graphics2D g2 = (Graphics2D)g;
            System.out.println(i++);
        }
        public static int i = 0;

        public static void main(String[] args) {
            new Gif();
        }
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("MonkaS")) {
                myMethod();
            }
        }
         public void myMethod() {
            JOptionPane.showMessageDialog(this, "Uciekamy!!!" );
        }
}








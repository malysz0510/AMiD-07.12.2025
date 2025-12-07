import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerifyForms extends JFrame {

    private JButton przycisk1;
    private JCheckBox accept;
    private JTextField poleWieku;

    public VerifyForms() {
        super("Weryfikacja");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(400, 300);

        przycisk1 = new JButton("Zatwierdz");
        accept = new JCheckBox("Akceptuje regulamin");
        JLabel wiek = new JLabel("Podaj swoj wiek: ");
        poleWieku = new JTextField(10);

        przycisk1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String tekst = poleWieku.getText();
                int wiek;

                try {
                    wiek = Integer.parseInt(tekst);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Wpisz poprawny wiek (liczbę).");
                    return;
                }

                if (wiek >= 18 && accept.isSelected()) {
                    JOptionPane.showMessageDialog(null, "Rejestracja pomyślna!");
                } else {
                    JOptionPane.showMessageDialog(null, "Wymagany wiek 18+ i akceptacja regulaminu.");
                }
            }
        });
        this.add(wiek);
        this.add(poleWieku);
        this.add(accept);
        this.add(przycisk1);
        this.setVisible(true);
    }
}

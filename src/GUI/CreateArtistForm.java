package GUI;

import javax.swing.*;

public class CreateArtistForm extends JFrame{
    private JPanel panel1;
    private JTextField artistNameField;
    private JButton closeButton;
    private JButton createButton;

    public CreateArtistForm(){
        setContentPane(panel1);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

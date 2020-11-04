package GUI;

import app.Server;
import classes.Artist;
import interfaces.ICreateService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateArtistForm extends JFrame{
    private JPanel panel1;
    private JTextField artistNameField;
    private JButton closeButton;
    private JButton createButton;

    public CreateArtistForm(Server server){
        ICreateService createService = server;

        setContentPane(panel1);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String artistName = artistNameField.getText();

                System.out.println(artistName);

                Artist createdArtist = createService.createArtist(artistName);

                System.out.println(createdArtist.getId());
            }
        });
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}

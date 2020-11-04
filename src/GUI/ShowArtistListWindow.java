package GUI;

import app.Server;
import classes.Artist;
import interfaces.IReadService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShowArtistListWindow extends JFrame {
    private JPanel panel1;
    private JList artistList;
    private JButton updateButton;
    private DefaultListModel<String> dlm;

    public ShowArtistListWindow(Server server) {
        IReadService readService = server;

        // Модель списка
        dlm = new DefaultListModel<String>();

        for (Artist artist : readService.getAllArtist()) {
            dlm.add(0, artist.getName());
        }
        ;

        artistList.setModel(dlm);

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dlm.clear();
                for (Artist artist : readService.getAllArtist()) {
                    dlm.add(0, artist.getName());
                }
                ;
                artistList.setModel(dlm);
            }
        });

        setContentPane(panel1);
        setVisible(true);
        setSize(400, 400);
    }
}

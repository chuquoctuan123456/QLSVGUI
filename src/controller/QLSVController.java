package controller;

import view.QLSVView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QLSVController implements ActionListener {
    private QLSVView view ;

    public QLSVController(QLSVView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cm = e.getActionCommand();
        JOptionPane.showMessageDialog(view ,cm);

    }
}

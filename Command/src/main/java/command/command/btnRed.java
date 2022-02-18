package command.command;

import java.awt.event.*;
import java.awt.Color;
import java.awt.Panel;

public class btnRed implements ActionListener{

    Panel p;

    public void actionPerformed(ActionEvent e) {
        p.setBackground(Color.red);
      }
}

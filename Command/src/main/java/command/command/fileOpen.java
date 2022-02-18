package command.command;

import java.awt.event.*;
import java.awt.FileDialog;
import java.awt.Frame;

public class fileOpen implements ActionListener{

    Frame fr;

    public void actionPerformed(ActionEvent e) {
        FileDialog fDlg = new FileDialog(fr, "Open a file", FileDialog.LOAD);
        fDlg.show();;
      }
}

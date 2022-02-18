/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command.command;

/**
 *
 * @author sarawut
 */

import java.awt.*;

public class ActionCommand extends Frame{
    Menu mnuFile;
    MenuItem mnuOpen, mnuExit;
    Button btnRed;
    Panel p;
    Frame fr;

  //-----------------------------------------
  public ActionCommand() {
    super("Frame without commands");
    fr = this;
    MenuBar mbar = new MenuBar();
    setMenuBar(mbar);

    mnuFile = new Menu("File", true);
    mbar.add(mnuFile);

    mnuOpen = new MenuItem("Open...");
    mnuFile.add(mnuOpen);
    mnuExit = new MenuItem("Exit");
    mnuFile.add(mnuExit);

    mnuOpen.addActionListener(new fileOpen());
    mnuExit.addActionListener(new fileExit());

    btnRed = new Button("Red");
    p = new Panel();
    add(p);
    p.add(btnRed);  

    btnRed.addActionListener(new btnRed());
    setBounds(100, 100, 200, 100);
    setVisible(true);
  }

  private void exitClicked() {
    System.exit(0);
  }

  static public void main(String argv[]) {
    new ActionCommand();
  }
}

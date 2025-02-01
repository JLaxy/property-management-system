package Property;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Vaddproperties extends JFrame {

  private JLabel Lot, Block, City, Province, Area, HouseType;
  private JTextField LHouse, BHouse, CHouse, PHouse, AHouse;
  // private JComboBox HType;
  private JButton addbtn, cancelbtn;

  public Vaddproperties() {
    //Label
    Lot = new JLabel("Lot: ");
    Block = new JLabel("Block: ");
    City = new JLabel("City : ");
    Province = new JLabel("Province: ");
    Area = new JLabel("Area: ");
    HouseType = new JLabel("House Type: ");
    // Textfield
    LHouse = new JTextField(15);
    BHouse = new JTextField(15);
    CHouse = new JTextField(15);
    PHouse = new JTextField(15);
    AHouse = new JTextField(15);

    addbtn = new JButton("ADD");
    cancelbtn = new JButton("CANCEL");
    //JComboBox to have a dropdown list of House Type
    String[] Type = { "Bungalow", "Villa", "Contemporary", "Hut" };

    JComboBox<String> combo = new JComboBox<>(Type);
    // start at bungalow which index 0
    combo.setSelectedIndex(0);

    // container for label and text field
    Container C = getContentPane();
    // size of Frame
    this.setSize(500, 500);
    this.setVisible(true);
    // fix size
    this.setResizable(false);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setTitle("Build Dev Software - Adding Properties");

    C.setLayout(new GridBagLayout());
    //adjust the position
    GridBagConstraints c = new GridBagConstraints();
    c.fill = GridBagConstraints.BOTH;
    //add the first label inside the labelPanel
    c.insets = new Insets(15, 0, 10, 10);
    // use for alignment the content
    c.gridx = 0;
    c.gridy = 1;
    C.add(Lot, c);
    c.gridx = 0;
    c.gridy = 2;
    C.add(Block, c);
    c.gridx = 0;
    c.gridy = 3;
    C.add(City, c);
    c.gridx = 0;
    c.gridy = 4;
    C.add(Province, c);
    c.gridx = 0;
    c.gridy = 5;
    C.add(Area, c);
    c.gridx = 0;
    c.gridy = 6;
    C.add(HouseType, c);

    // use for alignment the content
    c.gridx = 1;
    c.gridy = 1;
    C.add(LHouse, c);
    c.gridx = 1;
    c.gridy = 2;
    C.add(BHouse, c);
    c.gridx = 1;
    c.gridy = 3;
    C.add(CHouse, c);
    c.gridx = 1;
    c.gridy = 4;
    C.add(PHouse, c);
    c.gridx = 1;
    c.gridy = 5;
    C.add(AHouse, c);
    c.gridx = 1;
    c.gridy = 30;
    C.add(addbtn, c);
    c.gridx = 2;
    c.gridy = 30;
    C.add(cancelbtn, c);
    c.gridx = 1;
    c.gridy = 6;
    C.add(combo, c);
  }

  // set for cancelbtn
  public void setCancelButtonListener(ActionListener listener) {
    cancelbtn.addActionListener(listener);
  }

  // set for addbtn
  public void setAddButtonListener(ActionListener listener) {
    addbtn.addActionListener(listener);
  }
}

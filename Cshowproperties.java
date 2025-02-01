import Property.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Cshowproperties {

  Vshowproperties mainframe;

  public Cshowproperties(ArrayList<Property> properties) {
    mainframe = new Vshowproperties(properties);
    //Adding action listeners
    mainframe.setReturnListener(new returnListener());
  }

  public class returnListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      mainframe.dispose();
      new CMainView();
    }
  }
}

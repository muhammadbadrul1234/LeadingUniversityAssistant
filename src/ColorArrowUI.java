import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.plaf.ComboBoxUI;
import javax.swing.plaf.basic.BasicArrowButton;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;

class ColorArrowUI extends BasicComboBoxUI {


    public static ComboBoxUI createUI(JComponent c) {
        return new ColorArrowUI();
    }

    @Override protected JButton createArrowButton() {
        return new BasicArrowButton(
                BasicArrowButton.SOUTH,
            Color.getHSBColor(199, 31.0, 39.2),
            Color.RGBtoHSB(69, 90, 100, hsbvals)
            , Color.magenta,
            Color.yellow, Color.blue);
    }
}
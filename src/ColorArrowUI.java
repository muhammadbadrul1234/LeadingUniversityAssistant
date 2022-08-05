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
            Color.getColor(69,90,100),
            Color.RGBtoHSB(69, 90, 100, 199)
            , Color.magenta,
            Color.yellow, Color.blue);
    }
}
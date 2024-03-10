package org.openjfx;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML
    private CheckBox bokmålBoolean;

    @FXML
    private TextArea inputText;

    @FXML
    private Label outputLabel;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");

    }

    @FXML
    public void translateText() {
        String text = inputText.getText();
        boolean bokmålStatus = bokmålBoolean.isSelected();
        Translation translate = new Translation(text, bokmålStatus);
        
        String translatedOutput = translate.getTranslation();
        outputLabel.setText(translatedOutput);

    }
}

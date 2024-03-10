package org.openjfx;

import java.io.IOException;

import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.util.Duration;

public class PrimaryController {

    @FXML
    private CheckBox bokmålBoolean;

    @FXML
    private TextArea inputText;

    @FXML
    private Label outputLabel;

    @FXML
    private Button copyButton;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");

    }

    @FXML
    public void copyToClipboard() {
        Clipboard clipboard = Clipboard.getSystemClipboard();
        ClipboardContent copiedText = new ClipboardContent();

        copiedText.putString(outputLabel.getText());
        clipboard.setContent(copiedText);

        copyButton.setText("Kopiert!");

            PauseTransition delay = new PauseTransition(Duration.seconds(2)); //skaper en pause på 2 sek
            delay.setOnFinished(actionEvent -> copyButton.setText("Kopier")); //setter teksten til knappen tilbake etter pausen
            delay.play();

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

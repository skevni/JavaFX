package ru.geekbrains.javacore2.sklyarov.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    TextArea chatBox;
    @FXML
    TextField messageField;

    public void sendMessage() {
//        int width = (int) (chatBox.getWidth() * 0.07);
//        StringBuilder sb = new StringBuilder();
//        String text = messageField.getText();
//        for (int i = 0; i < text.length(); i += width) {
//            if ((i + width) > text.length()) {
//                sb.append(text.substring(i) + "\n\n");
//            } else {
//                sb.append(text.substring(i, i + width) + "\n");
//            }
//        }
//        chatBox.appendText(sb.toString());
        chatBox.appendText(messageField.getText()+"\n\n");
        messageField.clear();
    }
}

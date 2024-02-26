package com.grey.guipasswordgenerator;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable
{

    @FXML
    private Button btnGeneratePass;
    @FXML
    private CheckBox chkSpecial;
    @FXML
    private Label lblHeading;
    @FXML
    private ChoiceBox<Integer> choicePassLength;
    @FXML
    private Button btnCopy;
    @FXML
    private CheckBox chkNumbers;
    @FXML
    private TextField txtPassword;

    private String alphabet = "abcdefghijklmnopqrstuvwxyz";
    private String numbers = "0123456789";
    private String specials = "!@#$%^&*()_+-=?<>.,";
    @FXML
    private Button btnClear;
    Password newPassword;

    int length;
    boolean withNumber, withSpecial;

    public void initialize(URL url, ResourceBundle rb)
    {
        loadInitialState();
    }

    private void loadInitialState()
    {
        // Create values for password length
        ArrayList<Integer> choices = new ArrayList<>();
        choices.add(8);
        choices.add(12);
        choices.add(16);

        // Add password length values to choicebox
        choicePassLength.getItems().add(choices.get(0));
        choicePassLength.getItems().add(choices.get(1));
        choicePassLength.getItems().add(choices.get(2));
        choicePassLength.setValue(choices.get(0));

        //
    }

    @FXML
    public void isNumbersIncluded(ActionEvent actionEvent)
    {

    }

    public boolean checkNumbers(boolean status)
    {
        return status;
    }

    public boolean checkSpecial(boolean status)
    {
        return status;
    }

    @FXML
    public void isSpecialIncluded(ActionEvent actionEvent)
    {

    }

    @FXML
    public void selectPassLength(Event event) {
    }

    @FXML
    public String copyPassword(ActionEvent actionEvent)
    {
        String password = txtPassword.toString();
        return password;
    }

    @FXML
    public void generatePassword(ActionEvent actionEvent)
    {
        withSpecial = chkSpecial.isSelected();
        withNumber = chkNumbers.isSelected();
        length = choicePassLength.getValue();
        Random rand = new Random();
        StringBuilder password = new StringBuilder();
        for(int i = 0; i < length; i++)
        {
            int x = 0;
            for(int j = 0; j < alphabet.length(); j++)
            {
                x = rand.nextInt(alphabet.length());
            }
            char temp = alphabet.charAt(x);
            password.append(temp);
        }
        if(withNumber)
        {
            String passNums = password.toString();
//            passNums.replace();
        }
        txtPassword.setText(password.toString());
        lblHeading.setText("Here's your password...");
    }

    @FXML
    public void clearTextField(ActionEvent actionEvent)
    {
        txtPassword.setText("");
        lblHeading.setText("GUI Password Generator");
    }
}

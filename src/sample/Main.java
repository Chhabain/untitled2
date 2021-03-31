package sample;

import javax.swing.*;
public class Main{
    private final static int NUMBER_OF_ATTEMPT_EXCEEDED = 0;
    private final static int SUCCESS = 1;
    private final static int CANCELED = 2;
    public static void main(String [] args){

        // creating object
        will will = new will();
        Object [] inputOptions = will.getInputOptions(); // Input options for JOptionPane Dialog

        // showing correct credential
        JOptionPane.showMessageDialog(null, "Credential\n\nUser name = will \n\n Password = will786\n\n");
        int flag = validateCredential();

        // checking if credential valid
        if(flag == NUMBER_OF_ATTEMPT_EXCEEDED){
            JOptionPane.showMessageDialog(null, "You exceeded the number of trials");
        }else if(flag == SUCCESS){

            int input = JOptionPane.showConfirmDialog(null, inputOptions, "Will's Moving", JOptionPane.OK_CANCEL_OPTION);
            if(input== JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null, will.getOutputString());
            }
        }

    }

    public static int validateCredential(){
        // ask for credential 3 times until its valid
        for(int i=0;i<3;i++){
            JTextField textFirstName = new JTextField();
            JTextField textLastName = new JTextField();
            Object[] fields = {"Enter your Credentials: Attempt "+(i+1)+" of 3", "\nUser name", textFirstName, "Password", textLastName};

            int input = JOptionPane.showConfirmDialog(null, fields, "Will's Moving", JOptionPane.OK_CANCEL_OPTION);
            if(input == JOptionPane.CANCEL_OPTION){
                return CANCELED;
            }
            if(textFirstName.getText().toLowerCase().equals("will") && textLastName.getText().toLowerCase().equals("will786")){
                return SUCCESS;
            }else{
                if(i<2)
                    JOptionPane.showMessageDialog(null, "Wrong Credential! Try Again");
            }
        }
        return NUMBER_OF_ATTEMPT_EXCEEDED;
    }

}


//My first project published

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.Random;


public class TicTacToe {

    private static boolean turn = true;
    Random random = new Random();

      public void Grid() {

          JFrame frame = new JFrame("Tic Tac Toe");
          

          //Set the layout to a 3x3 grid
          GridLayout grid = new GridLayout(3, 3);

          frame.setVisible(true);
          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          frame.setSize(600, 600);
          frame.setLayout(grid);
          frame.setResizable(false);



          //create the number of buttons
       JButton[] buttons = new JButton[9];
       for (int i = 0; i < buttons.length; i++) {
           buttons[i] = new JButton("Button" + (i + 1));

           buttons[i].addActionListener(new ActionListener() {

               @Override
               public void actionPerformed(ActionEvent e) {
                   //change the text of the button clicked
                   JButton clickedButton = (JButton) e.getSource();
                   //logic to press the button and change it, and then i the clicked button to false
                   // so we cant press it again
                    if (turn) {
                        clickedButton.setText("O");
                        clickedButton.setEnabled(false);
                        turn = false;
                    } else  {
                       clickedButton.setText("X");
                        clickedButton.setEnabled(false);
                        turn = true;
                    }



                       //clickedButton.setText("CLicked");

               }
           });
           //add the buttons to the panel
           frame.getContentPane().add(buttons[i]);
       }
 //   private boolean whoWon() {

          }
      }

// I need to set a series a steps in order to make a player press down a button and mark it with
//an O or an X, and then create the logic to check what player wins

//}
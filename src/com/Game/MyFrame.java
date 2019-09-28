package com.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private JButton oneButton, twoButton, threeButton, fourButton, fiveButton,
    sixButton, sevenButton, eightButton, nineButton;

    Color buttonsColor = Color.GRAY;

    public MyFrame() throws HeadlessException {

        super("TicTacToe");

        oneButton = new JButton();
        oneButton.setSize(80,80);
        oneButton.setMinimumSize(new Dimension(80,80));
        oneButton.setBackground(buttonsColor);
        twoButton = new JButton();
        twoButton.setMinimumSize(new Dimension(80,80));
        twoButton.setSize(80,80);
        twoButton.setBackground(buttonsColor);
        threeButton = new JButton();
        threeButton.setMinimumSize(new Dimension(80,80));
        threeButton.setSize(80,80);
        threeButton.setBackground(buttonsColor);
        fourButton = new JButton();
        fourButton.setMinimumSize(new Dimension(80,80));
        fourButton.setSize(80, 80);
        fourButton.setBackground(buttonsColor);
        fiveButton = new JButton();
        fiveButton.setMinimumSize(new Dimension(80,80));
        fiveButton.setSize(80,80);
        fiveButton.setBackground(buttonsColor);
        sixButton = new JButton();
        sixButton.setMinimumSize(new Dimension(80,80));
        sixButton.setSize(80, 80);
        sixButton.setBackground(buttonsColor);
        sevenButton = new JButton();
        sevenButton.setMinimumSize(new Dimension(80,80));
        sevenButton.setSize(80, 80);
        sevenButton.setBackground(buttonsColor);
        eightButton = new JButton();
        eightButton.setMinimumSize(new Dimension(80,80));
        eightButton.setSize(80, 80);
        eightButton.setBackground(buttonsColor);
        nineButton = new JButton();
        nineButton.setMinimumSize(new Dimension(80,80));
        nineButton.setSize(80,80);
        nineButton.setBackground(buttonsColor);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(oneButton)
                        .addComponent(fourButton)
                        .addComponent(sevenButton)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(twoButton)
                        .addComponent(fiveButton)
                        .addComponent(eightButton)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(threeButton)
                        .addComponent(sixButton)
                        .addComponent(nineButton)
                )
        );

        //layout.linkSize(SwingConstants.HORIZONTAL, oneButton, twoButton, threeButton, fourButton,
         //       fiveButton, sixButton, sevenButton, eightButton, nineButton);

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(oneButton)
                        .addComponent(twoButton)
                        .addComponent(threeButton)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(fourButton)
                        .addComponent(fiveButton)
                        .addComponent(sixButton)
                )
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(sevenButton)
                        .addComponent(eightButton)
                        .addComponent(nineButton)
                )
        );
        setPreferredSize(new Dimension(300,320));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

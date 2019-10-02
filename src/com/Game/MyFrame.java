package com.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    private JButton oneButton, twoButton, threeButton, fourButton, fiveButton,
    sixButton, sevenButton, eightButton, nineButton, gameOnOffButton;

    private JTextField comunicat;
    //private JLabel comunicat;

    private Color buttonsColor = Color.GRAY;

    private int counter = 0, iconInt = 4;
    private String path;
    private Boolean planAgain = true, Mytour = true;


    int [][] tab = new int[3][3];


    public MyFrame() throws HeadlessException {

        super("TicTacToe");

        comunicat = new JTextField();
        comunicat.setMaximumSize(new Dimension(300, 40));
        comunicat.setText("Let's Play!");
        comunicat.setFont(comunicat.getFont().deriveFont(32.0f));
        comunicat.setHorizontalAlignment( SwingConstants.CENTER );
        comunicat.setEditable(false);

        gameOnOffButton = new JButton();
        gameOnOffButton.setText("Start");
        gameOnOffButton.addActionListener(this);

        oneButton = new JButton();
        oneButton.setSize(100,80);
        oneButton.setMinimumSize(new Dimension(100,80));
        oneButton.setBackground(buttonsColor);
        oneButton.addActionListener(this);

        twoButton = new JButton();
        twoButton.setMinimumSize(new Dimension(100,80));
        twoButton.setSize(100,80);
        twoButton.setBackground(buttonsColor);
        twoButton.addActionListener(this);

        threeButton = new JButton();
        threeButton.setMinimumSize(new Dimension(100,80));
        threeButton.setSize(100,80);
        threeButton.setBackground(buttonsColor);
        threeButton.addActionListener(this);

        fourButton = new JButton();
        fourButton.setMinimumSize(new Dimension(100,80));
        fourButton.setSize(100, 80);
        fourButton.setBackground(buttonsColor);
        fourButton.addActionListener(this);

        fiveButton = new JButton();
        fiveButton.setMinimumSize(new Dimension(100,80));
        fiveButton.setSize(100,80);
        fiveButton.setBackground(buttonsColor);
        fiveButton.addActionListener(this);

        sixButton = new JButton();
        sixButton.setMinimumSize(new Dimension(100,80));
        sixButton.setSize(100, 80);
        sixButton.setBackground(buttonsColor);
        sixButton.addActionListener(this);

        sevenButton = new JButton();
        sevenButton.setMinimumSize(new Dimension(100,80));
        sevenButton.setSize(100, 80);
        sevenButton.setBackground(buttonsColor);
        sevenButton.addActionListener(this);

        eightButton = new JButton();
        eightButton.setMinimumSize(new Dimension(100,80));
        eightButton.setSize(100, 80);
        eightButton.setBackground(buttonsColor);
        eightButton.addActionListener(this);

        nineButton = new JButton();
        nineButton.setMinimumSize(new Dimension(100,80));
        nineButton.setSize(100,80);
        nineButton.setBackground(buttonsColor);
        nineButton.addActionListener(this);

        oneButton.setEnabled(false);
        twoButton.setEnabled(false);
        threeButton.setEnabled(false);
        fourButton.setEnabled(false);
        fiveButton.setEnabled(false);
        sixButton.setEnabled(false);
        sevenButton.setEnabled(false);
        eightButton.setEnabled(false);
        nineButton.setEnabled(false);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setAutoCreateContainerGaps(true);
        layout.setAutoCreateGaps(true);

        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addComponent(gameOnOffButton)
                        .addComponent(comunicat)
                )
                .addGap(10)
                .addGroup(layout.createSequentialGroup()
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
                )
        );

        //layout.linkSize(SwingConstants.HORIZONTAL, oneButton, twoButton, threeButton, fourButton,
                //fiveButton, sixButton, sevenButton, eightButton, nineButton);

        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(gameOnOffButton)
                        .addComponent(comunicat)
                )
                .addGap(10)
                .addGroup(layout.createSequentialGroup()
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
                )
        );

        setPreferredSize(new Dimension(350,385));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        validate();

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource();


        if(source == oneButton)
        {
            PickMeUp(1);
            Mytour = false;
            LetsPlay();
        }
        else if(source == twoButton)
        {
            PickMeUp(2);
            Mytour = false;
            LetsPlay();
        }
        else if(source == threeButton)
        {
           PickMeUp(3);
            Mytour = false;
            LetsPlay();
        }
        else if(source == fourButton)
        {
            PickMeUp(4);
            Mytour = false;
            LetsPlay();
        }
        else if(source == fiveButton)
        {
            PickMeUp(5);
            Mytour = false;
            LetsPlay();
        }
        else if(source == sixButton)
        {
           PickMeUp(6);
            Mytour = false;
            LetsPlay();
        }
        else if(source == sevenButton)
        {
           PickMeUp(7);
            Mytour = false;
            LetsPlay();
        }
        else if(source == eightButton)
        {
            PickMeUp(8);
            Mytour = false;
            LetsPlay();
        }
        else if(source == nineButton)
        {
            PickMeUp(9);
            Mytour = false;
            LetsPlay();
        }
        else  if(source == gameOnOffButton)
        {
                 planAgain = true;
                gameOnOffButton.setText("Restart");
                comunicat.setText("Let's Play!");
                counter = 0;
                for(int i =0; i<3; i++)
                    for(int j=0; j<3; j++)
                    tab[i][j]=0;

                oneButton.setEnabled(true);
                twoButton.setEnabled(true);
                threeButton.setEnabled(true);
                fourButton.setEnabled(true);
                fiveButton.setEnabled(true);
                sixButton.setEnabled(true);
                sevenButton.setEnabled(true);
                eightButton.setEnabled(true);
                nineButton.setEnabled(true);

                oneButton.setIcon(null);
                twoButton.setIcon(null);
                threeButton.setIcon(null);
                fourButton.setIcon(null);
                fiveButton.setIcon(null);
                sixButton.setIcon(null);
                sevenButton.setIcon(null);
                eightButton.setIcon(null);
                nineButton.setIcon(null);

                oneButton.setBackground(buttonsColor);
                twoButton.setBackground(buttonsColor);
                threeButton.setBackground(buttonsColor);
                fourButton.setBackground(buttonsColor);
                fiveButton.setBackground(buttonsColor);
                sixButton.setBackground(buttonsColor);
                sevenButton.setBackground(buttonsColor);
                eightButton.setBackground(buttonsColor);
                nineButton.setBackground(buttonsColor);
            }

        if(planAgain == false)
        {
            comunicat.setText("Game Over");
            oneButton.setEnabled(false);
            twoButton.setEnabled(false);
            threeButton.setEnabled(false);
            fourButton.setEnabled(false);
            fiveButton.setEnabled(false);
            sixButton.setEnabled(false);
            sevenButton.setEnabled(false);
            eightButton.setEnabled(false);
            nineButton.setEnabled(false);

        }

    }

    Boolean CheckOutcome()
    {
        Boolean winner = false;

        if(tab[0][0] == 1  && tab[0][1] == 1 && tab[0][2] == 1)
        {
            winner = true;
            oneButton.setBackground(Color.CYAN);
            twoButton.setBackground(Color.CYAN);
            threeButton.setBackground(Color.CYAN);
        }
        if(tab[1][0] == 1  && tab[1][1] == 1 && tab[1][2] == 1)
        {
            winner = true;
            fourButton.setBackground(Color.CYAN);
            fiveButton.setBackground(Color.CYAN);
            sixButton.setBackground(Color.CYAN);
        }
        if(tab[2][0] == 1  && tab[2][1] == 1 && tab[2][2] == 1)
        {
            winner = true;
            sevenButton.setBackground(Color.CYAN);
            eightButton.setBackground(Color.CYAN);
            nineButton.setBackground(Color.CYAN);
        }
        if(tab[0][0] == 1  && tab[1][0] == 1 && tab[2][0] == 1)
        {
            winner = true;
            oneButton.setBackground(Color.CYAN);
            fourButton.setBackground(Color.CYAN);
            sevenButton.setBackground(Color.CYAN);
        }
        if(tab[0][1] == 1  && tab[1][1] == 1 && tab[2][1] == 1)
        {
            winner = true;
            twoButton.setBackground(Color.CYAN);
            fiveButton.setBackground(Color.CYAN);
            eightButton.setBackground(Color.CYAN);
        }
        if(tab[0][2] == 1  && tab[1][2] == 1 && tab[2][2] == 1)
        {
            winner = true;
            threeButton.setBackground(Color.CYAN);
            sixButton.setBackground(Color.CYAN);
            nineButton.setBackground(Color.CYAN);
        }
        if(tab[0][0] == 1  && tab[1][1] == 1 && tab[2][2] == 1)
        {
            winner = true;
            oneButton.setBackground(Color.CYAN);
            fiveButton.setBackground(Color.CYAN);
            nineButton.setBackground(Color.CYAN);
        }
        if(tab[0][2] == 1  && tab[1][1] == 1 && tab[2][0] == 1)
        {
            winner = true;
            threeButton.setBackground(Color.CYAN);
            fiveButton.setBackground(Color.CYAN);
            sevenButton.setBackground(Color.CYAN);
        }

        if(tab[0][0] == 2  && tab[0][1] == 2 && tab[0][2] == 2)
        {
            winner = true;
            oneButton.setBackground(Color.CYAN);
            twoButton.setBackground(Color.CYAN);
            threeButton.setBackground(Color.CYAN);
        }
        if(tab[1][0] == 2  && tab[1][1] == 2 && tab[1][2] == 2)
        {
            winner = true;
            fourButton.setBackground(Color.CYAN);
            fiveButton.setBackground(Color.CYAN);
            sixButton.setBackground(Color.CYAN);
        }
        if(tab[2][0] == 2  && tab[2][1] == 2 && tab[2][2] == 2)
        {
            winner = true;
            sevenButton.setBackground(Color.CYAN);
            eightButton.setBackground(Color.CYAN);
            nineButton.setBackground(Color.CYAN);
        }
        if(tab[0][0] == 2  && tab[1][0] == 2 && tab[2][0] == 2)
        {
            winner = true;
            oneButton.setBackground(Color.CYAN);
            fourButton.setBackground(Color.CYAN);
            sevenButton.setBackground(Color.CYAN);
        }
        if(tab[0][1] == 2  && tab[1][1] == 2 && tab[2][1] == 2)
        {
            winner = true;
            twoButton.setBackground(Color.CYAN);
            fiveButton.setBackground(Color.CYAN);
            eightButton.setBackground(Color.CYAN);
        }
        if(tab[0][2] == 2  && tab[1][2] == 2 && tab[2][2] == 2)
        {
            winner = true;
            threeButton.setBackground(Color.CYAN);
            sixButton.setBackground(Color.CYAN);
            nineButton.setBackground(Color.CYAN);
        }
        if(tab[0][0] == 2  && tab[1][1] == 2 && tab[2][2] == 2)
        {
            winner = true;
            oneButton.setBackground(Color.CYAN);
            fiveButton.setBackground(Color.CYAN);
            nineButton.setBackground(Color.CYAN);
        }
        if(tab[0][2] == 2  && tab[1][1] == 2 && tab[2][0] == 2)
        {
            winner = true;
            threeButton.setBackground(Color.CYAN);
            fiveButton.setBackground(Color.CYAN);
            sevenButton.setBackground(Color.CYAN);
        }

        return winner;

    }

    void PickMeUp(int myChoice)
    {
        if(counter%2 == 0)
        {
            path = "C:\\Pigi\\project\\TicTacToe\\src\\com\\Game\\bigblacko.png";
            iconInt = 1;
        }
        else
        {
            path = "C:\\Pigi\\project\\TicTacToe\\src\\com\\Game\\bigblackx.png";
            iconInt = 2;
        }

        switch (myChoice) {
            case 1:
                    if (oneButton.getIcon() == null) {
                        System.out.println(counter);
                    oneButton.setIcon(new ImageIcon(path));
                    counter++;
                    tab[0][0] = iconInt;

                    if (CheckOutcome() == true)
                        planAgain = false;
                }
            break;
            case 2:
                    if( twoButton.getIcon() == null ) {
                        System.out.println(counter);
                        twoButton.setIcon(new ImageIcon(path));
                        counter++;
                        tab[0][1] = iconInt;

                        if (CheckOutcome() == true)
                            planAgain = false;
                    }
                break;
            case 3:
                if( threeButton.getIcon() == null ) {
                    System.out.println(counter);
                    threeButton.setIcon(new ImageIcon(path));
                    counter++;
                    tab[0][2] = iconInt;

                    if (CheckOutcome() == true)
                        planAgain = false;
                }
                break;
            case 4:
                if( fourButton.getIcon() == null ) {
                    System.out.println(counter);
                    fourButton.setIcon(new ImageIcon(path));
                    counter++;
                    tab[1][0] = iconInt;

                    if (CheckOutcome() == true)
                        planAgain = false;
                }
                break;
            case 5:
                if( fiveButton.getIcon() == null ) {
                    System.out.println(counter);
                    fiveButton.setIcon(new ImageIcon(path));
                    counter++;
                    tab[1][1] = iconInt;

                    if (CheckOutcome() == true)
                        planAgain = false;
                }
                break;
            case 6:
                if( sixButton.getIcon() == null ) {
                    System.out.println(counter);
                    sixButton.setIcon(new ImageIcon(path));
                    counter++;
                    tab[1][2] = iconInt;

                    if (CheckOutcome() == true)
                        planAgain = false;
                }
                break;
            case 7:
                if (sevenButton.getIcon() == null) {
                    System.out.println(counter);
                    sevenButton.setIcon(new ImageIcon(path));
                    counter++;
                    tab[2][0] = iconInt;

                    if (CheckOutcome() == true)
                        planAgain = false;
                }
                break;
            case 8:
                if( eightButton.getIcon() == null ) {

                    System.out.println(counter);
                    eightButton.setIcon(new ImageIcon(path));
                    counter++;
                    tab[2][1] = iconInt;

                    if (CheckOutcome() == true)
                        planAgain = false;
                }
                break;
            case 9:
                if( nineButton.getIcon() == null ) {
                    System.out.println(counter);
                    nineButton.setIcon(new ImageIcon(path));
                    counter++;
                    tab[2][2] = iconInt;

                    if (CheckOutcome() == true)
                        planAgain = false;
                }
                break;
            default:
                //wyjatek
                break;
        }
    }

    public void LetsPlay()
    {
        Player player = new Player();
        if(Mytour == false) {
                int move = player.Move(tab);
                PickMeUp(move+1);
                Mytour = true;
        }
    }

}
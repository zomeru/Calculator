import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.regex.Pattern;


public class Calculator extends JFrame {

    private JPanel btnPanel = new JPanel();
    private JPanel textPanel = new JPanel();
    private JButton btnZero = new JButton();
    private JButton btnOne = new JButton();
    private JButton btnTwo = new JButton();
    private JButton btnThree = new JButton();
    private JButton btnFour = new JButton();
    private JButton btnFive = new JButton();
    private JButton btnSix = new JButton();
    private JButton btnSeven = new JButton();
    private JButton btnEight = new JButton();
    private JButton btnNine = new JButton();
    private JButton btnPlus = new JButton();
    private JButton btnMinus = new JButton();
    private JButton btnMultiply = new JButton();
    private JButton btnDivide = new JButton();
    private JButton btnEqual = new JButton();
    private JButton btnDot = new JButton();
    private JButton btnDel = new JButton();
    private JButton btnClear = new JButton();
    private JButton btnPosNeg = new JButton();
    private JButton btnPercent = new JButton();
    private JTextField textDisplay = new JTextField();
    private JLabel topTxt = new JLabel();

    private ImageIcon frameIcon = new ImageIcon(getClass().getResource("/buttons/math_icon_50px.png"));

    private char opt = ' ';
    private boolean go = true;
    private boolean addWrite = true;
    private double val = 0;

    public Calculator() { //Constructor

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setPreferredSize(new Dimension(306, 538));
        setResizable(false);
        setIconImage(frameIcon.getImage());


        buttons();
        btnPanel();
        textPanel();
        pack();

        setLocationRelativeTo(null);
    }

    private void buttons() {

        //Button Panel
        btnPanel.setBackground(new Color(69, 73, 76));
        btnPanel.setPreferredSize(new Dimension(360, 290));

        //Button Zero
        btnZero.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnZero.setForeground(new Color(255, 255, 255));
        btnZero.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnZero.setText("0");
        btnZero.setHorizontalTextPosition(SwingConstants.CENTER);
        btnZero.setPreferredSize(new Dimension(70, 70));
        btnZero.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnZero.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnZeroActionPerformed(e);
            }
        });

        //Button One
        btnOne.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnOne.setForeground(new Color(255, 255, 255));
        btnOne.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnOne.setText("1");
        btnOne.setHorizontalTextPosition(SwingConstants.CENTER);
        btnOne.setPreferredSize(new Dimension(70, 70));
        btnOne.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnOne.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnOneActionPerformed(e);
            }
        });

        //Button Two
        btnTwo.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnTwo.setForeground(new Color(255, 255, 255));
        btnTwo.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnTwo.setText("2");
        btnTwo.setHorizontalTextPosition(SwingConstants.CENTER);
        btnTwo.setPreferredSize(new Dimension(70, 70));
        btnTwo.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnTwo.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnTwoActionPerformed(e);
            }
        });

        //Button Three
        btnThree.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnThree.setForeground(new Color(255, 255, 255));
        btnThree.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnThree.setText("3");
        btnThree.setHorizontalTextPosition(SwingConstants.CENTER);
        btnThree.setPreferredSize(new Dimension(70, 70));
        btnThree.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnThree.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnThreeActionPerformed(e);
            }
        });

        //Button Four
        btnFour.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnFour.setForeground(new Color(255, 255, 255));
        btnFour.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnFour.setText("4");
        btnFour.setHorizontalTextPosition(SwingConstants.CENTER);
        btnFour.setPreferredSize(new Dimension(70, 70));
        btnFour.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnFour.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnFourActionPerformed(e);
            }
        });

        //Button Five
        btnFive.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnFive.setForeground(new Color(255, 255, 255));
        btnFive.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnFive.setText("5");
        btnFive.setHorizontalTextPosition(SwingConstants.CENTER);
        btnFive.setPreferredSize(new Dimension(70, 70));
        btnFive.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnFive.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnFiveActionPerformed(e);
            }
        });

        //Button Six
        btnSix.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnSix.setForeground(new Color(255, 255, 255));
        btnSix.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnSix.setText("6");
        btnSix.setHorizontalTextPosition(SwingConstants.CENTER);
        btnSix.setPreferredSize(new Dimension(70, 70));
        btnSix.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnSix.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSixActionPerformed(e);
            }
        });

        //Button Seven
        btnSeven.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnSeven.setForeground(new Color(255, 255, 255));
        btnSeven.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnSeven.setText("7");
        btnSeven.setHorizontalTextPosition(SwingConstants.CENTER);
        btnSeven.setPreferredSize(new Dimension(70, 70));
        btnSeven.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnSeven.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnSevenActionPerformed(e);
            }
        });

        //Button Eight
        btnEight.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnEight.setForeground(new Color(255, 255, 255));
        btnEight.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnEight.setText("8");
        btnEight.setHorizontalTextPosition(SwingConstants.CENTER);
        btnEight.setPreferredSize(new Dimension(70, 70));
        btnEight.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnEight.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnEightActionPerformed(e);
            }
        });

        //Button Nine
        btnNine.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnNine.setForeground(new Color(255, 255, 255));
        btnNine.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnNine.setText("9");
        btnNine.setHorizontalTextPosition(SwingConstants.CENTER);
        btnNine.setPreferredSize(new Dimension(70, 70));
        btnNine.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnNine.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnNineActionPerformed(e);
            }
        });

        //Button Dot
        btnDot.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnDot.setForeground(new Color(255, 255, 255));
        btnDot.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnDot.setText(".");
        btnDot.setHorizontalTextPosition(SwingConstants.CENTER);
        btnDot.setPreferredSize(new Dimension(70, 70));
        btnDot.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnDot.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnDotActionPerformed(e);
            }
        });

        //Button Del
        btnDel.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnDel.setForeground(new Color(255, 255, 255));
        btnDel.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnDel.setText("del");
        btnDel.setHorizontalTextPosition(SwingConstants.CENTER);
        btnDel.setPreferredSize(new Dimension(70, 70));
        btnDel.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnDel.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnDelActionPerformed(e);
            }
        });

        //Button Clear
        btnClear.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnClear.setForeground(new Color(255, 255, 255));
        btnClear.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnClear.setText("C");
        btnClear.setHorizontalTextPosition(SwingConstants.CENTER);
        btnClear.setPreferredSize(new Dimension(70, 70));
        btnClear.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnClear.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClearActionPerformed(e);
            }
        });

        //Button Clear
        btnClear.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnClear.setForeground(new Color(255, 255, 255));
        btnClear.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnClear.setText("C");
        btnClear.setHorizontalTextPosition(SwingConstants.CENTER);
        btnClear.setPreferredSize(new Dimension(70, 70));
        btnClear.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnClear.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnClearActionPerformed(e);
            }
        });

        //Button Positive Negative
        btnPosNeg.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnPosNeg.setForeground(new Color(255, 255, 255));
        btnPosNeg.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnPosNeg.setText("+/-");
        btnPosNeg.setHorizontalTextPosition(SwingConstants.CENTER);
        btnPosNeg.setPreferredSize(new Dimension(70, 70));
        btnPosNeg.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnPosNeg.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnPosNeg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPosNegActionPerformed(e);
            }
        });

        //Button Percent
        btnPercent.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnPercent.setForeground(new Color(255, 255, 255));
        btnPercent.setIcon(new ImageIcon(getClass().getResource("/buttons/box.jpg")));
        btnPercent.setText("%");
        btnPercent.setHorizontalTextPosition(SwingConstants.CENTER);
        btnPercent.setPreferredSize(new Dimension(70, 70));
        btnPercent.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_clicked.jpg")));
        btnPercent.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_hover.jpg")));
        btnPercent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnPercentActionPerformed(e);
            }
        });

        //Button Plus
        btnPlus.setFont(new Font("Roboto Condensed", 1, 18));
        btnPlus.setForeground(new Color(255, 255, 255));
        btnPlus.setIcon(new ImageIcon(getClass().getResource("/buttons/box_purple.jpg")));
        btnPlus.setText("+");
        btnPlus.setHorizontalTextPosition(SwingConstants.CENTER);
        btnPlus.setPreferredSize(new Dimension(70, 70));
        btnPlus.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_purple_clicked.jpg")));
        btnPlus.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_purple_hover.jpg")));
        btnPlus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnPlusActionPerformed(e);
            }
        });

        //Button Minus
        btnMinus.setFont(new Font("Roboto Condensed", 1, 18));
        btnMinus.setForeground(new Color(255, 255, 255));
        btnMinus.setIcon(new ImageIcon(getClass().getResource("/buttons/box_purple.jpg")));
        btnMinus.setText("-");
        btnMinus.setHorizontalTextPosition(SwingConstants.CENTER);
        btnMinus.setPreferredSize(new Dimension(70, 70));
        btnMinus.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_purple_clicked.jpg")));
        btnMinus.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_purple_hover.jpg")));
        btnMinus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnMinusActionPerformed(e);
            }
        });

        //Button Multiply
        btnMultiply.setFont(new Font("Roboto Condensed Light", 1, 18));
        btnMultiply.setForeground(new .Color(255, 255, 255));
        btnMultiply.setIcon(new ImageIcon(getClass().getResource("/buttons/box_purple.jpg")));
        btnMultiply.setText("x");
        btnMultiply.setHorizontalTextPosition(SwingConstants.CENTER);
        btnMultiply.setPreferredSize(new Dimension(70, 70));
        btnMultiply.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_purple_clicked.jpg")));
        btnMultiply.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_purple_hover.jpg")));
        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnMultiplyActionPerformed(e);
            }
        });

        //Button Divide
        btnDivide.setFont(new Font("Roboto Condensed", 1, 18));
        btnDivide.setForeground(new Color(255, 255, 255));
        btnDivide.setIcon(new ImageIcon(getClass().getResource("/buttons/box_purple.jpg")));
        btnDivide.setText("÷");
        btnDivide.setHorizontalTextPosition(SwingConstants.CENTER);
        btnDivide.setPreferredSize(new Dimension(70, 70));
        btnDivide.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_purple_clicked.jpg")));
        btnDivide.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_purple_hover.jpg")));
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnDivideActionPerformed(e);
            }
        });

        //Button Equal
        btnEqual.setFont(new Font("Roboto Condensed", 1, 18));
        btnEqual.setForeground(new java.awt.Color(51, 51, 51));
        btnEqual.setIcon(new ImageIcon(getClass().getResource("/buttons/box_yellow.jpg")));
        btnEqual.setText("=");
        btnEqual.setHorizontalTextPosition(SwingConstants.CENTER);
        btnEqual.setPreferredSize(new Dimension(70, 70));
        btnEqual.setPressedIcon(new ImageIcon(getClass().getResource("/buttons/box_yellow_clicked.jpg")));
        btnEqual.setRolloverIcon(new ImageIcon(getClass().getResource("/buttons/box_yellow_hover.jpg")));
        btnEqual.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                btnEqualActionPerformed(e);
            }
        });




    }

    private void btnPanel() {
        GroupLayout btnPanelLayout = new GroupLayout(btnPanel);
        btnPanel.setLayout(btnPanelLayout);
        btnPanelLayout.setHorizontalGroup(
                btnPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(btnPanelLayout.createSequentialGroup()
                                .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(btnPanelLayout.createSequentialGroup()
                                                .addGap(2, 2, 2)
                                                .addComponent(btnFour, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(btnPanelLayout.createSequentialGroup()
                                                .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addGroup(btnPanelLayout.createSequentialGroup()
                                                                .addGap(2, 2, 2)
                                                                .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnZero, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnOne, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(GroupLayout.Alignment.TRAILING, btnPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                .addComponent(btnClear, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(btnSeven, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                                .addGap(2, 2, 2)
                                                .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnEight, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(btnPanelLayout.createSequentialGroup()
                                                                .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                                        .addComponent(btnDot, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnTwo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(btnFive, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                .addGap(2, 2, 2)
                                                                .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(btnPanelLayout.createSequentialGroup()
                                                                                .addComponent(btnDel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(2, 2, 2)
                                                                                .addComponent(btnEqual, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(btnPanelLayout.createSequentialGroup()
                                                                                .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(btnNine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(btnThree, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(btnSix, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(btnPercent, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(2, 2, 2)
                                                                                .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(btnPlus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(btnMultiply, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(btnMinus, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(btnDivide, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                                                        .addComponent(btnPosNeg, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
                                .addGap(2, 2, 2))
        );
        btnPanelLayout.setVerticalGroup(
                btnPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, btnPanelLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPosNeg, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnPercent, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDivide, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnSix, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnMinus, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(btnPanelLayout.createSequentialGroup()
                                                .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnEight, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnNine, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnMultiply, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnSeven, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                                .addGap(2, 2, 2)
                                                .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnFour, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnFive, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))))
                                .addGap(2, 2, 2)
                                .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, btnPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnOne, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnTwo, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnThree, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                        .addComponent(btnPlus, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2)
                                .addGroup(btnPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnZero, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDot, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDel, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnEqual, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
                                .addGap(2, 2, 2))
        );

        getContentPane().add(btnPanel, java.awt.BorderLayout.CENTER);
    }

    private void textPanel() {
        textPanel.setBackground(new Color(250, 250, 250));

        topTxt.setFont(new Font("Roboto Condensed Light", 1, 18)); // NOI18N
        topTxt.setForeground(new Color(54, 54, 54));
        topTxt.setHorizontalAlignment(SwingConstants.RIGHT);

        textDisplay.setFont(new Font("Roboto Condensed Light", 1, 36)); // NOI18N
        textDisplay.setForeground(new Color(54, 54, 54));
        textDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textDisplay.setBorder(null);
        textDisplay.setCaretColor(new Color(255, 255, 255));
        textDisplay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                textDisplayKeyTyped(e);
            }
        });

        GroupLayout textPanelLayout = new GroupLayout(textPanel);
        textPanel.setLayout(textPanelLayout);
        textPanelLayout.setHorizontalGroup(
                textPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(textPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(textPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(topTxt, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textDisplay, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(18, Short.MAX_VALUE))
        );
        textPanelLayout.setVerticalGroup(
                textPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, textPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(topTxt, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textDisplay, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                .addContainerGap())
        );

        getContentPane().add(textPanel, BorderLayout.PAGE_START);
    }

    private double calc(double x, String input, char opt) {

        double y = Double.parseDouble(input);

        if (opt == '+') return x + y;
        else if (opt == '-') return x - y;
        else if (opt == '*') return x * y;
        else if (opt == '/') return x / y;
        else if (opt == '%') return x % y;
        else if (opt == 'p') return x * (-1);

        return y;

    }

    private void btnZeroActionPerformed(ActionEvent e) {

        if (addWrite) {
            if (Pattern.matches("[0]*", textDisplay.getText())) {
                textDisplay.setText("0");
            } else {
                textDisplay.setText(textDisplay.getText() + "0");
            }
        } else {
            textDisplay.setText("0");
            addWrite = true;
        }
        go = true;
    }

    private void btnOneActionPerformed(ActionEvent e) {

        if (addWrite) {
            if (Pattern.matches("[0]*", textDisplay.getText())) {
                textDisplay.setText("1");
            } else {
                textDisplay.setText(textDisplay.getText() + "5");
            }
        } else {
            textDisplay.setText("1");
            addWrite = true;
        }
        go = true;
    }

    private void btnTwoActionPerformed(ActionEvent e) {

        if (addWrite) {
            if (Pattern.matches("[0]*", textDisplay.getText())) {
                textDisplay.setText("2");
            } else {
                textDisplay.setText(textDisplay.getText() + "5");
            }
        } else {
            textDisplay.setText("2");
            addWrite = true;
        }
        go = true;
    }

    private void btnThreeActionPerformed(ActionEvent e) {

        if (addWrite) {
            if (Pattern.matches("[0]*", textDisplay.getText())) {
                textDisplay.setText("3");
            } else {
                textDisplay.setText(textDisplay.getText() + "5");
            }
        } else {
            textDisplay.setText("3");
            addWrite = true;
        }
        go = true;
    }

    private void btnFourActionPerformed(ActionEvent e) {

        if (addWrite) {
            if (Pattern.matches("[0]*", textDisplay.getText())) {
                textDisplay.setText("4");
            } else {
                textDisplay.setText(textDisplay.getText() + "4");
            }
        } else {
            textDisplay.setText("4");
            addWrite = true;
        }
        go = true;
    }

    private void btnFiveActionPerformed(ActionEvent e) {

        if (addWrite) {
            if (Pattern.matches("[0]*", textDisplay.getText())) {
                textDisplay.setText("5");
            } else {
                textDisplay.setText(textDisplay.getText() + "5");
            }
        } else {
            textDisplay.setText("5");
            addWrite = true;
        }
        go = true;
    }

    private void btnSixActionPerformed(ActionEvent e) {

        if (addWrite) {
            if (Pattern.matches("[0]*", textDisplay.getText())) {
                textDisplay.setText("6");
            } else {
                textDisplay.setText(textDisplay.getText() + "5");
            }
        } else {
            textDisplay.setText("6");
            addWrite = true;
        }
        go = true;
    }

    private void btnSevenActionPerformed(ActionEvent e) {

        if (addWrite) {
            if (Pattern.matches("[0]*", textDisplay.getText())) {
                textDisplay.setText("7");
            } else {
                textDisplay.setText(textDisplay.getText() + "7");
            }
        } else {
            textDisplay.setText("7");
            addWrite = true;
        }
        go = true;
    }

    private void btnEightActionPerformed(ActionEvent e) {

        if (addWrite) {
            if (Pattern.matches("[0]*", textDisplay.getText())) {
                textDisplay.setText("8");
            } else {
                textDisplay.setText(textDisplay.getText() + "8");
            }
        } else {
            textDisplay.setText("8");
            addWrite = true;
        }
        go = true;
    }

    private void btnNineActionPerformed(ActionEvent e) {

        if (addWrite) {
            if (Pattern.matches("[0]*", textDisplay.getText())) {
                textDisplay.setText("9");
            } else {
                textDisplay.setText(textDisplay.getText() + "9");
            }
        } else {
            textDisplay.setText("9");
            addWrite = true;
        }
        go = true;
    }

    private void btnDotActionPerformed(ActionEvent e) {

        if (addWrite) {
            textDisplay.setText(textDisplay.getText() + ".");
        } else {
            textDisplay.setText("0.");
            addWrite = true;
        }
        go = true;
    }

    private void btnDelActionPerformed(ActionEvent e) {

        String str = textDisplay.getText();
        StringBuilder strb = new StringBuilder();

        for (int i = 0; i < (str.length() - 1); i++) {
            strb.append(str.charAt(i));
        }

        if (strb.toString().equals("")) {
            textDisplay.setText("");
        }
        else {
            textDisplay.setText(strb.toString());
        }
    }

    private void btnClearActionPerformed(ActionEvent e) {

        textDisplay.setText("");
        opt = ' ';
        val = 0;
    }

    private void btnPosNegActionPerformed(ActionEvent e) {


        double pn = (-1) * Double.parseDouble(textDisplay.getText());
        if (addWrite) {
            textDisplay.setText(String.valueOf((int) pn));
        } else {
            textDisplay.setText(String.valueOf(pn));
            addWrite = true;
        }
        go = true;



    }

    private void btnPercentActionPerformed(ActionEvent e) {

        if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", textDisplay.getText()))
            if (go) {
                val = calc(val, textDisplay.getText(), opt);
                if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                    textDisplay.setText(String.valueOf((int) val));
                }
                else {
                    textDisplay.setText(String.valueOf(val));
                }
                opt = '%';
                go = false;
                addWrite = false;
            }
    }

    private void btnPlusActionPerformed(ActionEvent e) {

        if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", textDisplay.getText()))
            if (go) {
                val = calc(val, textDisplay.getText(), opt);
                if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                    textDisplay.setText(String.valueOf((int) val));
                } else {
                    textDisplay.setText(String.valueOf(val));
                }
                opt = '+';
                go = false;
                addWrite = false;
            } else {
                opt = '+';
            }
    }

    private void btnMinusActionPerformed(ActionEvent e) {

        if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", textDisplay.getText()))
            if (go) {
                val = calc(val, textDisplay.getText(), opt);
                if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                    textDisplay.setText(String.valueOf((int) val));
                } else {
                    textDisplay.setText(String.valueOf(val));
                }

                opt = '-';
                go = false;
                addWrite = false;
            } else {
                opt = '-';
            }
    }

    private void btnMultiplyActionPerformed(ActionEvent e) {

        if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", textDisplay.getText()))
            if (go) {
                val = calc(val, textDisplay.getText(), opt);
                if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                    textDisplay.setText(String.valueOf((int) val));
                } else {
                    textDisplay.setText(String.valueOf(val));
                }
                opt = '*';
                go = false;
                addWrite = false;
            } else {
                opt = '*';
            }
    }

    private void btnDivideActionPerformed(ActionEvent e) {

        if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", textDisplay.getText()))
            if (go) {
                val = calc(val, textDisplay.getText(), opt);
                if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                    textDisplay.setText(String.valueOf((int) val));
                }
                else {
                    textDisplay.setText(String.valueOf(val));
                }
                opt = '/';
                go = false;
                addWrite = false;
            } else {
                opt = '/';
            }
    }

    private void btnEqualActionPerformed(ActionEvent e) {

        if (Pattern.matches("([-]?\\d+[.]\\d*)|(\\d+)", textDisplay.getText()))
            if (go) {
                val = calc(val, textDisplay.getText(), opt);
                if (Pattern.matches("[-]?[\\d]+[.][0]*", String.valueOf(val))) {
                    textDisplay.setText(String.valueOf((int) val));
                } else {
                    textDisplay.setText(String.valueOf(val));
                }
                opt = '=';
                addWrite = false;
            }
    }

    private void textDisplayKeyTyped(KeyEvent e) {
        if (textDisplay.getText().length() >= 13 )
            e.consume();
    }

    public static void main(String[] args) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });

    } //Main method End

} //Class End

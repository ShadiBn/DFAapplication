import javax.swing.*;
import java.util.*;

public class Home extends javax.swing.JFrame {

    // Declare variables for DFA
    private Set<String> validInputs;
    private Set<String> finalStates;
    private String[] states;
    private String startingState;
    private Map<String, HashMap<String, String>> transitions;
    public static DFA dfa;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        validInputs = new HashSet<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        ValidInputLabel = new javax.swing.JLabel();
        ValidInputTextField = new javax.swing.JTextField();
        StatesLabel = new javax.swing.JLabel();
        StatesTextField = new javax.swing.JTextField();
        StartingStateLabel = new javax.swing.JLabel();
        StartingStateTextField = new javax.swing.JTextField();
        FinalStatesLabel = new javax.swing.JLabel();
        FInalStatesTextField = new javax.swing.JTextField();
        CheckEquivalenceButton = new javax.swing.JButton();
        MinimizeDfaButton = new javax.swing.JButton();
        ValidateStringButton = new javax.swing.JButton();
        GenerateStringsButton = new javax.swing.JButton();
        TransitionsInputButton = new javax.swing.JButton();
        TranisitonsShowScrollPanel = new javax.swing.JScrollPane();
        TranisitonShowList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(594, 400));
        setMinimumSize(new java.awt.Dimension(594, 400));
        setPreferredSize(new java.awt.Dimension(594, 400));
        setSize(new java.awt.Dimension(594, 400));
        getContentPane().setLayout(null);

        ValidInputLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        ValidInputLabel.setForeground(new java.awt.Color(255, 255, 255));
        ValidInputLabel.setText("Valid Inputs");
        getContentPane().add(ValidInputLabel);
        ValidInputLabel.setBounds(23, 42, 90, 17);

        ValidInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidInputTextFieldActionPerformed(evt);
            }
        });

        GenerateStringsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                handleGenerateStringsButtonClick();
            }
        });
        
        getContentPane().add(ValidInputTextField);
        ValidInputTextField.setBounds(240, 40, 64, 22);

        StatesLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        StatesLabel.setForeground(new java.awt.Color(255, 255, 255));
        StatesLabel.setText("All States(comma separated)");
        getContentPane().add(StatesLabel);
        StatesLabel.setBounds(23, 91, 190, 17);

        StatesTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatesTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(StatesTextField);
        StatesTextField.setBounds(240, 90, 103, 22);

        StartingStateLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        StartingStateLabel.setForeground(new java.awt.Color(255, 255, 255));
        StartingStateLabel.setText("Enter Starting State");
        getContentPane().add(StartingStateLabel);
        StartingStateLabel.setBounds(23, 145, 170, 17);
        getContentPane().add(StartingStateTextField);
        StartingStateTextField.setBounds(240, 140, 64, 22);

        FinalStatesLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        FinalStatesLabel.setForeground(new java.awt.Color(255, 255, 255));
        FinalStatesLabel.setText("All Final States(comma separated)");
        getContentPane().add(FinalStatesLabel);
        FinalStatesLabel.setBounds(23, 190, 220, 17);
        getContentPane().add(FInalStatesTextField);
        FInalStatesTextField.setBounds(240, 190, 137, 22);

        CheckEquivalenceButton.setBackground(new java.awt.Color(249, 255, 98));
        CheckEquivalenceButton.setText("Check Equivalence");
        CheckEquivalenceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckEquivalenceButtonActionPerformed(evt);
            }
        });
        getContentPane().add(CheckEquivalenceButton);
        CheckEquivalenceButton.setBounds(22, 289, 129, 23);

        MinimizeDfaButton.setBackground(new java.awt.Color(249, 255, 98));
        MinimizeDfaButton.setText("Minimize DFA");
        MinimizeDfaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinimizeDfaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MinimizeDfaButton);
        MinimizeDfaButton.setBounds(168, 289, 101, 23);

        ValidateStringButton.setBackground(new java.awt.Color(249, 255, 98));
        ValidateStringButton.setText("Validate Strings");
        ValidateStringButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValidateStringButtonActionPerformed(evt);
            }
        });
        getContentPane().add(ValidateStringButton);
        ValidateStringButton.setBounds(287, 289, 120, 23);

        GenerateStringsButton.setBackground(new java.awt.Color(249, 255, 98));
        GenerateStringsButton.setText("Generate Strings");
        getContentPane().add(GenerateStringsButton);
        GenerateStringsButton.setBounds(418, 289, 120, 23);

        TransitionsInputButton.setBackground(new java.awt.Color(249, 255, 98));
        TransitionsInputButton.setText("Click Here To Enter The DFA's Transitions");
        TransitionsInputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransitionsInputButtonActionPerformed(evt);
            }
        });
        getContentPane().add(TransitionsInputButton);
        TransitionsInputButton.setBounds(125, 238, 260, 23);

        TranisitonsShowScrollPanel.setViewportView(TranisitonShowList);

        getContentPane().add(TranisitonsShowScrollPanel);
        TranisitonsShowScrollPanel.setBounds(450, 20, 129, 200);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1337527.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-5, -24, 600, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>
    

    private void ValidInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // Now you have a Set<String> containing the valid inputs
        validInputs = new HashSet<>(Arrays.asList(ValidInputTextField.getText().split(",")));
    }

    private void CheckEquivalenceButtonActionPerformed(java.awt.event.ActionEvent evt) {
        new Page2().setVisible(true);
        setVisible(false);
    }



    private void StatesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        states = StatesTextField.getText().split(",");
    }

    private void TransitionsInputButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Get valid inputs from the text field
        String validInputString = ValidInputTextField.getText();
        validInputs = new HashSet<>(Arrays.asList(validInputString.split(",")));
    
        // Get all states from the text field
        states = StatesTextField.getText().split(",");
    
        // Get starting state
        startingState = StartingStateTextField.getText();
    
        // Get final states
        finalStates = new HashSet<>(Arrays.asList(FInalStatesTextField.getText().split(",")));
    
        // Input for transitions
        transitions = new HashMap<>();
        for (String state : states) {
            HashMap<String, String> transition = new HashMap<>();
            for (String input : validInputs) {
                String nextState = JOptionPane.showInputDialog(
                        String.format("Enter transition state for state '%s' with input '%s':", state, input));
                transition.put(input, nextState);
            }
            transitions.put(state, transition);
        }
    
        // Create DFA
        dfa = new DFA(startingState, finalStates, (HashMap<String, HashMap<String, String>>) transitions);
        String message = "Initial transitions";
        // Display transitions in the list (assuming you have a displayTransitions method)
        displayTransitions(message);
    }
    
    
    private void handleGenerateStringsButtonClick() {
    String[] generatedStrings = dfa.generateStrings();
    StringBuilder message = new StringBuilder("Generated Strings:\n");
    for (String str : generatedStrings) {
        message.append(str).append("\n");
    }
    JOptionPane.showMessageDialog(this, message.toString());
    }


    private void MinimizeDfaButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Minimize DFA
        dfa.minimizeDFA();

        String message = "Minimized transitions";
        // Display minimized transitions in the list
        displayTransitions(message);
    }

    private void ValidateStringButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // Input for validation
        String inputString = JOptionPane.showInputDialog("Enter the string to validate:");

        // Validate string using DFA
        String result = dfa.IterateString(inputString);

        if (finalStates.contains(result)) {
            JOptionPane.showMessageDialog(null, "Your string is valid");
        }
        else{
            String message = String.format("Your string ends at state '%s', which is not a final state", result);
            JOptionPane.showMessageDialog(null, message);    
        }
    }  

    private void displayTransitions(String message) {
        DefaultListModel<String> model = new DefaultListModel<>();
        model.addElement(message);
        for (Map.Entry<String, HashMap<String, String>> entry : transitions.entrySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(entry.getKey()).append(": ");
            for (Map.Entry<String, String> transition : entry.getValue().entrySet()) {
                sb.append(String.format("(%s, %s) ", transition.getKey(), transition.getValue()));
            }
            model.addElement(sb.toString());
        }
        TranisitonShowList.setModel(model);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton CheckEquivalenceButton;
    private javax.swing.JTextField FInalStatesTextField;
    private javax.swing.JLabel FinalStatesLabel;
    private javax.swing.JButton GenerateStringsButton;
    private javax.swing.JButton MinimizeDfaButton;
    private javax.swing.JLabel StartingStateLabel;
    private javax.swing.JTextField StartingStateTextField;
    private javax.swing.JLabel StatesLabel;
    private javax.swing.JTextField StatesTextField;
    private javax.swing.JList<String> TranisitonShowList;
    private javax.swing.JScrollPane TranisitonsShowScrollPanel;
    private javax.swing.JButton TransitionsInputButton;
    private javax.swing.JLabel ValidInputLabel;
    private javax.swing.JTextField ValidInputTextField;
    private javax.swing.JButton ValidateStringButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration
}

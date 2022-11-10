/**
 * @Course: ICT 4305
 * @Project: GroupTutorialAssignmentWeekNine
 * @Instructor: Dr. Sherri Maciosek
 */
package edu.du.ict4305.grouptutorialassignmentnine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.regex.*;

/**
 * @author lutherchikumba
 * @Date: 11/8/22
 */
public class Contact extends JFrame implements ActionListener {

      private final JTextField tname;
      private final JTextField temail;
      private final JTextField tmno;
      private final JTextArea tadd;
      private final JButton sub;
      private final JButton reset;
      private final JTextArea tout;
      private final JLabel res;
      private final JTextArea resadd;


      /**
       * constructor, to initialize the components
       * with default values.
       */
      public Contact() {
            setTitle("Registration Form");
            setBounds(300, 90, 900, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);

            // Components of the Form
            Container contentPane = getContentPane();
            contentPane.setLayout(null);

            JLabel title = new JLabel("Registration Form");
            title.setFont(new Font("Arial", Font.PLAIN, 30));
            title.setSize(300, 30);
            title.setLocation(300, 30);
            contentPane.add(title);

            JLabel name = new JLabel("Name");
            name.setFont(new Font("Arial", Font.PLAIN, 20));
            name.setSize(100, 20);
            name.setLocation(100, 100);
            contentPane.add(name);

            tname = new JTextField();
            tname.setFont(new Font("Arial", Font.PLAIN, 15));
            tname.setSize(190, 20);
            tname.setLocation(200, 100);
            contentPane.add(tname);

            JLabel email = new JLabel("Email");
            email.setFont(new Font("Arial", Font.PLAIN, 20));
            email.setSize(100, 20);
            email.setLocation(100, 150);
            contentPane.add(email);

            temail = new JTextField();
            temail.setFont(new Font("Arial", Font.PLAIN, 15));
            temail.setSize(150, 20);
            temail.setLocation(200, 150);
            contentPane.add(temail);

            JLabel mno = new JLabel("Phone");
            mno.setFont(new Font("Arial", Font.PLAIN, 20));
            mno.setSize(100, 20);
            mno.setLocation(100, 200);
            contentPane.add(mno);

            tmno = new JTextField();
            tmno.setFont(new Font("Arial", Font.PLAIN, 15));
            tmno.setSize(150, 20);
            tmno.setLocation(200, 200);
            contentPane.add(tmno);


            JLabel add = new JLabel("Address");
            add.setFont(new Font("Arial", Font.PLAIN, 20));
            add.setSize(100, 20);
            add.setLocation(100, 250);
            contentPane.add(add);

            tadd = new JTextArea();
            tadd.setFont(new Font("Arial", Font.PLAIN, 15));
            tadd.setSize(200, 75);
            tadd.setLocation(200, 250);
            tadd.setLineWrap(true);
            contentPane.add(tadd);

            sub = new JButton("Submit");
            sub.setFont(new Font("Arial", Font.PLAIN, 15));
            sub.setSize(100, 20);
            sub.setLocation(150, 450);
            sub.addActionListener(this);
            contentPane.add(sub);

            reset = new JButton("Reset");
            reset.setFont(new Font("Arial", Font.PLAIN, 15));
            reset.setSize(100, 20);
            reset.setLocation(270, 450);
            reset.addActionListener(this);
            contentPane.add(reset);

            tout = new JTextArea();
            tout.setFont(new Font("Arial", Font.PLAIN, 15));
            tout.setSize(300, 400);
            tout.setLocation(500, 100);
            tout.setLineWrap(true);
            tout.setEditable(false);
            contentPane.add(tout);

            res = new JLabel("");
            res.setFont(new Font("Arial", Font.PLAIN, 20));
            res.setSize(500, 25);
            res.setLocation(100, 500);
            contentPane.add(res);

            resadd = new JTextArea();
            resadd.setFont(new Font("Arial", Font.PLAIN, 15));
            resadd.setSize(200, 75);
            resadd.setLocation(580, 175);
            resadd.setLineWrap(true);
            contentPane.add(resadd);

            setVisible(true);
      }

      @Override
      public String toString() {
            return "Contact{" +
                    "tname=" + tname +
                    ", temail=" + temail +
                    ", tmno=" + tmno +
                    ", tadd=" + tadd +
                    ", sub=" + sub +
                    ", reset=" + reset +
                    ", tout=" + tout +
                    ", res=" + res +
                    ", resadd=" + resadd +
                    '}';
      }

      /**
       * method actionPerformed()
       * to get the action performed
       * by the user and act accordingly
       *
       * @param event the event to be processed
       */
      public void actionPerformed(ActionEvent event) {
            try {
                  PrintWriter out = new PrintWriter("src/main/java/edu/du/ict4305/grouptutorialassignmentnine/contact_info.txt"); // Step 2
                  if (event.getSource() == sub) {
                        String data
                                = "Name : "
                                + tname.getText() + "\n"
                                + "Address : "
                                + tadd.getText() + "\n"
                                + "Email : "
                                + temail.getText() + "\n"
                                + "Phone : "
                                + tmno.getText() + "\n";
                        if (tname.getText().isEmpty() || tadd.getText().isEmpty() || temail.getText().isEmpty() || tmno.getText().isEmpty()) {
                              tout.setText("");
                              resadd.setText("");
                              res.setText("Please enter all the fields..");
                        } else {

                              if (isValidEmailAddress(temail.getText()) && isValidPhoneNo(tmno.getText())) {
                                    tout.setText(data);
                                    out.println(data);
                                    tout.setEditable(false);
                                    res.setText("Registration Successfully..");
                                    out.close();

                              }else {
                                    tout.setText("");
                                    resadd.setText("");
                                    res.setText("Please enter valid information...");
                              }
                        }
                  } else if (event.getSource() == reset) {
                        String def = "";
                        tname.setText(def);
                        temail.setText(def);
                        tadd.setText(def);
                        tmno.setText(def);
                        res.setText(def);
                        tout.setText(def);
                        resadd.setText(def);
                  }
            } catch (FileNotFoundException ex) {
                  throw new RuntimeException(ex);
            }

      }

      /**
       * @param phoneNo
       * @return
       */
      public boolean isValidPhoneNo(String phoneNo) {
            Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
            Matcher match = pattern.matcher(phoneNo);
            return (match.find() && match.group().equals(phoneNo));
      }

      /**
       * @param email
       * @return
       */
      public boolean isValidEmailAddress(String email) {
            String regex = "^(.+)@(.+)$";
            Pattern pattern = Pattern.compile(regex);
            if (email == null)
                  return false;
            return pattern.matcher(email).matches();
      }
}



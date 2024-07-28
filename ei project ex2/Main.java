import commands.*;
import satellite.Satellite;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        Satellite satellite = new Satellite();

        JFrame frame = new JFrame("Satellite Command System");
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        JTextField txtCommand = new JTextField();
        JButton btnExecute = new JButton("Execute Command");
        JButton btnStatus = new JButton("Display Status");

        frame.add(new JLabel("Enter Command:"));
        frame.add(txtCommand);
        frame.add(btnExecute);
        frame.add(btnStatus);

        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnExecute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String command = txtCommand.getText();
                Command cmd = null;

                if (command.startsWith("rotate")) {
                    String direction = command.split(" ")[1];
                    cmd = new RotateCommand(satellite, direction);
                } else if (command.equals("activatePanels")) {
                    cmd = new ActivatePanelsCommand(satellite);
                } else if (command.equals("deactivatePanels")) {
                    cmd = new DeactivatePanelsCommand(satellite);
                } else if (command.equals("collectData")) {
                    cmd = new CollectDataCommand(satellite);
                } else {
                    System.out.println("Unknown command");
                }

                if (cmd != null) {
                    cmd.execute();
                }
            }
        });

        btnStatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                satellite.displayStatus();
            }
        });
    }
}

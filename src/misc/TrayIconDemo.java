
package misc;  
/*
 * TrayIconDemo.java
 */

import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
import sic.*;


public class TrayIconDemo {
    public static void main(String[] args) {
        /* Use an appropriate Look and Feel */
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        //Schedule a job for the event-dispatching thread:
        //adding TrayIcon.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
    public static void createAndShowGUI() {
        //Check the SystemTray support
        if (!SystemTray.isSupported()) {
            System.out.println("SystemTray is not supported");
            return;
        }
        final PopupMenu popup = new PopupMenu();
        final TrayIcon trayIcon =
                new TrayIcon(createImage("images/icon.png", "tray icon"));
        final SystemTray tray = SystemTray.getSystemTray();
        
        // Create a popup menu components
        MenuItem aboutItem = new MenuItem("About");
        MenuItem minimize_size = new MenuItem("Mini size");
        MenuItem note = new MenuItem("Jegyzet");
       MenuItem alarm = new MenuItem("Jelzés");
       MenuItem time = new MenuItem("Idő");
       MenuItem game = new MenuItem("Játék");
       MenuItem exit = new MenuItem("Kilépés");
       
       
        
        //Add components to popup menu
        popup.add(aboutItem);
        popup.add(minimize_size);
        popup.add(note);
        popup.add(alarm);
        popup.add(time);
        popup.add(game);
        popup.add(exit);
     
      
        
        trayIcon.setPopupMenu(popup);
        
        try {
            tray.add(trayIcon);
        } catch (AWTException e) {
            System.out.println("TrayIcon could not be added.");
            return;
        }
        
        
        
        trayIcon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               tray.remove(trayIcon);
                FaceGUI d = new FaceGUI();
                d.setVisible(true);
            }
        });
        
        aboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "This dialog box is run from the About menu item");
            }
        });
        
        minimize_size.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                FaceGUIMinimize mci = new FaceGUIMinimize();
                mci.setVisible(true);
            }
        });
        
       exit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
       
       note.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                NotesGUI nt = new NotesGUI();
                nt.setVisible(true);
            }
        });
        alarm.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                AlarmGUI ag = new AlarmGUI();
                ag.setVisible(true);
            }
        });
        
        time.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                timeGUI time = new timeGUI();
                time.setVisible(true);
            }
        });
        
        game.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                GameChooseGUI gm = new GameChooseGUI();
                gm.setVisible(true);
            }
        });
        
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MenuItem item = (MenuItem)e.getSource();
                //TrayIcon.MessageType type = null;
                System.out.println(item.getLabel());
                if ("Error".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.ERROR;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is an error message", TrayIcon.MessageType.ERROR);
                    
                } else if ("Warning".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.WARNING;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is a warning message", TrayIcon.MessageType.WARNING);
                    
                } else if ("Info".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.INFO;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is an info message", TrayIcon.MessageType.INFO);
                    
                } else if ("None".equals(item.getLabel())) {
                    //type = TrayIcon.MessageType.NONE;
                    trayIcon.displayMessage("Sun TrayIcon Demo",
                            "This is an ordinary message", TrayIcon.MessageType.NONE);
                }
            }
        };
    }
    
    //Obtain the image URL
    protected static Image createImage(String path, String description) {
        URL imageURL = TrayIconDemo.class.getResource(path);
        
        if (imageURL == null) {
            System.err.println("Resource not found: " + path);
            return null;
        } else {
            return (new ImageIcon(imageURL, description)).getImage();
        }
    }
}

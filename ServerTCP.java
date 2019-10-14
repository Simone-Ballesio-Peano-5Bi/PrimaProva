/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servertcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simon
 */
public class ServerTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            for(;;){
                ServerSocket welcomeSocket=new ServerSocket(15120);
                Socket connectionSocket =new Socket();
                connectionSocket=welcomeSocket.accept();
                Scanner sc=new Scanner(connectionSocket.getInputStream());
                String message=sc.nextLine();
                System.out.println("Il server ha ricevuto dal nodo: "+connectionSocket.getRemoteSocketAddress()+", che ci dice:\t"+ message);
                welcomeSocket.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(ServerTCP.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

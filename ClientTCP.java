/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simon
 */
public class ClientTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print(">\t");
        String massage ="Ballesio:\t"+ sc.nextLine();
        try {
//            Socket clienSocket=new Socket("10.102.0.65", 15120);
            Socket clienSocket=new Socket("LocalHost", 15120);
            DataOutputStream out= new DataOutputStream(clienSocket.getOutputStream());
            out.writeBytes(massage+"\n");
            out.flush();
            out.close();
        } catch (IOException ex) {
            Logger.getLogger(ClientTCP.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

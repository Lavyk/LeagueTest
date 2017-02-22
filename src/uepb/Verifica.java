/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uepb;

/**
 *
 * @author Super i3
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Verifica {

    private static final String TASKLIST = "tasklist";
    private static final String KILL = "taskkill /F /IM ";

    //private final String processName = "League of Legends.exe";
    private final String processName = "calc.exe";
    private boolean jogoAberto = false;

    public static boolean isProcessRunning(String serviceName) throws Exception {

        int cont = 0;
        Process p = Runtime.getRuntime().exec(TASKLIST);
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains(serviceName)) {
                return true;
            }

        }
        return false;
    }

    public void jogoAberto() throws Exception {

        boolean jogoEstaAberto = false;
        while (jogoEstaAberto == false) {
            jogoEstaAberto = isProcessRunning(processName);
        }
        while (jogoEstaAberto == true) {
            jogoEstaAberto = isProcessRunning(processName);
        }

    }

    public boolean getJogoStatus() {
        return jogoAberto;
    }

    public static void main(String[] args) throws Exception {
        Verifica jogo = new Verifica();
        jogo.jogoAberto();
    }

}

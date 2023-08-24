import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    static ServerSocket servidor;

    public static void main(String[] args) throws Exception {
        servidor = new ServerSocket(1234);
        while (true) {
            Socket cliente = servidor.accept(); // servidor esperando uma conexão
            BufferedReader leitor = new BufferedReader(new InputStreamReader(cliente.getInputStream())); // o leitor
                                                                                                         // recebe
                                                                                                         // o fluxo do
            String mensagem = leitor.readLine();
            System.out.println(mensagem); // cliente
            PrintWriter escritor = new PrintWriter(cliente.getOutputStream(), true); // responde o outro lado
            escritor.println("recebeu?");
        }
    }
}

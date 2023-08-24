import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Cliente {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket conexao = new Socket("localhost", 1234);
        PrintWriter escritor = new PrintWriter(conexao.getOutputStream(), true);
        escritor.println("Não sei ");
        BufferedReader leitor = new BufferedReader(new InputStreamReader(conexao.getInputStream()));
        String mensagem = leitor.readLine();
        System.out.println(mensagem);

    }
}

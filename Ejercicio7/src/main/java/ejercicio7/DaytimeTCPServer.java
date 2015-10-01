package ejercicio7;

/**
 * Created by ruben on 30/09/15.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;

public class DaytimeTCPServer {
    private final static int DEFAULT_PORT = 12345;

    public static void main(String[] args) throws IOException {
        int port = (args.length == 1) ? Integer.parseInt(args[0]) : DEFAULT_PORT;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // ServerSocket serverSocket = new ServerSocket(port);
            // Socket socket = serverSocket.accept();
            Socket socket = new Socket("localhost", 12345);
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.println(sdf.format(System.currentTimeMillis()));
            writer.flush();

    }

}

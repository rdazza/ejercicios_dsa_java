package ejercicio8;

/**
 * Created by ruben on 30/09/15.
 */
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.*;

public class DaytimeUDPClient {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.err.println("Pasa el nombre del servidor y su puerto");
            System.exit(-1);
        }
        String server = args[0];
        int port = Integer.parseInt(args[1]);

        byte[] data = new byte[0];
        DatagramPacket dp = new DatagramPacket(data, data.length, InetAddress.getByName(server), port);
        DatagramSocket datagramSocket = new DatagramSocket();
        datagramSocket.send(dp);

        byte[] buffer = new byte[1496];
        dp = new DatagramPacket(buffer, buffer.length);
        datagramSocket.receive(dp);
        DataInputStream dis = new DataInputStream(new ByteArrayInputStream(dp.getData()));
        String time = dis.readUTF();
        System.out.println(time);
    }
}

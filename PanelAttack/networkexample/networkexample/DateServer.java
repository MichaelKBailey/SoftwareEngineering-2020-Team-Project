package networkexample;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

/**
 * A TCP server that runs on port 9090.  When a client connects, it
 * sends the client the current date and time, then closes the
 * connection with that client.  Arguably just about the simplest
 * server you can write.
 */
public class DateServer {

    /**
     * Runs the server.
     */
    public static void main(String[] args) throws IOException {
// 1. What is a ServerSocket?
// 2. What is 9090?
        ServerSocket listener = new ServerSocket(9090);
        try {
// 3. What does the following loop conditional mean about this program?
            while (true) {
// 4. What is a Socket
// 5. What does accept() do?  When is it executed?
                Socket socket = listener.accept();
                try {
// 6.  Where is the toString of the Date object printed (sent)?
                    PrintWriter out =
                        new PrintWriter(socket.getOutputStream(), true);
                    out.println(new Date().toString());
                } finally {
                    socket.close();
                }
            }
        }
        finally {
            listener.close();
        }
    }
}

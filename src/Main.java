
    import java.io.IOException;
    import java.net.InetAddress;
    import java.net.ServerSocket;
    import java.net.Socket;
    import java.security.spec.RSAOtherPrimeInfo;
    public class Main {
        private static final int PORT = 8080; // ACILACAK OLAN PORT NOT : VDS UZERINDEN FIREWALL IZINLERINI VERMEYI UNUTMA

    public static void main(String[] args) {
            try(ServerSocket serverSocket = new ServerSocket(PORT)  ) {


            System.out.println("Server "+PORT+" Numaralı Port Üzerinden başlatıldı");
            while (true){
            Socket socket = serverSocket.accept();
            InetAddress serverAddress = socket.getInetAddress();

            System.out.println("[+] Birisi Bağlandı : "+serverAddress.getHostAddress());
            ClientHandler clientHandler= new ClientHandler(socket);
            clientHandler.start();
            }
            }catch (IOException ex){
            System.out.println("Server Hatası : "+ex.getMessage());
            ex.printStackTrace();
            }
            }

            }
    class ClientHandler extends Thread{
        private Socket socket;
        public ClientHandler(Socket socket){
            this.socket = socket;
        }
        public void run(){
            try {

            }catch (Exception ex){
                System.out.println("Müşteri Bağlantı Hatası : "+ex.getMessage());
                ex.printStackTrace();
            }finally {
                try {
                    socket.close();
                }catch (IOException ex){
                    System.out.println("Sunucu Durdurulurken Hata Oluştu : "+ex.getMessage());
                    ex.printStackTrace();
                }
            }
        }
    }
package ws;

import jakarta.xml.ws.Endpoint;


public class serverJWS {
    public static void main(String[] args) {
        //String url="http://127.0.0.1:8080/";
        String url="http://0.0.0.0:8080/"; //pour qu'il soit accessible de n'import qu'elle machine
        Endpoint.publish(url, new BanqueService() ) ;
        System.out.println("Web service déployé sur"+url);
    }
}

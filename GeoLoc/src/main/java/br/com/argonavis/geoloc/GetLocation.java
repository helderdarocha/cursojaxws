package br.com.argonavis.geoloc;

import com.cdyne.ws.IP2GeoSoap;
import com.cdyne.ws.IPInformation;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;


/**
 * Hello world!
 *
 */
public class GetLocation {

    public static void main(String[] args) throws MalformedURLException {
        URL wsdlLocation = new URL("http://ws.cdyne.com/ip2geo/ip2geo.asmx?wsdl");
        QName serviceName = new QName("http://ws.cdyne.com/", "IP2Geo");
        Service service = Service.create(wsdlLocation, serviceName);
        IP2GeoSoap proxy = service.getPort(IP2GeoSoap.class);
        IPInformation resolveIP = proxy.resolveIP("200.221.2.45", "0");
        String city = resolveIP.getCity();
        String country = resolveIP.getCountry();
        double latitude = resolveIP.getLatitude();
        double longitude = resolveIP.getLongitude();
        
        System.out.println("Cidade: " + city);
        System.out.println("Country: " + country);
        System.out.println("Latitude: " + latitude);
        System.out.println("Longitude: " + longitude);
        
        
    }
}

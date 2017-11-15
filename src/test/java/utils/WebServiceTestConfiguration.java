package utils;


import com.smartbear.SampleWebServiceSoap;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class WebServiceTestConfiguration {

    /**
     * create client and spellservice soap service
     */

    private static void testSOAPFromClient() {
        String soapServiceUrl = "http://secure.smartbearsoftware.com/samples/testcomplete10/webservices/Service.asmx?WSDL";

        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(SampleWebServiceSoap.class);
        factoryBean.setAddress(soapServiceUrl);

        SampleWebServiceSoap sampleWebServiceSoap = (SampleWebServiceSoap) factoryBean.create();
    }
}

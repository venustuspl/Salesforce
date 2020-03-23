import com.sforce.soap.partner.sobject.SObject.*;
import com.sforce.ws.ConnectorConfig;

public class SFExampleProgram
{

    public static void main( String[] args )
    throws Exception {

		PartnerConnection connection = getConnection();

		try {

         GetUserInfoResult userInfo = connection.getUserInfo();
         System.out.println("\nLogging in ...\n");
         System.out.println("UserID: " + userInfo.getUserId());
         System.out.println("User Full Name: " + userInfo.getUserFullName());
         System.out.println("User Email: " + userInfo.getUserEmail());

      } catch (Exception ce) {
         ce.printStackTrace();
      }
    }

    public static PartnerConnection getConnection ()
    throws Exception {

        ConnectorConfig config = new ConnectorConfig();
        config.setUsername("venustus.pl@gmail.com");
        config.setPassword("tomasz2018");
        config.setAuthEndpoint("https://login.salesforce.com/services/Soap/u/37");
        config.setManualLogin(false);
        com.sforce.soap.partner.PartnerConnection connection = com.sforce.soap.partner.Connector.newConnection(config);

		return connection;
    }
}


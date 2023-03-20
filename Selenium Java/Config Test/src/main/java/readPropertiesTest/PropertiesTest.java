package readPropertiesTest;

import org.junit.Test;

import java.io.IOException;

public class PropertiesTest {
    @Test
    public void readProperties() throws IOException {

        System.getProperties().load(ClassLoader.getSystemResourceAsStream("application.properties"));
        String urlFromProperties = System.getProperty("url");
        System.out.println(urlFromProperties);

    }

    @Test
    public void readFromConf(){

        String urlFromConfig = ConfigProvider.URL;
        System.out.println(urlFromConfig);
        Boolean isDemoAdmin = ConfigProvider.IS_DEMO_ADMIN;
        System.out.println(isDemoAdmin);

        if (ConfigProvider.readConfig().getBoolean("usersParams.admin.isAdmin")){
            System.out.println("successfully verify admin");
        }else{System.out.println("successfully not admin");}

        if (ConfigProvider.readConfig().getBoolean("usersParams.admin.isAdmin")){
            System.out.println("successfully verify admin");
        }else{System.out.println("successfully not admin");}
    }
}

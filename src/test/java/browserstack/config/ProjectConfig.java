package browserstack.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:${platform}.properties", "classpath:credentials.properties"})

public interface ProjectConfig extends Config {

    @Key("remoteBSUrl")
    String getRemoteBSUrl();

    @Key("appUrl")
    String getAppUrl();

    @Key("deviceName")
    String getDeviceName();

    @Key("osVersion")
    String getOsVersion();

    @Key("login")
    String getLogin();

    @Key("password")
    String getPassword();
}



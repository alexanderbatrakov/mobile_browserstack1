package androidTests.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)

public interface ProjectConfig extends Config {

    @Key("env")
    String getEnvironment();
    @Key("deviceName")
    String getDeviceName();

    @Key("osVersion")
    String getOsVersion();

    @Key("login")
    String getLogin();

    @Key("password")
    String getPassword();
}



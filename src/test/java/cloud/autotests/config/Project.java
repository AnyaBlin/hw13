package cloud.autotests.config;

import org.aeonbits.owner.ConfigFactory;

public class Project {
    public static ProjectConfig config = ConfigFactory.create(ProjectConfig.class, System.getProperties());

    public static boolean isRemoteWebDriver() {
        return !config.remoteBrowser().equals("");
    }

    public static boolean isVideoOn() {
        return !config.videoStorage().equals("");
    }
}
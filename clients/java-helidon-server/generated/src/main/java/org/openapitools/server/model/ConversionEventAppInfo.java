package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Object containing information about the application where event occurred.
 */
public class ConversionEventAppInfo   {

    private String appId;
    private String appName;
    private String appPackageName;
    private String appStore;
    private String appVersion;
    private Integer installTime;
    private String userAgent;
    private Integer windowHeight;
    private Integer windowWidth;

    /**
     * Default constructor.
     */
    public ConversionEventAppInfo() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionEventAppInfo.
     *
     * @param appId App ID in Google Play Store, AppStore or other stores.
     * @param appName Name of the app. Primarily used for Mobile Apps.
     * @param appPackageName App package name
     * @param appStore The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
     * @param appVersion App version. Primarily used for mobile apps
     * @param installTime App install time. Unix timestamp in seconds
     * @param userAgent User Agent request header. Primarily used for Web events
     * @param windowHeight Inner height of the window or viewport.
     * @param windowWidth Inner width of the window or viewport.
     */
    public ConversionEventAppInfo(
        String appId, 
        String appName, 
        String appPackageName, 
        String appStore, 
        String appVersion, 
        Integer installTime, 
        String userAgent, 
        Integer windowHeight, 
        Integer windowWidth
    ) {
        this.appId = appId;
        this.appName = appName;
        this.appPackageName = appPackageName;
        this.appStore = appStore;
        this.appVersion = appVersion;
        this.installTime = installTime;
        this.userAgent = userAgent;
        this.windowHeight = windowHeight;
        this.windowWidth = windowWidth;
    }



    /**
     * App ID in Google Play Store, AppStore or other stores.
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * Name of the app. Primarily used for Mobile Apps.
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * App package name
     * @return appPackageName
     */
    public String getAppPackageName() {
        return appPackageName;
    }

    public void setAppPackageName(String appPackageName) {
        this.appPackageName = appPackageName;
    }

    /**
     * The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
     * @return appStore
     */
    public String getAppStore() {
        return appStore;
    }

    public void setAppStore(String appStore) {
        this.appStore = appStore;
    }

    /**
     * App version. Primarily used for mobile apps
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    /**
     * App install time. Unix timestamp in seconds
     * minimum: 0
     * @return installTime
     */
    public Integer getInstallTime() {
        return installTime;
    }

    public void setInstallTime(Integer installTime) {
        this.installTime = installTime;
    }

    /**
     * User Agent request header. Primarily used for Web events
     * @return userAgent
     */
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    /**
     * Inner height of the window or viewport.
     * minimum: 0
     * maximum: 30720
     * @return windowHeight
     */
    public Integer getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(Integer windowHeight) {
        this.windowHeight = windowHeight;
    }

    /**
     * Inner width of the window or viewport.
     * minimum: 0
     * maximum: 30720
     * @return windowWidth
     */
    public Integer getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(Integer windowWidth) {
        this.windowWidth = windowWidth;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConversionEventAppInfo {\n");
        
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appPackageName: ").append(toIndentedString(appPackageName)).append("\n");
        sb.append("    appStore: ").append(toIndentedString(appStore)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    installTime: ").append(toIndentedString(installTime)).append("\n");
        sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
        sb.append("    windowHeight: ").append(toIndentedString(windowHeight)).append("\n");
        sb.append("    windowWidth: ").append(toIndentedString(windowWidth)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}


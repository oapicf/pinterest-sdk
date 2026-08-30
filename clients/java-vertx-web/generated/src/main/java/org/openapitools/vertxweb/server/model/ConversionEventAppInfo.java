package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object containing information about the application where event occurred.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public ConversionEventAppInfo () {

  }

  public ConversionEventAppInfo (String appId, String appName, String appPackageName, String appStore, String appVersion, Integer installTime, String userAgent, Integer windowHeight, Integer windowWidth) {
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

    
  @JsonProperty("app_id")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }

    
  @JsonProperty("app_name")
  public String getAppName() {
    return appName;
  }
  public void setAppName(String appName) {
    this.appName = appName;
  }

    
  @JsonProperty("app_package_name")
  public String getAppPackageName() {
    return appPackageName;
  }
  public void setAppPackageName(String appPackageName) {
    this.appPackageName = appPackageName;
  }

    
  @JsonProperty("app_store")
  public String getAppStore() {
    return appStore;
  }
  public void setAppStore(String appStore) {
    this.appStore = appStore;
  }

    
  @JsonProperty("app_version")
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

    
  @JsonProperty("install_time")
  public Integer getInstallTime() {
    return installTime;
  }
  public void setInstallTime(Integer installTime) {
    this.installTime = installTime;
  }

    
  @JsonProperty("user_agent")
  public String getUserAgent() {
    return userAgent;
  }
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

    
  @JsonProperty("window_height")
  public Integer getWindowHeight() {
    return windowHeight;
  }
  public void setWindowHeight(Integer windowHeight) {
    this.windowHeight = windowHeight;
  }

    
  @JsonProperty("window_width")
  public Integer getWindowWidth() {
    return windowWidth;
  }
  public void setWindowWidth(Integer windowWidth) {
    this.windowWidth = windowWidth;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEventAppInfo conversionEventAppInfo = (ConversionEventAppInfo) o;
    return Objects.equals(appId, conversionEventAppInfo.appId) &&
        Objects.equals(appName, conversionEventAppInfo.appName) &&
        Objects.equals(appPackageName, conversionEventAppInfo.appPackageName) &&
        Objects.equals(appStore, conversionEventAppInfo.appStore) &&
        Objects.equals(appVersion, conversionEventAppInfo.appVersion) &&
        Objects.equals(installTime, conversionEventAppInfo.installTime) &&
        Objects.equals(userAgent, conversionEventAppInfo.userAgent) &&
        Objects.equals(windowHeight, conversionEventAppInfo.windowHeight) &&
        Objects.equals(windowWidth, conversionEventAppInfo.windowWidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appName, appPackageName, appStore, appVersion, installTime, userAgent, windowHeight, windowWidth);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

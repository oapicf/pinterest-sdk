package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Object containing information about the application where event occurred.
 */
public class ConversionEventAppInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * App ID in Google Play Store, AppStore or other stores.
   */
  @JsonProperty("app_id")
  private String appId;

  /**
   * Name of the app. Primarily used for Mobile Apps.
   */
  @JsonProperty("app_name")
  private String appName;

  /**
   * App package name
   */
  @JsonProperty("app_package_name")
  private String appPackageName;

  /**
   * The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
   */
  @JsonProperty("app_store")
  private String appStore;

  /**
   * App version. Primarily used for mobile apps
   */
  @JsonProperty("app_version")
  private String appVersion;

  /**
   * App install time. Unix timestamp in seconds
   */
  @JsonProperty("install_time")
  private Integer installTime;

  /**
   * User Agent request header. Primarily used for Web events
   */
  @JsonProperty("user_agent")
  private String userAgent;

  /**
   * Inner height of the window or viewport.
   */
  @JsonProperty("window_height")
  private Integer windowHeight;

  /**
   * Inner width of the window or viewport.
   */
  @JsonProperty("window_width")
  private Integer windowWidth;

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
   * @return windowWidth
   */
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
    return Objects.equals(this.appId, conversionEventAppInfo.appId) &&
        Objects.equals(this.appName, conversionEventAppInfo.appName) &&
        Objects.equals(this.appPackageName, conversionEventAppInfo.appPackageName) &&
        Objects.equals(this.appStore, conversionEventAppInfo.appStore) &&
        Objects.equals(this.appVersion, conversionEventAppInfo.appVersion) &&
        Objects.equals(this.installTime, conversionEventAppInfo.installTime) &&
        Objects.equals(this.userAgent, conversionEventAppInfo.userAgent) &&
        Objects.equals(this.windowHeight, conversionEventAppInfo.windowHeight) &&
        Objects.equals(this.windowWidth, conversionEventAppInfo.windowWidth);
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

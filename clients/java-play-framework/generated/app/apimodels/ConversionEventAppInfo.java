package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Object containing information about the application where event occurred.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionEventAppInfo   {
  @JsonProperty("app_id")
  @Size(max=200)

  private String appId;

  @JsonProperty("app_name")
  @Size(max=200)

  private String appName;

  @JsonProperty("app_package_name")
  @Size(max=200)

  private String appPackageName;

  @JsonProperty("app_store")
  @Size(max=100)

  private String appStore;

  @JsonProperty("app_version")
  @Size(max=100)

  private String appVersion;

  @JsonProperty("install_time")
  @Min(0)

  private Integer installTime;

  @JsonProperty("user_agent")
  @Size(max=16384)

  private String userAgent;

  @JsonProperty("window_height")
  @Min(0)
@Max(30720)

  private Integer windowHeight;

  @JsonProperty("window_width")
  @Min(0)
@Max(30720)

  private Integer windowWidth;

  public ConversionEventAppInfo appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * App ID in Google Play Store, AppStore or other stores.
   * @return appId
  **/
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public ConversionEventAppInfo appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Name of the app. Primarily used for Mobile Apps.
   * @return appName
  **/
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public ConversionEventAppInfo appPackageName(String appPackageName) {
    this.appPackageName = appPackageName;
    return this;
  }

   /**
   * App package name
   * @return appPackageName
  **/
  public String getAppPackageName() {
    return appPackageName;
  }

  public void setAppPackageName(String appPackageName) {
    this.appPackageName = appPackageName;
  }

  public ConversionEventAppInfo appStore(String appStore) {
    this.appStore = appStore;
    return this;
  }

   /**
   * The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
   * @return appStore
  **/
  public String getAppStore() {
    return appStore;
  }

  public void setAppStore(String appStore) {
    this.appStore = appStore;
  }

  public ConversionEventAppInfo appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * App version. Primarily used for mobile apps
   * @return appVersion
  **/
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public ConversionEventAppInfo installTime(Integer installTime) {
    this.installTime = installTime;
    return this;
  }

   /**
   * App install time. Unix timestamp in seconds
   * minimum: 0
   * @return installTime
  **/
  public Integer getInstallTime() {
    return installTime;
  }

  public void setInstallTime(Integer installTime) {
    this.installTime = installTime;
  }

  public ConversionEventAppInfo userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * User Agent request header. Primarily used for Web events
   * @return userAgent
  **/
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public ConversionEventAppInfo windowHeight(Integer windowHeight) {
    this.windowHeight = windowHeight;
    return this;
  }

   /**
   * Inner height of the window or viewport.
   * minimum: 0
   * maximum: 30720
   * @return windowHeight
  **/
  public Integer getWindowHeight() {
    return windowHeight;
  }

  public void setWindowHeight(Integer windowHeight) {
    this.windowHeight = windowHeight;
  }

  public ConversionEventAppInfo windowWidth(Integer windowWidth) {
    this.windowWidth = windowWidth;
    return this;
  }

   /**
   * Inner width of the window or viewport.
   * minimum: 0
   * maximum: 30720
   * @return windowWidth
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


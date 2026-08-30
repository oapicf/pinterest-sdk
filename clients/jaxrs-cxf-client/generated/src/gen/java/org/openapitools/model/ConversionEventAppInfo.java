package org.openapitools.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object containing information about the application where event occurred.
 */
@ApiModel(description="Object containing information about the application where event occurred.")

public class ConversionEventAppInfo  {
  
 /**
  * App ID in Google Play Store, AppStore or other stores.
  */
  @ApiModelProperty(example = "429047995", value = "App ID in Google Play Store, AppStore or other stores.")

  private String appId;

 /**
  * Name of the app. Primarily used for Mobile Apps.
  */
  @ApiModelProperty(example = "MyAwesomeApp", value = "Name of the app. Primarily used for Mobile Apps.")

  private String appName;

 /**
  * App package name
  */
  @ApiModelProperty(example = "com.company.myawesomeapp", value = "App package name")

  private String appPackageName;

 /**
  * The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
  */
  @ApiModelProperty(example = "Google Play Store", value = "The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps")

  private String appStore;

 /**
  * App version. Primarily used for mobile apps
  */
  @ApiModelProperty(example = "7.9", value = "App version. Primarily used for mobile apps")

  private String appVersion;

 /**
  * App install time. Unix timestamp in seconds
  */
  @ApiModelProperty(example = "1739222269", value = "App install time. Unix timestamp in seconds")

  private Integer installTime;

 /**
  * User Agent request header. Primarily used for Web events
  */
  @ApiModelProperty(example = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36", value = "User Agent request header. Primarily used for Web events")

  private String userAgent;

 /**
  * Inner height of the window or viewport.
  */
  @ApiModelProperty(example = "900", value = "Inner height of the window or viewport.")

  private Integer windowHeight;

 /**
  * Inner width of the window or viewport.
  */
  @ApiModelProperty(example = "1678", value = "Inner width of the window or viewport.")

  private Integer windowWidth;
 /**
   * App ID in Google Play Store, AppStore or other stores.
   * @return appId
  **/
  @JsonProperty("app_id")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public ConversionEventAppInfo appId(String appId) {
    this.appId = appId;
    return this;
  }

 /**
   * Name of the app. Primarily used for Mobile Apps.
   * @return appName
  **/
  @JsonProperty("app_name")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public ConversionEventAppInfo appName(String appName) {
    this.appName = appName;
    return this;
  }

 /**
   * App package name
   * @return appPackageName
  **/
  @JsonProperty("app_package_name")
  public String getAppPackageName() {
    return appPackageName;
  }

  public void setAppPackageName(String appPackageName) {
    this.appPackageName = appPackageName;
  }

  public ConversionEventAppInfo appPackageName(String appPackageName) {
    this.appPackageName = appPackageName;
    return this;
  }

 /**
   * The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
   * @return appStore
  **/
  @JsonProperty("app_store")
  public String getAppStore() {
    return appStore;
  }

  public void setAppStore(String appStore) {
    this.appStore = appStore;
  }

  public ConversionEventAppInfo appStore(String appStore) {
    this.appStore = appStore;
    return this;
  }

 /**
   * App version. Primarily used for mobile apps
   * @return appVersion
  **/
  @JsonProperty("app_version")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public ConversionEventAppInfo appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

 /**
   * App install time. Unix timestamp in seconds
   * minimum: 0
   * @return installTime
  **/
  @JsonProperty("install_time")
  public Integer getInstallTime() {
    return installTime;
  }

  public void setInstallTime(Integer installTime) {
    this.installTime = installTime;
  }

  public ConversionEventAppInfo installTime(Integer installTime) {
    this.installTime = installTime;
    return this;
  }

 /**
   * User Agent request header. Primarily used for Web events
   * @return userAgent
  **/
  @JsonProperty("user_agent")
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  public ConversionEventAppInfo userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

 /**
   * Inner height of the window or viewport.
   * minimum: 0
   * maximum: 30720
   * @return windowHeight
  **/
  @JsonProperty("window_height")
  public Integer getWindowHeight() {
    return windowHeight;
  }

  public void setWindowHeight(Integer windowHeight) {
    this.windowHeight = windowHeight;
  }

  public ConversionEventAppInfo windowHeight(Integer windowHeight) {
    this.windowHeight = windowHeight;
    return this;
  }

 /**
   * Inner width of the window or viewport.
   * minimum: 0
   * maximum: 30720
   * @return windowWidth
  **/
  @JsonProperty("window_width")
  public Integer getWindowWidth() {
    return windowWidth;
  }

  public void setWindowWidth(Integer windowWidth) {
    this.windowWidth = windowWidth;
  }

  public ConversionEventAppInfo windowWidth(Integer windowWidth) {
    this.windowWidth = windowWidth;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


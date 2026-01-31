/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.23.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Object containing information about the application where event occurred.
 */

@ApiModel(description = "Object containing information about the application where event occurred.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-01-31T04:53:14.867699604Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
   * App ID in Google Play Store, AppStore or other stores.
   */
  public ConversionEventAppInfo appId(String appId) {
    this.appId = appId;
    return this;
  }

  
  @ApiModelProperty(example = "429047995", value = "App ID in Google Play Store, AppStore or other stores.")
  @JsonProperty("app_id")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }

  /**
   * Name of the app. Primarily used for Mobile Apps.
   */
  public ConversionEventAppInfo appName(String appName) {
    this.appName = appName;
    return this;
  }

  
  @ApiModelProperty(example = "MyAwesomeApp", value = "Name of the app. Primarily used for Mobile Apps.")
  @JsonProperty("app_name")
  public String getAppName() {
    return appName;
  }
  public void setAppName(String appName) {
    this.appName = appName;
  }

  /**
   * App package name
   */
  public ConversionEventAppInfo appPackageName(String appPackageName) {
    this.appPackageName = appPackageName;
    return this;
  }

  
  @ApiModelProperty(example = "com.company.myawesomeapp", value = "App package name")
  @JsonProperty("app_package_name")
  public String getAppPackageName() {
    return appPackageName;
  }
  public void setAppPackageName(String appPackageName) {
    this.appPackageName = appPackageName;
  }

  /**
   * The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
   */
  public ConversionEventAppInfo appStore(String appStore) {
    this.appStore = appStore;
    return this;
  }

  
  @ApiModelProperty(example = "Google Play Store", value = "The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps")
  @JsonProperty("app_store")
  public String getAppStore() {
    return appStore;
  }
  public void setAppStore(String appStore) {
    this.appStore = appStore;
  }

  /**
   * App version. Primarily used for mobile apps
   */
  public ConversionEventAppInfo appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  
  @ApiModelProperty(example = "7.9", value = "App version. Primarily used for mobile apps")
  @JsonProperty("app_version")
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  /**
   * App install time. Unix timestamp in seconds
   * minimum: 0
   */
  public ConversionEventAppInfo installTime(Integer installTime) {
    this.installTime = installTime;
    return this;
  }

  
  @ApiModelProperty(example = "1739222269", value = "App install time. Unix timestamp in seconds")
  @JsonProperty("install_time")
  public Integer getInstallTime() {
    return installTime;
  }
  public void setInstallTime(Integer installTime) {
    this.installTime = installTime;
  }

  /**
   * User Agent request header. Primarily used for Web events
   */
  public ConversionEventAppInfo userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  
  @ApiModelProperty(example = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36", value = "User Agent request header. Primarily used for Web events")
  @JsonProperty("user_agent")
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
   */
  public ConversionEventAppInfo windowHeight(Integer windowHeight) {
    this.windowHeight = windowHeight;
    return this;
  }

  
  @ApiModelProperty(example = "900", value = "Inner height of the window or viewport.")
  @JsonProperty("window_height")
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
   */
  public ConversionEventAppInfo windowWidth(Integer windowWidth) {
    this.windowWidth = windowWidth;
    return this;
  }

  
  @ApiModelProperty(example = "1678", value = "Inner width of the window or viewport.")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


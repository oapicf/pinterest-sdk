package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Object containing information about the application where event occurred.
 **/
@ApiModel(description = "Object containing information about the application where event occurred.")
@JsonTypeName("ConversionEventAppInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

  public ConversionEventAppInfo() {
  }

  /**
   * App ID in Google Play Store, AppStore or other stores.
   **/
  public ConversionEventAppInfo appId(String appId) {
    this.appId = appId;
    return this;
  }

  
  @ApiModelProperty(example = "429047995", value = "App ID in Google Play Store, AppStore or other stores.")
  @JsonProperty("app_id")
   @Size(max=200)public String getAppId() {
    return appId;
  }

  @JsonProperty("app_id")
  public void setAppId(String appId) {
    this.appId = appId;
  }

  /**
   * Name of the app. Primarily used for Mobile Apps.
   **/
  public ConversionEventAppInfo appName(String appName) {
    this.appName = appName;
    return this;
  }

  
  @ApiModelProperty(example = "MyAwesomeApp", value = "Name of the app. Primarily used for Mobile Apps.")
  @JsonProperty("app_name")
   @Size(max=200)public String getAppName() {
    return appName;
  }

  @JsonProperty("app_name")
  public void setAppName(String appName) {
    this.appName = appName;
  }

  /**
   * App package name
   **/
  public ConversionEventAppInfo appPackageName(String appPackageName) {
    this.appPackageName = appPackageName;
    return this;
  }

  
  @ApiModelProperty(example = "com.company.myawesomeapp", value = "App package name")
  @JsonProperty("app_package_name")
   @Size(max=200)public String getAppPackageName() {
    return appPackageName;
  }

  @JsonProperty("app_package_name")
  public void setAppPackageName(String appPackageName) {
    this.appPackageName = appPackageName;
  }

  /**
   * The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
   **/
  public ConversionEventAppInfo appStore(String appStore) {
    this.appStore = appStore;
    return this;
  }

  
  @ApiModelProperty(example = "Google Play Store", value = "The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps")
  @JsonProperty("app_store")
   @Size(max=100)public String getAppStore() {
    return appStore;
  }

  @JsonProperty("app_store")
  public void setAppStore(String appStore) {
    this.appStore = appStore;
  }

  /**
   * App version. Primarily used for mobile apps
   **/
  public ConversionEventAppInfo appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  
  @ApiModelProperty(example = "7.9", value = "App version. Primarily used for mobile apps")
  @JsonProperty("app_version")
   @Size(max=100)public String getAppVersion() {
    return appVersion;
  }

  @JsonProperty("app_version")
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  /**
   * App install time. Unix timestamp in seconds
   * minimum: 0
   **/
  public ConversionEventAppInfo installTime(Integer installTime) {
    this.installTime = installTime;
    return this;
  }

  
  @ApiModelProperty(example = "1739222269", value = "App install time. Unix timestamp in seconds")
  @JsonProperty("install_time")
   @Min(0)public Integer getInstallTime() {
    return installTime;
  }

  @JsonProperty("install_time")
  public void setInstallTime(Integer installTime) {
    this.installTime = installTime;
  }

  /**
   * User Agent request header. Primarily used for Web events
   **/
  public ConversionEventAppInfo userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  
  @ApiModelProperty(example = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36", value = "User Agent request header. Primarily used for Web events")
  @JsonProperty("user_agent")
   @Size(max=16384)public String getUserAgent() {
    return userAgent;
  }

  @JsonProperty("user_agent")
  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  /**
   * Inner height of the window or viewport.
   * minimum: 0
   * maximum: 30720
   **/
  public ConversionEventAppInfo windowHeight(Integer windowHeight) {
    this.windowHeight = windowHeight;
    return this;
  }

  
  @ApiModelProperty(example = "900", value = "Inner height of the window or viewport.")
  @JsonProperty("window_height")
   @Min(0) @Max(30720)public Integer getWindowHeight() {
    return windowHeight;
  }

  @JsonProperty("window_height")
  public void setWindowHeight(Integer windowHeight) {
    this.windowHeight = windowHeight;
  }

  /**
   * Inner width of the window or viewport.
   * minimum: 0
   * maximum: 30720
   **/
  public ConversionEventAppInfo windowWidth(Integer windowWidth) {
    this.windowWidth = windowWidth;
    return this;
  }

  
  @ApiModelProperty(example = "1678", value = "Inner width of the window or viewport.")
  @JsonProperty("window_width")
   @Min(0) @Max(30720)public Integer getWindowWidth() {
    return windowWidth;
  }

  @JsonProperty("window_width")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}


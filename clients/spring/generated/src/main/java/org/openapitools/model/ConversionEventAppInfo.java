package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Object containing information about the application where event occurred.
 */

@Schema(name = "ConversionEventAppInfo", description = "Object containing information about the application where event occurred.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEventAppInfo {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String appId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String appName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String appPackageName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String appStore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String appVersion;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer installTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String userAgent;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer windowHeight;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer windowWidth;

  public ConversionEventAppInfo appId(@Nullable String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * App ID in Google Play Store, AppStore or other stores.
   * @return appId
   */
  @Size(max = 200) 
  @Schema(name = "app_id", example = "429047995", description = "App ID in Google Play Store, AppStore or other stores.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_id")
  public @Nullable String getAppId() {
    return appId;
  }

  @JsonProperty("app_id")
  public void setAppId(@Nullable String appId) {
    this.appId = appId;
  }

  public ConversionEventAppInfo appName(@Nullable String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Name of the app. Primarily used for Mobile Apps.
   * @return appName
   */
  @Size(max = 200) 
  @Schema(name = "app_name", example = "MyAwesomeApp", description = "Name of the app. Primarily used for Mobile Apps.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_name")
  public @Nullable String getAppName() {
    return appName;
  }

  @JsonProperty("app_name")
  public void setAppName(@Nullable String appName) {
    this.appName = appName;
  }

  public ConversionEventAppInfo appPackageName(@Nullable String appPackageName) {
    this.appPackageName = appPackageName;
    return this;
  }

  /**
   * App package name
   * @return appPackageName
   */
  @Size(max = 200) 
  @Schema(name = "app_package_name", example = "com.company.myawesomeapp", description = "App package name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_package_name")
  public @Nullable String getAppPackageName() {
    return appPackageName;
  }

  @JsonProperty("app_package_name")
  public void setAppPackageName(@Nullable String appPackageName) {
    this.appPackageName = appPackageName;
  }

  public ConversionEventAppInfo appStore(@Nullable String appStore) {
    this.appStore = appStore;
    return this;
  }

  /**
   * The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps
   * @return appStore
   */
  @Size(max = 100) 
  @Schema(name = "app_store", example = "Google Play Store", description = "The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_store")
  public @Nullable String getAppStore() {
    return appStore;
  }

  @JsonProperty("app_store")
  public void setAppStore(@Nullable String appStore) {
    this.appStore = appStore;
  }

  public ConversionEventAppInfo appVersion(@Nullable String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  /**
   * App version. Primarily used for mobile apps
   * @return appVersion
   */
  @Size(max = 100) 
  @Schema(name = "app_version", example = "7.9", description = "App version. Primarily used for mobile apps", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_version")
  public @Nullable String getAppVersion() {
    return appVersion;
  }

  @JsonProperty("app_version")
  public void setAppVersion(@Nullable String appVersion) {
    this.appVersion = appVersion;
  }

  public ConversionEventAppInfo installTime(@Nullable Integer installTime) {
    this.installTime = installTime;
    return this;
  }

  /**
   * App install time. Unix timestamp in seconds
   * minimum: 0
   * @return installTime
   */
  @Min(value = 0) 
  @Schema(name = "install_time", example = "1739222269", description = "App install time. Unix timestamp in seconds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("install_time")
  public @Nullable Integer getInstallTime() {
    return installTime;
  }

  @JsonProperty("install_time")
  public void setInstallTime(@Nullable Integer installTime) {
    this.installTime = installTime;
  }

  public ConversionEventAppInfo userAgent(@Nullable String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

  /**
   * User Agent request header. Primarily used for Web events
   * @return userAgent
   */
  @Size(max = 16384) 
  @Schema(name = "user_agent", example = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36", description = "User Agent request header. Primarily used for Web events", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_agent")
  public @Nullable String getUserAgent() {
    return userAgent;
  }

  @JsonProperty("user_agent")
  public void setUserAgent(@Nullable String userAgent) {
    this.userAgent = userAgent;
  }

  public ConversionEventAppInfo windowHeight(@Nullable Integer windowHeight) {
    this.windowHeight = windowHeight;
    return this;
  }

  /**
   * Inner height of the window or viewport.
   * minimum: 0
   * maximum: 30720
   * @return windowHeight
   */
  @Min(value = 0) @Max(value = 30720) 
  @Schema(name = "window_height", example = "900", description = "Inner height of the window or viewport.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("window_height")
  public @Nullable Integer getWindowHeight() {
    return windowHeight;
  }

  @JsonProperty("window_height")
  public void setWindowHeight(@Nullable Integer windowHeight) {
    this.windowHeight = windowHeight;
  }

  public ConversionEventAppInfo windowWidth(@Nullable Integer windowWidth) {
    this.windowWidth = windowWidth;
    return this;
  }

  /**
   * Inner width of the window or viewport.
   * minimum: 0
   * maximum: 30720
   * @return windowWidth
   */
  @Min(value = 0) @Max(value = 30720) 
  @Schema(name = "window_width", example = "1678", description = "Inner width of the window or viewport.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("window_width")
  public @Nullable Integer getWindowWidth() {
    return windowWidth;
  }

  @JsonProperty("window_width")
  public void setWindowWidth(@Nullable Integer windowWidth) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


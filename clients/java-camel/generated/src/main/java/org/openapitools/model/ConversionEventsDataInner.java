package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventsDataInnerCustomData;
import org.openapitools.model.ConversionEventsUserData;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ConversionEventsDataInner
 */

@JsonTypeName("ConversionEvents_data_inner")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ConversionEventsDataInner {

  private String eventName;

  private String actionSource;

  private Long eventTime;

  private String eventId;

  private JsonNullable<String> eventSourceUrl = JsonNullable.<String>undefined();

  private Boolean optOut;

  private JsonNullable<String> partnerName = JsonNullable.<String>undefined();

  private ConversionEventsUserData userData;

  private ConversionEventsDataInnerCustomData customData;

  private JsonNullable<String> appId = JsonNullable.<String>undefined();

  private JsonNullable<String> appName = JsonNullable.<String>undefined();

  private JsonNullable<String> appVersion = JsonNullable.<String>undefined();

  private JsonNullable<String> deviceBrand = JsonNullable.<String>undefined();

  private JsonNullable<String> deviceCarrier = JsonNullable.<String>undefined();

  private JsonNullable<String> deviceModel = JsonNullable.<String>undefined();

  private JsonNullable<String> deviceType = JsonNullable.<String>undefined();

  private JsonNullable<String> osVersion = JsonNullable.<String>undefined();

  private Boolean wifi;

  private JsonNullable<String> language = JsonNullable.<String>undefined();

  public ConversionEventsDataInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionEventsDataInner(String eventName, String actionSource, Long eventTime, String eventId, ConversionEventsUserData userData) {
    this.eventName = eventName;
    this.actionSource = actionSource;
    this.eventTime = eventTime;
    this.eventId = eventId;
    this.userData = userData;
  }

  public ConversionEventsDataInner eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * <p>The type of the user event. Please use the right event_name otherwise the event won't be accepted and show up correctly in reports.   <ul>   <li><code>add_to_cart</code></li>   <li><code>checkout</code></li>   <li><code>custom</code></li>   <li><code>lead</code></li>   <li><code>page_visit</code></li>   <li><code>search</code></li>   <li><code>signup</code></li>   <li><code>view_category</code></li>   <li><code>watch_video</code></li>   </ul> </p> 
   * @return eventName
   */
  @NotNull 
  @Schema(name = "event_name", example = "checkout", description = "<p>The type of the user event. Please use the right event_name otherwise the event won't be accepted and show up correctly in reports.   <ul>   <li><code>add_to_cart</code></li>   <li><code>checkout</code></li>   <li><code>custom</code></li>   <li><code>lead</code></li>   <li><code>page_visit</code></li>   <li><code>search</code></li>   <li><code>signup</code></li>   <li><code>view_category</code></li>   <li><code>watch_video</code></li>   </ul> </p> ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_name")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public ConversionEventsDataInner actionSource(String actionSource) {
    this.actionSource = actionSource;
    return this;
  }

  /**
   * <p>   The source indicating where the conversion event occurred.   <ul>     <li><code>app_android</code></li>     <li><code>app_ios</code></li>     <li><code>web</code></li>     <li><code>offline</code></li>   </ul> </p> 
   * @return actionSource
   */
  @NotNull 
  @Schema(name = "action_source", example = "app_ios", description = "<p>   The source indicating where the conversion event occurred.   <ul>     <li><code>app_android</code></li>     <li><code>app_ios</code></li>     <li><code>web</code></li>     <li><code>offline</code></li>   </ul> </p> ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action_source")
  public String getActionSource() {
    return actionSource;
  }

  public void setActionSource(String actionSource) {
    this.actionSource = actionSource;
  }

  public ConversionEventsDataInner eventTime(Long eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * The time when the event happened. Unix timestamp in seconds.
   * @return eventTime
   */
  @NotNull 
  @Schema(name = "event_time", example = "1451431341", description = "The time when the event happened. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_time")
  public Long getEventTime() {
    return eventTime;
  }

  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

  public ConversionEventsDataInner eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
   * @return eventId
   */
  @NotNull 
  @Schema(name = "event_id", example = "eventId0001", description = "A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ConversionEventsDataInner eventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = JsonNullable.of(eventSourceUrl);
    return this;
  }

  /**
   * URL of the web conversion event.
   * @return eventSourceUrl
   */
  
  @Schema(name = "event_source_url", example = "https://www.my-clothing-shop.org/", description = "URL of the web conversion event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event_source_url")
  public JsonNullable<String> getEventSourceUrl() {
    return eventSourceUrl;
  }

  public void setEventSourceUrl(JsonNullable<String> eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
  }

  public ConversionEventsDataInner optOut(Boolean optOut) {
    this.optOut = optOut;
    return this;
  }

  /**
   * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
   * @return optOut
   */
  
  @Schema(name = "opt_out", example = "false", description = "When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("opt_out")
  public Boolean getOptOut() {
    return optOut;
  }

  public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
  }

  public ConversionEventsDataInner partnerName(String partnerName) {
    this.partnerName = JsonNullable.of(partnerName);
    return this;
  }

  /**
   * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
   * @return partnerName
   */
  
  @Schema(name = "partner_name", example = "ss-partnername", description = "The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_name")
  public JsonNullable<String> getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(JsonNullable<String> partnerName) {
    this.partnerName = partnerName;
  }

  public ConversionEventsDataInner userData(ConversionEventsUserData userData) {
    this.userData = userData;
    return this;
  }

  /**
   * Get userData
   * @return userData
   */
  @NotNull @Valid 
  @Schema(name = "user_data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_data")
  public ConversionEventsUserData getUserData() {
    return userData;
  }

  public void setUserData(ConversionEventsUserData userData) {
    this.userData = userData;
  }

  public ConversionEventsDataInner customData(ConversionEventsDataInnerCustomData customData) {
    this.customData = customData;
    return this;
  }

  /**
   * Get customData
   * @return customData
   */
  @Valid 
  @Schema(name = "custom_data", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("custom_data")
  public ConversionEventsDataInnerCustomData getCustomData() {
    return customData;
  }

  public void setCustomData(ConversionEventsDataInnerCustomData customData) {
    this.customData = customData;
  }

  public ConversionEventsDataInner appId(String appId) {
    this.appId = JsonNullable.of(appId);
    return this;
  }

  /**
   * The app store app ID.
   * @return appId
   */
  
  @Schema(name = "app_id", example = "429047995", description = "The app store app ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_id")
  public JsonNullable<String> getAppId() {
    return appId;
  }

  public void setAppId(JsonNullable<String> appId) {
    this.appId = appId;
  }

  public ConversionEventsDataInner appName(String appName) {
    this.appName = JsonNullable.of(appName);
    return this;
  }

  /**
   * Name of the app.
   * @return appName
   */
  
  @Schema(name = "app_name", example = "Pinterest", description = "Name of the app.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_name")
  public JsonNullable<String> getAppName() {
    return appName;
  }

  public void setAppName(JsonNullable<String> appName) {
    this.appName = appName;
  }

  public ConversionEventsDataInner appVersion(String appVersion) {
    this.appVersion = JsonNullable.of(appVersion);
    return this;
  }

  /**
   * Version of the app.
   * @return appVersion
   */
  
  @Schema(name = "app_version", example = "7.9", description = "Version of the app.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_version")
  public JsonNullable<String> getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(JsonNullable<String> appVersion) {
    this.appVersion = appVersion;
  }

  public ConversionEventsDataInner deviceBrand(String deviceBrand) {
    this.deviceBrand = JsonNullable.of(deviceBrand);
    return this;
  }

  /**
   * Brand of the user device.
   * @return deviceBrand
   */
  
  @Schema(name = "device_brand", example = "Apple", description = "Brand of the user device.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("device_brand")
  public JsonNullable<String> getDeviceBrand() {
    return deviceBrand;
  }

  public void setDeviceBrand(JsonNullable<String> deviceBrand) {
    this.deviceBrand = deviceBrand;
  }

  public ConversionEventsDataInner deviceCarrier(String deviceCarrier) {
    this.deviceCarrier = JsonNullable.of(deviceCarrier);
    return this;
  }

  /**
   * User device's mobile carrier.
   * @return deviceCarrier
   */
  
  @Schema(name = "device_carrier", example = "T-Mobile", description = "User device's mobile carrier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("device_carrier")
  public JsonNullable<String> getDeviceCarrier() {
    return deviceCarrier;
  }

  public void setDeviceCarrier(JsonNullable<String> deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
  }

  public ConversionEventsDataInner deviceModel(String deviceModel) {
    this.deviceModel = JsonNullable.of(deviceModel);
    return this;
  }

  /**
   * Model of the user device.
   * @return deviceModel
   */
  
  @Schema(name = "device_model", example = "iPhone X", description = "Model of the user device.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("device_model")
  public JsonNullable<String> getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(JsonNullable<String> deviceModel) {
    this.deviceModel = deviceModel;
  }

  public ConversionEventsDataInner deviceType(String deviceType) {
    this.deviceType = JsonNullable.of(deviceType);
    return this;
  }

  /**
   * Type of the user device.
   * @return deviceType
   */
  
  @Schema(name = "device_type", example = "iPhone", description = "Type of the user device.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("device_type")
  public JsonNullable<String> getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(JsonNullable<String> deviceType) {
    this.deviceType = deviceType;
  }

  public ConversionEventsDataInner osVersion(String osVersion) {
    this.osVersion = JsonNullable.of(osVersion);
    return this;
  }

  /**
   * Version of the device operating system.
   * @return osVersion
   */
  
  @Schema(name = "os_version", example = "12.1.4", description = "Version of the device operating system.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("os_version")
  public JsonNullable<String> getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(JsonNullable<String> osVersion) {
    this.osVersion = osVersion;
  }

  public ConversionEventsDataInner wifi(Boolean wifi) {
    this.wifi = wifi;
    return this;
  }

  /**
   * Whether the event occurred when the user device was connected to wifi.
   * @return wifi
   */
  
  @Schema(name = "wifi", example = "false", description = "Whether the event occurred when the user device was connected to wifi.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wifi")
  public Boolean getWifi() {
    return wifi;
  }

  public void setWifi(Boolean wifi) {
    this.wifi = wifi;
  }

  public ConversionEventsDataInner language(String language) {
    this.language = JsonNullable.of(language);
    return this;
  }

  /**
   * Two-character ISO-639-1 language code indicating the user's language.
   * @return language
   */
  
  @Schema(name = "language", example = "en", description = "Two-character ISO-639-1 language code indicating the user's language.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public JsonNullable<String> getLanguage() {
    return language;
  }

  public void setLanguage(JsonNullable<String> language) {
    this.language = language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEventsDataInner conversionEventsDataInner = (ConversionEventsDataInner) o;
    return Objects.equals(this.eventName, conversionEventsDataInner.eventName) &&
        Objects.equals(this.actionSource, conversionEventsDataInner.actionSource) &&
        Objects.equals(this.eventTime, conversionEventsDataInner.eventTime) &&
        Objects.equals(this.eventId, conversionEventsDataInner.eventId) &&
        equalsNullable(this.eventSourceUrl, conversionEventsDataInner.eventSourceUrl) &&
        Objects.equals(this.optOut, conversionEventsDataInner.optOut) &&
        equalsNullable(this.partnerName, conversionEventsDataInner.partnerName) &&
        Objects.equals(this.userData, conversionEventsDataInner.userData) &&
        Objects.equals(this.customData, conversionEventsDataInner.customData) &&
        equalsNullable(this.appId, conversionEventsDataInner.appId) &&
        equalsNullable(this.appName, conversionEventsDataInner.appName) &&
        equalsNullable(this.appVersion, conversionEventsDataInner.appVersion) &&
        equalsNullable(this.deviceBrand, conversionEventsDataInner.deviceBrand) &&
        equalsNullable(this.deviceCarrier, conversionEventsDataInner.deviceCarrier) &&
        equalsNullable(this.deviceModel, conversionEventsDataInner.deviceModel) &&
        equalsNullable(this.deviceType, conversionEventsDataInner.deviceType) &&
        equalsNullable(this.osVersion, conversionEventsDataInner.osVersion) &&
        Objects.equals(this.wifi, conversionEventsDataInner.wifi) &&
        equalsNullable(this.language, conversionEventsDataInner.language);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, actionSource, eventTime, eventId, hashCodeNullable(eventSourceUrl), optOut, hashCodeNullable(partnerName), userData, customData, hashCodeNullable(appId), hashCodeNullable(appName), hashCodeNullable(appVersion), hashCodeNullable(deviceBrand), hashCodeNullable(deviceCarrier), hashCodeNullable(deviceModel), hashCodeNullable(deviceType), hashCodeNullable(osVersion), wifi, hashCodeNullable(language));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsDataInner {\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    actionSource: ").append(toIndentedString(actionSource)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventSourceUrl: ").append(toIndentedString(eventSourceUrl)).append("\n");
    sb.append("    optOut: ").append(toIndentedString(optOut)).append("\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    deviceBrand: ").append(toIndentedString(deviceBrand)).append("\n");
    sb.append("    deviceCarrier: ").append(toIndentedString(deviceCarrier)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    wifi: ").append(toIndentedString(wifi)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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


package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventAppInfo;
import org.openapitools.model.ConversionEventDeviceInfo;
import org.openapitools.model.ConversionEventsDataItemsCustomData;
import org.openapitools.model.ConversionEventsUserDataProperties;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ConversionEventsDataItems
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEventsDataItems {

  private String actionSource;

  private JsonNullable<String> appId = JsonNullable.<String>undefined();

  private ConversionEventAppInfo appInfo;

  private JsonNullable<String> appName = JsonNullable.<String>undefined();

  private JsonNullable<String> appVersion = JsonNullable.<String>undefined();

  private ConversionEventsDataItemsCustomData customData;

  private JsonNullable<String> deviceBrand = JsonNullable.<String>undefined();

  private JsonNullable<String> deviceCarrier = JsonNullable.<String>undefined();

  private ConversionEventDeviceInfo deviceInfo;

  private JsonNullable<String> deviceModel = JsonNullable.<String>undefined();

  private JsonNullable<String> deviceType = JsonNullable.<String>undefined();

  private String eventId;

  private String eventName;

  private JsonNullable<String> eventSourceUrl = JsonNullable.<String>undefined();

  private Long eventTime;

  private JsonNullable<String> language = JsonNullable.<String>undefined();

  private Boolean optOut;

  private JsonNullable<String> osVersion = JsonNullable.<String>undefined();

  private JsonNullable<String> partnerName = JsonNullable.<String>undefined();

  private ConversionEventsUserDataProperties userData;

  private Boolean wifi;

  public ConversionEventsDataItems() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionEventsDataItems(String actionSource, String eventId, String eventName, Long eventTime, ConversionEventsUserDataProperties userData) {
    this.actionSource = actionSource;
    this.eventId = eventId;
    this.eventName = eventName;
    this.eventTime = eventTime;
    this.userData = userData;
  }

  public ConversionEventsDataItems actionSource(String actionSource) {
    this.actionSource = actionSource;
    return this;
  }

  /**
   * The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`
   * @return actionSource
   */
  @NotNull 
  @Schema(name = "action_source", description = "The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("action_source")
  public String getActionSource() {
    return actionSource;
  }

  public void setActionSource(String actionSource) {
    this.actionSource = actionSource;
  }

  public ConversionEventsDataItems appId(String appId) {
    this.appId = JsonNullable.of(appId);
    return this;
  }

  /**
   * The app store app ID.
   * @return appId
   */
  
  @Schema(name = "app_id", description = "The app store app ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_id")
  public JsonNullable<String> getAppId() {
    return appId;
  }

  public void setAppId(JsonNullable<String> appId) {
    this.appId = appId;
  }

  public ConversionEventsDataItems appInfo(ConversionEventAppInfo appInfo) {
    this.appInfo = appInfo;
    return this;
  }

  /**
   * Get appInfo
   * @return appInfo
   */
  @Valid 
  @Schema(name = "app_info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_info")
  public ConversionEventAppInfo getAppInfo() {
    return appInfo;
  }

  public void setAppInfo(ConversionEventAppInfo appInfo) {
    this.appInfo = appInfo;
  }

  public ConversionEventsDataItems appName(String appName) {
    this.appName = JsonNullable.of(appName);
    return this;
  }

  /**
   * Name of the app.
   * @return appName
   */
  
  @Schema(name = "app_name", description = "Name of the app.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_name")
  public JsonNullable<String> getAppName() {
    return appName;
  }

  public void setAppName(JsonNullable<String> appName) {
    this.appName = appName;
  }

  public ConversionEventsDataItems appVersion(String appVersion) {
    this.appVersion = JsonNullable.of(appVersion);
    return this;
  }

  /**
   * Version of the app.
   * @return appVersion
   */
  
  @Schema(name = "app_version", description = "Version of the app.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("app_version")
  public JsonNullable<String> getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(JsonNullable<String> appVersion) {
    this.appVersion = appVersion;
  }

  public ConversionEventsDataItems customData(ConversionEventsDataItemsCustomData customData) {
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
  public ConversionEventsDataItemsCustomData getCustomData() {
    return customData;
  }

  public void setCustomData(ConversionEventsDataItemsCustomData customData) {
    this.customData = customData;
  }

  public ConversionEventsDataItems deviceBrand(String deviceBrand) {
    this.deviceBrand = JsonNullable.of(deviceBrand);
    return this;
  }

  /**
   * Brand of the user device.
   * @return deviceBrand
   */
  
  @Schema(name = "device_brand", description = "Brand of the user device.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("device_brand")
  public JsonNullable<String> getDeviceBrand() {
    return deviceBrand;
  }

  public void setDeviceBrand(JsonNullable<String> deviceBrand) {
    this.deviceBrand = deviceBrand;
  }

  public ConversionEventsDataItems deviceCarrier(String deviceCarrier) {
    this.deviceCarrier = JsonNullable.of(deviceCarrier);
    return this;
  }

  /**
   * User device's mobile carrier.
   * @return deviceCarrier
   */
  
  @Schema(name = "device_carrier", description = "User device's mobile carrier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("device_carrier")
  public JsonNullable<String> getDeviceCarrier() {
    return deviceCarrier;
  }

  public void setDeviceCarrier(JsonNullable<String> deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
  }

  public ConversionEventsDataItems deviceInfo(ConversionEventDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

  /**
   * Get deviceInfo
   * @return deviceInfo
   */
  @Valid 
  @Schema(name = "device_info", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("device_info")
  public ConversionEventDeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  public void setDeviceInfo(ConversionEventDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

  public ConversionEventsDataItems deviceModel(String deviceModel) {
    this.deviceModel = JsonNullable.of(deviceModel);
    return this;
  }

  /**
   * Model of the user device.
   * @return deviceModel
   */
  
  @Schema(name = "device_model", description = "Model of the user device.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("device_model")
  public JsonNullable<String> getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(JsonNullable<String> deviceModel) {
    this.deviceModel = deviceModel;
  }

  public ConversionEventsDataItems deviceType(String deviceType) {
    this.deviceType = JsonNullable.of(deviceType);
    return this;
  }

  /**
   * Type of the user device.
   * @return deviceType
   */
  
  @Schema(name = "device_type", description = "Type of the user device.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("device_type")
  public JsonNullable<String> getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(JsonNullable<String> deviceType) {
    this.deviceType = deviceType;
  }

  public ConversionEventsDataItems eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
   * @return eventId
   */
  @NotNull 
  @Schema(name = "event_id", description = "A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ConversionEventsDataItems eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`
   * @return eventName
   */
  @NotNull 
  @Schema(name = "event_name", description = "The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_name")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public ConversionEventsDataItems eventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = JsonNullable.of(eventSourceUrl);
    return this;
  }

  /**
   * URL of the web conversion event.
   * @return eventSourceUrl
   */
  
  @Schema(name = "event_source_url", description = "URL of the web conversion event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("event_source_url")
  public JsonNullable<String> getEventSourceUrl() {
    return eventSourceUrl;
  }

  public void setEventSourceUrl(JsonNullable<String> eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
  }

  public ConversionEventsDataItems eventTime(Long eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * The time when the event happened. Unix timestamp in seconds.
   * @return eventTime
   */
  @NotNull 
  @Schema(name = "event_time", description = "The time when the event happened. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_time")
  public Long getEventTime() {
    return eventTime;
  }

  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

  public ConversionEventsDataItems language(String language) {
    this.language = JsonNullable.of(language);
    return this;
  }

  /**
   * Two-character ISO-639-1 language code indicating the user's language.
   * @return language
   */
  
  @Schema(name = "language", description = "Two-character ISO-639-1 language code indicating the user's language.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("language")
  public JsonNullable<String> getLanguage() {
    return language;
  }

  public void setLanguage(JsonNullable<String> language) {
    this.language = language;
  }

  public ConversionEventsDataItems optOut(Boolean optOut) {
    this.optOut = optOut;
    return this;
  }

  /**
   * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
   * @return optOut
   */
  
  @Schema(name = "opt_out", description = "When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("opt_out")
  public Boolean getOptOut() {
    return optOut;
  }

  public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
  }

  public ConversionEventsDataItems osVersion(String osVersion) {
    this.osVersion = JsonNullable.of(osVersion);
    return this;
  }

  /**
   * Version of the device operating system.
   * @return osVersion
   */
  
  @Schema(name = "os_version", description = "Version of the device operating system.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("os_version")
  public JsonNullable<String> getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(JsonNullable<String> osVersion) {
    this.osVersion = osVersion;
  }

  public ConversionEventsDataItems partnerName(String partnerName) {
    this.partnerName = JsonNullable.of(partnerName);
    return this;
  }

  /**
   * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'
   * @return partnerName
   */
  
  @Schema(name = "partner_name", description = "The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partner_name")
  public JsonNullable<String> getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(JsonNullable<String> partnerName) {
    this.partnerName = partnerName;
  }

  public ConversionEventsDataItems userData(ConversionEventsUserDataProperties userData) {
    this.userData = userData;
    return this;
  }

  /**
   * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
   * @return userData
   */
  @NotNull @Valid 
  @Schema(name = "user_data", description = "Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("user_data")
  public ConversionEventsUserDataProperties getUserData() {
    return userData;
  }

  public void setUserData(ConversionEventsUserDataProperties userData) {
    this.userData = userData;
  }

  public ConversionEventsDataItems wifi(Boolean wifi) {
    this.wifi = wifi;
    return this;
  }

  /**
   * Whether the event occurred when the user device was connected to wifi.
   * @return wifi
   */
  
  @Schema(name = "wifi", description = "Whether the event occurred when the user device was connected to wifi.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("wifi")
  public Boolean getWifi() {
    return wifi;
  }

  public void setWifi(Boolean wifi) {
    this.wifi = wifi;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEventsDataItems conversionEventsDataItems = (ConversionEventsDataItems) o;
    return Objects.equals(this.actionSource, conversionEventsDataItems.actionSource) &&
        equalsNullable(this.appId, conversionEventsDataItems.appId) &&
        Objects.equals(this.appInfo, conversionEventsDataItems.appInfo) &&
        equalsNullable(this.appName, conversionEventsDataItems.appName) &&
        equalsNullable(this.appVersion, conversionEventsDataItems.appVersion) &&
        Objects.equals(this.customData, conversionEventsDataItems.customData) &&
        equalsNullable(this.deviceBrand, conversionEventsDataItems.deviceBrand) &&
        equalsNullable(this.deviceCarrier, conversionEventsDataItems.deviceCarrier) &&
        Objects.equals(this.deviceInfo, conversionEventsDataItems.deviceInfo) &&
        equalsNullable(this.deviceModel, conversionEventsDataItems.deviceModel) &&
        equalsNullable(this.deviceType, conversionEventsDataItems.deviceType) &&
        Objects.equals(this.eventId, conversionEventsDataItems.eventId) &&
        Objects.equals(this.eventName, conversionEventsDataItems.eventName) &&
        equalsNullable(this.eventSourceUrl, conversionEventsDataItems.eventSourceUrl) &&
        Objects.equals(this.eventTime, conversionEventsDataItems.eventTime) &&
        equalsNullable(this.language, conversionEventsDataItems.language) &&
        Objects.equals(this.optOut, conversionEventsDataItems.optOut) &&
        equalsNullable(this.osVersion, conversionEventsDataItems.osVersion) &&
        equalsNullable(this.partnerName, conversionEventsDataItems.partnerName) &&
        Objects.equals(this.userData, conversionEventsDataItems.userData) &&
        Objects.equals(this.wifi, conversionEventsDataItems.wifi);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionSource, hashCodeNullable(appId), appInfo, hashCodeNullable(appName), hashCodeNullable(appVersion), customData, hashCodeNullable(deviceBrand), hashCodeNullable(deviceCarrier), deviceInfo, hashCodeNullable(deviceModel), hashCodeNullable(deviceType), eventId, eventName, hashCodeNullable(eventSourceUrl), eventTime, hashCodeNullable(language), optOut, hashCodeNullable(osVersion), hashCodeNullable(partnerName), userData, wifi);
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
    sb.append("class ConversionEventsDataItems {\n");
    sb.append("    actionSource: ").append(toIndentedString(actionSource)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appInfo: ").append(toIndentedString(appInfo)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    customData: ").append(toIndentedString(customData)).append("\n");
    sb.append("    deviceBrand: ").append(toIndentedString(deviceBrand)).append("\n");
    sb.append("    deviceCarrier: ").append(toIndentedString(deviceCarrier)).append("\n");
    sb.append("    deviceInfo: ").append(toIndentedString(deviceInfo)).append("\n");
    sb.append("    deviceModel: ").append(toIndentedString(deviceModel)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventSourceUrl: ").append(toIndentedString(eventSourceUrl)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    optOut: ").append(toIndentedString(optOut)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    wifi: ").append(toIndentedString(wifi)).append("\n");
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


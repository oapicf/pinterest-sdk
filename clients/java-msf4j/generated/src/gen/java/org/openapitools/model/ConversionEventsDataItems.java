package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventAppInfo;
import org.openapitools.model.ConversionEventDeviceInfo;
import org.openapitools.model.ConversionEventsDataItemsCustomData;
import org.openapitools.model.ConversionEventsUserDataProperties;

/**
 * ConversionEventsDataItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionEventsDataItems   {
  @JsonProperty("action_source")
  private String actionSource;

  @JsonProperty("app_id")
  private String appId;

  @JsonProperty("app_info")
  private ConversionEventAppInfo appInfo;

  @JsonProperty("app_name")
  private String appName;

  @JsonProperty("app_version")
  private String appVersion;

  @JsonProperty("custom_data")
  private ConversionEventsDataItemsCustomData customData;

  @JsonProperty("device_brand")
  private String deviceBrand;

  @JsonProperty("device_carrier")
  private String deviceCarrier;

  @JsonProperty("device_info")
  private ConversionEventDeviceInfo deviceInfo;

  @JsonProperty("device_model")
  private String deviceModel;

  @JsonProperty("device_type")
  private String deviceType;

  @JsonProperty("event_id")
  private String eventId;

  @JsonProperty("event_name")
  private String eventName;

  @JsonProperty("event_source_url")
  private String eventSourceUrl;

  @JsonProperty("event_time")
  private Long eventTime;

  @JsonProperty("language")
  private String language;

  @JsonProperty("opt_out")
  private Boolean optOut;

  @JsonProperty("os_version")
  private String osVersion;

  @JsonProperty("partner_name")
  private String partnerName;

  @JsonProperty("user_data")
  private ConversionEventsUserDataProperties userData;

  @JsonProperty("wifi")
  private Boolean wifi;

  public ConversionEventsDataItems actionSource(String actionSource) {
    this.actionSource = actionSource;
    return this;
  }

   /**
   * The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`
   * @return actionSource
  **/
  @ApiModelProperty(required = true, value = "The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`")
  public String getActionSource() {
    return actionSource;
  }

  public void setActionSource(String actionSource) {
    this.actionSource = actionSource;
  }

  public ConversionEventsDataItems appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * The app store app ID.
   * @return appId
  **/
  @ApiModelProperty(value = "The app store app ID.")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public ConversionEventsDataItems appInfo(ConversionEventAppInfo appInfo) {
    this.appInfo = appInfo;
    return this;
  }

   /**
   * Get appInfo
   * @return appInfo
  **/
  @ApiModelProperty(value = "")
  public ConversionEventAppInfo getAppInfo() {
    return appInfo;
  }

  public void setAppInfo(ConversionEventAppInfo appInfo) {
    this.appInfo = appInfo;
  }

  public ConversionEventsDataItems appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Name of the app.
   * @return appName
  **/
  @ApiModelProperty(value = "Name of the app.")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public ConversionEventsDataItems appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * Version of the app.
   * @return appVersion
  **/
  @ApiModelProperty(value = "Version of the app.")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public ConversionEventsDataItems customData(ConversionEventsDataItemsCustomData customData) {
    this.customData = customData;
    return this;
  }

   /**
   * Get customData
   * @return customData
  **/
  @ApiModelProperty(value = "")
  public ConversionEventsDataItemsCustomData getCustomData() {
    return customData;
  }

  public void setCustomData(ConversionEventsDataItemsCustomData customData) {
    this.customData = customData;
  }

  public ConversionEventsDataItems deviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

   /**
   * Brand of the user device.
   * @return deviceBrand
  **/
  @ApiModelProperty(value = "Brand of the user device.")
  public String getDeviceBrand() {
    return deviceBrand;
  }

  public void setDeviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
  }

  public ConversionEventsDataItems deviceCarrier(String deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
    return this;
  }

   /**
   * User device's mobile carrier.
   * @return deviceCarrier
  **/
  @ApiModelProperty(value = "User device's mobile carrier.")
  public String getDeviceCarrier() {
    return deviceCarrier;
  }

  public void setDeviceCarrier(String deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
  }

  public ConversionEventsDataItems deviceInfo(ConversionEventDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

   /**
   * Get deviceInfo
   * @return deviceInfo
  **/
  @ApiModelProperty(value = "")
  public ConversionEventDeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  public void setDeviceInfo(ConversionEventDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

  public ConversionEventsDataItems deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

   /**
   * Model of the user device.
   * @return deviceModel
  **/
  @ApiModelProperty(value = "Model of the user device.")
  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public ConversionEventsDataItems deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Type of the user device.
   * @return deviceType
  **/
  @ApiModelProperty(value = "Type of the user device.")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public ConversionEventsDataItems eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
   * @return eventId
  **/
  @ApiModelProperty(required = true, value = "A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.")
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
  **/
  @ApiModelProperty(required = true, value = "The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`")
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public ConversionEventsDataItems eventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
    return this;
  }

   /**
   * URL of the web conversion event.
   * @return eventSourceUrl
  **/
  @ApiModelProperty(value = "URL of the web conversion event.")
  public String getEventSourceUrl() {
    return eventSourceUrl;
  }

  public void setEventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
  }

  public ConversionEventsDataItems eventTime(Long eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * The time when the event happened. Unix timestamp in seconds.
   * @return eventTime
  **/
  @ApiModelProperty(required = true, value = "The time when the event happened. Unix timestamp in seconds.")
  public Long getEventTime() {
    return eventTime;
  }

  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

  public ConversionEventsDataItems language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Two-character ISO-639-1 language code indicating the user's language.
   * @return language
  **/
  @ApiModelProperty(value = "Two-character ISO-639-1 language code indicating the user's language.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public ConversionEventsDataItems optOut(Boolean optOut) {
    this.optOut = optOut;
    return this;
  }

   /**
   * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
   * @return optOut
  **/
  @ApiModelProperty(value = "When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.")
  public Boolean getOptOut() {
    return optOut;
  }

  public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
  }

  public ConversionEventsDataItems osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

   /**
   * Version of the device operating system.
   * @return osVersion
  **/
  @ApiModelProperty(value = "Version of the device operating system.")
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public ConversionEventsDataItems partnerName(String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

   /**
   * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'
   * @return partnerName
  **/
  @ApiModelProperty(value = "The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'")
  public String getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  public ConversionEventsDataItems userData(ConversionEventsUserDataProperties userData) {
    this.userData = userData;
    return this;
  }

   /**
   * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
   * @return userData
  **/
  @ApiModelProperty(required = true, value = "Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.")
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
  **/
  @ApiModelProperty(value = "Whether the event occurred when the user device was connected to wifi.")
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
        Objects.equals(this.appId, conversionEventsDataItems.appId) &&
        Objects.equals(this.appInfo, conversionEventsDataItems.appInfo) &&
        Objects.equals(this.appName, conversionEventsDataItems.appName) &&
        Objects.equals(this.appVersion, conversionEventsDataItems.appVersion) &&
        Objects.equals(this.customData, conversionEventsDataItems.customData) &&
        Objects.equals(this.deviceBrand, conversionEventsDataItems.deviceBrand) &&
        Objects.equals(this.deviceCarrier, conversionEventsDataItems.deviceCarrier) &&
        Objects.equals(this.deviceInfo, conversionEventsDataItems.deviceInfo) &&
        Objects.equals(this.deviceModel, conversionEventsDataItems.deviceModel) &&
        Objects.equals(this.deviceType, conversionEventsDataItems.deviceType) &&
        Objects.equals(this.eventId, conversionEventsDataItems.eventId) &&
        Objects.equals(this.eventName, conversionEventsDataItems.eventName) &&
        Objects.equals(this.eventSourceUrl, conversionEventsDataItems.eventSourceUrl) &&
        Objects.equals(this.eventTime, conversionEventsDataItems.eventTime) &&
        Objects.equals(this.language, conversionEventsDataItems.language) &&
        Objects.equals(this.optOut, conversionEventsDataItems.optOut) &&
        Objects.equals(this.osVersion, conversionEventsDataItems.osVersion) &&
        Objects.equals(this.partnerName, conversionEventsDataItems.partnerName) &&
        Objects.equals(this.userData, conversionEventsDataItems.userData) &&
        Objects.equals(this.wifi, conversionEventsDataItems.wifi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionSource, appId, appInfo, appName, appVersion, customData, deviceBrand, deviceCarrier, deviceInfo, deviceModel, deviceType, eventId, eventName, eventSourceUrl, eventTime, language, optOut, osVersion, partnerName, userData, wifi);
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


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





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  /**
   * The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`
   **/
  public ConversionEventsDataItems actionSource(String actionSource) {
    this.actionSource = actionSource;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`")
  @JsonProperty("action_source")
  public String getActionSource() {
    return actionSource;
  }
  public void setActionSource(String actionSource) {
    this.actionSource = actionSource;
  }

  /**
   * The app store app ID.
   **/
  public ConversionEventsDataItems appId(String appId) {
    this.appId = appId;
    return this;
  }

  
  @ApiModelProperty(value = "The app store app ID.")
  @JsonProperty("app_id")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }

  /**
   **/
  public ConversionEventsDataItems appInfo(ConversionEventAppInfo appInfo) {
    this.appInfo = appInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("app_info")
  public ConversionEventAppInfo getAppInfo() {
    return appInfo;
  }
  public void setAppInfo(ConversionEventAppInfo appInfo) {
    this.appInfo = appInfo;
  }

  /**
   * Name of the app.
   **/
  public ConversionEventsDataItems appName(String appName) {
    this.appName = appName;
    return this;
  }

  
  @ApiModelProperty(value = "Name of the app.")
  @JsonProperty("app_name")
  public String getAppName() {
    return appName;
  }
  public void setAppName(String appName) {
    this.appName = appName;
  }

  /**
   * Version of the app.
   **/
  public ConversionEventsDataItems appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  
  @ApiModelProperty(value = "Version of the app.")
  @JsonProperty("app_version")
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  /**
   **/
  public ConversionEventsDataItems customData(ConversionEventsDataItemsCustomData customData) {
    this.customData = customData;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_data")
  public ConversionEventsDataItemsCustomData getCustomData() {
    return customData;
  }
  public void setCustomData(ConversionEventsDataItemsCustomData customData) {
    this.customData = customData;
  }

  /**
   * Brand of the user device.
   **/
  public ConversionEventsDataItems deviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

  
  @ApiModelProperty(value = "Brand of the user device.")
  @JsonProperty("device_brand")
  public String getDeviceBrand() {
    return deviceBrand;
  }
  public void setDeviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
  }

  /**
   * User device's mobile carrier.
   **/
  public ConversionEventsDataItems deviceCarrier(String deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
    return this;
  }

  
  @ApiModelProperty(value = "User device's mobile carrier.")
  @JsonProperty("device_carrier")
  public String getDeviceCarrier() {
    return deviceCarrier;
  }
  public void setDeviceCarrier(String deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
  }

  /**
   **/
  public ConversionEventsDataItems deviceInfo(ConversionEventDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("device_info")
  public ConversionEventDeviceInfo getDeviceInfo() {
    return deviceInfo;
  }
  public void setDeviceInfo(ConversionEventDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

  /**
   * Model of the user device.
   **/
  public ConversionEventsDataItems deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

  
  @ApiModelProperty(value = "Model of the user device.")
  @JsonProperty("device_model")
  public String getDeviceModel() {
    return deviceModel;
  }
  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  /**
   * Type of the user device.
   **/
  public ConversionEventsDataItems deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  
  @ApiModelProperty(value = "Type of the user device.")
  @JsonProperty("device_type")
  public String getDeviceType() {
    return deviceType;
  }
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  /**
   * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
   **/
  public ConversionEventsDataItems eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.")
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`
   **/
  public ConversionEventsDataItems eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`")
  @JsonProperty("event_name")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  /**
   * URL of the web conversion event.
   **/
  public ConversionEventsDataItems eventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
    return this;
  }

  
  @ApiModelProperty(value = "URL of the web conversion event.")
  @JsonProperty("event_source_url")
  public String getEventSourceUrl() {
    return eventSourceUrl;
  }
  public void setEventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
  }

  /**
   * The time when the event happened. Unix timestamp in seconds.
   **/
  public ConversionEventsDataItems eventTime(Long eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "The time when the event happened. Unix timestamp in seconds.")
  @JsonProperty("event_time")
  public Long getEventTime() {
    return eventTime;
  }
  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

  /**
   * Two-character ISO-639-1 language code indicating the user's language.
   **/
  public ConversionEventsDataItems language(String language) {
    this.language = language;
    return this;
  }

  
  @ApiModelProperty(value = "Two-character ISO-639-1 language code indicating the user's language.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
   **/
  public ConversionEventsDataItems optOut(Boolean optOut) {
    this.optOut = optOut;
    return this;
  }

  
  @ApiModelProperty(value = "When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.")
  @JsonProperty("opt_out")
  public Boolean getOptOut() {
    return optOut;
  }
  public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
  }

  /**
   * Version of the device operating system.
   **/
  public ConversionEventsDataItems osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  
  @ApiModelProperty(value = "Version of the device operating system.")
  @JsonProperty("os_version")
  public String getOsVersion() {
    return osVersion;
  }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  /**
   * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'
   **/
  public ConversionEventsDataItems partnerName(String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

  
  @ApiModelProperty(value = "The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'")
  @JsonProperty("partner_name")
  public String getPartnerName() {
    return partnerName;
  }
  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  /**
   * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
   **/
  public ConversionEventsDataItems userData(ConversionEventsUserDataProperties userData) {
    this.userData = userData;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.")
  @JsonProperty("user_data")
  public ConversionEventsUserDataProperties getUserData() {
    return userData;
  }
  public void setUserData(ConversionEventsUserDataProperties userData) {
    this.userData = userData;
  }

  /**
   * Whether the event occurred when the user device was connected to wifi.
   **/
  public ConversionEventsDataItems wifi(Boolean wifi) {
    this.wifi = wifi;
    return this;
  }

  
  @ApiModelProperty(value = "Whether the event occurred when the user device was connected to wifi.")
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
    return Objects.equals(actionSource, conversionEventsDataItems.actionSource) &&
        Objects.equals(appId, conversionEventsDataItems.appId) &&
        Objects.equals(appInfo, conversionEventsDataItems.appInfo) &&
        Objects.equals(appName, conversionEventsDataItems.appName) &&
        Objects.equals(appVersion, conversionEventsDataItems.appVersion) &&
        Objects.equals(customData, conversionEventsDataItems.customData) &&
        Objects.equals(deviceBrand, conversionEventsDataItems.deviceBrand) &&
        Objects.equals(deviceCarrier, conversionEventsDataItems.deviceCarrier) &&
        Objects.equals(deviceInfo, conversionEventsDataItems.deviceInfo) &&
        Objects.equals(deviceModel, conversionEventsDataItems.deviceModel) &&
        Objects.equals(deviceType, conversionEventsDataItems.deviceType) &&
        Objects.equals(eventId, conversionEventsDataItems.eventId) &&
        Objects.equals(eventName, conversionEventsDataItems.eventName) &&
        Objects.equals(eventSourceUrl, conversionEventsDataItems.eventSourceUrl) &&
        Objects.equals(eventTime, conversionEventsDataItems.eventTime) &&
        Objects.equals(language, conversionEventsDataItems.language) &&
        Objects.equals(optOut, conversionEventsDataItems.optOut) &&
        Objects.equals(osVersion, conversionEventsDataItems.osVersion) &&
        Objects.equals(partnerName, conversionEventsDataItems.partnerName) &&
        Objects.equals(userData, conversionEventsDataItems.userData) &&
        Objects.equals(wifi, conversionEventsDataItems.wifi);
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


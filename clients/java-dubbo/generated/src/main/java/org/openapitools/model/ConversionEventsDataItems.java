package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventAppInfo;
import org.openapitools.model.ConversionEventDeviceInfo;
import org.openapitools.model.ConversionEventsDataItemsCustomData;
import org.openapitools.model.ConversionEventsUserDataProperties;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ConversionEventsDataItems implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The source indicating where the conversion event occurred. - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60;
   */
  @JsonProperty("action_source")
  private String actionSource;

  /**
   * The app store app ID.
   */
  @JsonProperty("app_id")
  private String appId;

  @JsonProperty("app_info")
  private ConversionEventAppInfo appInfo;

  /**
   * Name of the app.
   */
  @JsonProperty("app_name")
  private String appName;

  /**
   * Version of the app.
   */
  @JsonProperty("app_version")
  private String appVersion;

  @JsonProperty("custom_data")
  private ConversionEventsDataItemsCustomData customData;

  /**
   * Brand of the user device.
   */
  @JsonProperty("device_brand")
  private String deviceBrand;

  /**
   * User device&#39;s mobile carrier.
   */
  @JsonProperty("device_carrier")
  private String deviceCarrier;

  @JsonProperty("device_info")
  private ConversionEventDeviceInfo deviceInfo;

  /**
   * Model of the user device.
   */
  @JsonProperty("device_model")
  private String deviceModel;

  /**
   * Type of the user device.
   */
  @JsonProperty("device_type")
  private String deviceType;

  /**
   * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
   */
  @JsonProperty("event_id")
  private String eventId;

  /**
   * The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;app_open&#x60; - &#x60;checkout&#x60; - &#x60;contact&#x60; - &#x60;custom&#x60; - &#x60;customize_product&#x60; - &#x60;find_location&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;schedule&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;start_trial&#x60; - &#x60;submit_application&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60;
   */
  @JsonProperty("event_name")
  private String eventName;

  /**
   * URL of the web conversion event.
   */
  @JsonProperty("event_source_url")
  private String eventSourceUrl;

  /**
   * The time when the event happened. Unix timestamp in seconds.
   */
  @JsonProperty("event_time")
  private Long eventTime;

  /**
   * Two-character ISO-639-1 language code indicating the user&#39;s language.
   */
  @JsonProperty("language")
  private String language;

  /**
   * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
   */
  @JsonProperty("opt_out")
  private Boolean optOut;

  /**
   * Version of the device operating system.
   */
  @JsonProperty("os_version")
  private String osVersion;

  /**
   * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g &#39;ss-shopify&#39;
   */
  @JsonProperty("partner_name")
  private String partnerName;

  /**
   * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
   */
  @JsonProperty("user_data")
  private ConversionEventsUserDataProperties userData;

  /**
   * Whether the event occurred when the user device was connected to wifi.
   */
  @JsonProperty("wifi")
  private Boolean wifi;

  /**
   * The source indicating where the conversion event occurred. - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60;
   * @return actionSource
   */
  public String getActionSource() {
    return actionSource;
  }

  public void setActionSource(String actionSource) {
    this.actionSource = actionSource;
  }

  /**
   * The app store app ID.
   * @return appId
   */
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  /**
   * 
   * @return appInfo
   */
  public ConversionEventAppInfo getAppInfo() {
    return appInfo;
  }

  public void setAppInfo(ConversionEventAppInfo appInfo) {
    this.appInfo = appInfo;
  }

  /**
   * Name of the app.
   * @return appName
   */
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  /**
   * Version of the app.
   * @return appVersion
   */
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  /**
   * 
   * @return customData
   */
  public ConversionEventsDataItemsCustomData getCustomData() {
    return customData;
  }

  public void setCustomData(ConversionEventsDataItemsCustomData customData) {
    this.customData = customData;
  }

  /**
   * Brand of the user device.
   * @return deviceBrand
   */
  public String getDeviceBrand() {
    return deviceBrand;
  }

  public void setDeviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
  }

  /**
   * User device&#39;s mobile carrier.
   * @return deviceCarrier
   */
  public String getDeviceCarrier() {
    return deviceCarrier;
  }

  public void setDeviceCarrier(String deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
  }

  /**
   * 
   * @return deviceInfo
   */
  public ConversionEventDeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  public void setDeviceInfo(ConversionEventDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

  /**
   * Model of the user device.
   * @return deviceModel
   */
  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  /**
   * Type of the user device.
   * @return deviceType
   */
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  /**
   * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
   * @return eventId
   */
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;app_open&#x60; - &#x60;checkout&#x60; - &#x60;contact&#x60; - &#x60;custom&#x60; - &#x60;customize_product&#x60; - &#x60;find_location&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;schedule&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;start_trial&#x60; - &#x60;submit_application&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60;
   * @return eventName
   */
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  /**
   * URL of the web conversion event.
   * @return eventSourceUrl
   */
  public String getEventSourceUrl() {
    return eventSourceUrl;
  }

  public void setEventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
  }

  /**
   * The time when the event happened. Unix timestamp in seconds.
   * @return eventTime
   */
  public Long getEventTime() {
    return eventTime;
  }

  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

  /**
   * Two-character ISO-639-1 language code indicating the user&#39;s language.
   * @return language
   */
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
   * @return optOut
   */
  public Boolean getOptOut() {
    return optOut;
  }

  public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
  }

  /**
   * Version of the device operating system.
   * @return osVersion
   */
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  /**
   * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g &#39;ss-shopify&#39;
   * @return partnerName
   */
  public String getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  /**
   * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
   * @return userData
   */
  public ConversionEventsUserDataProperties getUserData() {
    return userData;
  }

  public void setUserData(ConversionEventsUserDataProperties userData) {
    this.userData = userData;
  }

  /**
   * Whether the event occurred when the user device was connected to wifi.
   * @return wifi
   */
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

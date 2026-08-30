package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventAppInfo;
import org.openapitools.model.ConversionEventDeviceInfo;
import org.openapitools.model.ConversionEventsDataItemsCustomData;
import org.openapitools.model.ConversionEventsUserDataProperties;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionEventsDataItems  {
  
 /**
  * The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`
  */
  @ApiModelProperty(required = true, value = "The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`")
  private String actionSource;

 /**
  * The app store app ID.
  */
  @ApiModelProperty(value = "The app store app ID.")
  private String appId;

  @ApiModelProperty(value = "")
  @Valid
  private ConversionEventAppInfo appInfo;

 /**
  * Name of the app.
  */
  @ApiModelProperty(value = "Name of the app.")
  private String appName;

 /**
  * Version of the app.
  */
  @ApiModelProperty(value = "Version of the app.")
  private String appVersion;

  @ApiModelProperty(value = "")
  @Valid
  private ConversionEventsDataItemsCustomData customData;

 /**
  * Brand of the user device.
  */
  @ApiModelProperty(value = "Brand of the user device.")
  private String deviceBrand;

 /**
  * User device's mobile carrier.
  */
  @ApiModelProperty(value = "User device's mobile carrier.")
  private String deviceCarrier;

  @ApiModelProperty(value = "")
  @Valid
  private ConversionEventDeviceInfo deviceInfo;

 /**
  * Model of the user device.
  */
  @ApiModelProperty(value = "Model of the user device.")
  private String deviceModel;

 /**
  * Type of the user device.
  */
  @ApiModelProperty(value = "Type of the user device.")
  private String deviceType;

 /**
  * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
  */
  @ApiModelProperty(required = true, value = "A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.")
  private String eventId;

 /**
  * The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`
  */
  @ApiModelProperty(required = true, value = "The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`")
  private String eventName;

 /**
  * URL of the web conversion event.
  */
  @ApiModelProperty(value = "URL of the web conversion event.")
  private String eventSourceUrl;

 /**
  * The time when the event happened. Unix timestamp in seconds.
  */
  @ApiModelProperty(required = true, value = "The time when the event happened. Unix timestamp in seconds.")
  private Long eventTime;

 /**
  * Two-character ISO-639-1 language code indicating the user's language.
  */
  @ApiModelProperty(value = "Two-character ISO-639-1 language code indicating the user's language.")
  private String language;

 /**
  * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
  */
  @ApiModelProperty(value = "When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.")
  private Boolean optOut;

 /**
  * Version of the device operating system.
  */
  @ApiModelProperty(value = "Version of the device operating system.")
  private String osVersion;

 /**
  * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'
  */
  @ApiModelProperty(value = "The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'")
  private String partnerName;

 /**
  * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
  */
  @ApiModelProperty(required = true, value = "Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.")
  @Valid
  private ConversionEventsUserDataProperties userData;

 /**
  * Whether the event occurred when the user device was connected to wifi.
  */
  @ApiModelProperty(value = "Whether the event occurred when the user device was connected to wifi.")
  private Boolean wifi;
 /**
  * The source indicating where the conversion event occurred. - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60;
  * @return actionSource
  */
  @JsonProperty("action_source")
  @NotNull
  public String getActionSource() {
    return actionSource;
  }

  /**
   * Sets the <code>actionSource</code> property.
   */
 public void setActionSource(String actionSource) {
    this.actionSource = actionSource;
  }

  /**
   * Sets the <code>actionSource</code> property.
   */
  public ConversionEventsDataItems actionSource(String actionSource) {
    this.actionSource = actionSource;
    return this;
  }

 /**
  * The app store app ID.
  * @return appId
  */
  @JsonProperty("app_id")
  public String getAppId() {
    return appId;
  }

  /**
   * Sets the <code>appId</code> property.
   */
 public void setAppId(String appId) {
    this.appId = appId;
  }

  /**
   * Sets the <code>appId</code> property.
   */
  public ConversionEventsDataItems appId(String appId) {
    this.appId = appId;
    return this;
  }

 /**
  * Get appInfo
  * @return appInfo
  */
  @JsonProperty("app_info")
  public ConversionEventAppInfo getAppInfo() {
    return appInfo;
  }

  /**
   * Sets the <code>appInfo</code> property.
   */
 public void setAppInfo(ConversionEventAppInfo appInfo) {
    this.appInfo = appInfo;
  }

  /**
   * Sets the <code>appInfo</code> property.
   */
  public ConversionEventsDataItems appInfo(ConversionEventAppInfo appInfo) {
    this.appInfo = appInfo;
    return this;
  }

 /**
  * Name of the app.
  * @return appName
  */
  @JsonProperty("app_name")
  public String getAppName() {
    return appName;
  }

  /**
   * Sets the <code>appName</code> property.
   */
 public void setAppName(String appName) {
    this.appName = appName;
  }

  /**
   * Sets the <code>appName</code> property.
   */
  public ConversionEventsDataItems appName(String appName) {
    this.appName = appName;
    return this;
  }

 /**
  * Version of the app.
  * @return appVersion
  */
  @JsonProperty("app_version")
  public String getAppVersion() {
    return appVersion;
  }

  /**
   * Sets the <code>appVersion</code> property.
   */
 public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  /**
   * Sets the <code>appVersion</code> property.
   */
  public ConversionEventsDataItems appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

 /**
  * Get customData
  * @return customData
  */
  @JsonProperty("custom_data")
  public ConversionEventsDataItemsCustomData getCustomData() {
    return customData;
  }

  /**
   * Sets the <code>customData</code> property.
   */
 public void setCustomData(ConversionEventsDataItemsCustomData customData) {
    this.customData = customData;
  }

  /**
   * Sets the <code>customData</code> property.
   */
  public ConversionEventsDataItems customData(ConversionEventsDataItemsCustomData customData) {
    this.customData = customData;
    return this;
  }

 /**
  * Brand of the user device.
  * @return deviceBrand
  */
  @JsonProperty("device_brand")
  public String getDeviceBrand() {
    return deviceBrand;
  }

  /**
   * Sets the <code>deviceBrand</code> property.
   */
 public void setDeviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
  }

  /**
   * Sets the <code>deviceBrand</code> property.
   */
  public ConversionEventsDataItems deviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

 /**
  * User device&#39;s mobile carrier.
  * @return deviceCarrier
  */
  @JsonProperty("device_carrier")
  public String getDeviceCarrier() {
    return deviceCarrier;
  }

  /**
   * Sets the <code>deviceCarrier</code> property.
   */
 public void setDeviceCarrier(String deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
  }

  /**
   * Sets the <code>deviceCarrier</code> property.
   */
  public ConversionEventsDataItems deviceCarrier(String deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
    return this;
  }

 /**
  * Get deviceInfo
  * @return deviceInfo
  */
  @JsonProperty("device_info")
  public ConversionEventDeviceInfo getDeviceInfo() {
    return deviceInfo;
  }

  /**
   * Sets the <code>deviceInfo</code> property.
   */
 public void setDeviceInfo(ConversionEventDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

  /**
   * Sets the <code>deviceInfo</code> property.
   */
  public ConversionEventsDataItems deviceInfo(ConversionEventDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
    return this;
  }

 /**
  * Model of the user device.
  * @return deviceModel
  */
  @JsonProperty("device_model")
  public String getDeviceModel() {
    return deviceModel;
  }

  /**
   * Sets the <code>deviceModel</code> property.
   */
 public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  /**
   * Sets the <code>deviceModel</code> property.
   */
  public ConversionEventsDataItems deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

 /**
  * Type of the user device.
  * @return deviceType
  */
  @JsonProperty("device_type")
  public String getDeviceType() {
    return deviceType;
  }

  /**
   * Sets the <code>deviceType</code> property.
   */
 public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  /**
   * Sets the <code>deviceType</code> property.
   */
  public ConversionEventsDataItems deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

 /**
  * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
  * @return eventId
  */
  @JsonProperty("event_id")
  @NotNull
  public String getEventId() {
    return eventId;
  }

  /**
   * Sets the <code>eventId</code> property.
   */
 public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * Sets the <code>eventId</code> property.
   */
  public ConversionEventsDataItems eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
  * The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;app_open&#x60; - &#x60;checkout&#x60; - &#x60;contact&#x60; - &#x60;custom&#x60; - &#x60;customize_product&#x60; - &#x60;find_location&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;schedule&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;start_trial&#x60; - &#x60;submit_application&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60;
  * @return eventName
  */
  @JsonProperty("event_name")
  @NotNull
  public String getEventName() {
    return eventName;
  }

  /**
   * Sets the <code>eventName</code> property.
   */
 public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  /**
   * Sets the <code>eventName</code> property.
   */
  public ConversionEventsDataItems eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

 /**
  * URL of the web conversion event.
  * @return eventSourceUrl
  */
  @JsonProperty("event_source_url")
  public String getEventSourceUrl() {
    return eventSourceUrl;
  }

  /**
   * Sets the <code>eventSourceUrl</code> property.
   */
 public void setEventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
  }

  /**
   * Sets the <code>eventSourceUrl</code> property.
   */
  public ConversionEventsDataItems eventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
    return this;
  }

 /**
  * The time when the event happened. Unix timestamp in seconds.
  * @return eventTime
  */
  @JsonProperty("event_time")
  @NotNull
  public Long getEventTime() {
    return eventTime;
  }

  /**
   * Sets the <code>eventTime</code> property.
   */
 public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

  /**
   * Sets the <code>eventTime</code> property.
   */
  public ConversionEventsDataItems eventTime(Long eventTime) {
    this.eventTime = eventTime;
    return this;
  }

 /**
  * Two-character ISO-639-1 language code indicating the user&#39;s language.
  * @return language
  */
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  /**
   * Sets the <code>language</code> property.
   */
 public void setLanguage(String language) {
    this.language = language;
  }

  /**
   * Sets the <code>language</code> property.
   */
  public ConversionEventsDataItems language(String language) {
    this.language = language;
    return this;
  }

 /**
  * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
  * @return optOut
  */
  @JsonProperty("opt_out")
  public Boolean getOptOut() {
    return optOut;
  }

  /**
   * Sets the <code>optOut</code> property.
   */
 public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
  }

  /**
   * Sets the <code>optOut</code> property.
   */
  public ConversionEventsDataItems optOut(Boolean optOut) {
    this.optOut = optOut;
    return this;
  }

 /**
  * Version of the device operating system.
  * @return osVersion
  */
  @JsonProperty("os_version")
  public String getOsVersion() {
    return osVersion;
  }

  /**
   * Sets the <code>osVersion</code> property.
   */
 public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  /**
   * Sets the <code>osVersion</code> property.
   */
  public ConversionEventsDataItems osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

 /**
  * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g &#39;ss-shopify&#39;
  * @return partnerName
  */
  @JsonProperty("partner_name")
  public String getPartnerName() {
    return partnerName;
  }

  /**
   * Sets the <code>partnerName</code> property.
   */
 public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  /**
   * Sets the <code>partnerName</code> property.
   */
  public ConversionEventsDataItems partnerName(String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

 /**
  * Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
  * @return userData
  */
  @JsonProperty("user_data")
  @NotNull
  public ConversionEventsUserDataProperties getUserData() {
    return userData;
  }

  /**
   * Sets the <code>userData</code> property.
   */
 public void setUserData(ConversionEventsUserDataProperties userData) {
    this.userData = userData;
  }

  /**
   * Sets the <code>userData</code> property.
   */
  public ConversionEventsDataItems userData(ConversionEventsUserDataProperties userData) {
    this.userData = userData;
    return this;
  }

 /**
  * Whether the event occurred when the user device was connected to wifi.
  * @return wifi
  */
  @JsonProperty("wifi")
  public Boolean getWifi() {
    return wifi;
  }

  /**
   * Sets the <code>wifi</code> property.
   */
 public void setWifi(Boolean wifi) {
    this.wifi = wifi;
  }

  /**
   * Sets the <code>wifi</code> property.
   */
  public ConversionEventsDataItems wifi(Boolean wifi) {
    this.wifi = wifi;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}


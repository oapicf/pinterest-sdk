package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConversionEventsDataInnerCustomData;
import com.prokarma.pkmst.model.ConversionEventsUserData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ConversionEventsDataInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-11-05T02:04:39.133647094Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class ConversionEventsDataInner   {
  @JsonProperty("event_name")
  private String eventName;

  @JsonProperty("action_source")
  private String actionSource;

  @JsonProperty("event_time")
  private Long eventTime;

  @JsonProperty("event_id")
  private String eventId;

  @JsonProperty("event_source_url")
  private String eventSourceUrl;

  @JsonProperty("opt_out")
  private Boolean optOut;

  @JsonProperty("partner_name")
  private String partnerName;

  @JsonProperty("user_data")
  private ConversionEventsUserData userData;

  @JsonProperty("custom_data")
  private ConversionEventsDataInnerCustomData customData;

  @JsonProperty("app_id")
  private String appId;

  @JsonProperty("app_name")
  private String appName;

  @JsonProperty("app_version")
  private String appVersion;

  @JsonProperty("device_brand")
  private String deviceBrand;

  @JsonProperty("device_carrier")
  private String deviceCarrier;

  @JsonProperty("device_model")
  private String deviceModel;

  @JsonProperty("device_type")
  private String deviceType;

  @JsonProperty("os_version")
  private String osVersion;

  @JsonProperty("wifi")
  private Boolean wifi;

  @JsonProperty("language")
  private String language;

  public ConversionEventsDataInner eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * <p>The type of the user event. Please use the right event_name otherwise the event won't be accepted and show up correctly in reports.   <ul>   <li><code>add_to_cart</code></li>   <li><code>checkout</code></li>   <li><code>custom</code></li>   <li><code>lead</code></li>   <li><code>page_visit</code></li>   <li><code>search</code></li>   <li><code>signup</code></li>   <li><code>view_category</code></li>   <li><code>watch_video</code></li>   </ul> </p> 
   * @return eventName
   */
  @ApiModelProperty(example = "checkout", required = true, value = "<p>The type of the user event. Please use the right event_name otherwise the event won't be accepted and show up correctly in reports.   <ul>   <li><code>add_to_cart</code></li>   <li><code>checkout</code></li>   <li><code>custom</code></li>   <li><code>lead</code></li>   <li><code>page_visit</code></li>   <li><code>search</code></li>   <li><code>signup</code></li>   <li><code>view_category</code></li>   <li><code>watch_video</code></li>   </ul> </p> ")
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
  @ApiModelProperty(example = "app_ios", required = true, value = "<p>   The source indicating where the conversion event occurred.   <ul>     <li><code>app_android</code></li>     <li><code>app_ios</code></li>     <li><code>web</code></li>     <li><code>offline</code></li>   </ul> </p> ")
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
  @ApiModelProperty(example = "1451431341", required = true, value = "The time when the event happened. Unix timestamp in seconds.")
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
  @ApiModelProperty(example = "eventId0001", required = true, value = "A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ConversionEventsDataInner eventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
    return this;
  }

  /**
   * URL of the web conversion event.
   * @return eventSourceUrl
   */
  @ApiModelProperty(example = "https://www.my-clothing-shop.org/", value = "URL of the web conversion event.")
  public String getEventSourceUrl() {
    return eventSourceUrl;
  }

  public void setEventSourceUrl(String eventSourceUrl) {
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
  @ApiModelProperty(example = "false", value = "When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.")
  public Boolean getOptOut() {
    return optOut;
  }

  public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
  }

  public ConversionEventsDataInner partnerName(String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

  /**
   * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
   * @return partnerName
   */
  @ApiModelProperty(example = "ss-partnername", value = "The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’")
  public String getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(String partnerName) {
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(value = "")
  public ConversionEventsDataInnerCustomData getCustomData() {
    return customData;
  }

  public void setCustomData(ConversionEventsDataInnerCustomData customData) {
    this.customData = customData;
  }

  public ConversionEventsDataInner appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * The app store app ID.
   * @return appId
   */
  @ApiModelProperty(example = "429047995", value = "The app store app ID.")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public ConversionEventsDataInner appName(String appName) {
    this.appName = appName;
    return this;
  }

  /**
   * Name of the app.
   * @return appName
   */
  @ApiModelProperty(example = "Pinterest", value = "Name of the app.")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public ConversionEventsDataInner appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

  /**
   * Version of the app.
   * @return appVersion
   */
  @ApiModelProperty(example = "7.9", value = "Version of the app.")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public ConversionEventsDataInner deviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

  /**
   * Brand of the user device.
   * @return deviceBrand
   */
  @ApiModelProperty(example = "Apple", value = "Brand of the user device.")
  public String getDeviceBrand() {
    return deviceBrand;
  }

  public void setDeviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
  }

  public ConversionEventsDataInner deviceCarrier(String deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
    return this;
  }

  /**
   * User device's mobile carrier.
   * @return deviceCarrier
   */
  @ApiModelProperty(example = "T-Mobile", value = "User device's mobile carrier.")
  public String getDeviceCarrier() {
    return deviceCarrier;
  }

  public void setDeviceCarrier(String deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
  }

  public ConversionEventsDataInner deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

  /**
   * Model of the user device.
   * @return deviceModel
   */
  @ApiModelProperty(example = "iPhone X", value = "Model of the user device.")
  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public ConversionEventsDataInner deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * Type of the user device.
   * @return deviceType
   */
  @ApiModelProperty(example = "iPhone", value = "Type of the user device.")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public ConversionEventsDataInner osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * Version of the device operating system.
   * @return osVersion
   */
  @ApiModelProperty(example = "12.1.4", value = "Version of the device operating system.")
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
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
  @ApiModelProperty(example = "false", value = "Whether the event occurred when the user device was connected to wifi.")
  public Boolean getWifi() {
    return wifi;
  }

  public void setWifi(Boolean wifi) {
    this.wifi = wifi;
  }

  public ConversionEventsDataInner language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Two-character ISO-639-1 language code indicating the user's language.
   * @return language
   */
  @ApiModelProperty(example = "en", value = "Two-character ISO-639-1 language code indicating the user's language.")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
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
        Objects.equals(this.eventSourceUrl, conversionEventsDataInner.eventSourceUrl) &&
        Objects.equals(this.optOut, conversionEventsDataInner.optOut) &&
        Objects.equals(this.partnerName, conversionEventsDataInner.partnerName) &&
        Objects.equals(this.userData, conversionEventsDataInner.userData) &&
        Objects.equals(this.customData, conversionEventsDataInner.customData) &&
        Objects.equals(this.appId, conversionEventsDataInner.appId) &&
        Objects.equals(this.appName, conversionEventsDataInner.appName) &&
        Objects.equals(this.appVersion, conversionEventsDataInner.appVersion) &&
        Objects.equals(this.deviceBrand, conversionEventsDataInner.deviceBrand) &&
        Objects.equals(this.deviceCarrier, conversionEventsDataInner.deviceCarrier) &&
        Objects.equals(this.deviceModel, conversionEventsDataInner.deviceModel) &&
        Objects.equals(this.deviceType, conversionEventsDataInner.deviceType) &&
        Objects.equals(this.osVersion, conversionEventsDataInner.osVersion) &&
        Objects.equals(this.wifi, conversionEventsDataInner.wifi) &&
        Objects.equals(this.language, conversionEventsDataInner.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, actionSource, eventTime, eventId, eventSourceUrl, optOut, partnerName, userData, customData, appId, appName, appVersion, deviceBrand, deviceCarrier, deviceModel, deviceType, osVersion, wifi, language);
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


package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventsDataInnerCustomData;
import org.openapitools.model.ConversionEventsUserData;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ConversionEventsDataInner  {
  
  @ApiModelProperty(example = "checkout", required = true, value = "The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. <li><code>add_to_cart</code> <li><code>checkout</code> <li><code>custom</code> <li><code>lead</code> <li><code>page_visit</code> <li><code>search</code> <li><code>signup</code> <li><code>view_category</code> <li><code>watch_video</code>")
 /**
   * The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. <li><code>add_to_cart</code> <li><code>checkout</code> <li><code>custom</code> <li><code>lead</code> <li><code>page_visit</code> <li><code>search</code> <li><code>signup</code> <li><code>view_category</code> <li><code>watch_video</code>
  **/
  private String eventName;

  @ApiModelProperty(example = "app_ios", required = true, value = "The source indicating where the conversion event occurred. <li><code>app_android</code> <li><code>app_ios</code> <li><code>web</code> <li><code>offline</code>")
 /**
   * The source indicating where the conversion event occurred. <li><code>app_android</code> <li><code>app_ios</code> <li><code>web</code> <li><code>offline</code>
  **/
  private String actionSource;

  @ApiModelProperty(example = "1451431341", required = true, value = "The time when the event happened. Unix timestamp in seconds.")
 /**
   * The time when the event happened. Unix timestamp in seconds.
  **/
  private Long eventTime;

  @ApiModelProperty(example = "eventId0001", required = true, value = "A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.")
 /**
   * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
  **/
  private String eventId;

  @ApiModelProperty(example = "https://www.my-clothing-shop.org/", value = "URL of the web conversion event.")
 /**
   * URL of the web conversion event.
  **/
  private String eventSourceUrl;

  @ApiModelProperty(example = "false", value = "When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.")
 /**
   * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
  **/
  private Boolean optOut;

  @ApiModelProperty(example = "ss-partnername", value = "The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’")
 /**
   * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’
  **/
  private String partnerName;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private ConversionEventsUserData userData;

  @ApiModelProperty(value = "")
  @Valid
  private ConversionEventsDataInnerCustomData customData;

  @ApiModelProperty(example = "429047995", value = "The app store app ID.")
 /**
   * The app store app ID.
  **/
  private String appId;

  @ApiModelProperty(example = "Pinterest", value = "Name of the app.")
 /**
   * Name of the app.
  **/
  private String appName;

  @ApiModelProperty(example = "7.9", value = "Version of the app.")
 /**
   * Version of the app.
  **/
  private String appVersion;

  @ApiModelProperty(example = "Apple", value = "Brand of the user device.")
 /**
   * Brand of the user device.
  **/
  private String deviceBrand;

  @ApiModelProperty(example = "T-Mobile", value = "User device's mobile carrier.")
 /**
   * User device's mobile carrier.
  **/
  private String deviceCarrier;

  @ApiModelProperty(example = "iPhone X", value = "Model of the user device.")
 /**
   * Model of the user device.
  **/
  private String deviceModel;

  @ApiModelProperty(example = "iPhone", value = "Type of the user device.")
 /**
   * Type of the user device.
  **/
  private String deviceType;

  @ApiModelProperty(example = "12.1.4", value = "Version of the device operating system.")
 /**
   * Version of the device operating system.
  **/
  private String osVersion;

  @ApiModelProperty(example = "false", value = "Whether the event occurred when the user device was connected to wifi.")
 /**
   * Whether the event occurred when the user device was connected to wifi.
  **/
  private Boolean wifi;

  @ApiModelProperty(example = "en", value = "Two-character ISO-639-1 language code indicating the user's language.")
 /**
   * Two-character ISO-639-1 language code indicating the user's language.
  **/
  private String language;
 /**
   * The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt; &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt; &lt;li&gt;&lt;code&gt;custom&lt;/code&gt; &lt;li&gt;&lt;code&gt;lead&lt;/code&gt; &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt; &lt;li&gt;&lt;code&gt;search&lt;/code&gt; &lt;li&gt;&lt;code&gt;signup&lt;/code&gt; &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt; &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt;
   * @return eventName
  **/
  @JsonProperty("event_name")
  @NotNull
  public String getEventName() {
    return eventName;
  }

  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  public ConversionEventsDataInner eventName(String eventName) {
    this.eventName = eventName;
    return this;
  }

 /**
   * The source indicating where the conversion event occurred. &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt; &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt; &lt;li&gt;&lt;code&gt;web&lt;/code&gt; &lt;li&gt;&lt;code&gt;offline&lt;/code&gt;
   * @return actionSource
  **/
  @JsonProperty("action_source")
  @NotNull
  public String getActionSource() {
    return actionSource;
  }

  public void setActionSource(String actionSource) {
    this.actionSource = actionSource;
  }

  public ConversionEventsDataInner actionSource(String actionSource) {
    this.actionSource = actionSource;
    return this;
  }

 /**
   * The time when the event happened. Unix timestamp in seconds.
   * @return eventTime
  **/
  @JsonProperty("event_time")
  @NotNull
  public Long getEventTime() {
    return eventTime;
  }

  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

  public ConversionEventsDataInner eventTime(Long eventTime) {
    this.eventTime = eventTime;
    return this;
  }

 /**
   * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
   * @return eventId
  **/
  @JsonProperty("event_id")
  @NotNull
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ConversionEventsDataInner eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * URL of the web conversion event.
   * @return eventSourceUrl
  **/
  @JsonProperty("event_source_url")
  public String getEventSourceUrl() {
    return eventSourceUrl;
  }

  public void setEventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
  }

  public ConversionEventsDataInner eventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
    return this;
  }

 /**
   * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
   * @return optOut
  **/
  @JsonProperty("opt_out")
  public Boolean getOptOut() {
    return optOut;
  }

  public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
  }

  public ConversionEventsDataInner optOut(Boolean optOut) {
    this.optOut = optOut;
    return this;
  }

 /**
   * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’
   * @return partnerName
  **/
  @JsonProperty("partner_name")
  public String getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  public ConversionEventsDataInner partnerName(String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

 /**
   * Get userData
   * @return userData
  **/
  @JsonProperty("user_data")
  @NotNull
  public ConversionEventsUserData getUserData() {
    return userData;
  }

  public void setUserData(ConversionEventsUserData userData) {
    this.userData = userData;
  }

  public ConversionEventsDataInner userData(ConversionEventsUserData userData) {
    this.userData = userData;
    return this;
  }

 /**
   * Get customData
   * @return customData
  **/
  @JsonProperty("custom_data")
  public ConversionEventsDataInnerCustomData getCustomData() {
    return customData;
  }

  public void setCustomData(ConversionEventsDataInnerCustomData customData) {
    this.customData = customData;
  }

  public ConversionEventsDataInner customData(ConversionEventsDataInnerCustomData customData) {
    this.customData = customData;
    return this;
  }

 /**
   * The app store app ID.
   * @return appId
  **/
  @JsonProperty("app_id")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public ConversionEventsDataInner appId(String appId) {
    this.appId = appId;
    return this;
  }

 /**
   * Name of the app.
   * @return appName
  **/
  @JsonProperty("app_name")
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public ConversionEventsDataInner appName(String appName) {
    this.appName = appName;
    return this;
  }

 /**
   * Version of the app.
   * @return appVersion
  **/
  @JsonProperty("app_version")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public ConversionEventsDataInner appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

 /**
   * Brand of the user device.
   * @return deviceBrand
  **/
  @JsonProperty("device_brand")
  public String getDeviceBrand() {
    return deviceBrand;
  }

  public void setDeviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
  }

  public ConversionEventsDataInner deviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
    return this;
  }

 /**
   * User device&#39;s mobile carrier.
   * @return deviceCarrier
  **/
  @JsonProperty("device_carrier")
  public String getDeviceCarrier() {
    return deviceCarrier;
  }

  public void setDeviceCarrier(String deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
  }

  public ConversionEventsDataInner deviceCarrier(String deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
    return this;
  }

 /**
   * Model of the user device.
   * @return deviceModel
  **/
  @JsonProperty("device_model")
  public String getDeviceModel() {
    return deviceModel;
  }

  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

  public ConversionEventsDataInner deviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
    return this;
  }

 /**
   * Type of the user device.
   * @return deviceType
  **/
  @JsonProperty("device_type")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public ConversionEventsDataInner deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

 /**
   * Version of the device operating system.
   * @return osVersion
  **/
  @JsonProperty("os_version")
  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public ConversionEventsDataInner osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

 /**
   * Whether the event occurred when the user device was connected to wifi.
   * @return wifi
  **/
  @JsonProperty("wifi")
  public Boolean getWifi() {
    return wifi;
  }

  public void setWifi(Boolean wifi) {
    this.wifi = wifi;
  }

  public ConversionEventsDataInner wifi(Boolean wifi) {
    this.wifi = wifi;
    return this;
  }

 /**
   * Two-character ISO-639-1 language code indicating the user&#39;s language.
   * @return language
  **/
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public ConversionEventsDataInner language(String language) {
    this.language = language;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


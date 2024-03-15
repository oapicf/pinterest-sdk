package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventsDataInnerCustomData;
import org.openapitools.model.ConversionEventsUserData;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;
import javax.validation.Valid;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-03-14T23:04:42.546429009Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConversionEventsDataInner   {
  
  private String eventName;
  private String actionSource;
  private Long eventTime;
  private String eventId;
  private String eventSourceUrl;
  private Boolean optOut;
  private String partnerName;
  private ConversionEventsUserData userData;
  private ConversionEventsDataInnerCustomData customData;
  private String appId;
  private String appName;
  private String appVersion;
  private String deviceBrand;
  private String deviceCarrier;
  private String deviceModel;
  private String deviceType;
  private String osVersion;
  private Boolean wifi;
  private String language;

  /**
   * The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. &lt;li&gt;&lt;code&gt;add_to_cart&lt;/code&gt; &lt;li&gt;&lt;code&gt;checkout&lt;/code&gt; &lt;li&gt;&lt;code&gt;custom&lt;/code&gt; &lt;li&gt;&lt;code&gt;lead&lt;/code&gt; &lt;li&gt;&lt;code&gt;page_visit&lt;/code&gt; &lt;li&gt;&lt;code&gt;search&lt;/code&gt; &lt;li&gt;&lt;code&gt;signup&lt;/code&gt; &lt;li&gt;&lt;code&gt;view_category&lt;/code&gt; &lt;li&gt;&lt;code&gt;watch_video&lt;/code&gt;
   **/
  
  @ApiModelProperty(example = "checkout", required = true, value = "The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. <li><code>add_to_cart</code> <li><code>checkout</code> <li><code>custom</code> <li><code>lead</code> <li><code>page_visit</code> <li><code>search</code> <li><code>signup</code> <li><code>view_category</code> <li><code>watch_video</code>")
  @JsonProperty("event_name")
  @NotNull
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

  /**
   * The source indicating where the conversion event occurred. &lt;li&gt;&lt;code&gt;app_android&lt;/code&gt; &lt;li&gt;&lt;code&gt;app_ios&lt;/code&gt; &lt;li&gt;&lt;code&gt;web&lt;/code&gt; &lt;li&gt;&lt;code&gt;offline&lt;/code&gt;
   **/
  
  @ApiModelProperty(example = "app_ios", required = true, value = "The source indicating where the conversion event occurred. <li><code>app_android</code> <li><code>app_ios</code> <li><code>web</code> <li><code>offline</code>")
  @JsonProperty("action_source")
  @NotNull
  public String getActionSource() {
    return actionSource;
  }
  public void setActionSource(String actionSource) {
    this.actionSource = actionSource;
  }

  /**
   * The time when the event happened. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(example = "1451431341", required = true, value = "The time when the event happened. Unix timestamp in seconds.")
  @JsonProperty("event_time")
  @NotNull
  public Long getEventTime() {
    return eventTime;
  }
  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

  /**
   * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
   **/
  
  @ApiModelProperty(example = "eventId0001", required = true, value = "A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.")
  @JsonProperty("event_id")
  @NotNull
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * URL of the web conversion event.
   **/
  
  @ApiModelProperty(example = "https://www.my-clothing-shop.org/", value = "URL of the web conversion event.")
  @JsonProperty("event_source_url")
  public String getEventSourceUrl() {
    return eventSourceUrl;
  }
  public void setEventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
  }

  /**
   * When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
   **/
  
  @ApiModelProperty(example = "false", value = "When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.")
  @JsonProperty("opt_out")
  public Boolean getOptOut() {
    return optOut;
  }
  public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
  }

  /**
   * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’
   **/
  
  @ApiModelProperty(example = "ss-partnername", value = "The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’")
  @JsonProperty("partner_name")
  public String getPartnerName() {
    return partnerName;
  }
  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("user_data")
  @NotNull
  @Valid
  public ConversionEventsUserData getUserData() {
    return userData;
  }
  public void setUserData(ConversionEventsUserData userData) {
    this.userData = userData;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("custom_data")
  @Valid
  public ConversionEventsDataInnerCustomData getCustomData() {
    return customData;
  }
  public void setCustomData(ConversionEventsDataInnerCustomData customData) {
    this.customData = customData;
  }

  /**
   * The app store app ID.
   **/
  
  @ApiModelProperty(example = "429047995", value = "The app store app ID.")
  @JsonProperty("app_id")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }

  /**
   * Name of the app.
   **/
  
  @ApiModelProperty(example = "Pinterest", value = "Name of the app.")
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
  
  @ApiModelProperty(example = "7.9", value = "Version of the app.")
  @JsonProperty("app_version")
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  /**
   * Brand of the user device.
   **/
  
  @ApiModelProperty(example = "Apple", value = "Brand of the user device.")
  @JsonProperty("device_brand")
  public String getDeviceBrand() {
    return deviceBrand;
  }
  public void setDeviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
  }

  /**
   * User device&#39;s mobile carrier.
   **/
  
  @ApiModelProperty(example = "T-Mobile", value = "User device's mobile carrier.")
  @JsonProperty("device_carrier")
  public String getDeviceCarrier() {
    return deviceCarrier;
  }
  public void setDeviceCarrier(String deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
  }

  /**
   * Model of the user device.
   **/
  
  @ApiModelProperty(example = "iPhone X", value = "Model of the user device.")
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
  
  @ApiModelProperty(example = "iPhone", value = "Type of the user device.")
  @JsonProperty("device_type")
  public String getDeviceType() {
    return deviceType;
  }
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  /**
   * Version of the device operating system.
   **/
  
  @ApiModelProperty(example = "12.1.4", value = "Version of the device operating system.")
  @JsonProperty("os_version")
  public String getOsVersion() {
    return osVersion;
  }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  /**
   * Whether the event occurred when the user device was connected to wifi.
   **/
  
  @ApiModelProperty(example = "false", value = "Whether the event occurred when the user device was connected to wifi.")
  @JsonProperty("wifi")
  public Boolean getWifi() {
    return wifi;
  }
  public void setWifi(Boolean wifi) {
    this.wifi = wifi;
  }

  /**
   * Two-character ISO-639-1 language code indicating the user&#39;s language.
   **/
  
  @ApiModelProperty(example = "en", value = "Two-character ISO-639-1 language code indicating the user's language.")
  @JsonProperty("language")
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


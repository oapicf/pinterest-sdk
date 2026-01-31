package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventAppInfo;
import org.openapitools.model.ConversionEventDeviceInfo;
import org.openapitools.model.ConversionEventsDataInnerCustomData;
import org.openapitools.model.ConversionEventsUserData;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-31T04:54:58.059572557Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ConversionEventsDataInner   {
  
  private String actionSource;
  private String appId;
  private ConversionEventAppInfo appInfo;
  private String appName;
  private String appVersion;
  private ConversionEventsDataInnerCustomData customData;
  private String deviceBrand;
  private String deviceCarrier;
  private ConversionEventDeviceInfo deviceInfo;
  private String deviceModel;
  private String deviceType;
  private String eventId;
  private String eventName;
  private String eventSourceUrl;
  private Long eventTime;
  private String language;
  private Boolean optOut;
  private String osVersion;
  private String partnerName;
  private ConversionEventsUserData userData;
  private Boolean wifi;

  /**
   * &lt;p&gt;The source indicating where the conversion event occurred.&lt;/p&gt; - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60;
   **/
  
  @ApiModelProperty(example = "app_ios", required = true, value = "<p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline`")
  @JsonProperty("action_source")
  @NotNull
  public String getActionSource() {
    return actionSource;
  }
  public void setActionSource(String actionSource) {
    this.actionSource = actionSource;
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("app_info")
  @Valid
  public ConversionEventAppInfo getAppInfo() {
    return appInfo;
  }
  public void setAppInfo(ConversionEventAppInfo appInfo) {
    this.appInfo = appInfo;
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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("device_info")
  @Valid
  public ConversionEventDeviceInfo getDeviceInfo() {
    return deviceInfo;
  }
  public void setDeviceInfo(ConversionEventDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
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
   * &lt;p&gt;The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.&lt;/p&gt;  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;checkout&#x60; - &#x60;custom&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60;
   **/
  
  @ApiModelProperty(example = "checkout", required = true, value = "<p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video`")
  @JsonProperty("event_name")
  @NotNull
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionEventsDataInner conversionEventsDataInner = (ConversionEventsDataInner) o;
    return Objects.equals(this.actionSource, conversionEventsDataInner.actionSource) &&
        Objects.equals(this.appId, conversionEventsDataInner.appId) &&
        Objects.equals(this.appInfo, conversionEventsDataInner.appInfo) &&
        Objects.equals(this.appName, conversionEventsDataInner.appName) &&
        Objects.equals(this.appVersion, conversionEventsDataInner.appVersion) &&
        Objects.equals(this.customData, conversionEventsDataInner.customData) &&
        Objects.equals(this.deviceBrand, conversionEventsDataInner.deviceBrand) &&
        Objects.equals(this.deviceCarrier, conversionEventsDataInner.deviceCarrier) &&
        Objects.equals(this.deviceInfo, conversionEventsDataInner.deviceInfo) &&
        Objects.equals(this.deviceModel, conversionEventsDataInner.deviceModel) &&
        Objects.equals(this.deviceType, conversionEventsDataInner.deviceType) &&
        Objects.equals(this.eventId, conversionEventsDataInner.eventId) &&
        Objects.equals(this.eventName, conversionEventsDataInner.eventName) &&
        Objects.equals(this.eventSourceUrl, conversionEventsDataInner.eventSourceUrl) &&
        Objects.equals(this.eventTime, conversionEventsDataInner.eventTime) &&
        Objects.equals(this.language, conversionEventsDataInner.language) &&
        Objects.equals(this.optOut, conversionEventsDataInner.optOut) &&
        Objects.equals(this.osVersion, conversionEventsDataInner.osVersion) &&
        Objects.equals(this.partnerName, conversionEventsDataInner.partnerName) &&
        Objects.equals(this.userData, conversionEventsDataInner.userData) &&
        Objects.equals(this.wifi, conversionEventsDataInner.wifi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionSource, appId, appInfo, appName, appVersion, customData, deviceBrand, deviceCarrier, deviceInfo, deviceModel, deviceType, eventId, eventName, eventSourceUrl, eventTime, language, optOut, osVersion, partnerName, userData, wifi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionEventsDataInner {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


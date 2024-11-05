package apimodels;

import apimodels.ConversionEventsDataInnerCustomData;
import apimodels.ConversionEventsUserData;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ConversionEventsDataInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionEventsDataInner   {
  @JsonProperty("event_name")
  @NotNull

  private String eventName;

  @JsonProperty("action_source")
  @NotNull

  private String actionSource;

  @JsonProperty("event_time")
  @NotNull

  private Long eventTime;

  @JsonProperty("event_id")
  @NotNull

  private String eventId;

  @JsonProperty("event_source_url")
  
  private String eventSourceUrl;

  @JsonProperty("opt_out")
  
  private Boolean optOut;

  @JsonProperty("partner_name")
  
  private String partnerName;

  @JsonProperty("user_data")
  @NotNull
@Valid

  private ConversionEventsUserData userData;

  @JsonProperty("custom_data")
  @Valid

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(eventName, conversionEventsDataInner.eventName) &&
        Objects.equals(actionSource, conversionEventsDataInner.actionSource) &&
        Objects.equals(eventTime, conversionEventsDataInner.eventTime) &&
        Objects.equals(eventId, conversionEventsDataInner.eventId) &&
        Objects.equals(eventSourceUrl, conversionEventsDataInner.eventSourceUrl) &&
        Objects.equals(optOut, conversionEventsDataInner.optOut) &&
        Objects.equals(partnerName, conversionEventsDataInner.partnerName) &&
        Objects.equals(userData, conversionEventsDataInner.userData) &&
        Objects.equals(customData, conversionEventsDataInner.customData) &&
        Objects.equals(appId, conversionEventsDataInner.appId) &&
        Objects.equals(appName, conversionEventsDataInner.appName) &&
        Objects.equals(appVersion, conversionEventsDataInner.appVersion) &&
        Objects.equals(deviceBrand, conversionEventsDataInner.deviceBrand) &&
        Objects.equals(deviceCarrier, conversionEventsDataInner.deviceCarrier) &&
        Objects.equals(deviceModel, conversionEventsDataInner.deviceModel) &&
        Objects.equals(deviceType, conversionEventsDataInner.deviceType) &&
        Objects.equals(osVersion, conversionEventsDataInner.osVersion) &&
        Objects.equals(wifi, conversionEventsDataInner.wifi) &&
        Objects.equals(language, conversionEventsDataInner.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventName, actionSource, eventTime, eventId, eventSourceUrl, optOut, partnerName, userData, customData, appId, appName, appVersion, deviceBrand, deviceCarrier, deviceModel, deviceType, osVersion, wifi, language);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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


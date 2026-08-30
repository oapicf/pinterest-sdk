package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ConversionEventAppInfo;
import org.openapitools.vertxweb.server.model.ConversionEventDeviceInfo;
import org.openapitools.vertxweb.server.model.ConversionEventsDataItemsCustomData;
import org.openapitools.vertxweb.server.model.ConversionEventsUserDataProperties;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionEventsDataItems   {
  
  private String actionSource;
  private String appId;
  private ConversionEventAppInfo appInfo;
  private String appName;
  private String appVersion;
  private ConversionEventsDataItemsCustomData customData;
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
  private ConversionEventsUserDataProperties userData;
  private Boolean wifi;

  public ConversionEventsDataItems () {

  }

  public ConversionEventsDataItems (String actionSource, String appId, ConversionEventAppInfo appInfo, String appName, String appVersion, ConversionEventsDataItemsCustomData customData, String deviceBrand, String deviceCarrier, ConversionEventDeviceInfo deviceInfo, String deviceModel, String deviceType, String eventId, String eventName, String eventSourceUrl, Long eventTime, String language, Boolean optOut, String osVersion, String partnerName, ConversionEventsUserDataProperties userData, Boolean wifi) {
    this.actionSource = actionSource;
    this.appId = appId;
    this.appInfo = appInfo;
    this.appName = appName;
    this.appVersion = appVersion;
    this.customData = customData;
    this.deviceBrand = deviceBrand;
    this.deviceCarrier = deviceCarrier;
    this.deviceInfo = deviceInfo;
    this.deviceModel = deviceModel;
    this.deviceType = deviceType;
    this.eventId = eventId;
    this.eventName = eventName;
    this.eventSourceUrl = eventSourceUrl;
    this.eventTime = eventTime;
    this.language = language;
    this.optOut = optOut;
    this.osVersion = osVersion;
    this.partnerName = partnerName;
    this.userData = userData;
    this.wifi = wifi;
  }

    
  @JsonProperty("action_source")
  public String getActionSource() {
    return actionSource;
  }
  public void setActionSource(String actionSource) {
    this.actionSource = actionSource;
  }

    
  @JsonProperty("app_id")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
  }

    
  @JsonProperty("app_info")
  public ConversionEventAppInfo getAppInfo() {
    return appInfo;
  }
  public void setAppInfo(ConversionEventAppInfo appInfo) {
    this.appInfo = appInfo;
  }

    
  @JsonProperty("app_name")
  public String getAppName() {
    return appName;
  }
  public void setAppName(String appName) {
    this.appName = appName;
  }

    
  @JsonProperty("app_version")
  public String getAppVersion() {
    return appVersion;
  }
  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

    
  @JsonProperty("custom_data")
  public ConversionEventsDataItemsCustomData getCustomData() {
    return customData;
  }
  public void setCustomData(ConversionEventsDataItemsCustomData customData) {
    this.customData = customData;
  }

    
  @JsonProperty("device_brand")
  public String getDeviceBrand() {
    return deviceBrand;
  }
  public void setDeviceBrand(String deviceBrand) {
    this.deviceBrand = deviceBrand;
  }

    
  @JsonProperty("device_carrier")
  public String getDeviceCarrier() {
    return deviceCarrier;
  }
  public void setDeviceCarrier(String deviceCarrier) {
    this.deviceCarrier = deviceCarrier;
  }

    
  @JsonProperty("device_info")
  public ConversionEventDeviceInfo getDeviceInfo() {
    return deviceInfo;
  }
  public void setDeviceInfo(ConversionEventDeviceInfo deviceInfo) {
    this.deviceInfo = deviceInfo;
  }

    
  @JsonProperty("device_model")
  public String getDeviceModel() {
    return deviceModel;
  }
  public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
  }

    
  @JsonProperty("device_type")
  public String getDeviceType() {
    return deviceType;
  }
  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

    
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

    
  @JsonProperty("event_name")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

    
  @JsonProperty("event_source_url")
  public String getEventSourceUrl() {
    return eventSourceUrl;
  }
  public void setEventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
  }

    
  @JsonProperty("event_time")
  public Long getEventTime() {
    return eventTime;
  }
  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

    
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }

    
  @JsonProperty("opt_out")
  public Boolean getOptOut() {
    return optOut;
  }
  public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
  }

    
  @JsonProperty("os_version")
  public String getOsVersion() {
    return osVersion;
  }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

    
  @JsonProperty("partner_name")
  public String getPartnerName() {
    return partnerName;
  }
  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

    
  @JsonProperty("user_data")
  public ConversionEventsUserDataProperties getUserData() {
    return userData;
  }
  public void setUserData(ConversionEventsUserDataProperties userData) {
    this.userData = userData;
  }

    
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

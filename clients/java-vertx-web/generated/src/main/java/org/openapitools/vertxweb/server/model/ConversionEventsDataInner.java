package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ConversionEventAppInfo;
import org.openapitools.vertxweb.server.model.ConversionEventDeviceInfo;
import org.openapitools.vertxweb.server.model.ConversionEventsDataInnerCustomData;
import org.openapitools.vertxweb.server.model.ConversionEventsUserData;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public ConversionEventsDataInner () {

  }

  public ConversionEventsDataInner (String actionSource, String appId, ConversionEventAppInfo appInfo, String appName, String appVersion, ConversionEventsDataInnerCustomData customData, String deviceBrand, String deviceCarrier, ConversionEventDeviceInfo deviceInfo, String deviceModel, String deviceType, String eventId, String eventName, String eventSourceUrl, Long eventTime, String language, Boolean optOut, String osVersion, String partnerName, ConversionEventsUserData userData, Boolean wifi) {
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
  public ConversionEventsDataInnerCustomData getCustomData() {
    return customData;
  }
  public void setCustomData(ConversionEventsDataInnerCustomData customData) {
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
  public ConversionEventsUserData getUserData() {
    return userData;
  }
  public void setUserData(ConversionEventsUserData userData) {
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
    ConversionEventsDataInner conversionEventsDataInner = (ConversionEventsDataInner) o;
    return Objects.equals(actionSource, conversionEventsDataInner.actionSource) &&
        Objects.equals(appId, conversionEventsDataInner.appId) &&
        Objects.equals(appInfo, conversionEventsDataInner.appInfo) &&
        Objects.equals(appName, conversionEventsDataInner.appName) &&
        Objects.equals(appVersion, conversionEventsDataInner.appVersion) &&
        Objects.equals(customData, conversionEventsDataInner.customData) &&
        Objects.equals(deviceBrand, conversionEventsDataInner.deviceBrand) &&
        Objects.equals(deviceCarrier, conversionEventsDataInner.deviceCarrier) &&
        Objects.equals(deviceInfo, conversionEventsDataInner.deviceInfo) &&
        Objects.equals(deviceModel, conversionEventsDataInner.deviceModel) &&
        Objects.equals(deviceType, conversionEventsDataInner.deviceType) &&
        Objects.equals(eventId, conversionEventsDataInner.eventId) &&
        Objects.equals(eventName, conversionEventsDataInner.eventName) &&
        Objects.equals(eventSourceUrl, conversionEventsDataInner.eventSourceUrl) &&
        Objects.equals(eventTime, conversionEventsDataInner.eventTime) &&
        Objects.equals(language, conversionEventsDataInner.language) &&
        Objects.equals(optOut, conversionEventsDataInner.optOut) &&
        Objects.equals(osVersion, conversionEventsDataInner.osVersion) &&
        Objects.equals(partnerName, conversionEventsDataInner.partnerName) &&
        Objects.equals(userData, conversionEventsDataInner.userData) &&
        Objects.equals(wifi, conversionEventsDataInner.wifi);
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

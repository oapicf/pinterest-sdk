package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.ConversionEventsDataInnerCustomData;
import org.openapitools.vertxweb.server.model.ConversionEventsUserData;

@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public ConversionEventsDataInner () {

  }

  public ConversionEventsDataInner (String eventName, String actionSource, Long eventTime, String eventId, String eventSourceUrl, Boolean optOut, String partnerName, ConversionEventsUserData userData, ConversionEventsDataInnerCustomData customData, String appId, String appName, String appVersion, String deviceBrand, String deviceCarrier, String deviceModel, String deviceType, String osVersion, Boolean wifi, String language) {
    this.eventName = eventName;
    this.actionSource = actionSource;
    this.eventTime = eventTime;
    this.eventId = eventId;
    this.eventSourceUrl = eventSourceUrl;
    this.optOut = optOut;
    this.partnerName = partnerName;
    this.userData = userData;
    this.customData = customData;
    this.appId = appId;
    this.appName = appName;
    this.appVersion = appVersion;
    this.deviceBrand = deviceBrand;
    this.deviceCarrier = deviceCarrier;
    this.deviceModel = deviceModel;
    this.deviceType = deviceType;
    this.osVersion = osVersion;
    this.wifi = wifi;
    this.language = language;
  }

    
  @JsonProperty("event_name")
  public String getEventName() {
    return eventName;
  }
  public void setEventName(String eventName) {
    this.eventName = eventName;
  }

    
  @JsonProperty("action_source")
  public String getActionSource() {
    return actionSource;
  }
  public void setActionSource(String actionSource) {
    this.actionSource = actionSource;
  }

    
  @JsonProperty("event_time")
  public Long getEventTime() {
    return eventTime;
  }
  public void setEventTime(Long eventTime) {
    this.eventTime = eventTime;
  }

    
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

    
  @JsonProperty("event_source_url")
  public String getEventSourceUrl() {
    return eventSourceUrl;
  }
  public void setEventSourceUrl(String eventSourceUrl) {
    this.eventSourceUrl = eventSourceUrl;
  }

    
  @JsonProperty("opt_out")
  public Boolean getOptOut() {
    return optOut;
  }
  public void setOptOut(Boolean optOut) {
    this.optOut = optOut;
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

    
  @JsonProperty("custom_data")
  public ConversionEventsDataInnerCustomData getCustomData() {
    return customData;
  }
  public void setCustomData(ConversionEventsDataInnerCustomData customData) {
    this.customData = customData;
  }

    
  @JsonProperty("app_id")
  public String getAppId() {
    return appId;
  }
  public void setAppId(String appId) {
    this.appId = appId;
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

    
  @JsonProperty("os_version")
  public String getOsVersion() {
    return osVersion;
  }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

    
  @JsonProperty("wifi")
  public Boolean getWifi() {
    return wifi;
  }
  public void setWifi(Boolean wifi) {
    this.wifi = wifi;
  }

    
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

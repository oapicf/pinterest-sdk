package org.openapitools.server.model;

import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.ConversionEventAppInfo;
import org.openapitools.server.model.ConversionEventDeviceInfo;
import org.openapitools.server.model.ConversionEventsDataItemsCustomData;
import org.openapitools.server.model.ConversionEventsUserDataProperties;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



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

    /**
     * Default constructor.
     */
    public ConversionEventsDataItems() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionEventsDataItems.
     *
     * @param actionSource The source indicating where the conversion event occurred. - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60;
     * @param appId The app store app ID.
     * @param appInfo appInfo
     * @param appName Name of the app.
     * @param appVersion Version of the app.
     * @param customData customData
     * @param deviceBrand Brand of the user device.
     * @param deviceCarrier User device&#39;s mobile carrier.
     * @param deviceInfo deviceInfo
     * @param deviceModel Model of the user device.
     * @param deviceType Type of the user device.
     * @param eventId A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
     * @param eventName The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;app_open&#x60; - &#x60;checkout&#x60; - &#x60;contact&#x60; - &#x60;custom&#x60; - &#x60;customize_product&#x60; - &#x60;find_location&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;schedule&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;start_trial&#x60; - &#x60;submit_application&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60;
     * @param eventSourceUrl URL of the web conversion event.
     * @param eventTime The time when the event happened. Unix timestamp in seconds.
     * @param language Two-character ISO-639-1 language code indicating the user&#39;s language.
     * @param optOut When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device.
     * @param osVersion Version of the device operating system.
     * @param partnerName The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g &#39;ss-shopify&#39;
     * @param userData Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent.
     * @param wifi Whether the event occurred when the user device was connected to wifi.
     */
    public ConversionEventsDataItems(
        String actionSource, 
        String appId, 
        ConversionEventAppInfo appInfo, 
        String appName, 
        String appVersion, 
        ConversionEventsDataItemsCustomData customData, 
        String deviceBrand, 
        String deviceCarrier, 
        ConversionEventDeviceInfo deviceInfo, 
        String deviceModel, 
        String deviceType, 
        String eventId, 
        String eventName, 
        String eventSourceUrl, 
        Long eventTime, 
        String language, 
        Boolean optOut, 
        String osVersion, 
        String partnerName, 
        ConversionEventsUserDataProperties userData, 
        Boolean wifi
    ) {
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



    /**
     * The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline`
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
     * Get appInfo
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
     * Get customData
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
     * User device's mobile carrier.
     * @return deviceCarrier
     */
    public String getDeviceCarrier() {
        return deviceCarrier;
    }

    public void setDeviceCarrier(String deviceCarrier) {
        this.deviceCarrier = deviceCarrier;
    }

    /**
     * Get deviceInfo
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
     * A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API.
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video`
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
     * Two-character ISO-639-1 language code indicating the user's language.
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
     * The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify'
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

    /**
      * Create a string representation of this pojo.
    **/
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


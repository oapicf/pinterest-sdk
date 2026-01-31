package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventAppInfo;
import org.openapitools.model.ConversionEventDeviceInfo;
import org.openapitools.model.ConversionEventsDataInnerCustomData;
import org.openapitools.model.ConversionEventsUserData;

@Canonical
class ConversionEventsDataInner {
    /* <p>The source indicating where the conversion event occurred.</p> - `app_android` - `app_ios` - `web` - `offline` */
    String actionSource
    /* The app store app ID. */
    String appId
    
    ConversionEventAppInfo appInfo
    /* Name of the app. */
    String appName
    /* Version of the app. */
    String appVersion
    
    ConversionEventsDataInnerCustomData customData
    /* Brand of the user device. */
    String deviceBrand
    /* User device's mobile carrier. */
    String deviceCarrier
    
    ConversionEventDeviceInfo deviceInfo
    /* Model of the user device. */
    String deviceModel
    /* Type of the user device. */
    String deviceType
    /* A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. */
    String eventId
    /* <p>The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.</p>  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `checkout` - `custom` - `initiate_checkout` - `lead` - `page_visit` - `search` - `signup` - `subscribe` - `view_category` - `view_content` - `watch_video` */
    String eventName
    /* URL of the web conversion event. */
    String eventSourceUrl
    /* The time when the event happened. Unix timestamp in seconds. */
    Long eventTime
    /* Two-character ISO-639-1 language code indicating the user's language. */
    String language
    /* When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. */
    Boolean optOut
    /* Version of the device operating system. */
    String osVersion
    /* The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’ */
    String partnerName
    
    ConversionEventsUserData userData
    /* Whether the event occurred when the user device was connected to wifi. */
    Boolean wifi
}

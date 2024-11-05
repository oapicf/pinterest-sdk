package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConversionEventsDataInnerCustomData;
import org.openapitools.model.ConversionEventsUserData;

@Canonical
class ConversionEventsDataInner {
    /* <p>The type of the user event. Please use the right event_name otherwise the event won't be accepted and show up correctly in reports.   <ul>   <li><code>add_to_cart</code></li>   <li><code>checkout</code></li>   <li><code>custom</code></li>   <li><code>lead</code></li>   <li><code>page_visit</code></li>   <li><code>search</code></li>   <li><code>signup</code></li>   <li><code>view_category</code></li>   <li><code>watch_video</code></li>   </ul> </p>  */
    String eventName
    /* <p>   The source indicating where the conversion event occurred.   <ul>     <li><code>app_android</code></li>     <li><code>app_ios</code></li>     <li><code>web</code></li>     <li><code>offline</code></li>   </ul> </p>  */
    String actionSource
    /* The time when the event happened. Unix timestamp in seconds. */
    Long eventTime
    /* A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. */
    String eventId
    /* URL of the web conversion event. */
    String eventSourceUrl
    /* When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. */
    Boolean optOut
    /* The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’ */
    String partnerName
    
    ConversionEventsUserData userData
    
    ConversionEventsDataInnerCustomData customData
    /* The app store app ID. */
    String appId
    /* Name of the app. */
    String appName
    /* Version of the app. */
    String appVersion
    /* Brand of the user device. */
    String deviceBrand
    /* User device's mobile carrier. */
    String deviceCarrier
    /* Model of the user device. */
    String deviceModel
    /* Type of the user device. */
    String deviceType
    /* Version of the device operating system. */
    String osVersion
    /* Whether the event occurred when the user device was connected to wifi. */
    Boolean wifi
    /* Two-character ISO-639-1 language code indicating the user's language. */
    String language
}

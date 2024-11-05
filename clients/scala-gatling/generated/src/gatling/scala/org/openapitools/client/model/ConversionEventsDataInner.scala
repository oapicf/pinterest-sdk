
package org.openapitools.client.model


case class ConversionEventsDataInner (
    /* <p>The type of the user event. Please use the right event_name otherwise the event won't be accepted and show up correctly in reports.   <ul>   <li><code>add_to_cart</code></li>   <li><code>checkout</code></li>   <li><code>custom</code></li>   <li><code>lead</code></li>   <li><code>page_visit</code></li>   <li><code>search</code></li>   <li><code>signup</code></li>   <li><code>view_category</code></li>   <li><code>watch_video</code></li>   </ul> </p>  */
    _eventName: String,
    /* <p>   The source indicating where the conversion event occurred.   <ul>     <li><code>app_android</code></li>     <li><code>app_ios</code></li>     <li><code>web</code></li>     <li><code>offline</code></li>   </ul> </p>  */
    _actionSource: String,
    /* The time when the event happened. Unix timestamp in seconds. */
    _eventTime: Long,
    /* A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. */
    _eventId: String,
    /* URL of the web conversion event. */
    _eventSourceUrl: Option[String],
    /* When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. */
    _optOut: Option[Boolean],
    /* The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’ */
    _partnerName: Option[String],
    _userData: ConversionEventsUserData,
    _customData: Option[ConversionEventsDataInnerCustomData],
    /* The app store app ID. */
    _appId: Option[String],
    /* Name of the app. */
    _appName: Option[String],
    /* Version of the app. */
    _appVersion: Option[String],
    /* Brand of the user device. */
    _deviceBrand: Option[String],
    /* User device's mobile carrier. */
    _deviceCarrier: Option[String],
    /* Model of the user device. */
    _deviceModel: Option[String],
    /* Type of the user device. */
    _deviceType: Option[String],
    /* Version of the device operating system. */
    _osVersion: Option[String],
    /* Whether the event occurred when the user device was connected to wifi. */
    _wifi: Option[Boolean],
    /* Two-character ISO-639-1 language code indicating the user's language. */
    _language: Option[String]
)
object ConversionEventsDataInner {
    def toStringBody(var_eventName: Object, var_actionSource: Object, var_eventTime: Object, var_eventId: Object, var_eventSourceUrl: Object, var_optOut: Object, var_partnerName: Object, var_userData: Object, var_customData: Object, var_appId: Object, var_appName: Object, var_appVersion: Object, var_deviceBrand: Object, var_deviceCarrier: Object, var_deviceModel: Object, var_deviceType: Object, var_osVersion: Object, var_wifi: Object, var_language: Object) =
        s"""
        | {
        | "eventName":$var_eventName,"actionSource":$var_actionSource,"eventTime":$var_eventTime,"eventId":$var_eventId,"eventSourceUrl":$var_eventSourceUrl,"optOut":$var_optOut,"partnerName":$var_partnerName,"userData":$var_userData,"customData":$var_customData,"appId":$var_appId,"appName":$var_appName,"appVersion":$var_appVersion,"deviceBrand":$var_deviceBrand,"deviceCarrier":$var_deviceCarrier,"deviceModel":$var_deviceModel,"deviceType":$var_deviceType,"osVersion":$var_osVersion,"wifi":$var_wifi,"language":$var_language
        | }
        """.stripMargin
}

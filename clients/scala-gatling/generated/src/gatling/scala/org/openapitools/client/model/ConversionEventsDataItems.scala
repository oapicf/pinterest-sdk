
package org.openapitools.client.model


case class ConversionEventsDataItems (
    /* The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline` */
    _actionSource: String,
    /* The app store app ID. */
    _appId: Option[String],
    _appInfo: Option[ConversionEventAppInfo],
    /* Name of the app. */
    _appName: Option[String],
    /* Version of the app. */
    _appVersion: Option[String],
    _customData: Option[ConversionEventsDataItemsCustomData],
    /* Brand of the user device. */
    _deviceBrand: Option[String],
    /* User device's mobile carrier. */
    _deviceCarrier: Option[String],
    _deviceInfo: Option[ConversionEventDeviceInfo],
    /* Model of the user device. */
    _deviceModel: Option[String],
    /* Type of the user device. */
    _deviceType: Option[String],
    /* A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. */
    _eventId: String,
    /* The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video` */
    _eventName: String,
    /* URL of the web conversion event. */
    _eventSourceUrl: Option[String],
    /* The time when the event happened. Unix timestamp in seconds. */
    _eventTime: Long,
    /* Two-character ISO-639-1 language code indicating the user's language. */
    _language: Option[String],
    /* When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. */
    _optOut: Option[Boolean],
    /* Version of the device operating system. */
    _osVersion: Option[String],
    /* The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify' */
    _partnerName: Option[String],
    /* Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent. */
    _userData: ConversionEventsUserDataProperties,
    /* Whether the event occurred when the user device was connected to wifi. */
    _wifi: Option[Boolean]
)
object ConversionEventsDataItems {
    def toStringBody(var_actionSource: Object, var_appId: Object, var_appInfo: Object, var_appName: Object, var_appVersion: Object, var_customData: Object, var_deviceBrand: Object, var_deviceCarrier: Object, var_deviceInfo: Object, var_deviceModel: Object, var_deviceType: Object, var_eventId: Object, var_eventName: Object, var_eventSourceUrl: Object, var_eventTime: Object, var_language: Object, var_optOut: Object, var_osVersion: Object, var_partnerName: Object, var_userData: Object, var_wifi: Object) =
        s"""
        | {
        | "actionSource":$var_actionSource,"appId":$var_appId,"appInfo":$var_appInfo,"appName":$var_appName,"appVersion":$var_appVersion,"customData":$var_customData,"deviceBrand":$var_deviceBrand,"deviceCarrier":$var_deviceCarrier,"deviceInfo":$var_deviceInfo,"deviceModel":$var_deviceModel,"deviceType":$var_deviceType,"eventId":$var_eventId,"eventName":$var_eventName,"eventSourceUrl":$var_eventSourceUrl,"eventTime":$var_eventTime,"language":$var_language,"optOut":$var_optOut,"osVersion":$var_osVersion,"partnerName":$var_partnerName,"userData":$var_userData,"wifi":$var_wifi
        | }
        """.stripMargin
}

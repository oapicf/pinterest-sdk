# OAIConversionEventsDataItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionSource** | **NSString*** | The source indicating where the conversion event occurred. - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60; | 
**appId** | **NSString*** | The app store app ID. | [optional] 
**appInfo** | [**OAIConversionEventAppInfo***](OAIConversionEventAppInfo.md) |  | [optional] 
**appName** | **NSString*** | Name of the app. | [optional] 
**appVersion** | **NSString*** | Version of the app. | [optional] 
**customData** | [**OAIConversionEventsDataItemsCustomData***](OAIConversionEventsDataItemsCustomData.md) |  | [optional] 
**deviceBrand** | **NSString*** | Brand of the user device. | [optional] 
**deviceCarrier** | **NSString*** | User device&#39;s mobile carrier. | [optional] 
**deviceInfo** | [**OAIConversionEventDeviceInfo***](OAIConversionEventDeviceInfo.md) |  | [optional] 
**deviceModel** | **NSString*** | Model of the user device. | [optional] 
**deviceType** | **NSString*** | Type of the user device. | [optional] 
**eventId** | **NSString*** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | 
**eventName** | **NSString*** | The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;app_open&#x60; - &#x60;checkout&#x60; - &#x60;contact&#x60; - &#x60;custom&#x60; - &#x60;customize_product&#x60; - &#x60;find_location&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;schedule&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;start_trial&#x60; - &#x60;submit_application&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60; | 
**eventSourceUrl** | **NSString*** | URL of the web conversion event. | [optional] 
**eventTime** | **NSNumber*** | The time when the event happened. Unix timestamp in seconds. | 
**language** | **NSString*** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] 
**optOut** | **NSNumber*** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] 
**osVersion** | **NSString*** | Version of the device operating system. | [optional] 
**partnerName** | **NSString*** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g &#39;ss-shopify&#39; | [optional] 
**userData** | [**OAIConversionEventsUserDataProperties***](OAIConversionEventsUserDataProperties.md) | Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent. | 
**wifi** | **NSNumber*** | Whether the event occurred when the user device was connected to wifi. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



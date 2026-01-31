# ConversionEventsDataInner

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionSource** | **String!** | &lt;p&gt;The source indicating where the conversion event occurred.&lt;/p&gt; - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60; | [default to null]
**appId** | **String** | The app store app ID. | [optional] [default to null]
**appInfo** | [***ConversionEventAppInfo**](ConversionEventAppInfo.md) |  | [optional] [default to null]
**appName** | **String** | Name of the app. | [optional] [default to null]
**appVersion** | **String** | Version of the app. | [optional] [default to null]
**customData** | [***ConversionEventsDataInnerCustomData**](ConversionEvents_data_inner_custom_data.md) |  | [optional] [default to null]
**deviceBrand** | **String** | Brand of the user device. | [optional] [default to null]
**deviceCarrier** | **String** | User device&#39;s mobile carrier. | [optional] [default to null]
**deviceInfo** | [***ConversionEventDeviceInfo**](ConversionEventDeviceInfo.md) |  | [optional] [default to null]
**deviceModel** | **String** | Model of the user device. | [optional] [default to null]
**deviceType** | **String** | Type of the user device. | [optional] [default to null]
**eventId** | **String!** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | [default to null]
**eventName** | **String!** | &lt;p&gt;The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.&lt;/p&gt;  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;checkout&#x60; - &#x60;custom&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60; | [default to null]
**eventSourceUrl** | **String** | URL of the web conversion event. | [optional] [default to null]
**eventTime** | **Int!** | The time when the event happened. Unix timestamp in seconds. | [default to null]
**language** | **String** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] [default to null]
**optOut** | **Boolean!** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] [default to null]
**osVersion** | **String** | Version of the device operating system. | [optional] [default to null]
**partnerName** | **String** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’ | [optional] [default to null]
**userData** | [***ConversionEventsUserData**](ConversionEventsUserData.md) |  | [default to null]
**wifi** | **Boolean!** | Whether the event occurred when the user device was connected to wifi. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



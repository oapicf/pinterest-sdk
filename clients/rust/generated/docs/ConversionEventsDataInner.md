# ConversionEventsDataInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_name** | **String** | The type of the user event. Please use the right event_name otherwise the event won’t be accepted and show up correctly in reports. <li><code>add_to_cart</code> <li><code>checkout</code> <li><code>custom</code> <li><code>lead</code> <li><code>page_visit</code> <li><code>search</code> <li><code>signup</code> <li><code>view_category</code> <li><code>watch_video</code> | 
**action_source** | **String** | The source indicating where the conversion event occurred. <li><code>app_android</code> <li><code>app_ios</code> <li><code>web</code> <li><code>offline</code> | 
**event_time** | **i64** | The time when the event happened. Unix timestamp in seconds. | 
**event_id** | **String** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | 
**event_source_url** | Option<**String**> | URL of the web conversion event. | [optional]
**opt_out** | Option<**bool**> | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional]
**partner_name** | Option<**String**> | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’ | [optional]
**user_data** | Option<[**models::ConversionEventsUserData**](ConversionEventsUserData.md)> |  | 
**custom_data** | Option<[**models::ConversionEventsDataInnerCustomData**](ConversionEvents_data_inner_custom_data.md)> |  | [optional]
**app_id** | Option<**String**> | The app store app ID. | [optional]
**app_name** | Option<**String**> | Name of the app. | [optional]
**app_version** | Option<**String**> | Version of the app. | [optional]
**device_brand** | Option<**String**> | Brand of the user device. | [optional]
**device_carrier** | Option<**String**> | User device's mobile carrier. | [optional]
**device_model** | Option<**String**> | Model of the user device. | [optional]
**device_type** | Option<**String**> | Type of the user device. | [optional]
**os_version** | Option<**String**> | Version of the device operating system. | [optional]
**wifi** | Option<**bool**> | Whether the event occurred when the user device was connected to wifi. | [optional]
**language** | Option<**String**> | Two-character ISO-639-1 language code indicating the user's language. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



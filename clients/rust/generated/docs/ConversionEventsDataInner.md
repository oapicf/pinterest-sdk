# ConversionEventsDataInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**event_name** | **String** | <p>The type of the user event. Please use the right event_name otherwise the event won't be accepted and show up correctly in reports.   <ul>   <li><code>add_to_cart</code></li>   <li><code>checkout</code></li>   <li><code>custom</code></li>   <li><code>lead</code></li>   <li><code>page_visit</code></li>   <li><code>search</code></li>   <li><code>signup</code></li>   <li><code>view_category</code></li>   <li><code>watch_video</code></li>   </ul> </p>  | 
**action_source** | **String** | <p>   The source indicating where the conversion event occurred.   <ul>     <li><code>app_android</code></li>     <li><code>app_ios</code></li>     <li><code>web</code></li>     <li><code>offline</code></li>   </ul> </p>  | 
**event_time** | **i64** | The time when the event happened. Unix timestamp in seconds. | 
**event_id** | **String** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | 
**event_source_url** | Option<**String**> | URL of the web conversion event. | [optional]
**opt_out** | Option<**bool**> | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional]
**partner_name** | Option<**String**> | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g ‘ss-shopify’ | [optional]
**user_data** | [**models::ConversionEventsUserData**](ConversionEventsUserData.md) |  | 
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



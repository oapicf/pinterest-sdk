# # ConversionEventsDataInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_source** | **string** | &lt;p&gt;The source indicating where the conversion event occurred.&lt;/p&gt; - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60; |
**app_id** | **string** | The app store app ID. | [optional]
**app_info** | [**\OpenAPI\Client\Model\ConversionEventAppInfo**](ConversionEventAppInfo.md) |  | [optional]
**app_name** | **string** | Name of the app. | [optional]
**app_version** | **string** | Version of the app. | [optional]
**custom_data** | [**\OpenAPI\Client\Model\ConversionEventsDataInnerCustomData**](ConversionEventsDataInnerCustomData.md) |  | [optional]
**device_brand** | **string** | Brand of the user device. | [optional]
**device_carrier** | **string** | User device&#39;s mobile carrier. | [optional]
**device_info** | [**\OpenAPI\Client\Model\ConversionEventDeviceInfo**](ConversionEventDeviceInfo.md) |  | [optional]
**device_model** | **string** | Model of the user device. | [optional]
**device_type** | **string** | Type of the user device. | [optional]
**event_id** | **string** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. |
**event_name** | **string** | &lt;p&gt;The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.&lt;/p&gt;  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;checkout&#x60; - &#x60;custom&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60; |
**event_source_url** | **string** | URL of the web conversion event. | [optional]
**event_time** | **int** | The time when the event happened. Unix timestamp in seconds. |
**language** | **string** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional]
**opt_out** | **bool** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional]
**os_version** | **string** | Version of the device operating system. | [optional]
**partner_name** | **string** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g ‘ss-shopify’ | [optional]
**user_data** | [**\OpenAPI\Client\Model\ConversionEventsUserData**](ConversionEventsUserData.md) |  |
**wifi** | **bool** | Whether the event occurred when the user device was connected to wifi. | [optional]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)

# CONVERSION_EVENTS_DATA_ITEMS

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_source** | [**STRING_32**](STRING_32.md) | The source indicating where the conversion event occurred. - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60; | [default to null]
**app_id** | [**STRING_32**](STRING_32.md) | The app store app ID. | [optional] [default to null]
**app_info** | [**CONVERSION_EVENT_APP_INFO**](ConversionEventAppInfo.md) |  | [optional] [default to null]
**app_name** | [**STRING_32**](STRING_32.md) | Name of the app. | [optional] [default to null]
**app_version** | [**STRING_32**](STRING_32.md) | Version of the app. | [optional] [default to null]
**custom_data** | [**CONVERSION_EVENTS_DATA_ITEMS_CUSTOM_DATA**](ConversionEventsDataItemsCustomData.md) |  | [optional] [default to null]
**device_brand** | [**STRING_32**](STRING_32.md) | Brand of the user device. | [optional] [default to null]
**device_carrier** | [**STRING_32**](STRING_32.md) | User device&#39;s mobile carrier. | [optional] [default to null]
**device_info** | [**CONVERSION_EVENT_DEVICE_INFO**](ConversionEventDeviceInfo.md) |  | [optional] [default to null]
**device_model** | [**STRING_32**](STRING_32.md) | Model of the user device. | [optional] [default to null]
**device_type** | [**STRING_32**](STRING_32.md) | Type of the user device. | [optional] [default to null]
**event_id** | [**STRING_32**](STRING_32.md) | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | [default to null]
**event_name** | [**STRING_32**](STRING_32.md) | The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;app_open&#x60; - &#x60;checkout&#x60; - &#x60;contact&#x60; - &#x60;custom&#x60; - &#x60;customize_product&#x60; - &#x60;find_location&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;schedule&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;start_trial&#x60; - &#x60;submit_application&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60; | [default to null]
**event_source_url** | [**STRING_32**](STRING_32.md) | URL of the web conversion event. | [optional] [default to null]
**event_time** | **INTEGER_64** | The time when the event happened. Unix timestamp in seconds. | [default to null]
**language** | [**STRING_32**](STRING_32.md) | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] [default to null]
**opt_out** | **BOOLEAN** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] [default to null]
**os_version** | [**STRING_32**](STRING_32.md) | Version of the device operating system. | [optional] [default to null]
**partner_name** | [**STRING_32**](STRING_32.md) | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g &#39;ss-shopify&#39; | [optional] [default to null]
**user_data** | [**CONVERSION_EVENTS_USER_DATA_PROPERTIES**](ConversionEventsUserDataProperties.md) | Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent. | [default to null]
**wifi** | **BOOLEAN** | Whether the event occurred when the user device was connected to wifi. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



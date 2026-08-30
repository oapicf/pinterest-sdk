# conversion_events_data_items_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_source** | **char \*** | The source indicating where the conversion event occurred. - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60; | 
**app_id** | **char \*** | The app store app ID. | [optional] 
**app_info** | [**conversion_event_app_info_t**](conversion_event_app_info.md) \* |  | [optional] 
**app_name** | **char \*** | Name of the app. | [optional] 
**app_version** | **char \*** | Version of the app. | [optional] 
**custom_data** | [**conversion_events_data_items_custom_data_t**](conversion_events_data_items_custom_data.md) \* |  | [optional] 
**device_brand** | **char \*** | Brand of the user device. | [optional] 
**device_carrier** | **char \*** | User device&#39;s mobile carrier. | [optional] 
**device_info** | [**conversion_event_device_info_t**](conversion_event_device_info.md) \* |  | [optional] 
**device_model** | **char \*** | Model of the user device. | [optional] 
**device_type** | **char \*** | Type of the user device. | [optional] 
**event_id** | **char \*** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | 
**event_name** | **char \*** | The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;app_open&#x60; - &#x60;checkout&#x60; - &#x60;contact&#x60; - &#x60;custom&#x60; - &#x60;customize_product&#x60; - &#x60;find_location&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;schedule&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;start_trial&#x60; - &#x60;submit_application&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60; | 
**event_source_url** | **char \*** | URL of the web conversion event. | [optional] 
**event_time** | **long** | The time when the event happened. Unix timestamp in seconds. | 
**language** | **char \*** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] 
**opt_out** | **int** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] 
**os_version** | **char \*** | Version of the device operating system. | [optional] 
**partner_name** | **char \*** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g &#39;ss-shopify&#39; | [optional] 
**user_data** | [**conversion_events_user_data_properties_t**](conversion_events_user_data_properties.md) \* | Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent. | 
**wifi** | **int** | Whether the event occurred when the user device was connected to wifi. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



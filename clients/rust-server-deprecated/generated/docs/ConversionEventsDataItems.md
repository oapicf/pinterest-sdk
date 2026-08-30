# ConversionEventsDataItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_source** | **String** | The source indicating where the conversion event occurred. - `app_android` - `app_ios` - `web` - `offline` | 
**app_id** | **swagger::Nullable<String>** | The app store app ID. | [optional] [default to None]
**app_info** | [***models::ConversionEventAppInfo**](ConversionEventAppInfo.md) |  | [optional] [default to None]
**app_name** | **swagger::Nullable<String>** | Name of the app. | [optional] [default to None]
**app_version** | **swagger::Nullable<String>** | Version of the app. | [optional] [default to None]
**custom_data** | [***models::ConversionEventsDataItemsCustomData**](ConversionEventsDataItemsCustomData.md) |  | [optional] [default to None]
**device_brand** | **swagger::Nullable<String>** | Brand of the user device. | [optional] [default to None]
**device_carrier** | **swagger::Nullable<String>** | User device's mobile carrier. | [optional] [default to None]
**device_info** | [***models::ConversionEventDeviceInfo**](ConversionEventDeviceInfo.md) |  | [optional] [default to None]
**device_model** | **swagger::Nullable<String>** | Model of the user device. | [optional] [default to None]
**device_type** | **swagger::Nullable<String>** | Type of the user device. | [optional] [default to None]
**event_id** | **String** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event's data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | 
**event_name** | **String** | The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - `add_payment_info` - `add_to_cart` - `add_to_wishlist` - `app_install` - `app_open` - `checkout` - `contact` - `custom` - `customize_product` - `find_location` - `initiate_checkout` - `lead` - `page_visit` - `schedule` - `search` - `signup` - `start_trial` - `submit_application` - `subscribe` - `view_category` - `view_content` - `watch_video` | 
**event_source_url** | **swagger::Nullable<String>** | URL of the web conversion event. | [optional] [default to None]
**event_time** | **i64** | The time when the event happened. Unix timestamp in seconds. | 
**language** | **swagger::Nullable<String>** | Two-character ISO-639-1 language code indicating the user's language. | [optional] [default to None]
**opt_out** | **bool** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] [default to None]
**os_version** | **swagger::Nullable<String>** | Version of the device operating system. | [optional] [default to None]
**partner_name** | **swagger::Nullable<String>** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \"ss-partnername\" lowercase. E.g 'ss-shopify' | [optional] [default to None]
**user_data** | [***models::ConversionEventsUserDataProperties**](ConversionEventsUserDataProperties.md) | Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent. | 
**wifi** | **bool** | Whether the event occurred when the user device was connected to wifi. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



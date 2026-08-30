# ConversionEventsDataItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_source** | **str** | The source indicating where the conversion event occurred. - &#x60;app_android&#x60; - &#x60;app_ios&#x60; - &#x60;web&#x60; - &#x60;offline&#x60; | 
**app_id** | **str** | The app store app ID. | [optional] 
**app_info** | [**ConversionEventAppInfo**](ConversionEventAppInfo.md) |  | [optional] 
**app_name** | **str** | Name of the app. | [optional] 
**app_version** | **str** | Version of the app. | [optional] 
**custom_data** | [**ConversionEventsDataItemsCustomData**](ConversionEventsDataItemsCustomData.md) |  | [optional] 
**device_brand** | **str** | Brand of the user device. | [optional] 
**device_carrier** | **str** | User device&#39;s mobile carrier. | [optional] 
**device_info** | [**ConversionEventDeviceInfo**](ConversionEventDeviceInfo.md) |  | [optional] 
**device_model** | **str** | Model of the user device. | [optional] 
**device_type** | **str** | Type of the user device. | [optional] 
**event_id** | **str** | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. Without this, event&#39;s data is likely to be double counted and will cause report metric inflation. Third-party vendors make sure this field is updated on both Pinterest tag and Conversions API side before rolling out template for Conversions API. | 
**event_name** | **str** | The type of the user event. Please use the right event_name; otherwise the event will not be accepted and show up correctly in reports.  - &#x60;add_payment_info&#x60; - &#x60;add_to_cart&#x60; - &#x60;add_to_wishlist&#x60; - &#x60;app_install&#x60; - &#x60;app_open&#x60; - &#x60;checkout&#x60; - &#x60;contact&#x60; - &#x60;custom&#x60; - &#x60;customize_product&#x60; - &#x60;find_location&#x60; - &#x60;initiate_checkout&#x60; - &#x60;lead&#x60; - &#x60;page_visit&#x60; - &#x60;schedule&#x60; - &#x60;search&#x60; - &#x60;signup&#x60; - &#x60;start_trial&#x60; - &#x60;submit_application&#x60; - &#x60;subscribe&#x60; - &#x60;view_category&#x60; - &#x60;view_content&#x60; - &#x60;watch_video&#x60; | 
**event_source_url** | **str** | URL of the web conversion event. | [optional] 
**event_time** | **int** | The time when the event happened. Unix timestamp in seconds. | 
**language** | **str** | Two-character ISO-639-1 language code indicating the user&#39;s language. | [optional] 
**opt_out** | **bool** | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] 
**os_version** | **str** | Version of the device operating system. | [optional] 
**partner_name** | **str** | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. The naming convention is \&quot;ss-partnername\&quot; lowercase. E.g &#39;ss-shopify&#39; | [optional] 
**user_data** | [**ConversionEventsUserDataProperties**](ConversionEventsUserDataProperties.md) | Object containing customer information data. Note, It is required at least one of 1) em, 2) hashed_maids or 3) pair client_ip_address + client_user_agent. | 
**wifi** | **bool** | Whether the event occurred when the user device was connected to wifi. | [optional] 

## Example

```python
from pinterestsdk.models.conversion_events_data_items import ConversionEventsDataItems

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionEventsDataItems from a JSON string
conversion_events_data_items_instance = ConversionEventsDataItems.from_json(json)
# print the JSON string representation of the object
print(ConversionEventsDataItems.to_json())

# convert the object into a dict
conversion_events_data_items_dict = conversion_events_data_items_instance.to_dict()
# create an instance of ConversionEventsDataItems from a dict
conversion_events_data_items_from_dict = ConversionEventsDataItems.from_dict(conversion_events_data_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



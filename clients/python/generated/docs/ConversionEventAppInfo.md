# ConversionEventAppInfo

Object containing information about the application where event occurred.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**app_id** | **str** | App ID in Google Play Store, AppStore or other stores. | [optional] 
**app_name** | **str** | Name of the app. Primarily used for Mobile Apps. | [optional] 
**app_package_name** | **str** | App package name | [optional] 
**app_store** | **str** | The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps | [optional] 
**app_version** | **str** | App version. Primarily used for mobile apps | [optional] 
**install_time** | **int** | App install time. Unix timestamp in seconds | [optional] 
**user_agent** | **str** | User Agent request header. Primarily used for Web events | [optional] 
**window_height** | **int** | Inner height of the window or viewport. | [optional] 
**window_width** | **int** | Inner width of the window or viewport. | [optional] 

## Example

```python
from pinterestsdk.models.conversion_event_app_info import ConversionEventAppInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionEventAppInfo from a JSON string
conversion_event_app_info_instance = ConversionEventAppInfo.from_json(json)
# print the JSON string representation of the object
print(ConversionEventAppInfo.to_json())

# convert the object into a dict
conversion_event_app_info_dict = conversion_event_app_info_instance.to_dict()
# create an instance of ConversionEventAppInfo from a dict
conversion_event_app_info_from_dict = ConversionEventAppInfo.from_dict(conversion_event_app_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# pinterestsdk.model.ad_common.AdCommon

Creation fields

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Creation fields | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**ad_group_id** | str,  | str,  | ID of the ad group that contains the ad. | [optional] 
**android_deep_link** | None, str,  | NoneClass, str,  | Deep link URL for Android devices. Not currently available. Using this field will generate an error. | [optional] 
**[carousel_android_deep_links](#carousel_android_deep_links)** | list, tuple, None,  | tuple, NoneClass,  | Comma-separated deep links for the carousel pin on Android. | [optional] 
**[carousel_destination_urls](#carousel_destination_urls)** | list, tuple, None,  | tuple, NoneClass,  | Comma-separated destination URLs for the carousel pin to promote. | [optional] 
**[carousel_ios_deep_links](#carousel_ios_deep_links)** | list, tuple, None,  | tuple, NoneClass,  | Comma-separated deep links for the carousel pin on iOS. | [optional] 
**click_tracking_url** | None, str,  | NoneClass, str,  | Tracking url for the ad clicks. | [optional] 
**creative_type** | [**CreativeType**](CreativeType.md) | [**CreativeType**](CreativeType.md) |  | [optional] 
**destination_url** | None, str,  | NoneClass, str,  | Destination URL. | [optional] 
**ios_deep_link** | None, str,  | NoneClass, str,  | Deep link URL for iOS devices. Not currently available. Using this field will generate an error. | [optional] 
**is_pin_deleted** | bool,  | BoolClass,  | Is original pin deleted? | [optional] 
**is_removable** | bool,  | BoolClass,  | Is pin repinnable? | [optional] 
**name** | None, str,  | NoneClass, str,  | Name of the ad - 255 chars max. | [optional] 
**pin_id** | str,  | str,  | Pin ID. | [optional] 
**status** | [**EntityStatus**](EntityStatus.md) | [**EntityStatus**](EntityStatus.md) |  | [optional] 
**[tracking_urls](#tracking_urls)** | dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  |  | [optional] 
**view_tracking_url** | None, str,  | NoneClass, str,  | Tracking URL for ad impressions. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# carousel_android_deep_links

Comma-separated deep links for the carousel pin on Android.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | Comma-separated deep links for the carousel pin on Android. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# carousel_destination_urls

Comma-separated destination URLs for the carousel pin to promote.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | Comma-separated destination URLs for the carousel pin to promote. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# carousel_ios_deep_links

Comma-separated deep links for the carousel pin on iOS.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple, None,  | tuple, NoneClass,  | Comma-separated deep links for the carousel pin on iOS. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# tracking_urls

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict, None,  | frozendict.frozendict, NoneClass,  |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[TrackingUrls](TrackingUrls.md) | [**TrackingUrls**](TrackingUrls.md) | [**TrackingUrls**](TrackingUrls.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


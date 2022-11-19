# pinterestsdk.model.conversion_events.ConversionEvents

A list of events (one or more) encapsulated by a data object.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | A list of events (one or more) encapsulated by a data object. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[data](#data)** | list, tuple,  | tuple,  |  | 

# data

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#items) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**action_source** | str,  | str,  | The source indicating where the conversion event occurred. | must be one of ["app_android", "app_ios", "web", "offline", ] 
**event_id** | str,  | str,  | A unique id string that identifies this event and can be used for deduping between events ingested via both the conversion API and Pinterest tracking. | 
**event_name** | str,  | str,  | The type of the user event. | must be one of ["add_to_cart", "checkout", "custom", "lead", "page_visit", "search", "signup", "view_category", "watch_video", ] 
**user_data** | [**ConversionEventsUserData**](ConversionEventsUserData.md) | [**ConversionEventsUserData**](ConversionEventsUserData.md) |  | 
**event_time** | decimal.Decimal, int,  | decimal.Decimal,  | The time when the event happened. Unix timestamp in seconds. | value must be a 64 bit integer
**event_source_url** | None, str,  | NoneClass, str,  | URL of the web conversion event. | [optional] 
**opt_out** | bool,  | BoolClass,  | When action_source is web or offline, it defines whether the user has opted out of tracking for web conversion events. While when action_source is app_android or app_ios, it defines whether the user has enabled Limit Ad Tracking on their iOS device, or opted out of Ads Personalization on their Android device. | [optional] 
**partner_name** | None, str,  | NoneClass, str,  | The third party partner name responsible to send the event to Conversions API on behalf of the advertiser. Only send this field if Pinterest has worked directly with you to define a value for partner_name. | [optional] 
**[custom_data](#custom_data)** | dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing other custom data. | [optional] 
**app_id** | None, str,  | NoneClass, str,  | The app store app ID. | [optional] 
**app_name** | None, str,  | NoneClass, str,  | Name of the app. | [optional] 
**app_version** | None, str,  | NoneClass, str,  | Version of the app. | [optional] 
**device_brand** | None, str,  | NoneClass, str,  | Brand of the user device. | [optional] 
**device_carrier** | None, str,  | NoneClass, str,  | User device&#x27;s mobile carrier. | [optional] 
**device_model** | None, str,  | NoneClass, str,  | Model of the user device. | [optional] 
**device_type** | None, str,  | NoneClass, str,  | Type of the user device. | [optional] 
**os_version** | None, str,  | NoneClass, str,  | Version of the device operating system. | [optional] 
**wifi** | bool,  | BoolClass,  | Whether the event occurred when the user device was connected to wifi. | [optional] 
**language** | None, str,  | NoneClass, str,  | Two-character ISO-639-1 language code indicating the user&#x27;s language. | [optional] 

# custom_data

Object containing other custom data.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Object containing other custom data. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**currency** | None, str,  | NoneClass, str,  | The ISO-4217 currency code. If not provided, we will default to the advertiser&#x27;s currency set during account creation. | [optional] 
**value** | None, str,  | NoneClass, str,  | Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price | [optional] 
**[content_ids](#content_ids)** | list, tuple,  | tuple,  | List of products IDs | [optional] 
**[contents](#contents)** | list, tuple,  | tuple,  | A list of objects containing information about products, such as price and quantity. | [optional] 
**num_items** | decimal.Decimal, int,  | decimal.Decimal,  | Total number of products of the event. For example, the total number of items purchased in a checkout event. | [optional] value must be a 64 bit integer
**order_id** | None, str,  | NoneClass, str,  | The order ID | [optional] 
**search_string** | None, str,  | NoneClass, str,  | The search string related to the user conversion event. | [optional] 
**opt_out_type** | None, str,  | NoneClass, str,  | Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. | [optional] 
**np** | None, str,  | NoneClass, str,  | Named partner. Not required, this is for Pinterest internal use only. | [optional] 

# content_ids

List of products IDs

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | List of products IDs | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# contents

A list of objects containing information about products, such as price and quantity.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | A list of objects containing information about products, such as price and quantity. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#items) | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

# items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**item_price** | str,  | str,  | The price of a product. Accepted as a string in the request; it will be parsed into a double. For example, if there are two products in a checkout event, the value should be the total price | [optional] 
**quantity** | decimal.Decimal, int,  | decimal.Decimal,  | The amount of a product. | [optional] value must be a 64 bit integer

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


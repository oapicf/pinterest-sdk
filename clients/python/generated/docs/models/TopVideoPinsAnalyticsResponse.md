# pinterestsdk.model.top_video_pins_analytics_response.TopVideoPinsAnalyticsResponse

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[date_availability](#date_availability)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[pins](#pins)** | list, tuple,  | tuple,  |  | [optional] 
**sort_by** | str,  | str,  |  | [optional] must be one of ["SAVE", "IMPRESSION", "OUTBOUND_CLICK", "VIDEO_MRC_VIEW", "VIDEO_AVG_WATCH_TIME", "VIDEO_V50_WATCH_TIME", "QUARTILE_95_PERCENT_VIEW", "VIDEO_10S_VIEW", "VIDEO_START", ] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# date_availability

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**latest_available_timestamp** | decimal.Decimal, int, float,  | decimal.Decimal,  |  | [optional] 
**is_realtime** | bool,  | BoolClass,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# pins

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#items) | dict, frozendict.frozendict,  | frozendict.frozendict,  | Array with metrics, status, and pin id for the requested metric | 

# items

Array with metrics, status, and pin id for the requested metric

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Array with metrics, status, and pin id for the requested metric | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[metrics](#metrics)** | dict, frozendict.frozendict,  | frozendict.frozendict,  | The metric name and daily value for each requested metric | [optional] 
**[data_status](#data_status)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**pin_id** | str,  | str,  | The pin id | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# metrics

The metric name and daily value for each requested metric

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | The metric name and daily value for each requested metric | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | decimal.Decimal, int, float,  | decimal.Decimal,  | any string name can be used but the value must be the correct type | [optional] 

# data_status

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**any_string_name** | [**DataStatus**](DataStatus.md) | [**DataStatus**](DataStatus.md) | any string name can be used but the value must be the correct type | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


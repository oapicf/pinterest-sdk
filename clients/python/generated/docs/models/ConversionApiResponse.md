# pinterestsdk.model.conversion_api_response.ConversionApiResponse

Schema describing the object in the response, which contains information about the events that were received and processed.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Schema describing the object in the response, which contains information about the events that were received and processed. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**num_events_processed** | decimal.Decimal, int,  | decimal.Decimal,  | Number of events that were successfully processed from the events. | 
**num_events_received** | decimal.Decimal, int,  | decimal.Decimal,  | Total number of events received in the request. | 
**[events](#events)** | list, tuple,  | tuple,  | Specific messages for each event received. The order will match the order in which the events were received in the request. | 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# events

Specific messages for each event received. The order will match the order in which the events were received in the request.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | Specific messages for each event received. The order will match the order in which the events were received in the request. | 

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
**status** | str,  | str,  | Whether the event was processed successfully. | must be one of ["failed", "processed", ] 
**error_message** | None, str,  | NoneClass, str,  | Error message containing more information about why the event failed to be processed. | [optional] 
**warning_message** | None, str,  | NoneClass, str,  | Warning messages about any fields in the event which are not standard. These are not critical to event processing. | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


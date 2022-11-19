# pinterestsdk.model.bulk_download_request.BulkDownloadRequest

Ad entities to get in bulk request.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  | Ad entities to get in bulk request. | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**[entity_types](#entity_types)** | list, tuple,  | tuple,  | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] 
**[entity_ids](#entity_ids)** | list, tuple,  | tuple,  | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] 
**updated_since** | str,  | str,  | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] 
**[campaign_filter](#campaign_filter)** | dict, frozendict.frozendict,  | frozendict.frozendict,  |  | [optional] 
**[output_format](#output_format)** | str,  | str,  |  | [optional] if omitted the server will use the default value of "JSON"
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# entity_types

All entity types specified will be downloaded. Fewer types result in faster downloads.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | All entity types specified will be downloaded. Fewer types result in faster downloads. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[items](#items) | str,  | str,  |  | 

# items

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | 

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[BulkEntityType](BulkEntityType.md) | [**BulkEntityType**](BulkEntityType.md) | [**BulkEntityType**](BulkEntityType.md) |  | 

# entity_ids

All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
items | str,  | str,  |  | 

# campaign_filter

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
dict, frozendict.frozendict,  | frozendict.frozendict,  |  | 

### Dictionary Keys
Key | Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | ------------- | -------------
**start_time** | str,  | str,  | Unix UTC timestamp. | [optional] 
**end_time** | str,  | str,  | Unix UTC timestamp. | [optional] 
**name** | str,  | str,  | Campaign name | [optional] 
**[campaign_status](#campaign_status)** | list, tuple,  | tuple,  |  | [optional] 
**[objective_type](#objective_type)** | list, tuple,  | tuple,  |  | [optional] 
**any_string_name** | dict, frozendict.frozendict, str, date, datetime, int, float, bool, decimal.Decimal, None, list, tuple, bytes, io.FileIO, io.BufferedReader | frozendict.frozendict, str, BoolClass, decimal.Decimal, NoneClass, tuple, bytes, FileIO | any string name can be used but the value must be the correct type | [optional]

# campaign_status

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**CampaignSummaryStatus**](CampaignSummaryStatus.md) | [**CampaignSummaryStatus**](CampaignSummaryStatus.md) | [**CampaignSummaryStatus**](CampaignSummaryStatus.md) |  | 

# objective_type

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
list, tuple,  | tuple,  |  | 

### Tuple Items
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[**ObjectiveType**](ObjectiveType.md) | [**ObjectiveType**](ObjectiveType.md) | [**ObjectiveType**](ObjectiveType.md) |  | 

# output_format

## Model Type Info
Input Type | Accessed Type | Description | Notes
------------ | ------------- | ------------- | -------------
str,  | str,  |  | if omitted the server will use the default value of "JSON"

### Composed Schemas (allOf/anyOf/oneOf/not)
#### allOf
Class Name | Input Type | Accessed Type | Description | Notes
------------- | ------------- | ------------- | ------------- | -------------
[BulkOutputFormat](BulkOutputFormat.md) | [**BulkOutputFormat**](BulkOutputFormat.md) | [**BulkOutputFormat**](BulkOutputFormat.md) |  | 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)


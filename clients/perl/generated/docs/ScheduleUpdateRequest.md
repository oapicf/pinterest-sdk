# WWW::OpenAPIClient::Object::ScheduleUpdateRequest

## Load the model package
```perl
use WWW::OpenAPIClient::Object::ScheduleUpdateRequest;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | **string** |  | [optional] 
**entity_type** | **string** | Entity type | [optional] 
**id** | **string** | Schedule ID. | 
**delta_value** | [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  | [optional] 
**end_timestamp** | **int** | Schedule end time. Unix timestamp in seconds. | [optional] 
**name** | **string** |  | [optional] 
**schedule_action** | [**ScheduleAction**](ScheduleAction.md) |  | [optional] 
**schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) |  | [optional] 
**schedule_type** | [**ScheduleType**](ScheduleType.md) |  | [optional] 
**start_timestamp** | **int** | Schedule start time. Unix timestamp in seconds. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



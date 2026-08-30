# WWW::OpenAPIClient::Object::Schedule

## Load the model package
```perl
use WWW::OpenAPIClient::Object::Schedule;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delta_value** | [**ScheduleDeltaValue**](ScheduleDeltaValue.md) |  | [optional] 
**end_timestamp** | **int** | Schedule end time. Unix timestamp in seconds. | [optional] 
**entity_id** | **string** | entity ID. | 
**entity_type** | [**AdAccountEntityType**](AdAccountEntityType.md) | Specify the entity_type to get summary information | [optional] 
**name** | **string** | Schedule name. | [optional] 
**schedule_action** | [**ScheduleAction**](ScheduleAction.md) | The schedule action. | [optional] 
**schedule_id** | **string** | Schedule ID. | [readonly] 
**schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) | Schedule status. | [optional] 
**schedule_type** | [**ScheduleType**](ScheduleType.md) | The schedule type. | [optional] 
**start_timestamp** | **int** | Schedule start time. Unix timestamp in seconds. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



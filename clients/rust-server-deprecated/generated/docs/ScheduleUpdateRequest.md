# ScheduleUpdateRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | **String** |  | [optional] [default to None]
**entity_type** | **String** | Entity type | [optional] [default to None]
**id** | **String** | Schedule ID. | 
**delta_value** | [***models::ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  | [optional] [default to None]
**end_timestamp** | **i32** | Schedule end time. Unix timestamp in seconds. | [optional] [default to None]
**name** | **String** |  | [optional] [default to None]
**schedule_action** | [***models::ScheduleAction**](ScheduleAction.md) |  | [optional] [default to None]
**schedule_status** | [***models::ScheduleStatus**](ScheduleStatus.md) |  | [optional] [default to None]
**schedule_type** | [***models::ScheduleType**](ScheduleType.md) |  | [optional] [default to None]
**start_timestamp** | **i32** | Schedule start time. Unix timestamp in seconds. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



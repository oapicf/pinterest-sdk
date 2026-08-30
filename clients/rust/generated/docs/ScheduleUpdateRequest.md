# ScheduleUpdateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | Option<**String**> |  | [optional]
**entity_type** | Option<**String**> | Entity type | [optional]
**id** | **String** | Schedule ID. | 
**delta_value** | Option<[**models::ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md)> |  | [optional]
**end_timestamp** | Option<**i32**> | Schedule end time. Unix timestamp in seconds. | [optional]
**name** | Option<**String**> |  | [optional]
**schedule_action** | Option<[**models::ScheduleAction**](ScheduleAction.md)> |  | [optional]
**schedule_status** | Option<[**models::ScheduleStatus**](ScheduleStatus.md)> |  | [optional]
**schedule_type** | Option<[**models::ScheduleType**](ScheduleType.md)> |  | [optional]
**start_timestamp** | Option<**i32**> | Schedule start time. Unix timestamp in seconds. | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



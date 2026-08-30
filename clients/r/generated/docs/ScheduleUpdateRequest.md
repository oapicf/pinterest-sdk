# openapi::ScheduleUpdateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | **character** |  | [optional] [Pattern: ^[C]?\\d+$] 
**entity_type** | **character** | Entity type | [optional] 
**id** | **character** | Schedule ID. | 
**delta_value** | [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  | [optional] 
**end_timestamp** | **integer** | Schedule end time. Unix timestamp in seconds. | [optional] 
**name** | **character** |  | [optional] 
**schedule_action** | [**ScheduleAction**](ScheduleAction.md) |  | [optional] [Enum: ] 
**schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) |  | [optional] [Enum: ] 
**schedule_type** | [**ScheduleType**](ScheduleType.md) |  | [optional] [Enum: ] 
**start_timestamp** | **integer** | Schedule start time. Unix timestamp in seconds. | [optional] 



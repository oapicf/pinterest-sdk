# openapi::ScheduleCreateRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | **character** |  | [Pattern: ^[C]?\\d+$] 
**entity_type** | **character** | Entity type | 
**delta_value** | [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  | 
**end_timestamp** | **integer** | Schedule end time. Unix timestamp in seconds. | 
**name** | **character** |  | 
**schedule_action** | [**ScheduleAction**](ScheduleAction.md) |  | [Enum: ] 
**schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) |  | [Enum: ] 
**schedule_type** | [**ScheduleType**](ScheduleType.md) |  | [Enum: ] 
**start_timestamp** | **integer** | Schedule start time. Unix timestamp in seconds. | 



# openapi::SchedulesCreate200ResponseInnerData

Created/updated resource on success or error details on failure

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delta_value** | [**ScheduleDeltaValue**](Schedule_delta_value.md) |  | [optional] 
**end_timestamp** | **integer** | Schedule end time. Unix timestamp in seconds. | [optional] 
**entity_id** | **character** | entity ID. | [Pattern: ^\\d+$] 
**entity_type** | [**AdAccountEntityType**](AdAccountEntityType.md) | Specify the entity_type to get summary information | [optional] [Enum: ] 
**name** | **character** | Schedule name. | [optional] 
**schedule_action** | [**ScheduleAction**](ScheduleAction.md) | The schedule action. | [optional] [Enum: ] 
**schedule_id** | **character** | Schedule ID. | [Pattern: ^\\d+$] 
**schedule_status** | [**ScheduleStatus**](ScheduleStatus.md) | Schedule status. | [optional] [Enum: ] 
**schedule_type** | [**ScheduleType**](ScheduleType.md) | The schedule type. | [optional] [Enum: ] 
**start_timestamp** | **integer** | Schedule start time. Unix timestamp in seconds. | [optional] 
**id** | **character** |  | [Pattern: ^\\d+$] [Max. length: 18] 
**exceptions** | [**PinterestLibError**](Pinterest.Lib.Error.md) |  | 



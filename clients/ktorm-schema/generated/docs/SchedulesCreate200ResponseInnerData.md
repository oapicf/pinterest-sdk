
# Table `schedules_create_200_response_inner_data`
(mapped from: SchedulesCreate200ResponseInnerData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**entityId** | entity_id | text NOT NULL |  | **kotlin.String** | entity ID. | 
**scheduleId** | schedule_id | text NOT NULL |  | **kotlin.String** | Schedule ID. | 
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**exceptions** | exceptions | long NOT NULL |  | [**PinterestLibError**](PinterestLibError.md) |  |  [foreignkey]
**deltaValue** | delta_value | long |  | [**ScheduleDeltaValue**](ScheduleDeltaValue.md) |  |  [optional] [foreignkey]
**endTimestamp** | end_timestamp | int |  | **kotlin.Int** | Schedule end time. Unix timestamp in seconds. |  [optional]
**entityType** | entity_type | long |  | [**AdAccountEntityType**](AdAccountEntityType.md) | Specify the entity_type to get summary information |  [optional] [foreignkey]
**name** | name | text |  | **kotlin.String** | Schedule name. |  [optional]
**scheduleAction** | schedule_action | long |  | [**ScheduleAction**](ScheduleAction.md) | The schedule action. |  [optional] [foreignkey]
**scheduleStatus** | schedule_status | long |  | [**ScheduleStatus**](ScheduleStatus.md) | Schedule status. |  [optional] [foreignkey]
**scheduleType** | schedule_type | long |  | [**ScheduleType**](ScheduleType.md) | The schedule type. |  [optional] [foreignkey]
**startTimestamp** | start_timestamp | int |  | **kotlin.Int** | Schedule start time. Unix timestamp in seconds. |  [optional]
















# Table `ScheduleCreateRequest`
(mapped from: ScheduleCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**entityId** | entity_id | text NOT NULL |  | **kotlin.String** |  | 
**entityType** | entity_type | text NOT NULL |  | **kotlin.String** | Entity type | 
**deltaValue** | delta_value | long NOT NULL |  | [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  |  [foreignkey]
**endTimestamp** | end_timestamp | int NOT NULL |  | **kotlin.Int** | Schedule end time. Unix timestamp in seconds. | 
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**scheduleAction** | schedule_action | long NOT NULL |  | [**ScheduleAction**](ScheduleAction.md) |  |  [foreignkey]
**scheduleStatus** | schedule_status | long NOT NULL |  | [**ScheduleStatus**](ScheduleStatus.md) |  |  [foreignkey]
**scheduleType** | schedule_type | long NOT NULL |  | [**ScheduleType**](ScheduleType.md) |  |  [foreignkey]
**startTimestamp** | start_timestamp | int NOT NULL |  | **kotlin.Int** | Schedule start time. Unix timestamp in seconds. | 












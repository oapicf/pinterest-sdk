
# Table `ScheduleUpdateRequest`
(mapped from: ScheduleUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Schedule ID. | 
**entityId** | entity_id | text |  | **kotlin.String** |  |  [optional]
**entityType** | entity_type | text |  | **kotlin.String** | Entity type |  [optional]
**deltaValue** | delta_value | long |  | [**ScheduleCommonDeltaValue**](ScheduleCommonDeltaValue.md) |  |  [optional] [foreignkey]
**endTimestamp** | end_timestamp | int |  | **kotlin.Int** | Schedule end time. Unix timestamp in seconds. |  [optional]
**name** | name | text |  | **kotlin.String** |  |  [optional]
**scheduleAction** | schedule_action | long |  | [**ScheduleAction**](ScheduleAction.md) |  |  [optional] [foreignkey]
**scheduleStatus** | schedule_status | long |  | [**ScheduleStatus**](ScheduleStatus.md) |  |  [optional] [foreignkey]
**scheduleType** | schedule_type | long |  | [**ScheduleType**](ScheduleType.md) |  |  [optional] [foreignkey]
**startTimestamp** | start_timestamp | int |  | **kotlin.Int** | Schedule start time. Unix timestamp in seconds. |  [optional]













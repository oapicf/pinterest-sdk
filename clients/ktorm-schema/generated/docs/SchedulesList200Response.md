
# Table `schedules_list_200_response`
(mapped from: SchedulesList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Schedule&gt;**](Schedule.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `SchedulesList200ResponseSchedule`**
(mapped from: SchedulesList200ResponseSchedule)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
schedulesList200Response | schedulesList200Response | long | | kotlin.Long | Primary Key | *one*
schedule | schedule | long | | kotlin.Long | Foreign Key | *many*






# Table `schedules_create_200_response_inner_data_oneOf`
(mapped from: SchedulesCreate200ResponseInnerDataOneOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** |  | 
**scheduleId** | schedule_id | text NOT NULL |  | **kotlin.String** | Schedule ID. | 
**exceptions** | exceptions | long NOT NULL |  | [**PinterestLibError**](PinterestLibError.md) |  |  [foreignkey]






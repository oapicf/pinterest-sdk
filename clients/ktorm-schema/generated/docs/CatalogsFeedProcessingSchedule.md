
# Table `CatalogsFeedProcessingSchedule`
(mapped from: CatalogsFeedProcessingSchedule)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**time** | time | text NOT NULL |  | **kotlin.String** | A time in format HH:MM with leading 0 (zero) | 
**timezone** | timezone | long NOT NULL |  | [**CatalogsFeedProcessingScheduleTimezone**](CatalogsFeedProcessingScheduleTimezone.md) | The timezone considered for the processing schedule time. |  [foreignkey]





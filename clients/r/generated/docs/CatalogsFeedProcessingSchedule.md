# openapi::CatalogsFeedProcessingSchedule

Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **character** | A time in format HH:MM with leading 0 (zero) | [Pattern: ^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$] 
**timezone** | [**CatalogsFeedProcessingScheduleTimezone**](CatalogsFeedProcessingScheduleTimezone.md) | The timezone considered for the processing schedule time. | [Enum: ] 



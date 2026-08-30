# CatalogsFeedProcessingSchedule

Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**time** | **str** | A time in format HH:MM with leading 0 (zero) | 
**timezone** | [**CatalogsFeedProcessingScheduleTimezone**](CatalogsFeedProcessingScheduleTimezone.md) | The timezone considered for the processing schedule time. | 

## Example

```python
from pinterestsdk.models.catalogs_feed_processing_schedule import CatalogsFeedProcessingSchedule

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsFeedProcessingSchedule from a JSON string
catalogs_feed_processing_schedule_instance = CatalogsFeedProcessingSchedule.from_json(json)
# print the JSON string representation of the object
print(CatalogsFeedProcessingSchedule.to_json())

# convert the object into a dict
catalogs_feed_processing_schedule_dict = catalogs_feed_processing_schedule_instance.to_dict()
# create an instance of CatalogsFeedProcessingSchedule from a dict
catalogs_feed_processing_schedule_from_dict = CatalogsFeedProcessingSchedule.from_dict(catalogs_feed_processing_schedule_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



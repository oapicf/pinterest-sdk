# EventQualityScore

Schema for GET Conversion EQS response.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ingestion_source** | [**IngestionSourceOptions**](IngestionSourceOptions.md) |  | 
**lookback_period** | [**LookbackPeriodOptions**](LookbackPeriodOptions.md) |  | 
**overall_status** | [**OverallStatusOptions**](OverallStatusOptions.md) |  | 
**quality_components** | [**QualityComponents**](QualityComponents.md) |  | 
**source_platform** | [**SourcePlatformOptions**](SourcePlatformOptions.md) |  | 

## Example

```python
from pinterestsdk.models.event_quality_score import EventQualityScore

# TODO update the JSON string below
json = "{}"
# create an instance of EventQualityScore from a JSON string
event_quality_score_instance = EventQualityScore.from_json(json)
# print the JSON string representation of the object
print(EventQualityScore.to_json())

# convert the object into a dict
event_quality_score_dict = event_quality_score_instance.to_dict()
# create an instance of EventQualityScore from a dict
event_quality_score_from_dict = EventQualityScore.from_dict(event_quality_score_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



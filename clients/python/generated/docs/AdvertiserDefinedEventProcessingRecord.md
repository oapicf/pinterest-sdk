# AdvertiserDefinedEventProcessingRecord

Processing record for an advertiser defined event operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exceptions** | **List[str]** | List of exception messages if the operation failed | [optional] 
**name** | **str** | Name of the advertiser defined event | 
**status** | **str** | Processing status (success or failure) | 

## Example

```python
from pinterestsdk.models.advertiser_defined_event_processing_record import AdvertiserDefinedEventProcessingRecord

# TODO update the JSON string below
json = "{}"
# create an instance of AdvertiserDefinedEventProcessingRecord from a JSON string
advertiser_defined_event_processing_record_instance = AdvertiserDefinedEventProcessingRecord.from_json(json)
# print the JSON string representation of the object
print(AdvertiserDefinedEventProcessingRecord.to_json())

# convert the object into a dict
advertiser_defined_event_processing_record_dict = advertiser_defined_event_processing_record_instance.to_dict()
# create an instance of AdvertiserDefinedEventProcessingRecord from a dict
advertiser_defined_event_processing_record_from_dict = AdvertiserDefinedEventProcessingRecord.from_dict(advertiser_defined_event_processing_record_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



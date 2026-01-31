# AdvertiserDefinedEventsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[AdvertiserDefinedEvent]**](AdvertiserDefinedEvent.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.advertiser_defined_events_response import AdvertiserDefinedEventsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AdvertiserDefinedEventsResponse from a JSON string
advertiser_defined_events_response_instance = AdvertiserDefinedEventsResponse.from_json(json)
# print the JSON string representation of the object
print(AdvertiserDefinedEventsResponse.to_json())

# convert the object into a dict
advertiser_defined_events_response_dict = advertiser_defined_events_response_instance.to_dict()
# create an instance of AdvertiserDefinedEventsResponse from a dict
advertiser_defined_events_response_from_dict = AdvertiserDefinedEventsResponse.from_dict(advertiser_defined_events_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



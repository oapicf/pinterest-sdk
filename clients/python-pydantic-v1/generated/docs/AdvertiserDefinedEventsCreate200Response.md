# AdvertiserDefinedEventsCreate200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[AdvertiserDefinedEventProcessingRecord]**](AdvertiserDefinedEventProcessingRecord.md) |  | 

## Example

```python
from openapi_client.models.advertiser_defined_events_create200_response import AdvertiserDefinedEventsCreate200Response

# TODO update the JSON string below
json = "{}"
# create an instance of AdvertiserDefinedEventsCreate200Response from a JSON string
advertiser_defined_events_create200_response_instance = AdvertiserDefinedEventsCreate200Response.from_json(json)
# print the JSON string representation of the object
print AdvertiserDefinedEventsCreate200Response.to_json()

# convert the object into a dict
advertiser_defined_events_create200_response_dict = advertiser_defined_events_create200_response_instance.to_dict()
# create an instance of AdvertiserDefinedEventsCreate200Response from a dict
advertiser_defined_events_create200_response_from_dict = AdvertiserDefinedEventsCreate200Response.from_dict(advertiser_defined_events_create200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# AdvertiserDefinedEventsCreateRequest

Request body for creating or updating advertiser defined events

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[AdvertiserDefinedEventInput]**](AdvertiserDefinedEventInput.md) | List of advertiser defined events to create or update | 

## Example

```python
from openapi_client.models.advertiser_defined_events_create_request import AdvertiserDefinedEventsCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AdvertiserDefinedEventsCreateRequest from a JSON string
advertiser_defined_events_create_request_instance = AdvertiserDefinedEventsCreateRequest.from_json(json)
# print the JSON string representation of the object
print AdvertiserDefinedEventsCreateRequest.to_json()

# convert the object into a dict
advertiser_defined_events_create_request_dict = advertiser_defined_events_create_request_instance.to_dict()
# create an instance of AdvertiserDefinedEventsCreateRequest from a dict
advertiser_defined_events_create_request_from_dict = AdvertiserDefinedEventsCreateRequest.from_dict(advertiser_defined_events_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



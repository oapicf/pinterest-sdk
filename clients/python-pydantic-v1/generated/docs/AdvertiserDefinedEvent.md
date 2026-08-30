# AdvertiserDefinedEvent

Advertiser defined event

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapped_conversion_type** | [**ConversionTagTypeOptimal**](ConversionTagTypeOptimal.md) | Standard type mapped to ADE for optimization | [optional] 
**name** | **str** | Raw string name of the event, usually logged as raw_event_name in our dataset | [optional] 

## Example

```python
from openapi_client.models.advertiser_defined_event import AdvertiserDefinedEvent

# TODO update the JSON string below
json = "{}"
# create an instance of AdvertiserDefinedEvent from a JSON string
advertiser_defined_event_instance = AdvertiserDefinedEvent.from_json(json)
# print the JSON string representation of the object
print AdvertiserDefinedEvent.to_json()

# convert the object into a dict
advertiser_defined_event_dict = advertiser_defined_event_instance.to_dict()
# create an instance of AdvertiserDefinedEvent from a dict
advertiser_defined_event_from_dict = AdvertiserDefinedEvent.from_dict(advertiser_defined_event_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



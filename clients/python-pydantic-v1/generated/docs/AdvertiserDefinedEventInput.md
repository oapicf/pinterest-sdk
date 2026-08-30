# AdvertiserDefinedEventInput

Advertiser defined event input for create/update operations

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mapped_conversion_type** | [**AdvertiserDefinedEventMappingType**](AdvertiserDefinedEventMappingType.md) | Pinterest standard event type to map this custom event to for campaign optimization and reporting | 
**name** | **str** | Raw string name of the event | 

## Example

```python
from openapi_client.models.advertiser_defined_event_input import AdvertiserDefinedEventInput

# TODO update the JSON string below
json = "{}"
# create an instance of AdvertiserDefinedEventInput from a JSON string
advertiser_defined_event_input_instance = AdvertiserDefinedEventInput.from_json(json)
# print the JSON string representation of the object
print AdvertiserDefinedEventInput.to_json()

# convert the object into a dict
advertiser_defined_event_input_dict = advertiser_defined_event_input_instance.to_dict()
# create an instance of AdvertiserDefinedEventInput from a dict
advertiser_defined_event_input_from_dict = AdvertiserDefinedEventInput.from_dict(advertiser_defined_event_input_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



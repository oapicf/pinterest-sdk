# PinsList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[Pin]**](Pin.md) |  | 

## Example

```python
from pinterestsdk.models.pins_list200_response import PinsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of PinsList200Response from a JSON string
pins_list200_response_instance = PinsList200Response.from_json(json)
# print the JSON string representation of the object
print(PinsList200Response.to_json())

# convert the object into a dict
pins_list200_response_dict = pins_list200_response_instance.to_dict()
# create an instance of PinsList200Response from a dict
pins_list200_response_from_dict = PinsList200Response.from_dict(pins_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# SummaryPin

Summarized pin information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alt_text** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**id** | **str** |  | 
**link** | **str** |  | [optional] 
**media** | [**PinMedia**](PinMedia.md) |  | [optional] [readonly] 
**title** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.summary_pin import SummaryPin

# TODO update the JSON string below
json = "{}"
# create an instance of SummaryPin from a JSON string
summary_pin_instance = SummaryPin.from_json(json)
# print the JSON string representation of the object
print(SummaryPin.to_json())

# convert the object into a dict
summary_pin_dict = summary_pin_instance.to_dict()
# create an instance of SummaryPin from a dict
summary_pin_from_dict = SummaryPin.from_dict(summary_pin_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



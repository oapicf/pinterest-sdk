# LabelErrorData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Label ID. | [optional] 
**label_type** | [**NullableLabelType**](NullableLabelType.md) |  | [optional] 
**status** | [**NullableLabelStatus**](NullableLabelStatus.md) |  | [optional] 
**value** | **str** | Label name. 100-character limit. | [optional] 

## Example

```python
from pinterestsdk.models.label_error_data import LabelErrorData

# TODO update the JSON string below
json = "{}"
# create an instance of LabelErrorData from a JSON string
label_error_data_instance = LabelErrorData.from_json(json)
# print the JSON string representation of the object
print(LabelErrorData.to_json())

# convert the object into a dict
label_error_data_dict = label_error_data_instance.to_dict()
# create an instance of LabelErrorData from a dict
label_error_data_from_dict = LabelErrorData.from_dict(label_error_data_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



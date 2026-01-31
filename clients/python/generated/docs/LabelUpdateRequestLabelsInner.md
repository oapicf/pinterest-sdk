# LabelUpdateRequestLabelsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Label ID. | 
**status** | [**LabelStatus**](LabelStatus.md) |  | [optional] 
**value** | **str** | Label name. 100-character limit. | [optional] 

## Example

```python
from pinterestsdk.models.label_update_request_labels_inner import LabelUpdateRequestLabelsInner

# TODO update the JSON string below
json = "{}"
# create an instance of LabelUpdateRequestLabelsInner from a JSON string
label_update_request_labels_inner_instance = LabelUpdateRequestLabelsInner.from_json(json)
# print the JSON string representation of the object
print(LabelUpdateRequestLabelsInner.to_json())

# convert the object into a dict
label_update_request_labels_inner_dict = label_update_request_labels_inner_instance.to_dict()
# create an instance of LabelUpdateRequestLabelsInner from a dict
label_update_request_labels_inner_from_dict = LabelUpdateRequestLabelsInner.from_dict(label_update_request_labels_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



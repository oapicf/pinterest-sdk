# LabelCreateRequestLabelsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**label_type** | [**LabelType**](LabelType.md) |  | 
**value** | **str** | Label name. 100-character limit. | 

## Example

```python
from pinterestsdk.models.label_create_request_labels_inner import LabelCreateRequestLabelsInner

# TODO update the JSON string below
json = "{}"
# create an instance of LabelCreateRequestLabelsInner from a JSON string
label_create_request_labels_inner_instance = LabelCreateRequestLabelsInner.from_json(json)
# print the JSON string representation of the object
print(LabelCreateRequestLabelsInner.to_json())

# convert the object into a dict
label_create_request_labels_inner_dict = label_create_request_labels_inner_instance.to_dict()
# create an instance of LabelCreateRequestLabelsInner from a dict
label_create_request_labels_inner_from_dict = LabelCreateRequestLabelsInner.from_dict(label_create_request_labels_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



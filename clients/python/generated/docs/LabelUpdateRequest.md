# LabelUpdateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labels** | [**List[LabelUpdateItem]**](LabelUpdateItem.md) | Labels that you are applying to the campaign. | 

## Example

```python
from pinterestsdk.models.label_update_request import LabelUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of LabelUpdateRequest from a JSON string
label_update_request_instance = LabelUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(LabelUpdateRequest.to_json())

# convert the object into a dict
label_update_request_dict = label_update_request_instance.to_dict()
# create an instance of LabelUpdateRequest from a dict
label_update_request_from_dict = LabelUpdateRequest.from_dict(label_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



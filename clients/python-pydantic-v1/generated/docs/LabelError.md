# LabelError


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**LabelErrorData**](LabelErrorData.md) |  | [optional] 
**error_messages** | **List[str]** |  | [optional] 

## Example

```python
from openapi_client.models.label_error import LabelError

# TODO update the JSON string below
json = "{}"
# create an instance of LabelError from a JSON string
label_error_instance = LabelError.from_json(json)
# print the JSON string representation of the object
print LabelError.to_json()

# convert the object into a dict
label_error_dict = label_error_instance.to_dict()
# create an instance of LabelError from a dict
label_error_from_dict = LabelError.from_dict(label_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# LabelsList200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[Label]**](Label.md) |  | 

## Example

```python
from openapi_client.models.labels_list200_response import LabelsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of LabelsList200Response from a JSON string
labels_list200_response_instance = LabelsList200Response.from_json(json)
# print the JSON string representation of the object
print LabelsList200Response.to_json()

# convert the object into a dict
labels_list200_response_dict = labels_list200_response_instance.to_dict()
# create an instance of LabelsList200Response from a dict
labels_list200_response_from_dict = LabelsList200Response.from_dict(labels_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# TemplatesList200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[TemplateResponse]**](TemplateResponse.md) |  | 

## Example

```python
from pinterestsdk.models.templates_list200_response import TemplatesList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of TemplatesList200Response from a JSON string
templates_list200_response_instance = TemplatesList200Response.from_json(json)
# print the JSON string representation of the object
print(TemplatesList200Response.to_json())

# convert the object into a dict
templates_list200_response_dict = templates_list200_response_instance.to_dict()
# create an instance of TemplatesList200Response from a dict
templates_list200_response_from_dict = TemplatesList200Response.from_dict(templates_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



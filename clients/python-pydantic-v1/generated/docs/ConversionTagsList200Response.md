# ConversionTagsList200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[ConversionTag]**](ConversionTag.md) |  | 

## Example

```python
from openapi_client.models.conversion_tags_list200_response import ConversionTagsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionTagsList200Response from a JSON string
conversion_tags_list200_response_instance = ConversionTagsList200Response.from_json(json)
# print the JSON string representation of the object
print ConversionTagsList200Response.to_json()

# convert the object into a dict
conversion_tags_list200_response_dict = conversion_tags_list200_response_instance.to_dict()
# create an instance of ConversionTagsList200Response from a dict
conversion_tags_list200_response_from_dict = ConversionTagsList200Response.from_dict(conversion_tags_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



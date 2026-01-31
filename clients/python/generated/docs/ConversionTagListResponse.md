# ConversionTagListResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[ConversionTag]**](ConversionTag.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.conversion_tag_list_response import ConversionTagListResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ConversionTagListResponse from a JSON string
conversion_tag_list_response_instance = ConversionTagListResponse.from_json(json)
# print the JSON string representation of the object
print(ConversionTagListResponse.to_json())

# convert the object into a dict
conversion_tag_list_response_dict = conversion_tag_list_response_instance.to_dict()
# create an instance of ConversionTagListResponse from a dict
conversion_tag_list_response_from_dict = ConversionTagListResponse.from_dict(conversion_tag_list_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



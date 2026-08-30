# PageVisitConversionTagsGet200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[ConversionEventResponse]**](ConversionEventResponse.md) |  | 

## Example

```python
from openapi_client.models.page_visit_conversion_tags_get200_response import PageVisitConversionTagsGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of PageVisitConversionTagsGet200Response from a JSON string
page_visit_conversion_tags_get200_response_instance = PageVisitConversionTagsGet200Response.from_json(json)
# print the JSON string representation of the object
print PageVisitConversionTagsGet200Response.to_json()

# convert the object into a dict
page_visit_conversion_tags_get200_response_dict = page_visit_conversion_tags_get200_response_instance.to_dict()
# create an instance of PageVisitConversionTagsGet200Response from a dict
page_visit_conversion_tags_get200_response_from_dict = PageVisitConversionTagsGet200Response.from_dict(page_visit_conversion_tags_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ProductTagsResponse

Response containing a list of product tags for a pin.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product_tags** | [**List[ProductTagItem]**](ProductTagItem.md) | List of product tags on the pin. | 

## Example

```python
from pinterestsdk.models.product_tags_response import ProductTagsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ProductTagsResponse from a JSON string
product_tags_response_instance = ProductTagsResponse.from_json(json)
# print the JSON string representation of the object
print(ProductTagsResponse.to_json())

# convert the object into a dict
product_tags_response_dict = product_tags_response_instance.to_dict()
# create an instance of ProductTagsResponse from a dict
product_tags_response_from_dict = ProductTagsResponse.from_dict(product_tags_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



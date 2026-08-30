# ProductTagsError

Error response for requests containing ineligible product tags.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **int** |  | 
**details** | [**IneligibleProductTagsErrorDetails**](IneligibleProductTagsErrorDetails.md) | Details about which product tags failed eligibility check. | [optional] 
**message** | **str** |  | 

## Example

```python
from openapi_client.models.product_tags_error import ProductTagsError

# TODO update the JSON string below
json = "{}"
# create an instance of ProductTagsError from a JSON string
product_tags_error_instance = ProductTagsError.from_json(json)
# print the JSON string representation of the object
print ProductTagsError.to_json()

# convert the object into a dict
product_tags_error_dict = product_tags_error_instance.to_dict()
# create an instance of ProductTagsError from a dict
product_tags_error_from_dict = ProductTagsError.from_dict(product_tags_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# IneligibleProductTagsErrorDetails

Details about ineligible product tags in the request.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product_tags** | [**List[IneligibleProductTagErrorItem]**](IneligibleProductTagErrorItem.md) | List of product tags that failed eligibility check. | 

## Example

```python
from openapi_client.models.ineligible_product_tags_error_details import IneligibleProductTagsErrorDetails

# TODO update the JSON string below
json = "{}"
# create an instance of IneligibleProductTagsErrorDetails from a JSON string
ineligible_product_tags_error_details_instance = IneligibleProductTagsErrorDetails.from_json(json)
# print the JSON string representation of the object
print IneligibleProductTagsErrorDetails.to_json()

# convert the object into a dict
ineligible_product_tags_error_details_dict = ineligible_product_tags_error_details_instance.to_dict()
# create an instance of IneligibleProductTagsErrorDetails from a dict
ineligible_product_tags_error_details_from_dict = IneligibleProductTagsErrorDetails.from_dict(ineligible_product_tags_error_details_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# ProductTagsBulkAddRequest

Request body for bulk adding product tags to a pin.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product_tags** | [**List[ProductTagItem]**](ProductTagItem.md) | List of product tags to add. Maximum 24 items allowed. | 

## Example

```python
from pinterestsdk.models.product_tags_bulk_add_request import ProductTagsBulkAddRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ProductTagsBulkAddRequest from a JSON string
product_tags_bulk_add_request_instance = ProductTagsBulkAddRequest.from_json(json)
# print the JSON string representation of the object
print(ProductTagsBulkAddRequest.to_json())

# convert the object into a dict
product_tags_bulk_add_request_dict = product_tags_bulk_add_request_instance.to_dict()
# create an instance of ProductTagsBulkAddRequest from a dict
product_tags_bulk_add_request_from_dict = ProductTagsBulkAddRequest.from_dict(product_tags_bulk_add_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



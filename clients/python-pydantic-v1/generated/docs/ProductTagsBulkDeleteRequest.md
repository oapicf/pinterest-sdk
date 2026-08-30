# ProductTagsBulkDeleteRequest

Request body for bulk deleting product tags from a pin.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product_tags** | [**List[ProductTagItem]**](ProductTagItem.md) | List of product tags to delete. | 

## Example

```python
from openapi_client.models.product_tags_bulk_delete_request import ProductTagsBulkDeleteRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ProductTagsBulkDeleteRequest from a JSON string
product_tags_bulk_delete_request_instance = ProductTagsBulkDeleteRequest.from_json(json)
# print the JSON string representation of the object
print ProductTagsBulkDeleteRequest.to_json()

# convert the object into a dict
product_tags_bulk_delete_request_dict = product_tags_bulk_delete_request_instance.to_dict()
# create an instance of ProductTagsBulkDeleteRequest from a dict
product_tags_bulk_delete_request_from_dict = ProductTagsBulkDeleteRequest.from_dict(product_tags_bulk_delete_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



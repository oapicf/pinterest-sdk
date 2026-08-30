# BulkUpsertRequestUpdateCatalogProductGroupsItems


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] 
**is_featured** | **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.bulk_upsert_request_update_catalog_product_groups_items import BulkUpsertRequestUpdateCatalogProductGroupsItems

# TODO update the JSON string below
json = "{}"
# create an instance of BulkUpsertRequestUpdateCatalogProductGroupsItems from a JSON string
bulk_upsert_request_update_catalog_product_groups_items_instance = BulkUpsertRequestUpdateCatalogProductGroupsItems.from_json(json)
# print the JSON string representation of the object
print BulkUpsertRequestUpdateCatalogProductGroupsItems.to_json()

# convert the object into a dict
bulk_upsert_request_update_catalog_product_groups_items_dict = bulk_upsert_request_update_catalog_product_groups_items_instance.to_dict()
# create an instance of BulkUpsertRequestUpdateCatalogProductGroupsItems from a dict
bulk_upsert_request_update_catalog_product_groups_items_from_dict = BulkUpsertRequestUpdateCatalogProductGroupsItems.from_dict(bulk_upsert_request_update_catalog_product_groups_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



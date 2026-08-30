# BulkUpsertRequestCreateCatalogProductGroupsItems


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**feed_id** | **str** | Catalog Feed id pertaining to the catalog product group. | 
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**is_featured** | **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**name** | **str** |  | 

## Example

```python
from openapi_client.models.bulk_upsert_request_create_catalog_product_groups_items import BulkUpsertRequestCreateCatalogProductGroupsItems

# TODO update the JSON string below
json = "{}"
# create an instance of BulkUpsertRequestCreateCatalogProductGroupsItems from a JSON string
bulk_upsert_request_create_catalog_product_groups_items_instance = BulkUpsertRequestCreateCatalogProductGroupsItems.from_json(json)
# print the JSON string representation of the object
print BulkUpsertRequestCreateCatalogProductGroupsItems.to_json()

# convert the object into a dict
bulk_upsert_request_create_catalog_product_groups_items_dict = bulk_upsert_request_create_catalog_product_groups_items_instance.to_dict()
# create an instance of BulkUpsertRequestCreateCatalogProductGroupsItems from a dict
bulk_upsert_request_create_catalog_product_groups_items_from_dict = BulkUpsertRequestCreateCatalogProductGroupsItems.from_dict(bulk_upsert_request_create_catalog_product_groups_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CatalogsRetailItemsPostFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] 
**catalog_type** | **str** |  | 
**item_ids** | **List[str]** |  | 

## Example

```python
from openapi_client.models.catalogs_retail_items_post_filter import CatalogsRetailItemsPostFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailItemsPostFilter from a JSON string
catalogs_retail_items_post_filter_instance = CatalogsRetailItemsPostFilter.from_json(json)
# print the JSON string representation of the object
print CatalogsRetailItemsPostFilter.to_json()

# convert the object into a dict
catalogs_retail_items_post_filter_dict = catalogs_retail_items_post_filter_instance.to_dict()
# create an instance of CatalogsRetailItemsPostFilter from a dict
catalogs_retail_items_post_filter_from_dict = CatalogsRetailItemsPostFilter.from_dict(catalogs_retail_items_post_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



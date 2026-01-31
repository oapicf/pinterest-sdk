# CatalogsRetailItemsFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog | [optional] 
**catalog_type** | **str** |  | 
**item_ids** | **List[str]** |  | 

## Example

```python
from pinterestsdk.models.catalogs_retail_items_filter import CatalogsRetailItemsFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailItemsFilter from a JSON string
catalogs_retail_items_filter_instance = CatalogsRetailItemsFilter.from_json(json)
# print the JSON string representation of the object
print(CatalogsRetailItemsFilter.to_json())

# convert the object into a dict
catalogs_retail_items_filter_dict = catalogs_retail_items_filter_instance.to_dict()
# create an instance of CatalogsRetailItemsFilter from a dict
catalogs_retail_items_filter_from_dict = CatalogsRetailItemsFilter.from_dict(catalogs_retail_items_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CatalogsItemsPostFilters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**catalog_id** | **str** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 
**item_ids** | **List[str]** |  | 
**hotel_ids** | **List[str]** |  | 
**creative_assets_ids** | **List[str]** |  | 

## Example

```python
from pinterestsdk.models.catalogs_items_post_filters import CatalogsItemsPostFilters

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsItemsPostFilters from a JSON string
catalogs_items_post_filters_instance = CatalogsItemsPostFilters.from_json(json)
# print the JSON string representation of the object
print(CatalogsItemsPostFilters.to_json())

# convert the object into a dict
catalogs_items_post_filters_dict = catalogs_items_post_filters_instance.to_dict()
# create an instance of CatalogsItemsPostFilters from a dict
catalogs_items_post_filters_from_dict = CatalogsItemsPostFilters.from_dict(catalogs_items_post_filters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



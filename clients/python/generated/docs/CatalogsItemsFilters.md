# CatalogsItemsFilters


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
from pinterestsdk.models.catalogs_items_filters import CatalogsItemsFilters

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsItemsFilters from a JSON string
catalogs_items_filters_instance = CatalogsItemsFilters.from_json(json)
# print the JSON string representation of the object
print(CatalogsItemsFilters.to_json())

# convert the object into a dict
catalogs_items_filters_dict = catalogs_items_filters_instance.to_dict()
# create an instance of CatalogsItemsFilters from a dict
catalogs_items_filters_from_dict = CatalogsItemsFilters.from_dict(catalogs_items_filters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



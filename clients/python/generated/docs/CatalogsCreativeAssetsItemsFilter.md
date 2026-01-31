# CatalogsCreativeAssetsItemsFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 
**catalog_type** | **str** |  | 
**creative_assets_ids** | **List[str]** |  | 

## Example

```python
from pinterestsdk.models.catalogs_creative_assets_items_filter import CatalogsCreativeAssetsItemsFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsItemsFilter from a JSON string
catalogs_creative_assets_items_filter_instance = CatalogsCreativeAssetsItemsFilter.from_json(json)
# print the JSON string representation of the object
print(CatalogsCreativeAssetsItemsFilter.to_json())

# convert the object into a dict
catalogs_creative_assets_items_filter_dict = catalogs_creative_assets_items_filter_instance.to_dict()
# create an instance of CatalogsCreativeAssetsItemsFilter from a dict
catalogs_creative_assets_items_filter_from_dict = CatalogsCreativeAssetsItemsFilter.from_dict(catalogs_creative_assets_items_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



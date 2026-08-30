# CatalogsCreativeAssetsItemsPostFilter


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] 
**catalog_type** | **str** |  | 
**creative_assets_ids** | **List[str]** |  | 

## Example

```python
from openapi_client.models.catalogs_creative_assets_items_post_filter import CatalogsCreativeAssetsItemsPostFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsItemsPostFilter from a JSON string
catalogs_creative_assets_items_post_filter_instance = CatalogsCreativeAssetsItemsPostFilter.from_json(json)
# print the JSON string representation of the object
print CatalogsCreativeAssetsItemsPostFilter.to_json()

# convert the object into a dict
catalogs_creative_assets_items_post_filter_dict = catalogs_creative_assets_items_post_filter_instance.to_dict()
# create an instance of CatalogsCreativeAssetsItemsPostFilter from a dict
catalogs_creative_assets_items_post_filter_from_dict = CatalogsCreativeAssetsItemsPostFilter.from_dict(catalogs_creative_assets_items_post_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



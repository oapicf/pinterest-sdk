# CatalogsCreativeAssetsProductGroup


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog ID pertaining to the product group. | 
**catalog_type** | **str** |  | 
**created_at** | **int** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**description** | **str** |  | [optional] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**id** | **str** | ID of the catalog product group. | 
**name** | **str** | Name of catalog product group | [optional] 
**updated_at** | **int** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 

## Example

```python
from openapi_client.models.catalogs_creative_assets_product_group import CatalogsCreativeAssetsProductGroup

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsProductGroup from a JSON string
catalogs_creative_assets_product_group_instance = CatalogsCreativeAssetsProductGroup.from_json(json)
# print the JSON string representation of the object
print CatalogsCreativeAssetsProductGroup.to_json()

# convert the object into a dict
catalogs_creative_assets_product_group_dict = catalogs_creative_assets_product_group_instance.to_dict()
# create an instance of CatalogsCreativeAssetsProductGroup from a dict
catalogs_creative_assets_product_group_from_dict = CatalogsCreativeAssetsProductGroup.from_dict(catalogs_creative_assets_product_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



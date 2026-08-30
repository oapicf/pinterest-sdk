# CatalogsVerticalProductGroup


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog ID pertaining to the product group. | 
**catalog_type** | **str** |  | 
**country** | **str** |  | [optional] 
**created_at** | **int** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**description** | **str** |  | [optional] 
**feed_id** | **str** | id of the catalogs feed belonging to this catalog product group | 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**id** | **str** | ID of the catalog product group. | 
**is_featured** | **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**locale** | **str** |  | [optional] 
**name** | **str** | Name of catalog product group | [optional] 
**status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] 
**type** | [**CatalogsHotelProductGroupType**](CatalogsHotelProductGroupType.md) |  | 
**updated_at** | **int** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 

## Example

```python
from openapi_client.models.catalogs_vertical_product_group import CatalogsVerticalProductGroup

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsVerticalProductGroup from a JSON string
catalogs_vertical_product_group_instance = CatalogsVerticalProductGroup.from_json(json)
# print the JSON string representation of the object
print CatalogsVerticalProductGroup.to_json()

# convert the object into a dict
catalogs_vertical_product_group_dict = catalogs_vertical_product_group_instance.to_dict()
# create an instance of CatalogsVerticalProductGroup from a dict
catalogs_vertical_product_group_from_dict = CatalogsVerticalProductGroup.from_dict(catalogs_vertical_product_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



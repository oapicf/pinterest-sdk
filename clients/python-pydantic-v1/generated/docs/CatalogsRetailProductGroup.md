# CatalogsRetailProductGroup


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog ID pertaining to the product group. | 
**catalog_type** | **str** |  | 
**country** | **str** |  | [optional] 
**created_at** | **int** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**description** | **str** |  | [optional] 
**feed_id** | **str** | id of the catalogs feed belonging to this catalog product group | 
**filters** | [**CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**id** | **str** | ID of the catalog product group. | 
**is_featured** | **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**locale** | **str** |  | [optional] 
**name** | **str** | Name of catalog product group | [optional] 
**status** | [**CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] 
**type** | [**CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | 
**updated_at** | **int** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 

## Example

```python
from openapi_client.models.catalogs_retail_product_group import CatalogsRetailProductGroup

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailProductGroup from a JSON string
catalogs_retail_product_group_instance = CatalogsRetailProductGroup.from_json(json)
# print the JSON string representation of the object
print CatalogsRetailProductGroup.to_json()

# convert the object into a dict
catalogs_retail_product_group_dict = catalogs_retail_product_group_instance.to_dict()
# create an instance of CatalogsRetailProductGroup from a dict
catalogs_retail_product_group_from_dict = CatalogsRetailProductGroup.from_dict(catalogs_retail_product_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



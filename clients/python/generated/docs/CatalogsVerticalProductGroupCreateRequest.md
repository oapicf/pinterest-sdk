# CatalogsVerticalProductGroupCreateRequest

Request object for creating a catalog based product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the creative assets product group. | 
**catalog_type** | **str** |  | 
**country** | [**Country**](Country.md) |  | [optional] 
**description** | **str** |  | [optional] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] 
**name** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_vertical_product_group_create_request import CatalogsVerticalProductGroupCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsVerticalProductGroupCreateRequest from a JSON string
catalogs_vertical_product_group_create_request_instance = CatalogsVerticalProductGroupCreateRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsVerticalProductGroupCreateRequest.to_json())

# convert the object into a dict
catalogs_vertical_product_group_create_request_dict = catalogs_vertical_product_group_create_request_instance.to_dict()
# create an instance of CatalogsVerticalProductGroupCreateRequest from a dict
catalogs_vertical_product_group_create_request_from_dict = CatalogsVerticalProductGroupCreateRequest.from_dict(catalogs_vertical_product_group_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



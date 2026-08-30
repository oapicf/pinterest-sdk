# CatalogsVerticalProductGroupUpdateRequest

Request object for updating a catalog based product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | [optional] 
**country** | [**Country**](Country.md) |  | [optional] 
**description** | **str** |  | [optional] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | [optional] 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] 
**name** | **str** | Name of catalog product group | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_vertical_product_group_update_request import CatalogsVerticalProductGroupUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsVerticalProductGroupUpdateRequest from a JSON string
catalogs_vertical_product_group_update_request_instance = CatalogsVerticalProductGroupUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsVerticalProductGroupUpdateRequest.to_json())

# convert the object into a dict
catalogs_vertical_product_group_update_request_dict = catalogs_vertical_product_group_update_request_instance.to_dict()
# create an instance of CatalogsVerticalProductGroupUpdateRequest from a dict
catalogs_vertical_product_group_update_request_from_dict = CatalogsVerticalProductGroupUpdateRequest.from_dict(catalogs_vertical_product_group_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CatalogsCreativeAssetsProductGroupUpdateRequest

Request object for updating a creative assets product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | [optional] 
**name** | **str** | Name of catalog product group | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_creative_assets_product_group_update_request import CatalogsCreativeAssetsProductGroupUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsProductGroupUpdateRequest from a JSON string
catalogs_creative_assets_product_group_update_request_instance = CatalogsCreativeAssetsProductGroupUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsCreativeAssetsProductGroupUpdateRequest.to_json())

# convert the object into a dict
catalogs_creative_assets_product_group_update_request_dict = catalogs_creative_assets_product_group_update_request_instance.to_dict()
# create an instance of CatalogsCreativeAssetsProductGroupUpdateRequest from a dict
catalogs_creative_assets_product_group_update_request_from_dict = CatalogsCreativeAssetsProductGroupUpdateRequest.from_dict(catalogs_creative_assets_product_group_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



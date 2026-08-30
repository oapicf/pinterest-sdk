# CatalogsCreativeAssetsProductGroupCreateRequest

Request object for creating a creative assets product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog ID pertaining to the product group. | 
**catalog_type** | **str** |  | 
**description** | **str** |  | [optional] 
**filters** | [**CatalogsCreativeAssetsProductGroupFilters**](CatalogsCreativeAssetsProductGroupFilters.md) |  | 
**name** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_creative_assets_product_group_create_request import CatalogsCreativeAssetsProductGroupCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsProductGroupCreateRequest from a JSON string
catalogs_creative_assets_product_group_create_request_instance = CatalogsCreativeAssetsProductGroupCreateRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsCreativeAssetsProductGroupCreateRequest.to_json())

# convert the object into a dict
catalogs_creative_assets_product_group_create_request_dict = catalogs_creative_assets_product_group_create_request_instance.to_dict()
# create an instance of CatalogsCreativeAssetsProductGroupCreateRequest from a dict
catalogs_creative_assets_product_group_create_request_from_dict = CatalogsCreativeAssetsProductGroupCreateRequest.from_dict(catalogs_creative_assets_product_group_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



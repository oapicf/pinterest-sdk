# CatalogsProductGroupCreateRequest

Request object for creating a product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**feed_id** | **str** | Catalog Feed id pertaining to the catalog product group. | 
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**is_featured** | **bool** | boolean indicator of whether the product group is being featured or not | [optional] [default to False]
**name** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_product_group_create_request import CatalogsProductGroupCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupCreateRequest from a JSON string
catalogs_product_group_create_request_instance = CatalogsProductGroupCreateRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsProductGroupCreateRequest.to_json())

# convert the object into a dict
catalogs_product_group_create_request_dict = catalogs_product_group_create_request_instance.to_dict()
# create an instance of CatalogsProductGroupCreateRequest from a dict
catalogs_product_group_create_request_from_dict = CatalogsProductGroupCreateRequest.from_dict(catalogs_product_group_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



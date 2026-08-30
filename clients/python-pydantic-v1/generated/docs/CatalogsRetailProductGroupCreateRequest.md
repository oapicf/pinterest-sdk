# CatalogsRetailProductGroupCreateRequest

Request object for creating a product group.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog ID pertaining to the product group. | 
**catalog_type** | **str** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | 
**country** | [**Country**](Country.md) |  | [optional] 
**description** | **str** |  | [optional] 
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] 
**name** | **str** |  | 

## Example

```python
from openapi_client.models.catalogs_retail_product_group_create_request import CatalogsRetailProductGroupCreateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailProductGroupCreateRequest from a JSON string
catalogs_retail_product_group_create_request_instance = CatalogsRetailProductGroupCreateRequest.from_json(json)
# print the JSON string representation of the object
print CatalogsRetailProductGroupCreateRequest.to_json()

# convert the object into a dict
catalogs_retail_product_group_create_request_dict = catalogs_retail_product_group_create_request_instance.to_dict()
# create an instance of CatalogsRetailProductGroupCreateRequest from a dict
catalogs_retail_product_group_create_request_from_dict = CatalogsRetailProductGroupCreateRequest.from_dict(catalogs_retail_product_group_create_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CatalogsRetailProductGroupUpdateRequest

Request object for updating a retail product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. | [optional] 
**country** | [**Country**](Country.md) |  | [optional] 
**description** | **str** |  | [optional] 
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] 
**locale** | [**CatalogsLocale**](CatalogsLocale.md) |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_retail_product_group_update_request import CatalogsRetailProductGroupUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailProductGroupUpdateRequest from a JSON string
catalogs_retail_product_group_update_request_instance = CatalogsRetailProductGroupUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsRetailProductGroupUpdateRequest.to_json())

# convert the object into a dict
catalogs_retail_product_group_update_request_dict = catalogs_retail_product_group_update_request_instance.to_dict()
# create an instance of CatalogsRetailProductGroupUpdateRequest from a dict
catalogs_retail_product_group_update_request_from_dict = CatalogsRetailProductGroupUpdateRequest.from_dict(catalogs_retail_product_group_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



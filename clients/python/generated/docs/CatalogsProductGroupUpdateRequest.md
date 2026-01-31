# CatalogsProductGroupUpdateRequest

Request object for updating a product group.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] 
**is_featured** | **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_product_group_update_request import CatalogsProductGroupUpdateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupUpdateRequest from a JSON string
catalogs_product_group_update_request_instance = CatalogsProductGroupUpdateRequest.from_json(json)
# print the JSON string representation of the object
print(CatalogsProductGroupUpdateRequest.to_json())

# convert the object into a dict
catalogs_product_group_update_request_dict = catalogs_product_group_update_request_instance.to_dict()
# create an instance of CatalogsProductGroupUpdateRequest from a dict
catalogs_product_group_update_request_from_dict = CatalogsProductGroupUpdateRequest.from_dict(catalogs_product_group_update_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



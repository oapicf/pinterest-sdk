# CatalogsProductGroupUpdateManyRequestItemsOneOfItems0


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] 
**is_featured** | **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**name** | **str** |  | [optional] 
**id** | **str** | ID of the product group. | 

## Example

```python
from openapi_client.models.catalogs_product_group_update_many_request_items_one_of_items0 import CatalogsProductGroupUpdateManyRequestItemsOneOfItems0

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 from a JSON string
catalogs_product_group_update_many_request_items_one_of_items0_instance = CatalogsProductGroupUpdateManyRequestItemsOneOfItems0.from_json(json)
# print the JSON string representation of the object
print CatalogsProductGroupUpdateManyRequestItemsOneOfItems0.to_json()

# convert the object into a dict
catalogs_product_group_update_many_request_items_one_of_items0_dict = catalogs_product_group_update_many_request_items_one_of_items0_instance.to_dict()
# create an instance of CatalogsProductGroupUpdateManyRequestItemsOneOfItems0 from a dict
catalogs_product_group_update_many_request_items_one_of_items0_from_dict = CatalogsProductGroupUpdateManyRequestItemsOneOfItems0.from_dict(catalogs_product_group_update_many_request_items_one_of_items0_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



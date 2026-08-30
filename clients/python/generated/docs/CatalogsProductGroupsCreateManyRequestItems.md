# CatalogsProductGroupsCreateManyRequestItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**feed_id** | **str** | Catalog Feed id pertaining to the catalog product group. | 
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**is_featured** | **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**name** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_product_groups_create_many_request_items import CatalogsProductGroupsCreateManyRequestItems

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupsCreateManyRequestItems from a JSON string
catalogs_product_groups_create_many_request_items_instance = CatalogsProductGroupsCreateManyRequestItems.from_json(json)
# print the JSON string representation of the object
print(CatalogsProductGroupsCreateManyRequestItems.to_json())

# convert the object into a dict
catalogs_product_groups_create_many_request_items_dict = catalogs_product_groups_create_many_request_items_instance.to_dict()
# create an instance of CatalogsProductGroupsCreateManyRequestItems from a dict
catalogs_product_groups_create_many_request_items_from_dict = CatalogsProductGroupsCreateManyRequestItems.from_dict(catalogs_product_groups_create_many_request_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



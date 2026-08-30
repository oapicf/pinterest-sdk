# CatalogsProductGroupsCreateRequestSchema


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
from pinterestsdk.models.catalogs_product_groups_create_request_schema import CatalogsProductGroupsCreateRequestSchema

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupsCreateRequestSchema from a JSON string
catalogs_product_groups_create_request_schema_instance = CatalogsProductGroupsCreateRequestSchema.from_json(json)
# print the JSON string representation of the object
print(CatalogsProductGroupsCreateRequestSchema.to_json())

# convert the object into a dict
catalogs_product_groups_create_request_schema_dict = catalogs_product_groups_create_request_schema_instance.to_dict()
# create an instance of CatalogsProductGroupsCreateRequestSchema from a dict
catalogs_product_groups_create_request_schema_from_dict = CatalogsProductGroupsCreateRequestSchema.from_dict(catalogs_product_groups_create_request_schema_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



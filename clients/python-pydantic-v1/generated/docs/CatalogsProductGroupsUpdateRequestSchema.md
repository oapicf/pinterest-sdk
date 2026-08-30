# CatalogsProductGroupsUpdateRequestSchema


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** |  | [optional] 
**filters** | [**CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | [optional] 
**is_featured** | **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.catalogs_product_groups_update_request_schema import CatalogsProductGroupsUpdateRequestSchema

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupsUpdateRequestSchema from a JSON string
catalogs_product_groups_update_request_schema_instance = CatalogsProductGroupsUpdateRequestSchema.from_json(json)
# print the JSON string representation of the object
print CatalogsProductGroupsUpdateRequestSchema.to_json()

# convert the object into a dict
catalogs_product_groups_update_request_schema_dict = catalogs_product_groups_update_request_schema_instance.to_dict()
# create an instance of CatalogsProductGroupsUpdateRequestSchema from a dict
catalogs_product_groups_update_request_schema_from_dict = CatalogsProductGroupsUpdateRequestSchema.from_dict(catalogs_product_groups_update_request_schema_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



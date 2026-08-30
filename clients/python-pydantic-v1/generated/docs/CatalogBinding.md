# CatalogBinding

Information about a catalog asset.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** | Catalog type | [optional] 
**id** | **str** | Catalog ID. | [optional] 
**name** | **str** | Catalog name | [optional] 

## Example

```python
from openapi_client.models.catalog_binding import CatalogBinding

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogBinding from a JSON string
catalog_binding_instance = CatalogBinding.from_json(json)
# print the JSON string representation of the object
print CatalogBinding.to_json()

# convert the object into a dict
catalog_binding_dict = catalog_binding_instance.to_dict()
# create an instance of CatalogBinding from a dict
catalog_binding_from_dict = CatalogBinding.from_dict(catalog_binding_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



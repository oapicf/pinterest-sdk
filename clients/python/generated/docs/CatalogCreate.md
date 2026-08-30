# CatalogCreate

Resource create operation model.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**name** | **str** | A human-friendly name associated to a catalog entity. | 

## Example

```python
from pinterestsdk.models.catalog_create import CatalogCreate

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogCreate from a JSON string
catalog_create_instance = CatalogCreate.from_json(json)
# print the JSON string representation of the object
print(CatalogCreate.to_json())

# convert the object into a dict
catalog_create_dict = catalog_create_instance.to_dict()
# create an instance of CatalogCreate from a dict
catalog_create_from_dict = CatalogCreate.from_dict(catalog_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



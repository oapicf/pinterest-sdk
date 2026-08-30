# Catalog

Catalog entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | [**CatalogsType**](CatalogsType.md) |  | 
**created_at** | **datetime** |  | [readonly] 
**id** | **str** | ID of the catalog entity. | 
**name** | **str** | A human-friendly name associated to a catalog entity. | 
**updated_at** | **datetime** |  | [readonly] 

## Example

```python
from pinterestsdk.models.catalog import Catalog

# TODO update the JSON string below
json = "{}"
# create an instance of Catalog from a JSON string
catalog_instance = Catalog.from_json(json)
# print the JSON string representation of the object
print(Catalog.to_json())

# convert the object into a dict
catalog_dict = catalog_instance.to_dict()
# create an instance of Catalog from a dict
catalog_from_dict = Catalog.from_dict(catalog_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



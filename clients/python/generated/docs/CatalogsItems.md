# CatalogsItems

Response object of catalogs items

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[ItemResponse]**](ItemResponse.md) | Array with catalogs items | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_items import CatalogsItems

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsItems from a JSON string
catalogs_items_instance = CatalogsItems.from_json(json)
# print the JSON string representation of the object
print(CatalogsItems.to_json())

# convert the object into a dict
catalogs_items_dict = catalogs_items_instance.to_dict()
# create an instance of CatalogsItems from a dict
catalogs_items_from_dict = CatalogsItems.from_dict(catalogs_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



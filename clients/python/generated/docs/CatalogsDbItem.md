# CatalogsDbItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **datetime** |  | 
**id** | **str** |  | 
**updated_at** | **datetime** |  | 

## Example

```python
from pinterestsdk.models.catalogs_db_item import CatalogsDbItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsDbItem from a JSON string
catalogs_db_item_instance = CatalogsDbItem.from_json(json)
# print the JSON string representation of the object
print(CatalogsDbItem.to_json())

# convert the object into a dict
catalogs_db_item_dict = catalogs_db_item_instance.to_dict()
# create an instance of CatalogsDbItem from a dict
catalogs_db_item_from_dict = CatalogsDbItem.from_dict(catalogs_db_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



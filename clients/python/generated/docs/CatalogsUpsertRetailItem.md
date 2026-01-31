# CatalogsUpsertRetailItem

An item to be upserted

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**ItemAttributesRequest**](ItemAttributesRequest.md) |  | 
**item_id** | **str** | The catalog item id in the merchant namespace | 
**operation** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_upsert_retail_item import CatalogsUpsertRetailItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsUpsertRetailItem from a JSON string
catalogs_upsert_retail_item_instance = CatalogsUpsertRetailItem.from_json(json)
# print the JSON string representation of the object
print(CatalogsUpsertRetailItem.to_json())

# convert the object into a dict
catalogs_upsert_retail_item_dict = catalogs_upsert_retail_item_instance.to_dict()
# create an instance of CatalogsUpsertRetailItem from a dict
catalogs_upsert_retail_item_from_dict = CatalogsUpsertRetailItem.from_dict(catalogs_upsert_retail_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



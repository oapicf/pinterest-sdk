# CatalogsUpsertCreativeAssetsItem

A creative assets item to be upserted.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | 
**creative_assets_id** | **str** | The catalog creative assets id in the merchant namespace | 
**operation** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_upsert_creative_assets_item import CatalogsUpsertCreativeAssetsItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsUpsertCreativeAssetsItem from a JSON string
catalogs_upsert_creative_assets_item_instance = CatalogsUpsertCreativeAssetsItem.from_json(json)
# print the JSON string representation of the object
print(CatalogsUpsertCreativeAssetsItem.to_json())

# convert the object into a dict
catalogs_upsert_creative_assets_item_dict = catalogs_upsert_creative_assets_item_instance.to_dict()
# create an instance of CatalogsUpsertCreativeAssetsItem from a dict
catalogs_upsert_creative_assets_item_from_dict = CatalogsUpsertCreativeAssetsItem.from_dict(catalogs_upsert_creative_assets_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CatalogsDeleteCreativeAssetsItem

A creative assets item to be deleted

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creative_assets_id** | **str** | The catalog creative assets id in the merchant namespace | 
**operation** | **str** |  | 

## Example

```python
from openapi_client.models.catalogs_delete_creative_assets_item import CatalogsDeleteCreativeAssetsItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsDeleteCreativeAssetsItem from a JSON string
catalogs_delete_creative_assets_item_instance = CatalogsDeleteCreativeAssetsItem.from_json(json)
# print the JSON string representation of the object
print CatalogsDeleteCreativeAssetsItem.to_json()

# convert the object into a dict
catalogs_delete_creative_assets_item_dict = catalogs_delete_creative_assets_item_instance.to_dict()
# create an instance of CatalogsDeleteCreativeAssetsItem from a dict
catalogs_delete_creative_assets_item_from_dict = CatalogsDeleteCreativeAssetsItem.from_dict(catalogs_delete_creative_assets_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CatalogsUpdateCreativeAssetsItem

A creative assets item to be updated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsUpdatableCreativeAssetsAttributes**](CatalogsUpdatableCreativeAssetsAttributes.md) |  | 
**creative_assets_id** | **str** | The catalog creative assets item id in the merchant namespace | 
**operation** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_update_creative_assets_item import CatalogsUpdateCreativeAssetsItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsUpdateCreativeAssetsItem from a JSON string
catalogs_update_creative_assets_item_instance = CatalogsUpdateCreativeAssetsItem.from_json(json)
# print the JSON string representation of the object
print(CatalogsUpdateCreativeAssetsItem.to_json())

# convert the object into a dict
catalogs_update_creative_assets_item_dict = catalogs_update_creative_assets_item_instance.to_dict()
# create an instance of CatalogsUpdateCreativeAssetsItem from a dict
catalogs_update_creative_assets_item_from_dict = CatalogsUpdateCreativeAssetsItem.from_dict(catalogs_update_creative_assets_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



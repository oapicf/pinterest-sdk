# CatalogsCreativeAssetsBatchItem

Creative assets batch item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsUpdatableCreativeAssetsAttributes**](CatalogsUpdatableCreativeAssetsAttributes.md) |  | 
**creative_assets_id** | **str** | The catalog creative assets id in the merchant namespace | 
**operation** | **str** |  | 

## Example

```python
from pinterestsdk.models.catalogs_creative_assets_batch_item import CatalogsCreativeAssetsBatchItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsBatchItem from a JSON string
catalogs_creative_assets_batch_item_instance = CatalogsCreativeAssetsBatchItem.from_json(json)
# print the JSON string representation of the object
print(CatalogsCreativeAssetsBatchItem.to_json())

# convert the object into a dict
catalogs_creative_assets_batch_item_dict = catalogs_creative_assets_batch_item_instance.to_dict()
# create an instance of CatalogsCreativeAssetsBatchItem from a dict
catalogs_creative_assets_batch_item_from_dict = CatalogsCreativeAssetsBatchItem.from_dict(catalogs_creative_assets_batch_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



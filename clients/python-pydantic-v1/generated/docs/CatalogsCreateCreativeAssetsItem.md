# CatalogsCreateCreativeAssetsItem

A creative assets item to be created.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**CatalogsCreativeAssetsAttributes**](CatalogsCreativeAssetsAttributes.md) |  | 
**creative_assets_id** | **str** | The catalog creative assets id in the merchant namespace | 
**operation** | **str** |  | 

## Example

```python
from openapi_client.models.catalogs_create_creative_assets_item import CatalogsCreateCreativeAssetsItem

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreateCreativeAssetsItem from a JSON string
catalogs_create_creative_assets_item_instance = CatalogsCreateCreativeAssetsItem.from_json(json)
# print the JSON string representation of the object
print CatalogsCreateCreativeAssetsItem.to_json()

# convert the object into a dict
catalogs_create_creative_assets_item_dict = catalogs_create_creative_assets_item_instance.to_dict()
# create an instance of CatalogsCreateCreativeAssetsItem from a dict
catalogs_create_creative_assets_item_from_dict = CatalogsCreateCreativeAssetsItem.from_dict(catalogs_create_creative_assets_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



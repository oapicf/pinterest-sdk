# CatalogsCreativeAssetsProductMetadata

Creative assets product metadata entity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creative_assets_id** | **str** | The user-created unique ID that represents the creative assets item. | 
**visibility** | [**CreativeAssetsVisibilityType**](CreativeAssetsVisibilityType.md) |  | 

## Example

```python
from openapi_client.models.catalogs_creative_assets_product_metadata import CatalogsCreativeAssetsProductMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsProductMetadata from a JSON string
catalogs_creative_assets_product_metadata_instance = CatalogsCreativeAssetsProductMetadata.from_json(json)
# print the JSON string representation of the object
print CatalogsCreativeAssetsProductMetadata.to_json()

# convert the object into a dict
catalogs_creative_assets_product_metadata_dict = catalogs_creative_assets_product_metadata_instance.to_dict()
# create an instance of CatalogsCreativeAssetsProductMetadata from a dict
catalogs_creative_assets_product_metadata_from_dict = CatalogsCreativeAssetsProductMetadata.from_dict(catalogs_creative_assets_product_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CatalogsCreativeAssetsProduct


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**metadata** | [**CatalogsCreativeAssetsProductMetadata**](CatalogsCreativeAssetsProductMetadata.md) |  | 
**pin** | [**Pin**](Pin.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_creative_assets_product import CatalogsCreativeAssetsProduct

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsProduct from a JSON string
catalogs_creative_assets_product_instance = CatalogsCreativeAssetsProduct.from_json(json)
# print the JSON string representation of the object
print(CatalogsCreativeAssetsProduct.to_json())

# convert the object into a dict
catalogs_creative_assets_product_dict = catalogs_creative_assets_product_instance.to_dict()
# create an instance of CatalogsCreativeAssetsProduct from a dict
catalogs_creative_assets_product_from_dict = CatalogsCreativeAssetsProduct.from_dict(catalogs_creative_assets_product_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



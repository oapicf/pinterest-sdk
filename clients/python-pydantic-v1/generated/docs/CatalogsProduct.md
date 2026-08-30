# CatalogsProduct


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**metadata** | [**CatalogsCreativeAssetsProductMetadata**](CatalogsCreativeAssetsProductMetadata.md) |  | 
**pin** | [**Pin**](Pin.md) |  | 

## Example

```python
from openapi_client.models.catalogs_product import CatalogsProduct

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProduct from a JSON string
catalogs_product_instance = CatalogsProduct.from_json(json)
# print the JSON string representation of the object
print CatalogsProduct.to_json()

# convert the object into a dict
catalogs_product_dict = catalogs_product_instance.to_dict()
# create an instance of CatalogsProduct from a dict
catalogs_product_from_dict = CatalogsProduct.from_dict(catalogs_product_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



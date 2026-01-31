# CatalogsRetailProduct


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**metadata** | [**CatalogsRetailProductMetadata**](CatalogsRetailProductMetadata.md) |  | 
**pin** | [**Pin**](Pin.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_retail_product import CatalogsRetailProduct

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailProduct from a JSON string
catalogs_retail_product_instance = CatalogsRetailProduct.from_json(json)
# print the JSON string representation of the object
print(CatalogsRetailProduct.to_json())

# convert the object into a dict
catalogs_retail_product_dict = catalogs_retail_product_instance.to_dict()
# create an instance of CatalogsRetailProduct from a dict
catalogs_retail_product_from_dict = CatalogsRetailProduct.from_dict(catalogs_retail_product_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



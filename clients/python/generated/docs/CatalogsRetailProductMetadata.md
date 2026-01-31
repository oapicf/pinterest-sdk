# CatalogsRetailProductMetadata

Retail product metadata entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availability** | [**NonNullableProductAvailabilityType**](NonNullableProductAvailabilityType.md) |  | 
**currency** | [**NonNullableCatalogsCurrency**](NonNullableCatalogsCurrency.md) |  | 
**item_group_id** | **str** | The parent ID of the product. | 
**item_id** | **str** | The user-created unique ID that represents the product. | 
**price** | **float** | The price of the product. | 
**sale_price** | **float** | The discounted price of the product. | 

## Example

```python
from pinterestsdk.models.catalogs_retail_product_metadata import CatalogsRetailProductMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsRetailProductMetadata from a JSON string
catalogs_retail_product_metadata_instance = CatalogsRetailProductMetadata.from_json(json)
# print the JSON string representation of the object
print(CatalogsRetailProductMetadata.to_json())

# convert the object into a dict
catalogs_retail_product_metadata_dict = catalogs_retail_product_metadata_instance.to_dict()
# create an instance of CatalogsRetailProductMetadata from a dict
catalogs_retail_product_metadata_from_dict = CatalogsRetailProductMetadata.from_dict(catalogs_retail_product_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



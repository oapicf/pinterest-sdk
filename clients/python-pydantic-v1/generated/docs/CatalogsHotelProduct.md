# CatalogsHotelProduct


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**metadata** | [**CatalogsHotelProductMetadata**](CatalogsHotelProductMetadata.md) |  | 
**pin** | [**Pin**](Pin.md) |  | 

## Example

```python
from openapi_client.models.catalogs_hotel_product import CatalogsHotelProduct

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelProduct from a JSON string
catalogs_hotel_product_instance = CatalogsHotelProduct.from_json(json)
# print the JSON string representation of the object
print CatalogsHotelProduct.to_json()

# convert the object into a dict
catalogs_hotel_product_dict = catalogs_hotel_product_instance.to_dict()
# create an instance of CatalogsHotelProduct from a dict
catalogs_hotel_product_from_dict = CatalogsHotelProduct.from_dict(catalogs_hotel_product_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



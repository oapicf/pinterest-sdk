# CatalogsHotelProductMetadata

Hotel product metadata entity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hotel_id** | **str** | The user-created unique ID that represents the hotel item. | 

## Example

```python
from openapi_client.models.catalogs_hotel_product_metadata import CatalogsHotelProductMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelProductMetadata from a JSON string
catalogs_hotel_product_metadata_instance = CatalogsHotelProductMetadata.from_json(json)
# print the JSON string representation of the object
print CatalogsHotelProductMetadata.to_json()

# convert the object into a dict
catalogs_hotel_product_metadata_dict = catalogs_hotel_product_metadata_instance.to_dict()
# create an instance of CatalogsHotelProductMetadata from a dict
catalogs_hotel_product_metadata_from_dict = CatalogsHotelProductMetadata.from_dict(catalogs_hotel_product_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CatalogsHotelAddress


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addr1** | **str** | Primary street address of hotel. | [optional] 
**city** | **str** | City where the hotel is located. | [optional] 
**country** | **str** | Country where the hotel is located. | [optional] 
**postal_code** | **str** | Required for countries with a postal code system. Postal or zip code of the hotel. | [optional] 
**region** | **str** | State, county, province, where the hotel is located. | [optional] 

## Example

```python
from openapi_client.models.catalogs_hotel_address import CatalogsHotelAddress

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelAddress from a JSON string
catalogs_hotel_address_instance = CatalogsHotelAddress.from_json(json)
# print the JSON string representation of the object
print CatalogsHotelAddress.to_json()

# convert the object into a dict
catalogs_hotel_address_dict = catalogs_hotel_address_instance.to_dict()
# create an instance of CatalogsHotelAddress from a dict
catalogs_hotel_address_from_dict = CatalogsHotelAddress.from_dict(catalogs_hotel_address_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



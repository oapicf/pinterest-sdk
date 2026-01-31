# CatalogsHotelProductGroupFilters

Object holding a group of filters for a hotel product group

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**any_of** | [**List[CatalogsHotelProductGroupFilterKeys]**](CatalogsHotelProductGroupFilterKeys.md) |  | 
**all_of** | [**List[CatalogsHotelProductGroupFilterKeys]**](CatalogsHotelProductGroupFilterKeys.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_hotel_product_group_filters import CatalogsHotelProductGroupFilters

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelProductGroupFilters from a JSON string
catalogs_hotel_product_group_filters_instance = CatalogsHotelProductGroupFilters.from_json(json)
# print the JSON string representation of the object
print(CatalogsHotelProductGroupFilters.to_json())

# convert the object into a dict
catalogs_hotel_product_group_filters_dict = catalogs_hotel_product_group_filters_instance.to_dict()
# create an instance of CatalogsHotelProductGroupFilters from a dict
catalogs_hotel_product_group_filters_from_dict = CatalogsHotelProductGroupFilters.from_dict(catalogs_hotel_product_group_filters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



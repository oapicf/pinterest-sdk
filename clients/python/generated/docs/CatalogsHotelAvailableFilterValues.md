# CatalogsHotelAvailableFilterValues


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_type** | **str** |  | 
**filter_values** | [**CatalogsHotelFilterValuesMap**](CatalogsHotelFilterValuesMap.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_hotel_available_filter_values import CatalogsHotelAvailableFilterValues

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelAvailableFilterValues from a JSON string
catalogs_hotel_available_filter_values_instance = CatalogsHotelAvailableFilterValues.from_json(json)
# print the JSON string representation of the object
print(CatalogsHotelAvailableFilterValues.to_json())

# convert the object into a dict
catalogs_hotel_available_filter_values_dict = catalogs_hotel_available_filter_values_instance.to_dict()
# create an instance of CatalogsHotelAvailableFilterValues from a dict
catalogs_hotel_available_filter_values_from_dict = CatalogsHotelAvailableFilterValues.from_dict(catalogs_hotel_available_filter_values_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



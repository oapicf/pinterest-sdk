# CatalogsHotelFilterValuesMap

A map of filter attributes to their available values.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**brand** | **List[str]** |  | [optional] 
**custom_label_0** | **List[str]** |  | [optional] 
**custom_label_1** | **List[str]** |  | [optional] 
**custom_label_2** | **List[str]** |  | [optional] 
**custom_label_3** | **List[str]** |  | [optional] 
**custom_label_4** | **List[str]** |  | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_hotel_filter_values_map import CatalogsHotelFilterValuesMap

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelFilterValuesMap from a JSON string
catalogs_hotel_filter_values_map_instance = CatalogsHotelFilterValuesMap.from_json(json)
# print the JSON string representation of the object
print(CatalogsHotelFilterValuesMap.to_json())

# convert the object into a dict
catalogs_hotel_filter_values_map_dict = catalogs_hotel_filter_values_map_instance.to_dict()
# create an instance of CatalogsHotelFilterValuesMap from a dict
catalogs_hotel_filter_values_map_from_dict = CatalogsHotelFilterValuesMap.from_dict(catalogs_hotel_filter_values_map_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# HotelIdFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hotel_id** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 

## Example

```python
from pinterestsdk.models.hotel_id_filter import HotelIdFilter

# TODO update the JSON string below
json = "{}"
# create an instance of HotelIdFilter from a JSON string
hotel_id_filter_instance = HotelIdFilter.from_json(json)
# print the JSON string representation of the object
print(HotelIdFilter.to_json())

# convert the object into a dict
hotel_id_filter_dict = hotel_id_filter_instance.to_dict()
# create an instance of HotelIdFilter from a dict
hotel_id_filter_from_dict = HotelIdFilter.from_dict(hotel_id_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



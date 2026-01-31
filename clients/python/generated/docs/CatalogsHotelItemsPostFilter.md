# CatalogsHotelItemsPostFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] 
**catalog_type** | **str** |  | 
**hotel_ids** | **List[str]** |  | 

## Example

```python
from pinterestsdk.models.catalogs_hotel_items_post_filter import CatalogsHotelItemsPostFilter

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelItemsPostFilter from a JSON string
catalogs_hotel_items_post_filter_instance = CatalogsHotelItemsPostFilter.from_json(json)
# print the JSON string representation of the object
print(CatalogsHotelItemsPostFilter.to_json())

# convert the object into a dict
catalogs_hotel_items_post_filter_dict = catalogs_hotel_items_post_filter_instance.to_dict()
# create an instance of CatalogsHotelItemsPostFilter from a dict
catalogs_hotel_items_post_filter_from_dict = CatalogsHotelItemsPostFilter.from_dict(catalogs_hotel_items_post_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



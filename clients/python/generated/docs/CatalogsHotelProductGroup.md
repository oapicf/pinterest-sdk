# CatalogsHotelProductGroup


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **str** | Catalog ID pertaining to the product group. | 
**catalog_type** | **str** |  | 
**created_at** | **int** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**description** | **str** |  | [optional] 
**filters** | [**CatalogsHotelProductGroupFilters**](CatalogsHotelProductGroupFilters.md) |  | 
**id** | **str** | ID of the catalog product group. | 
**name** | **str** | Name of catalog product group | [optional] 
**type** | [**CatalogsHotelProductGroupType**](CatalogsHotelProductGroupType.md) |  | 
**updated_at** | **int** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 

## Example

```python
from pinterestsdk.models.catalogs_hotel_product_group import CatalogsHotelProductGroup

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelProductGroup from a JSON string
catalogs_hotel_product_group_instance = CatalogsHotelProductGroup.from_json(json)
# print the JSON string representation of the object
print(CatalogsHotelProductGroup.to_json())

# convert the object into a dict
catalogs_hotel_product_group_dict = catalogs_hotel_product_group_instance.to_dict()
# create an instance of CatalogsHotelProductGroup from a dict
catalogs_hotel_product_group_from_dict = CatalogsHotelProductGroup.from_dict(catalogs_hotel_product_group_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



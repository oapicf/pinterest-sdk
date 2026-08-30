# CatalogsHotelProductGroupFilterKeys


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | [**PriceFilterPrice**](PriceFilterPrice.md) |  | 
**hotel_id** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**brand** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**custom_label_0** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**custom_label_1** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**custom_label_2** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**custom_label_3** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**custom_label_4** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**country** | [**CatalogsProductGroupMultipleCountriesCriteria**](CatalogsProductGroupMultipleCountriesCriteria.md) |  | 
**title_keywords** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 

## Example

```python
from openapi_client.models.catalogs_hotel_product_group_filter_keys import CatalogsHotelProductGroupFilterKeys

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelProductGroupFilterKeys from a JSON string
catalogs_hotel_product_group_filter_keys_instance = CatalogsHotelProductGroupFilterKeys.from_json(json)
# print the JSON string representation of the object
print CatalogsHotelProductGroupFilterKeys.to_json()

# convert the object into a dict
catalogs_hotel_product_group_filter_keys_dict = catalogs_hotel_product_group_filter_keys_instance.to_dict()
# create an instance of CatalogsHotelProductGroupFilterKeys from a dict
catalogs_hotel_product_group_filter_keys_from_dict = CatalogsHotelProductGroupFilterKeys.from_dict(catalogs_hotel_product_group_filter_keys_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CatalogsHotelProductGroupFilterKeys


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**price** | [**CatalogsProductGroupPricingCurrencyCriteria**](CatalogsProductGroupPricingCurrencyCriteria.md) |  | 
**hotel_id** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**brand** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**custom_label_0** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**custom_label_1** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**custom_label_2** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**custom_label_3** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**custom_label_4** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**country** | [**CatalogsProductGroupMultipleCountriesCriteria**](.md) |  | 
**title_keywords** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_hotel_product_group_filter_keys import CatalogsHotelProductGroupFilterKeys

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsHotelProductGroupFilterKeys from a JSON string
catalogs_hotel_product_group_filter_keys_instance = CatalogsHotelProductGroupFilterKeys.from_json(json)
# print the JSON string representation of the object
print(CatalogsHotelProductGroupFilterKeys.to_json())

# convert the object into a dict
catalogs_hotel_product_group_filter_keys_dict = catalogs_hotel_product_group_filter_keys_instance.to_dict()
# create an instance of CatalogsHotelProductGroupFilterKeys from a dict
catalogs_hotel_product_group_filter_keys_from_dict = CatalogsHotelProductGroupFilterKeys.from_dict(catalogs_hotel_product_group_filter_keys_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CatalogsBaseFilterKeys

Base filter keys shared across catalog filtering

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**min_price** | [**CatalogsProductGroupPricingCriteria**](CatalogsProductGroupPricingCriteria.md) |  | 
**max_price** | [**CatalogsProductGroupPricingCriteria**](CatalogsProductGroupPricingCriteria.md) |  | 
**currency** | [**CatalogsProductGroupCurrencyCriteria**](CatalogsProductGroupCurrencyCriteria.md) |  | 
**item_id** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**availability** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**brand** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**condition** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**custom_label_0** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**custom_label_1** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**custom_label_2** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**custom_label_3** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**custom_label_4** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**item_group_id** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**gender** | [**CatalogsProductGroupMultipleGenderCriteria**](CatalogsProductGroupMultipleGenderCriteria.md) |  | 
**media_type** | [**CatalogsProductGroupMultipleMediaTypesCriteria**](CatalogsProductGroupMultipleMediaTypesCriteria.md) |  | 
**product_type_4** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**product_type_3** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**product_type_2** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**product_type_1** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**product_type_0** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**google_product_category_6** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**google_product_category_5** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**google_product_category_4** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**google_product_category_3** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**google_product_category_2** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**google_product_category_1** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**google_product_category_0** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**custom_number_0** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**custom_number_1** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**custom_number_2** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**custom_number_3** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**custom_number_4** | [**CatalogsProductGroupUint32Criteria**](CatalogsProductGroupUint32Criteria.md) |  | 
**title_keywords** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**pinterest_product_categories** | [**CatalogsProductGroupMultiplePinterestProductCategoryCriteria**](CatalogsProductGroupMultiplePinterestProductCategoryCriteria.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_base_filter_keys import CatalogsBaseFilterKeys

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsBaseFilterKeys from a JSON string
catalogs_base_filter_keys_instance = CatalogsBaseFilterKeys.from_json(json)
# print the JSON string representation of the object
print(CatalogsBaseFilterKeys.to_json())

# convert the object into a dict
catalogs_base_filter_keys_dict = catalogs_base_filter_keys_instance.to_dict()
# create an instance of CatalogsBaseFilterKeys from a dict
catalogs_base_filter_keys_from_dict = CatalogsBaseFilterKeys.from_dict(catalogs_base_filter_keys_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



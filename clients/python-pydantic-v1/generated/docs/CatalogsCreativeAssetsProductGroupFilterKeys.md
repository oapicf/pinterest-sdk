# CatalogsCreativeAssetsProductGroupFilterKeys


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creative_assets_id** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**custom_label_0** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**custom_label_1** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**custom_label_2** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**custom_label_3** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**custom_label_4** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 
**google_product_category_6** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**google_product_category_5** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**google_product_category_4** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**google_product_category_3** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**google_product_category_2** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**google_product_category_1** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**google_product_category_0** | [**CatalogsProductGroupMultipleStringListCriteria**](CatalogsProductGroupMultipleStringListCriteria.md) |  | 
**media_type** | [**CatalogsProductGroupMultipleMediaTypesCriteria**](CatalogsProductGroupMultipleMediaTypesCriteria.md) |  | 
**title_keywords** | [**CatalogsProductGroupMultipleStringCriteria**](CatalogsProductGroupMultipleStringCriteria.md) |  | 
**link** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](CatalogsProductGroupFilterOperatorTypeCriteria.md) |  | 

## Example

```python
from openapi_client.models.catalogs_creative_assets_product_group_filter_keys import CatalogsCreativeAssetsProductGroupFilterKeys

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsProductGroupFilterKeys from a JSON string
catalogs_creative_assets_product_group_filter_keys_instance = CatalogsCreativeAssetsProductGroupFilterKeys.from_json(json)
# print the JSON string representation of the object
print CatalogsCreativeAssetsProductGroupFilterKeys.to_json()

# convert the object into a dict
catalogs_creative_assets_product_group_filter_keys_dict = catalogs_creative_assets_product_group_filter_keys_instance.to_dict()
# create an instance of CatalogsCreativeAssetsProductGroupFilterKeys from a dict
catalogs_creative_assets_product_group_filter_keys_from_dict = CatalogsCreativeAssetsProductGroupFilterKeys.from_dict(catalogs_creative_assets_product_group_filter_keys_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



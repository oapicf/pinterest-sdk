# CatalogsCreativeAssetsProductGroupFilterKeys


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**creative_assets_id** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 
**custom_label_0** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**custom_label_1** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**custom_label_2** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**custom_label_3** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**custom_label_4** | [**CatalogsProductGroupFilterOperatorTypeCriteria**](.md) |  | 
**google_product_category_6** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**google_product_category_5** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**google_product_category_4** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**google_product_category_3** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**google_product_category_2** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**google_product_category_1** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**google_product_category_0** | [**CatalogsProductGroupMultipleStringListCriteria**](.md) |  | 
**media_type** | [**CatalogsProductGroupMultipleMediaTypesCriteria**](.md) |  | 
**title_keywords** | [**CatalogsProductGroupMultipleStringCriteria**](.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_creative_assets_product_group_filter_keys import CatalogsCreativeAssetsProductGroupFilterKeys

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsCreativeAssetsProductGroupFilterKeys from a JSON string
catalogs_creative_assets_product_group_filter_keys_instance = CatalogsCreativeAssetsProductGroupFilterKeys.from_json(json)
# print the JSON string representation of the object
print(CatalogsCreativeAssetsProductGroupFilterKeys.to_json())

# convert the object into a dict
catalogs_creative_assets_product_group_filter_keys_dict = catalogs_creative_assets_product_group_filter_keys_instance.to_dict()
# create an instance of CatalogsCreativeAssetsProductGroupFilterKeys from a dict
catalogs_creative_assets_product_group_filter_keys_from_dict = CatalogsCreativeAssetsProductGroupFilterKeys.from_dict(catalogs_creative_assets_product_group_filter_keys_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CatalogsProductGroupFilters

Object holding a group of filters for a catalog product group

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**any_of** | [**List[CatalogsProductGroupFilterKeys]**](CatalogsProductGroupFilterKeys.md) |  | 
**all_of** | [**List[CatalogsProductGroupFilterKeys]**](CatalogsProductGroupFilterKeys.md) |  | 

## Example

```python
from pinterestsdk.models.catalogs_product_group_filters import CatalogsProductGroupFilters

# TODO update the JSON string below
json = "{}"
# create an instance of CatalogsProductGroupFilters from a JSON string
catalogs_product_group_filters_instance = CatalogsProductGroupFilters.from_json(json)
# print the JSON string representation of the object
print(CatalogsProductGroupFilters.to_json())

# convert the object into a dict
catalogs_product_group_filters_dict = catalogs_product_group_filters_instance.to_dict()
# create an instance of CatalogsProductGroupFilters from a dict
catalogs_product_group_filters_from_dict = CatalogsProductGroupFilters.from_dict(catalogs_product_group_filters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



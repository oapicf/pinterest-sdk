# PinterestProductCategoriesFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pinterest_product_categories** | [**CatalogsProductGroupMultiplePinterestProductCategoryCriteria**](CatalogsProductGroupMultiplePinterestProductCategoryCriteria.md) |  | 

## Example

```python
from pinterestsdk.models.pinterest_product_categories_filter import PinterestProductCategoriesFilter

# TODO update the JSON string below
json = "{}"
# create an instance of PinterestProductCategoriesFilter from a JSON string
pinterest_product_categories_filter_instance = PinterestProductCategoriesFilter.from_json(json)
# print the JSON string representation of the object
print(PinterestProductCategoriesFilter.to_json())

# convert the object into a dict
pinterest_product_categories_filter_dict = pinterest_product_categories_filter_instance.to_dict()
# create an instance of PinterestProductCategoriesFilter from a dict
pinterest_product_categories_filter_from_dict = PinterestProductCategoriesFilter.from_dict(pinterest_product_categories_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



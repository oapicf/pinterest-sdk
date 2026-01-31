# TrendingProductCategory

Trending shopping product category

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**engagement_type** | [**ProductCategoriesEngagementType**](ProductCategoriesEngagementType.md) | Engagement type | 
**pct_change_mom** | **int** | Month-over-month change percentage | 
**percent_relative_volume** | **int** | Relative volume percentage | 
**product_category** | **str** | Product Category Name | 
**verticals** | [**List[VerticalProductCategory]**](VerticalProductCategory.md) | Vertical name associated with the product category | [optional] 

## Example

```python
from pinterestsdk.models.trending_product_category import TrendingProductCategory

# TODO update the JSON string below
json = "{}"
# create an instance of TrendingProductCategory from a JSON string
trending_product_category_instance = TrendingProductCategory.from_json(json)
# print the JSON string representation of the object
print(TrendingProductCategory.to_json())

# convert the object into a dict
trending_product_category_dict = trending_product_category_instance.to_dict()
# create an instance of TrendingProductCategory from a dict
trending_product_category_from_dict = TrendingProductCategory.from_dict(trending_product_category_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



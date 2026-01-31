# ProductCategoriesMetricsHighlights

Key performance metrics highlights for this product category

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**engagement** | [**InnerProductCategoriesMetricsHighlights**](InnerProductCategoriesMetricsHighlights.md) | Engagement metric value | [optional] 
**outbound_clicks** | [**InnerProductCategoriesMetricsHighlights**](InnerProductCategoriesMetricsHighlights.md) | Number of outbound clicks | [optional] 
**pin_saves** | [**InnerProductCategoriesMetricsHighlights**](InnerProductCategoriesMetricsHighlights.md) | Number of pin saves | [optional] 

## Example

```python
from pinterestsdk.models.product_categories_metrics_highlights import ProductCategoriesMetricsHighlights

# TODO update the JSON string below
json = "{}"
# create an instance of ProductCategoriesMetricsHighlights from a JSON string
product_categories_metrics_highlights_instance = ProductCategoriesMetricsHighlights.from_json(json)
# print the JSON string representation of the object
print(ProductCategoriesMetricsHighlights.to_json())

# convert the object into a dict
product_categories_metrics_highlights_dict = product_categories_metrics_highlights_instance.to_dict()
# create an instance of ProductCategoriesMetricsHighlights from a dict
product_categories_metrics_highlights_from_dict = ProductCategoriesMetricsHighlights.from_dict(product_categories_metrics_highlights_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



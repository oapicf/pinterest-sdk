# ProductGroupAnalyticsResponseInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_date** | **date** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 
**product_group_id** | **str** | The ID of the product group that this metrics belongs to. | 

## Example

```python
from pinterestsdk.models.product_group_analytics_response_inner import ProductGroupAnalyticsResponseInner

# TODO update the JSON string below
json = "{}"
# create an instance of ProductGroupAnalyticsResponseInner from a JSON string
product_group_analytics_response_inner_instance = ProductGroupAnalyticsResponseInner.from_json(json)
# print the JSON string representation of the object
print(ProductGroupAnalyticsResponseInner.to_json())

# convert the object into a dict
product_group_analytics_response_inner_dict = product_group_analytics_response_inner_instance.to_dict()
# create an instance of ProductGroupAnalyticsResponseInner from a dict
product_group_analytics_response_inner_from_dict = ProductGroupAnalyticsResponseInner.from_dict(product_group_analytics_response_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



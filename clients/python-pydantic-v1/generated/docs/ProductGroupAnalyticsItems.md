# ProductGroupAnalyticsItems


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_date** | **date** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] 
**product_group_id** | **str** | The ID of the product group that this metrics belongs to. | 

## Example

```python
from openapi_client.models.product_group_analytics_items import ProductGroupAnalyticsItems

# TODO update the JSON string below
json = "{}"
# create an instance of ProductGroupAnalyticsItems from a JSON string
product_group_analytics_items_instance = ProductGroupAnalyticsItems.from_json(json)
# print the JSON string representation of the object
print ProductGroupAnalyticsItems.to_json()

# convert the object into a dict
product_group_analytics_items_dict = product_group_analytics_items_instance.to_dict()
# create an instance of ProductGroupAnalyticsItems from a dict
product_group_analytics_items_from_dict = ProductGroupAnalyticsItems.from_dict(product_group_analytics_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



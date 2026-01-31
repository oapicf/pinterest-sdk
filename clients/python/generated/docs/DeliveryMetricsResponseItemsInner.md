# DeliveryMetricsResponseItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **str** | Category name | [optional] 
**definition** | **str** | How the metric is defined. | [optional] 
**display_name** | **str** | Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. | [optional] 
**name** | **str** | Metric&#39;s name. | [optional] 

## Example

```python
from pinterestsdk.models.delivery_metrics_response_items_inner import DeliveryMetricsResponseItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryMetricsResponseItemsInner from a JSON string
delivery_metrics_response_items_inner_instance = DeliveryMetricsResponseItemsInner.from_json(json)
# print the JSON string representation of the object
print(DeliveryMetricsResponseItemsInner.to_json())

# convert the object into a dict
delivery_metrics_response_items_inner_dict = delivery_metrics_response_items_inner_instance.to_dict()
# create an instance of DeliveryMetricsResponseItemsInner from a dict
delivery_metrics_response_items_inner_from_dict = DeliveryMetricsResponseItemsInner.from_dict(delivery_metrics_response_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



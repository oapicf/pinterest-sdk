# DeliveryMetricsResponseItemsItems


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **str** | Category name | [optional] 
**definition** | **str** | How the metric is defined. | [optional] 
**display_name** | **str** | Display name, when available. If unavaible it will not be returned. Matches how the metric is named in our native tools like Pinterest Ads Manager. | [optional] 
**name** | **str** | Metric&#39;s name. | [optional] 

## Example

```python
from openapi_client.models.delivery_metrics_response_items_items import DeliveryMetricsResponseItemsItems

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryMetricsResponseItemsItems from a JSON string
delivery_metrics_response_items_items_instance = DeliveryMetricsResponseItemsItems.from_json(json)
# print the JSON string representation of the object
print DeliveryMetricsResponseItemsItems.to_json()

# convert the object into a dict
delivery_metrics_response_items_items_dict = delivery_metrics_response_items_items_instance.to_dict()
# create an instance of DeliveryMetricsResponseItemsItems from a dict
delivery_metrics_response_items_items_from_dict = DeliveryMetricsResponseItemsItems.from_dict(delivery_metrics_response_items_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# DeliveryMetricsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[DeliveryMetricsResponseItemsInner]**](DeliveryMetricsResponseItemsInner.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.delivery_metrics_response import DeliveryMetricsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryMetricsResponse from a JSON string
delivery_metrics_response_instance = DeliveryMetricsResponse.from_json(json)
# print the JSON string representation of the object
print(DeliveryMetricsResponse.to_json())

# convert the object into a dict
delivery_metrics_response_dict = delivery_metrics_response_instance.to_dict()
# create an instance of DeliveryMetricsResponse from a dict
delivery_metrics_response_from_dict = DeliveryMetricsResponse.from_dict(delivery_metrics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# DeliveryMetricsGet200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[DeliveryMetricsResponseItemsItems]**](DeliveryMetricsResponseItemsItems.md) |  | 

## Example

```python
from openapi_client.models.delivery_metrics_get200_response import DeliveryMetricsGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of DeliveryMetricsGet200Response from a JSON string
delivery_metrics_get200_response_instance = DeliveryMetricsGet200Response.from_json(json)
# print the JSON string representation of the object
print DeliveryMetricsGet200Response.to_json()

# convert the object into a dict
delivery_metrics_get200_response_dict = delivery_metrics_get200_response_instance.to_dict()
# create an instance of DeliveryMetricsGet200Response from a dict
delivery_metrics_get200_response_from_dict = DeliveryMetricsGet200Response.from_dict(delivery_metrics_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



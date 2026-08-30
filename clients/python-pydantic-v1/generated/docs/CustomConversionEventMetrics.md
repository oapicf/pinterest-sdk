# CustomConversionEventMetrics


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**custom_event_metrics_type** | [**AdeColumnType**](AdeColumnType.md) |  | 
**custom_event_name** | **str** | Name of the advertiser-defined custom conversion event | 

## Example

```python
from openapi_client.models.custom_conversion_event_metrics import CustomConversionEventMetrics

# TODO update the JSON string below
json = "{}"
# create an instance of CustomConversionEventMetrics from a JSON string
custom_conversion_event_metrics_instance = CustomConversionEventMetrics.from_json(json)
# print the JSON string representation of the object
print CustomConversionEventMetrics.to_json()

# convert the object into a dict
custom_conversion_event_metrics_dict = custom_conversion_event_metrics_instance.to_dict()
# create an instance of CustomConversionEventMetrics from a dict
custom_conversion_event_metrics_from_dict = CustomConversionEventMetrics.from_dict(custom_conversion_event_metrics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



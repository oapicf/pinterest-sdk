# MetricsResponseDataItems


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metrics** | **object** | Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers). | 
**targeting_type** | **str** | The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER) | 
**targeting_value** | **str** | The targeting value for this data item (e.g., &#39;christmas decor ideas&#39;, &#39;iphone&#39;, &#39;female&#39;) | 

## Example

```python
from pinterestsdk.models.metrics_response_data_items import MetricsResponseDataItems

# TODO update the JSON string below
json = "{}"
# create an instance of MetricsResponseDataItems from a JSON string
metrics_response_data_items_instance = MetricsResponseDataItems.from_json(json)
# print the JSON string representation of the object
print(MetricsResponseDataItems.to_json())

# convert the object into a dict
metrics_response_data_items_dict = metrics_response_data_items_instance.to_dict()
# create an instance of MetricsResponseDataItems from a dict
metrics_response_data_items_from_dict = MetricsResponseDataItems.from_dict(metrics_response_data_items_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



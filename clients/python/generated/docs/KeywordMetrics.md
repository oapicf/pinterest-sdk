# KeywordMetrics

Keyword metrics JSON

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyword_query_volume** | **str** | Keyword&#39;s search frequency. This value is based on keyword frequency in pepsi client response | [optional] 

## Example

```python
from pinterestsdk.models.keyword_metrics import KeywordMetrics

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordMetrics from a JSON string
keyword_metrics_instance = KeywordMetrics.from_json(json)
# print the JSON string representation of the object
print(KeywordMetrics.to_json())

# convert the object into a dict
keyword_metrics_dict = keyword_metrics_instance.to_dict()
# create an instance of KeywordMetrics from a dict
keyword_metrics_from_dict = KeywordMetrics.from_dict(keyword_metrics_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



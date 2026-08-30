# KeywordMetricsResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keyword** | **str** | Keyword name, e.g., \&quot;keyword\&quot;:\&quot;fashion outfits\&quot; | [optional] 
**metrics** | [**KeywordMetrics**](KeywordMetrics.md) |  | [optional] 

## Example

```python
from openapi_client.models.keyword_metrics_response import KeywordMetricsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordMetricsResponse from a JSON string
keyword_metrics_response_instance = KeywordMetricsResponse.from_json(json)
# print the JSON string representation of the object
print KeywordMetricsResponse.to_json()

# convert the object into a dict
keyword_metrics_response_dict = keyword_metrics_response_instance.to_dict()
# create an instance of KeywordMetricsResponse from a dict
keyword_metrics_response_from_dict = KeywordMetricsResponse.from_dict(keyword_metrics_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



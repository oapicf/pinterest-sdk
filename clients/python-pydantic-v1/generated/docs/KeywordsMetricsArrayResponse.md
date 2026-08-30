# KeywordsMetricsArrayResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**List[KeywordMetricsResponse]**](KeywordMetricsResponse.md) |  | [optional] 

## Example

```python
from openapi_client.models.keywords_metrics_array_response import KeywordsMetricsArrayResponse

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordsMetricsArrayResponse from a JSON string
keywords_metrics_array_response_instance = KeywordsMetricsArrayResponse.from_json(json)
# print the JSON string representation of the object
print KeywordsMetricsArrayResponse.to_json()

# convert the object into a dict
keywords_metrics_array_response_dict = keywords_metrics_array_response_instance.to_dict()
# create an instance of KeywordsMetricsArrayResponse from a dict
keywords_metrics_array_response_from_dict = KeywordsMetricsArrayResponse.from_dict(keywords_metrics_array_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



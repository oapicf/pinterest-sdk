# TrendingKeywordsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**trends** | [**List[TrendingKeyword]**](TrendingKeyword.md) | The top trending keywords for the specified trend type in the requested region. Results are ordered, with the first element in the array representing the #1 top trend. | [optional] 

## Example

```python
from pinterestsdk.models.trending_keywords_response import TrendingKeywordsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of TrendingKeywordsResponse from a JSON string
trending_keywords_response_instance = TrendingKeywordsResponse.from_json(json)
# print the JSON string representation of the object
print(TrendingKeywordsResponse.to_json())

# convert the object into a dict
trending_keywords_response_dict = trending_keywords_response_instance.to_dict()
# create an instance of TrendingKeywordsResponse from a dict
trending_keywords_response_from_dict = TrendingKeywordsResponse.from_dict(trending_keywords_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



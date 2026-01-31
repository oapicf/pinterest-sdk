# KeywordsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[KeywordError]**](KeywordError.md) |  | [optional] 
**keywords** | [**List[Keyword]**](Keyword.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.keywords_response import KeywordsResponse

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordsResponse from a JSON string
keywords_response_instance = KeywordsResponse.from_json(json)
# print the JSON string representation of the object
print(KeywordsResponse.to_json())

# convert the object into a dict
keywords_response_dict = keywords_response_instance.to_dict()
# create an instance of KeywordsResponse from a dict
keywords_response_from_dict = KeywordsResponse.from_dict(keywords_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



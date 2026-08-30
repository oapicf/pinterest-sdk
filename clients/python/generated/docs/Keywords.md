# Keywords


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**List[KeywordError]**](KeywordError.md) | Keyword error | [readonly] 
**keywords** | [**List[Keyword]**](Keyword.md) | Keywords | 

## Example

```python
from pinterestsdk.models.keywords import Keywords

# TODO update the JSON string below
json = "{}"
# create an instance of Keywords from a JSON string
keywords_instance = Keywords.from_json(json)
# print the JSON string representation of the object
print(Keywords.to_json())

# convert the object into a dict
keywords_dict = keywords_instance.to_dict()
# create an instance of Keywords from a dict
keywords_from_dict = Keywords.from_dict(keywords_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



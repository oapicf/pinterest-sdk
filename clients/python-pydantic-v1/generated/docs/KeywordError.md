# KeywordError


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**Keyword**](Keyword.md) |  | [optional] 
**error_messages** | **List[str]** |  | [optional] 

## Example

```python
from openapi_client.models.keyword_error import KeywordError

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordError from a JSON string
keyword_error_instance = KeywordError.from_json(json)
# print the JSON string representation of the object
print KeywordError.to_json()

# convert the object into a dict
keyword_error_dict = keyword_error_instance.to_dict()
# create an instance of KeywordError from a dict
keyword_error_from_dict = KeywordError.from_dict(keyword_error_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



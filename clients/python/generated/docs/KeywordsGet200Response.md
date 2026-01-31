# KeywordsGet200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[Keyword]**](Keyword.md) |  | 

## Example

```python
from pinterestsdk.models.keywords_get200_response import KeywordsGet200Response

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordsGet200Response from a JSON string
keywords_get200_response_instance = KeywordsGet200Response.from_json(json)
# print the JSON string representation of the object
print(KeywordsGet200Response.to_json())

# convert the object into a dict
keywords_get200_response_dict = keywords_get200_response_instance.to_dict()
# create an instance of KeywordsGet200Response from a dict
keywords_get200_response_from_dict = KeywordsGet200Response.from_dict(keywords_get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



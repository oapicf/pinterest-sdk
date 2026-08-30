# KeywordsUpdate

Resource create or update operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keywords** | [**List[KeywordUpdateItem]**](KeywordUpdateItem.md) | Keywords | [optional] 

## Example

```python
from openapi_client.models.keywords_update import KeywordsUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordsUpdate from a JSON string
keywords_update_instance = KeywordsUpdate.from_json(json)
# print the JSON string representation of the object
print KeywordsUpdate.to_json()

# convert the object into a dict
keywords_update_dict = keywords_update_instance.to_dict()
# create an instance of KeywordsUpdate from a dict
keywords_update_from_dict = KeywordsUpdate.from_dict(keywords_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



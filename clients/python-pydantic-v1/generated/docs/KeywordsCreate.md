# KeywordsCreate

Resource create operation model.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keywords** | [**List[KeywordCreateItem]**](KeywordCreateItem.md) | Keywords | 
**parent_id** | **str** | Keyword data | 

## Example

```python
from openapi_client.models.keywords_create import KeywordsCreate

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordsCreate from a JSON string
keywords_create_instance = KeywordsCreate.from_json(json)
# print the JSON string representation of the object
print KeywordsCreate.to_json()

# convert the object into a dict
keywords_create_dict = keywords_create_instance.to_dict()
# create an instance of KeywordsCreate from a dict
keywords_create_from_dict = KeywordsCreate.from_dict(keywords_create_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



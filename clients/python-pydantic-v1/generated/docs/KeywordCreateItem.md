# KeywordCreateItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid** | **int** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**match_type** | [**MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | 
**value** | **str** | Keyword value (120 chars max). | 

## Example

```python
from openapi_client.models.keyword_create_item import KeywordCreateItem

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordCreateItem from a JSON string
keyword_create_item_instance = KeywordCreateItem.from_json(json)
# print the JSON string representation of the object
print KeywordCreateItem.to_json()

# convert the object into a dict
keyword_create_item_dict = keyword_create_item_instance.to_dict()
# create an instance of KeywordCreateItem from a dict
keyword_create_item_from_dict = KeywordCreateItem.from_dict(keyword_create_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



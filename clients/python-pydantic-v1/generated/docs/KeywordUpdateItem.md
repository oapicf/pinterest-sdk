# KeywordUpdateItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **bool** |  | [optional] 
**bid** | **int** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**id** | **str** | Keyword ID . | 

## Example

```python
from openapi_client.models.keyword_update_item import KeywordUpdateItem

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordUpdateItem from a JSON string
keyword_update_item_instance = KeywordUpdateItem.from_json(json)
# print the JSON string representation of the object
print KeywordUpdateItem.to_json()

# convert the object into a dict
keyword_update_item_dict = keyword_update_item_instance.to_dict()
# create an instance of KeywordUpdateItem from a dict
keyword_update_item_from_dict = KeywordUpdateItem.from_dict(keyword_update_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



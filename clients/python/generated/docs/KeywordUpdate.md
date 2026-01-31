# KeywordUpdate


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **bool** | Is keyword archived? | [optional] 
**bid** | **int** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**id** | **str** | Keyword ID. | 

## Example

```python
from pinterestsdk.models.keyword_update import KeywordUpdate

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordUpdate from a JSON string
keyword_update_instance = KeywordUpdate.from_json(json)
# print the JSON string representation of the object
print(KeywordUpdate.to_json())

# convert the object into a dict
keyword_update_dict = keyword_update_instance.to_dict()
# create an instance of KeywordUpdate from a dict
keyword_update_from_dict = KeywordUpdate.from_dict(keyword_update_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



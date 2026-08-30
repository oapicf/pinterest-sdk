# KeywordUpdateGenerated


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **bool** | Is keyword archived? | [optional] 
**bid** | **int** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**id** | **str** | Keyword ID. | 

## Example

```python
from openapi_client.models.keyword_update_generated import KeywordUpdateGenerated

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordUpdateGenerated from a JSON string
keyword_update_generated_instance = KeywordUpdateGenerated.from_json(json)
# print the JSON string representation of the object
print KeywordUpdateGenerated.to_json()

# convert the object into a dict
keyword_update_generated_dict = keyword_update_generated_instance.to_dict()
# create an instance of KeywordUpdateGenerated from a dict
keyword_update_generated_from_dict = KeywordUpdateGenerated.from_dict(keyword_update_generated_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



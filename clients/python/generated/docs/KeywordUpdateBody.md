# KeywordUpdateBody


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keywords** | [**List[KeywordUpdate]**](KeywordUpdate.md) | Keywords to update. Object array. Each object has 2 possible fields:&lt;br&gt;1. \&quot;id\&quot;: (required) keyword ID&lt;br&gt;2. \&quot;archived\&quot;: boolean. Should keyword be archived?&lt;br&gt;For example: [{\&quot;id\&quot;:\&quot;2886610576653\&quot;, \&quot;archived\&quot;: false}, {\&quot;id\&quot;:\&quot;2886610576654\&quot;,  \&quot;archived\&quot;: true}, ...] | 

## Example

```python
from pinterestsdk.models.keyword_update_body import KeywordUpdateBody

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordUpdateBody from a JSON string
keyword_update_body_instance = KeywordUpdateBody.from_json(json)
# print the JSON string representation of the object
print(KeywordUpdateBody.to_json())

# convert the object into a dict
keyword_update_body_dict = keyword_update_body_instance.to_dict()
# create an instance of KeywordUpdateBody from a dict
keyword_update_body_from_dict = KeywordUpdateBody.from_dict(keyword_update_body_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



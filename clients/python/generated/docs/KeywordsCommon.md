# KeywordsCommon


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid** | **int** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**match_type** | [**MatchTypeResponse**](MatchTypeResponse.md) |  | 
**value** | **str** | Keyword value (120 chars max). | 

## Example

```python
from pinterestsdk.models.keywords_common import KeywordsCommon

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordsCommon from a JSON string
keywords_common_instance = KeywordsCommon.from_json(json)
# print the JSON string representation of the object
print(KeywordsCommon.to_json())

# convert the object into a dict
keywords_common_dict = keywords_common_instance.to_dict()
# create an instance of KeywordsCommon from a dict
keywords_common_from_dict = KeywordsCommon.from_dict(keywords_common_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



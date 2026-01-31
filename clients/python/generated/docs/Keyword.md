# Keyword


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid** | **int** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**match_type** | [**MatchTypeResponse**](MatchTypeResponse.md) |  | 
**value** | **str** | Keyword value (120 chars max). | 
**archived** | **bool** |  | [optional] 
**id** | **str** | Keyword ID . | [optional] 
**parent_id** | **str** | Keyword parent entity ID (advertiser, campaign, ad group). | [optional] 
**parent_type** | **str** | Parent entity type | [optional] 
**type** | **str** | Always keyword | [optional] 

## Example

```python
from pinterestsdk.models.keyword import Keyword

# TODO update the JSON string below
json = "{}"
# create an instance of Keyword from a JSON string
keyword_instance = Keyword.from_json(json)
# print the JSON string representation of the object
print(Keyword.to_json())

# convert the object into a dict
keyword_dict = keyword_instance.to_dict()
# create an instance of Keyword from a dict
keyword_from_dict = Keyword.from_dict(keyword_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



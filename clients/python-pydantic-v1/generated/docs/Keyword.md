# Keyword


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**archived** | **bool** |  | [optional] 
**bid** | **int** | **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. | [optional] 
**id** | **str** | Keyword ID . | 
**match_type** | [**MatchType**](MatchType.md) | Keyword [match type](/docs/api-features/targeting-overview/) | 
**parent_id** | **str** | Keyword parent entity ID (advertiser, campaign, ad group). | [readonly] 
**parent_type** | **str** | Parent entity type (advertiser, campaign, ad group). | [optional] [readonly] 
**type** | **str** | Always keyword | [optional] [readonly] 
**value** | **str** | Keyword value (120 chars max). | 

## Example

```python
from openapi_client.models.keyword import Keyword

# TODO update the JSON string below
json = "{}"
# create an instance of Keyword from a JSON string
keyword_instance = Keyword.from_json(json)
# print the JSON string representation of the object
print Keyword.to_json()

# convert the object into a dict
keyword_dict = keyword_instance.to_dict()
# create an instance of Keyword from a dict
keyword_from_dict = Keyword.from_dict(keyword_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



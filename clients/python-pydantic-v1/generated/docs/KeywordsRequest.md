# KeywordsRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keywords** | [**List[KeywordsCommon]**](KeywordsCommon.md) | Keyword JSON array. Each array element has 3 fields | 
**parent_id** | **str** | Keyword parent entity ID (advertiser, campaign, ad group). | 

## Example

```python
from openapi_client.models.keywords_request import KeywordsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of KeywordsRequest from a JSON string
keywords_request_instance = KeywordsRequest.from_json(json)
# print the JSON string representation of the object
print KeywordsRequest.to_json()

# convert the object into a dict
keywords_request_dict = keywords_request_instance.to_dict()
# create an instance of KeywordsRequest from a dict
keywords_request_from_dict = KeywordsRequest.from_dict(keywords_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



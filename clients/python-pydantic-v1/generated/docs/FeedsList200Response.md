# FeedsList200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[CatalogsFeed]**](CatalogsFeed.md) |  | 

## Example

```python
from openapi_client.models.feeds_list200_response import FeedsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of FeedsList200Response from a JSON string
feeds_list200_response_instance = FeedsList200Response.from_json(json)
# print the JSON string representation of the object
print FeedsList200Response.to_json()

# convert the object into a dict
feeds_list200_response_dict = feeds_list200_response_instance.to_dict()
# create an instance of FeedsList200Response from a dict
feeds_list200_response_from_dict = FeedsList200Response.from_dict(feeds_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



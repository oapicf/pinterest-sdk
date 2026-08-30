# FeedProcessingResultsList200Response


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **str** |  | [optional] 
**items** | [**List[CatalogsFeedProcessingResult]**](CatalogsFeedProcessingResult.md) |  | 

## Example

```python
from openapi_client.models.feed_processing_results_list200_response import FeedProcessingResultsList200Response

# TODO update the JSON string below
json = "{}"
# create an instance of FeedProcessingResultsList200Response from a JSON string
feed_processing_results_list200_response_instance = FeedProcessingResultsList200Response.from_json(json)
# print the JSON string representation of the object
print FeedProcessingResultsList200Response.to_json()

# convert the object into a dict
feed_processing_results_list200_response_dict = feed_processing_results_list200_response_instance.to_dict()
# create an instance of FeedProcessingResultsList200Response from a dict
feed_processing_results_list200_response_from_dict = FeedProcessingResultsList200Response.from_dict(feed_processing_results_list200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



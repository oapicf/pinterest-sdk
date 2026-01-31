# BookClosedResponse

Creation fields

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversion_metrics_ready** | **bool** | Are conversion metrics ready? | [optional] 
**non_conversion_metrics_ready** | **bool** | Are non-conversion metrics ready? | [optional] 

## Example

```python
from pinterestsdk.models.book_closed_response import BookClosedResponse

# TODO update the JSON string below
json = "{}"
# create an instance of BookClosedResponse from a JSON string
book_closed_response_instance = BookClosedResponse.from_json(json)
# print the JSON string representation of the object
print(BookClosedResponse.to_json())

# convert the object into a dict
book_closed_response_dict = book_closed_response_instance.to_dict()
# create an instance of BookClosedResponse from a dict
book_closed_response_from_dict = BookClosedResponse.from_dict(book_closed_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



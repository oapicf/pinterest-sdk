# BookClosed


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conversion_metrics_ready** | **bool** | Are conversion metrics ready? | 
**non_conversion_metrics_ready** | **bool** | Are non-conversion metrics ready? | 

## Example

```python
from pinterestsdk.models.book_closed import BookClosed

# TODO update the JSON string below
json = "{}"
# create an instance of BookClosed from a JSON string
book_closed_instance = BookClosed.from_json(json)
# print the JSON string representation of the object
print(BookClosed.to_json())

# convert the object into a dict
book_closed_dict = book_closed_instance.to_dict()
# create an instance of BookClosed from a dict
book_closed_from_dict = BookClosed.from_dict(book_closed_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



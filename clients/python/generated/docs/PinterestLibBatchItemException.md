# PinterestLibBatchItemException

Exception details for a batch operation item.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **int** |  | [optional] 
**message** | **str** |  | 

## Example

```python
from pinterestsdk.models.pinterest_lib_batch_item_exception import PinterestLibBatchItemException

# TODO update the JSON string below
json = "{}"
# create an instance of PinterestLibBatchItemException from a JSON string
pinterest_lib_batch_item_exception_instance = PinterestLibBatchItemException.from_json(json)
# print the JSON string representation of the object
print(PinterestLibBatchItemException.to_json())

# convert the object into a dict
pinterest_lib_batch_item_exception_dict = pinterest_lib_batch_item_exception_instance.to_dict()
# create an instance of PinterestLibBatchItemException from a dict
pinterest_lib_batch_item_exception_from_dict = PinterestLibBatchItemException.from_dict(pinterest_lib_batch_item_exception_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



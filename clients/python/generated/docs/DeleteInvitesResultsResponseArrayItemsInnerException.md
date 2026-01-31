# DeleteInvitesResultsResponseArrayItemsInnerException

An exception object if there is an error performing the cancellation. It will only be provided if there is an error.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_id** | **str** | Unique identifier of an invite. | [optional] 
**message** | **str** | Error message associated with the error in performing the action on the invite/request. | [optional] 

## Example

```python
from pinterestsdk.models.delete_invites_results_response_array_items_inner_exception import DeleteInvitesResultsResponseArrayItemsInnerException

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteInvitesResultsResponseArrayItemsInnerException from a JSON string
delete_invites_results_response_array_items_inner_exception_instance = DeleteInvitesResultsResponseArrayItemsInnerException.from_json(json)
# print the JSON string representation of the object
print(DeleteInvitesResultsResponseArrayItemsInnerException.to_json())

# convert the object into a dict
delete_invites_results_response_array_items_inner_exception_dict = delete_invites_results_response_array_items_inner_exception_instance.to_dict()
# create an instance of DeleteInvitesResultsResponseArrayItemsInnerException from a dict
delete_invites_results_response_array_items_inner_exception_from_dict = DeleteInvitesResultsResponseArrayItemsInnerException.from_dict(delete_invites_results_response_array_items_inner_exception_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



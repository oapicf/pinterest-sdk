# DeleteInvitesResultsResponseArrayItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exception** | [**DeleteInvitesResultsResponseArrayItemsInnerException**](DeleteInvitesResultsResponseArrayItemsInnerException.md) |  | [optional] 
**invite** | [**BaseInviteDataResponse**](BaseInviteDataResponse.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.delete_invites_results_response_array_items_inner import DeleteInvitesResultsResponseArrayItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteInvitesResultsResponseArrayItemsInner from a JSON string
delete_invites_results_response_array_items_inner_instance = DeleteInvitesResultsResponseArrayItemsInner.from_json(json)
# print the JSON string representation of the object
print(DeleteInvitesResultsResponseArrayItemsInner.to_json())

# convert the object into a dict
delete_invites_results_response_array_items_inner_dict = delete_invites_results_response_array_items_inner_instance.to_dict()
# create an instance of DeleteInvitesResultsResponseArrayItemsInner from a dict
delete_invites_results_response_array_items_inner_from_dict = DeleteInvitesResultsResponseArrayItemsInner.from_dict(delete_invites_results_response_array_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



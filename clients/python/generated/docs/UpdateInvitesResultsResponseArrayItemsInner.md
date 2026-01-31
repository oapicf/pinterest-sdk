# UpdateInvitesResultsResponseArrayItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exception** | [**InviteExceptionResponse**](InviteExceptionResponse.md) |  | [optional] 
**invite** | [**InviteBusinessRoleBinding**](InviteBusinessRoleBinding.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.update_invites_results_response_array_items_inner import UpdateInvitesResultsResponseArrayItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateInvitesResultsResponseArrayItemsInner from a JSON string
update_invites_results_response_array_items_inner_instance = UpdateInvitesResultsResponseArrayItemsInner.from_json(json)
# print the JSON string representation of the object
print(UpdateInvitesResultsResponseArrayItemsInner.to_json())

# convert the object into a dict
update_invites_results_response_array_items_inner_dict = update_invites_results_response_array_items_inner_instance.to_dict()
# create an instance of UpdateInvitesResultsResponseArrayItemsInner from a dict
update_invites_results_response_array_items_inner_from_dict = UpdateInvitesResultsResponseArrayItemsInner.from_dict(update_invites_results_response_array_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



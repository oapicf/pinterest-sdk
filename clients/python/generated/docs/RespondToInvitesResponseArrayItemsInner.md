# RespondToInvitesResponseArrayItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exception** | [**InviteExceptionResponse**](InviteExceptionResponse.md) |  | [optional] 
**invite** | [**BaseInviteDataResponse**](BaseInviteDataResponse.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.respond_to_invites_response_array_items_inner import RespondToInvitesResponseArrayItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of RespondToInvitesResponseArrayItemsInner from a JSON string
respond_to_invites_response_array_items_inner_instance = RespondToInvitesResponseArrayItemsInner.from_json(json)
# print the JSON string representation of the object
print(RespondToInvitesResponseArrayItemsInner.to_json())

# convert the object into a dict
respond_to_invites_response_array_items_inner_dict = respond_to_invites_response_array_items_inner_instance.to_dict()
# create an instance of RespondToInvitesResponseArrayItemsInner from a dict
respond_to_invites_response_array_items_inner_from_dict = RespondToInvitesResponseArrayItemsInner.from_dict(respond_to_invites_response_array_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



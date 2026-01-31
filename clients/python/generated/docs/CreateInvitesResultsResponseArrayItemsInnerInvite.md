# CreateInvitesResultsResponseArrayItemsInnerInvite

An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier of the invite/request. | [optional] 
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] 

## Example

```python
from pinterestsdk.models.create_invites_results_response_array_items_inner_invite import CreateInvitesResultsResponseArrayItemsInnerInvite

# TODO update the JSON string below
json = "{}"
# create an instance of CreateInvitesResultsResponseArrayItemsInnerInvite from a JSON string
create_invites_results_response_array_items_inner_invite_instance = CreateInvitesResultsResponseArrayItemsInnerInvite.from_json(json)
# print the JSON string representation of the object
print(CreateInvitesResultsResponseArrayItemsInnerInvite.to_json())

# convert the object into a dict
create_invites_results_response_array_items_inner_invite_dict = create_invites_results_response_array_items_inner_invite_instance.to_dict()
# create an instance of CreateInvitesResultsResponseArrayItemsInnerInvite from a dict
create_invites_results_response_array_items_inner_invite_from_dict = CreateInvitesResultsResponseArrayItemsInnerInvite.from_dict(create_invites_results_response_array_items_inner_invite_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



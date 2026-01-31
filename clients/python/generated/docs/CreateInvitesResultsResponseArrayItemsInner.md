# CreateInvitesResultsResponseArrayItemsInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exception** | [**InviteExceptionResponse**](InviteExceptionResponse.md) |  | [optional] 
**invite** | [**CreateInvitesResultsResponseArrayItemsInnerInvite**](CreateInvitesResultsResponseArrayItemsInnerInvite.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.create_invites_results_response_array_items_inner import CreateInvitesResultsResponseArrayItemsInner

# TODO update the JSON string below
json = "{}"
# create an instance of CreateInvitesResultsResponseArrayItemsInner from a JSON string
create_invites_results_response_array_items_inner_instance = CreateInvitesResultsResponseArrayItemsInner.from_json(json)
# print the JSON string representation of the object
print(CreateInvitesResultsResponseArrayItemsInner.to_json())

# convert the object into a dict
create_invites_results_response_array_items_inner_dict = create_invites_results_response_array_items_inner_instance.to_dict()
# create an instance of CreateInvitesResultsResponseArrayItemsInner from a dict
create_invites_results_response_array_items_inner_from_dict = CreateInvitesResultsResponseArrayItemsInner.from_dict(create_invites_results_response_array_items_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



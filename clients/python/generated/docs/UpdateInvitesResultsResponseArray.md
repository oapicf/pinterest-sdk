# UpdateInvitesResultsResponseArray


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[InviteActionResultItem]**](InviteActionResultItem.md) | List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. | [optional] 

## Example

```python
from pinterestsdk.models.update_invites_results_response_array import UpdateInvitesResultsResponseArray

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateInvitesResultsResponseArray from a JSON string
update_invites_results_response_array_instance = UpdateInvitesResultsResponseArray.from_json(json)
# print the JSON string representation of the object
print(UpdateInvitesResultsResponseArray.to_json())

# convert the object into a dict
update_invites_results_response_array_dict = update_invites_results_response_array_instance.to_dict()
# create an instance of UpdateInvitesResultsResponseArray from a dict
update_invites_results_response_array_from_dict = UpdateInvitesResultsResponseArray.from_dict(update_invites_results_response_array_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



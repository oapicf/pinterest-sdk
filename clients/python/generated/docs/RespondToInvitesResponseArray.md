# RespondToInvitesResponseArray


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[RespondToInviteResultItem]**](RespondToInviteResultItem.md) | List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned. | [optional] 

## Example

```python
from pinterestsdk.models.respond_to_invites_response_array import RespondToInvitesResponseArray

# TODO update the JSON string below
json = "{}"
# create an instance of RespondToInvitesResponseArray from a JSON string
respond_to_invites_response_array_instance = RespondToInvitesResponseArray.from_json(json)
# print the JSON string representation of the object
print(RespondToInvitesResponseArray.to_json())

# convert the object into a dict
respond_to_invites_response_array_dict = respond_to_invites_response_array_instance.to_dict()
# create an instance of RespondToInvitesResponseArray from a dict
respond_to_invites_response_array_from_dict = RespondToInvitesResponseArray.from_dict(respond_to_invites_response_array_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



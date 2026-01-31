# DeleteInvitesResultsResponseArray

Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[DeleteInvitesResultsResponseArrayItemsInner]**](DeleteInvitesResultsResponseArrayItemsInner.md) | List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled. | [optional] 

## Example

```python
from pinterestsdk.models.delete_invites_results_response_array import DeleteInvitesResultsResponseArray

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteInvitesResultsResponseArray from a JSON string
delete_invites_results_response_array_instance = DeleteInvitesResultsResponseArray.from_json(json)
# print the JSON string representation of the object
print(DeleteInvitesResultsResponseArray.to_json())

# convert the object into a dict
delete_invites_results_response_array_dict = delete_invites_results_response_array_instance.to_dict()
# create an instance of DeleteInvitesResultsResponseArray from a dict
delete_invites_results_response_array_from_dict = DeleteInvitesResultsResponseArray.from_dict(delete_invites_results_response_array_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



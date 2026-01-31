# CreateInvitesResultsResponseArray


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | [**List[CreateInvitesResultsResponseArrayItemsInner]**](CreateInvitesResultsResponseArrayItemsInner.md) | List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. | [optional] 

## Example

```python
from pinterestsdk.models.create_invites_results_response_array import CreateInvitesResultsResponseArray

# TODO update the JSON string below
json = "{}"
# create an instance of CreateInvitesResultsResponseArray from a JSON string
create_invites_results_response_array_instance = CreateInvitesResultsResponseArray.from_json(json)
# print the JSON string representation of the object
print(CreateInvitesResultsResponseArray.to_json())

# convert the object into a dict
create_invites_results_response_array_dict = create_invites_results_response_array_instance.to_dict()
# create an instance of CreateInvitesResultsResponseArray from a dict
create_invites_results_response_array_from_dict = CreateInvitesResultsResponseArray.from_dict(create_invites_results_response_array_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



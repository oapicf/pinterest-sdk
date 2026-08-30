# RespondToInviteResultItem


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exception** | [**InviteExceptionResponse**](InviteExceptionResponse.md) |  | [optional] 
**invite** | [**BaseInviteDataResponse**](BaseInviteDataResponse.md) | An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created. | [optional] 

## Example

```python
from openapi_client.models.respond_to_invite_result_item import RespondToInviteResultItem

# TODO update the JSON string below
json = "{}"
# create an instance of RespondToInviteResultItem from a JSON string
respond_to_invite_result_item_instance = RespondToInviteResultItem.from_json(json)
# print the JSON string representation of the object
print RespondToInviteResultItem.to_json()

# convert the object into a dict
respond_to_invite_result_item_dict = respond_to_invite_result_item_instance.to_dict()
# create an instance of RespondToInviteResultItem from a dict
respond_to_invite_result_item_from_dict = RespondToInviteResultItem.from_dict(respond_to_invite_result_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



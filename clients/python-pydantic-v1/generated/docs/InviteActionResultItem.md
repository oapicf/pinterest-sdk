# InviteActionResultItem

An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exception** | [**InviteExceptionResponse**](InviteExceptionResponse.md) |  | [optional] 
**invite** | [**InviteBusinessRoleBinding**](InviteBusinessRoleBinding.md) |  | [optional] 

## Example

```python
from openapi_client.models.invite_action_result_item import InviteActionResultItem

# TODO update the JSON string below
json = "{}"
# create an instance of InviteActionResultItem from a JSON string
invite_action_result_item_instance = InviteActionResultItem.from_json(json)
# print the JSON string representation of the object
print InviteActionResultItem.to_json()

# convert the object into a dict
invite_action_result_item_dict = invite_action_result_item_instance.to_dict()
# create an instance of InviteActionResultItem from a dict
invite_action_result_item_from_dict = InviteActionResultItem.from_dict(invite_action_result_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



# CancelInviteResultItem


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exception** | [**CancelInviteException**](CancelInviteException.md) |  | [optional] 
**invite** | [**CancelInviteResult**](CancelInviteResult.md) |  | [optional] 

## Example

```python
from pinterestsdk.models.cancel_invite_result_item import CancelInviteResultItem

# TODO update the JSON string below
json = "{}"
# create an instance of CancelInviteResultItem from a JSON string
cancel_invite_result_item_instance = CancelInviteResultItem.from_json(json)
# print the JSON string representation of the object
print(CancelInviteResultItem.to_json())

# convert the object into a dict
cancel_invite_result_item_dict = cancel_invite_result_item_instance.to_dict()
# create an instance of CancelInviteResultItem from a dict
cancel_invite_result_item_from_dict = CancelInviteResultItem.from_dict(cancel_invite_result_item_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



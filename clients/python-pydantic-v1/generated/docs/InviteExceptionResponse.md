# InviteExceptionResponse

An exception object if there is an error performing the action. Will only be provided if there is an error.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **int** | Error code associated with the error in performing the action on the invite/request. | [optional] 
**invite_or_request_id** | **str** | Unique identifier of the invite/request. | [optional] 
**message** | **str** | Error message associated with the error in performing the action on the invite/request. | [optional] 
**users_or_partner_ids** | **List[str]** | A list of users&#39; usernames or emails OR a list of partner ids that caused the error. | [optional] 

## Example

```python
from openapi_client.models.invite_exception_response import InviteExceptionResponse

# TODO update the JSON string below
json = "{}"
# create an instance of InviteExceptionResponse from a JSON string
invite_exception_response_instance = InviteExceptionResponse.from_json(json)
# print the JSON string representation of the object
print InviteExceptionResponse.to_json()

# convert the object into a dict
invite_exception_response_dict = invite_exception_response_instance.to_dict()
# create an instance of InviteExceptionResponse from a dict
invite_exception_response_from_dict = InviteExceptionResponse.from_dict(invite_exception_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



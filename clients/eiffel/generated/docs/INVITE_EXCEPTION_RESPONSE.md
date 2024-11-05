# INVITE_EXCEPTION_RESPONSE

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_or_request_id** | [**STRING_32**](STRING_32.md) | Unique identifier of the invite/request. | [optional] [default to null]
**code** | **INTEGER_32** | Error code associated with the error in performing the action on the invite/request. | [optional] [default to null]
**message** | [**STRING_32**](STRING_32.md) | Error message associated with the error in performing the action on the invite/request. | [optional] [default to null]
**users_or_partner_ids** | [**LIST [STRING_32]**](STRING_32.md) | A list of users&#39; usernames or emails OR a list of partner ids that caused the error. | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



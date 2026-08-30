# InviteExceptionResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **i32** | Error code associated with the error in performing the action on the invite/request. | [optional] [default to None]
**invite_or_request_id** | **swagger::Nullable<String>** | Unique identifier of the invite/request. | [optional] [default to None]
**message** | **String** | Error message associated with the error in performing the action on the invite/request. | [optional] [default to None]
**users_or_partner_ids** | **Vec<String>** | A list of users' usernames or emails OR a list of partner ids that caused the error. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



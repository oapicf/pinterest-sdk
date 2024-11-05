# openapi::InviteExceptionResponse

An exception object if there is an error performing the action. Will only be provided if there is an error.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_or_request_id** | **character** | Unique identifier of the invite/request. | [optional] [Pattern: ^\\d+$] 
**code** | **integer** | Error code associated with the error in performing the action on the invite/request. | [optional] 
**message** | **character** | Error message associated with the error in performing the action on the invite/request. | [optional] 
**users_or_partner_ids** | **array[character]** | A list of users&#39; usernames or emails OR a list of partner ids that caused the error. | [optional] 



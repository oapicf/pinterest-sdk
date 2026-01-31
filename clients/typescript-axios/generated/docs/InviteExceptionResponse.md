# InviteExceptionResponse

An exception object if there is an error performing the action. Will only be provided if there is an error.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invite_or_request_id** | **string** | Unique identifier of the invite/request. | [optional] [default to undefined]
**code** | **number** | Error code associated with the error in performing the action on the invite/request. | [optional] [default to undefined]
**message** | **string** | Error message associated with the error in performing the action on the invite/request. | [optional] [default to undefined]
**users_or_partner_ids** | **Array&lt;string&gt;** | A list of users\&#39; usernames or emails OR a list of partner ids that caused the error. | [optional] [default to undefined]

## Example

```typescript
import { InviteExceptionResponse } from './api';

const instance: InviteExceptionResponse = {
    invite_or_request_id,
    code,
    message,
    users_or_partner_ids,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

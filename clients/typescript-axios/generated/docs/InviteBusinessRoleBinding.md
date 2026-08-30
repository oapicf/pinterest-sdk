# InviteBusinessRoleBinding

An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_by_business_id** | **string** | Unique identifier for the business that created the invite/request. | [optional] [default to undefined]
**created_by_user_id** | **string** | Unique identifier for the user that created the invite/request. | [optional] [default to undefined]
**id** | **string** | Unique identifier of the invite/request. | [optional] [default to undefined]
**invite_data** | [**InviteDataResponse**](InviteDataResponse.md) |  | [optional] [default to undefined]
**is_received_invite** | **boolean** | Indicates whether the invite/request was received. | [optional] [default to undefined]
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] [default to undefined]

## Example

```typescript
import { InviteBusinessRoleBinding } from './api';

const instance: InviteBusinessRoleBinding = {
    created_by_business_id,
    created_by_user_id,
    id,
    invite_data,
    is_received_invite,
    user,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

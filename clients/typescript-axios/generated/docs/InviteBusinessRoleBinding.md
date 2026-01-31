# InviteBusinessRoleBinding


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Unique identifier of the invite/request. | [optional] [default to undefined]
**invite_data** | [**BaseInviteDataResponseInviteData**](BaseInviteDataResponseInviteData.md) |  | [optional] [default to undefined]
**is_received_invite** | **boolean** | Indicates whether the invite/request was received. | [optional] [default to undefined]
**user** | **object** | Metadata for the user that updated the invite/request. | [optional] [default to undefined]
**created_by_business_id** | **string** | Unique identifier for the business that created the invite/request. | [optional] [default to undefined]
**created_by_user_id** | **string** | Unique identifier for the user that created the invite/request. | [optional] [default to undefined]

## Example

```typescript
import { InviteBusinessRoleBinding } from './api';

const instance: InviteBusinessRoleBinding = {
    id,
    invite_data,
    is_received_invite,
    user,
    created_by_business_id,
    created_by_user_id,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

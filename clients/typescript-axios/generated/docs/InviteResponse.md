# InviteResponse

A user\'s username or email OR a partner id that caused the error.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**assets_summary** | [**InviteAssetsSummary**](InviteAssetsSummary.md) |  | [optional] [default to undefined]
**business_roles** | **Array&lt;string&gt;** | The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. | [optional] [default to undefined]
**created_by_business** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the business that created the invite/request. | [optional] [default to undefined]
**created_by_user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the user that created the invite/request. | [optional] [default to undefined]
**created_time** | **number** | The time the invite/request was created. Returned in milliseconds. | [optional] [default to undefined]
**id** | **string** | Unique identifier of the invite/request. | [optional] [default to undefined]
**invite_data** | [**InviteDataResponse**](InviteDataResponse.md) |  | [optional] [default to undefined]
**is_received_invite** | **boolean** | Indicates whether the invite/request was received. | [optional] [default to undefined]
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] [default to undefined]

## Example

```typescript
import { InviteResponse } from './api';

const instance: InviteResponse = {
    assets_summary,
    business_roles,
    created_by_business,
    created_by_user,
    created_time,
    id,
    invite_data,
    is_received_invite,
    user,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

# BaseInviteDataResponse

Common invite/request data returned by the business access endpoints.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | Unique identifier of the invite/request. | [optional] [default to undefined]
**invite_data** | [**InviteDataResponse**](InviteDataResponse.md) |  | [optional] [default to undefined]
**is_received_invite** | **boolean** | Indicates whether the invite/request was received. | [optional] [default to undefined]
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. | [optional] [default to undefined]

## Example

```typescript
import { BaseInviteDataResponse } from './api';

const instance: BaseInviteDataResponse = {
    id,
    invite_data,
    is_received_invite,
    user,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

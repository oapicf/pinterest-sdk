# InviteActionResultItem

An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exception** | [**InviteExceptionResponse**](InviteExceptionResponse.md) |  | [optional] [default to undefined]
**invite** | [**InviteBusinessRoleBinding**](InviteBusinessRoleBinding.md) |  | [optional] [default to undefined]

## Example

```typescript
import { InviteActionResultItem } from './api';

const instance: InviteActionResultItem = {
    exception,
    invite,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

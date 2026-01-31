# UserSingleAssetBinding

An object containing the permissions a business member/partner has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**permissions** | **Array&lt;string&gt;** | Permission levels member or partner has on an asset. | [optional] [default to undefined]
**user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) |  | [optional] [default to undefined]

## Example

```typescript
import { UserSingleAssetBinding } from './api';

const instance: UserSingleAssetBinding = {
    permissions,
    user,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

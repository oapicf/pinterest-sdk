# UsersForIndividualAssetResponse

An object containing the permissions a business member has on the asset.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**asset_id** | **string** | Unique identifier of a business asset. | [optional] [default to undefined]
**member_id** | **string** | Unique identifier of the business member with asset access. | [optional] [default to undefined]
**permissions** | **Array&lt;string&gt;** | Permission levels member or partner has on an asset. | [optional] [default to undefined]

## Example

```typescript
import { UsersForIndividualAssetResponse } from './api';

const instance: UsersForIndividualAssetResponse = {
    asset_id,
    member_id,
    permissions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

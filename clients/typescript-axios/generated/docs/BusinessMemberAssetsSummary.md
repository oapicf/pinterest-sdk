# BusinessMemberAssetsSummary

Ad accounts and profiles the business member/partner has access to.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_accounts** | [**Array&lt;AssetIdWithPermissions&gt;**](AssetIdWithPermissions.md) | List of ad account IDs and respective permission levels. | [optional] [default to undefined]
**profiles** | [**Array&lt;AssetIdWithPermissions&gt;**](AssetIdWithPermissions.md) | List of profile IDs and respective permission levels. | [optional] [default to undefined]

## Example

```typescript
import { BusinessMemberAssetsSummary } from './api';

const instance: BusinessMemberAssetsSummary = {
    ad_accounts,
    profiles,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

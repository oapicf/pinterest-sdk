# InviteAssetsSummary

Ad accounts and profiles the member/partner will be granted access to with this invite/request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_accounts** | [**Array&lt;InviteAssetsSummaryAdAccountsInner&gt;**](InviteAssetsSummaryAdAccountsInner.md) | List of ad account IDs and respective permission levels that will be assigned. | [optional] [default to undefined]
**profiles** | [**Array&lt;InviteAssetsSummaryProfilesInner&gt;**](InviteAssetsSummaryProfilesInner.md) | List of profile IDs and respective permission levels that will be assigned. | [optional] [default to undefined]

## Example

```typescript
import { InviteAssetsSummary } from './api';

const instance: InviteAssetsSummary = {
    ad_accounts,
    profiles,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

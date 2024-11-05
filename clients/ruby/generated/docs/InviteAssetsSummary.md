# PinterestSdkClient::InviteAssetsSummary

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_accounts** | [**Array&lt;InviteAssetsSummaryAdAccountsInner&gt;**](InviteAssetsSummaryAdAccountsInner.md) | List of ad account IDs and respective permission levels that will be assigned. | [optional] |
| **profiles** | [**Array&lt;InviteAssetsSummaryProfilesInner&gt;**](InviteAssetsSummaryProfilesInner.md) | List of profile IDs and respective permission levels that will be assigned. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::InviteAssetsSummary.new(
  ad_accounts: null,
  profiles: null
)
```


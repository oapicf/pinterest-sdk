# PinterestSdkClient::BusinessMemberAssetsSummary

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_accounts** | [**Array&lt;AssetIdWithPermissions&gt;**](AssetIdWithPermissions.md) | List of ad account IDs and respective permission levels. | [optional] |
| **profiles** | [**Array&lt;AssetIdWithPermissions&gt;**](AssetIdWithPermissions.md) | List of profile IDs and respective permission levels. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessMemberAssetsSummary.new(
  ad_accounts: null,
  profiles: null
)
```


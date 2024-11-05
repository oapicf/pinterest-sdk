# PinterestSdkClient::UsersForIndividualAssetResponse

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_id** | **String** | Unique identifier of a business asset. | [optional] |
| **member_id** | **String** | Unique identifier of the business member with asset access. | [optional] |
| **permissions** | **Array&lt;String&gt;** | Permission levels member or partner has on an asset. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UsersForIndividualAssetResponse.new(
  asset_id: 549755885175,
  member_id: 140943737684417,
  permissions: [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;]
)
```


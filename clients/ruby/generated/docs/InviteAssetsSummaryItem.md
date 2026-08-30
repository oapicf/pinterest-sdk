# PinterestSdkClient::InviteAssetsSummaryItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Unique identifier of the asset. | [optional] |
| **permissions** | **Array&lt;String&gt;** | Permission levels member or partner has on an asset. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::InviteAssetsSummaryItem.new(
  id: null,
  permissions: [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;]
)
```


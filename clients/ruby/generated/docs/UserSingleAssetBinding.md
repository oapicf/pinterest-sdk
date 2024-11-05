# PinterestSdkClient::UserSingleAssetBinding

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **permissions** | **Array&lt;String&gt;** | Permission levels member or partner has on an asset. | [optional] |
| **user** | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::UserSingleAssetBinding.new(
  permissions: [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;],
  user: null
)
```


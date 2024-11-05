# PinterestSdkClient::BusinessMemberAssetsSummaryProfilesInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | Unique identifier of a business profile. | [optional] |
| **permissions** | **Array&lt;String&gt;** | Permission levels member or partner has on an asset. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessMemberAssetsSummaryProfilesInner.new(
  id: 383791336903426391,
  permissions: [&quot;FINANCE_MANAGER&quot;,&quot;CATALOGS_MANAGER&quot;,&quot;AUDIENCE_MANAGER&quot;]
)
```


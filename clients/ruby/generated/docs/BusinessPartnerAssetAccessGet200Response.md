# PinterestSdkClient::BusinessPartnerAssetAccessGet200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **items** | [**Array&lt;GetPartnerAssetsResponse&gt;**](GetPartnerAssetsResponse.md) | List assets on which you granted access to your partner or assets on which your partner has granted you access. |  |
| **bookmark** | **String** |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessPartnerAssetAccessGet200Response.new(
  items: null,
  bookmark: null
)
```


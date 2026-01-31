# PinterestSdkClient::BusinessPartnerAssetAccessGet200Response

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bookmark** | **String** |  | [optional] |
| **items** | [**Array&lt;GetPartnerAssetsResponse&gt;**](GetPartnerAssetsResponse.md) | List assets on which you granted access to your partner or assets on which your partner has granted you access. |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BusinessPartnerAssetAccessGet200Response.new(
  bookmark: null,
  items: null
)
```


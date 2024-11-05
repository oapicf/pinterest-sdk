# PinterestSdkClient::DeletePartnerAssetAccessBodyAccessesInner

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **partner_id** | **String** | Unique identifier of a business partner to update asset access to. |  |
| **asset_id** | **String** | Unique identifier of the business asset. |  |
| **partner_type** | **String** | If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset.&lt;br&gt; If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset. | [optional][default to &#39;INTERNAL&#39;] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DeletePartnerAssetAccessBodyAccessesInner.new(
  partner_id: 1234567890123,
  asset_id: 549755885175,
  partner_type: INTERNAL
)
```


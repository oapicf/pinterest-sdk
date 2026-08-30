# PinterestSdkClient::DeletePartnerAssetAccessItem

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **asset_id** | **String** | Unique identifier of the business asset. |  |
| **partner_id** | **String** | Unique identifier of a business partner to update asset access to. |  |
| **partner_type** | **String** | If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset. | [optional][default to &#39;INTERNAL&#39;] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::DeletePartnerAssetAccessItem.new(
  asset_id: null,
  partner_id: null,
  partner_type: null
)
```


# PinterestSdkClient::ProductGroupPromotionUpdateRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_group_id** | **String** | ID of the ad group the product group belongs to. |  |
| **product_group_promotion** | [**Array&lt;ProductGroupPromotion&gt;**](ProductGroupPromotion.md) |  |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::ProductGroupPromotionUpdateRequest.new(
  ad_group_id: 2680059592705,
  product_group_promotion: null
)
```


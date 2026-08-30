# PinterestSdkClient::CampaignUpdateRequestAllOf2

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **bid_options** | [**CampaignBidOptionsUpdate**](CampaignBidOptionsUpdate.md) |  | [optional] |
| **intended_promotion_type** | [**IntendedPromotionType**](IntendedPromotionType.md) |  | [optional] |
| **is_ltv_optimized** | **Boolean** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional] |
| **is_performance_plus** | **Boolean** | Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field. | [optional] |
| **is_top_of_search** | **Boolean** | Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. | [optional] |
| **objective_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignUpdateRequestAllOf2.new(
  bid_options: null,
  intended_promotion_type: null,
  is_ltv_optimized: null,
  is_performance_plus: null,
  is_top_of_search: null,
  objective_type: null
)
```


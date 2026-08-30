# PinterestSdkClient::CampaignAdPreview

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_account_id** | **String** | Advertiser ID for this preview. | [readonly] |
| **ad_group_id** | **String** | Ad group ID to create a preview record for. |  |
| **client_id** | **Integer** | Client ID that created preview. | [optional][readonly] |
| **expires_at** | **Integer** | Unix timestamp in milliseconds for preview expiration. | [readonly] |
| **is_active** | **Boolean** | Whether preview link is active. | [readonly] |
| **pin_id** | **Integer** | Pin ID for pin promotion preview. | [optional][readonly] |
| **pin_promotion_id** | **Integer** | Pin promotion ID for this preview. | [optional][readonly] |
| **promoted_product_group_id** | **Integer** | Promoted product group ID for catalog previews. | [optional][readonly] |
| **url** | **String** | Campaign ad preview URL. | [readonly] |
| **user_id** | **Integer** | User ID that created preview. | [readonly] |
| **uuid** | **String** | Pin promotion preview key. | [readonly] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CampaignAdPreview.new(
  ad_account_id: 549755885175,
  ad_group_id: 1234567890,
  client_id: null,
  expires_at: null,
  is_active: null,
  pin_id: null,
  pin_promotion_id: null,
  promoted_product_group_id: null,
  url: https://ads.pinterest.com/web-ad-preview/748db198-bd61-4a6f-b756-996c034e8cbb/,
  user_id: null,
  uuid: null
)
```


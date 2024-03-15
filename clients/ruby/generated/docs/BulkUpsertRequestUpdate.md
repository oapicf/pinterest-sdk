# PinterestSdkClient::BulkUpsertRequestUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaigns** | [**Array&lt;CampaignUpdateRequest&gt;**](CampaignUpdateRequest.md) |  | [optional] |
| **ad_groups** | [**Array&lt;AdGroupUpdateRequest&gt;**](AdGroupUpdateRequest.md) |  | [optional] |
| **ads** | [**Array&lt;AdUpdateRequest&gt;**](AdUpdateRequest.md) |  | [optional] |
| **product_groups** | [**Array&lt;ProductGroupPromotionUpdateRequest&gt;**](ProductGroupPromotionUpdateRequest.md) |  | [optional] |
| **keywords** | [**Array&lt;KeywordUpdate&gt;**](KeywordUpdate.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BulkUpsertRequestUpdate.new(
  campaigns: null,
  ad_groups: null,
  ads: null,
  product_groups: null,
  keywords: null
)
```


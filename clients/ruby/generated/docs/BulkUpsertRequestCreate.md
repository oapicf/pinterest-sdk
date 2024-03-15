# PinterestSdkClient::BulkUpsertRequestCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaigns** | [**Array&lt;CampaignCreateRequest&gt;**](CampaignCreateRequest.md) |  | [optional] |
| **ad_groups** | [**Array&lt;AdGroupCreateRequest&gt;**](AdGroupCreateRequest.md) |  | [optional] |
| **ads** | [**Array&lt;AdCreateRequest&gt;**](AdCreateRequest.md) |  | [optional] |
| **product_groups** | [**Array&lt;ProductGroupPromotionCreateRequest&gt;**](ProductGroupPromotionCreateRequest.md) |  | [optional] |
| **keywords** | [**Array&lt;KeywordsRequest&gt;**](KeywordsRequest.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BulkUpsertRequestCreate.new(
  campaigns: null,
  ad_groups: null,
  ads: null,
  product_groups: null,
  keywords: null
)
```


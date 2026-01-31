# PinterestSdkClient::BulkUpsertRequestCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_groups** | [**Array&lt;AdGroupCreateRequest&gt;**](AdGroupCreateRequest.md) |  | [optional] |
| **ads** | [**Array&lt;AdCreateRequest&gt;**](AdCreateRequest.md) |  | [optional] |
| **campaigns** | [**Array&lt;CampaignCreateRequest&gt;**](CampaignCreateRequest.md) |  | [optional] |
| **catalog_product_groups** | [**Array&lt;MultipleProductGroupsInner&gt;**](MultipleProductGroupsInner.md) |  | [optional] |
| **keywords** | [**Array&lt;KeywordsRequest&gt;**](KeywordsRequest.md) |  | [optional] |
| **labels** | [**Array&lt;LabelCreateRequest&gt;**](LabelCreateRequest.md) |  | [optional] |
| **product_groups** | [**Array&lt;ProductGroupPromotionCreateRequest&gt;**](ProductGroupPromotionCreateRequest.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BulkUpsertRequestCreate.new(
  ad_groups: null,
  ads: null,
  campaigns: null,
  catalog_product_groups: null,
  keywords: null,
  labels: null,
  product_groups: null
)
```


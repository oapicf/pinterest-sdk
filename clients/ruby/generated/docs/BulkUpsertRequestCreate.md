# PinterestSdkClient::BulkUpsertRequestCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_groups** | [**Array&lt;AdGroupCreateRequest&gt;**](AdGroupCreateRequest.md) |  | [optional] |
| **ads** | [**Array&lt;AdCreateRequest&gt;**](AdCreateRequest.md) |  | [optional] |
| **campaigns** | [**Array&lt;CampaignCreateRequest&gt;**](CampaignCreateRequest.md) |  | [optional] |
| **catalog_product_groups** | [**Array&lt;BulkUpsertRequestCreateCatalogProductGroupsItems&gt;**](BulkUpsertRequestCreateCatalogProductGroupsItems.md) |  | [optional] |
| **keywords** | [**Array&lt;KeywordsRequest&gt;**](KeywordsRequest.md) |  | [optional] |
| **labels** | [**Array&lt;LabelBulkCreateRequest&gt;**](LabelBulkCreateRequest.md) |  | [optional] |
| **product_groups** | [**Array&lt;ProductGroupPromotionCreateRequest&gt;**](ProductGroupPromotionCreateRequest.md) |  | [optional] |
| **schedules** | [**Array&lt;ScheduleCreateRequest&gt;**](ScheduleCreateRequest.md) |  | [optional] |

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
  product_groups: null,
  schedules: null
)
```


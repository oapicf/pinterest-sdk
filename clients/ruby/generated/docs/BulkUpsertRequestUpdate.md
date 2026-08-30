# PinterestSdkClient::BulkUpsertRequestUpdate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_groups** | [**Array&lt;AdGroupUpdateRequest&gt;**](AdGroupUpdateRequest.md) |  | [optional] |
| **ads** | [**Array&lt;AdUpdateRequest&gt;**](AdUpdateRequest.md) |  | [optional] |
| **campaigns** | [**Array&lt;CampaignUpdateRequest&gt;**](CampaignUpdateRequest.md) |  | [optional] |
| **catalog_product_groups** | [**Array&lt;BulkUpsertRequestUpdateCatalogProductGroupsItems&gt;**](BulkUpsertRequestUpdateCatalogProductGroupsItems.md) |  | [optional] |
| **keywords** | [**Array&lt;KeywordUpdateGenerated&gt;**](KeywordUpdateGenerated.md) |  | [optional] |
| **labels** | [**Array&lt;LabelBulkUpdateRequest&gt;**](LabelBulkUpdateRequest.md) |  | [optional] |
| **product_groups** | [**Array&lt;ProductGroupPromotionUpdateRequest&gt;**](ProductGroupPromotionUpdateRequest.md) |  | [optional] |
| **schedules** | [**Array&lt;ScheduleUpdateRequest&gt;**](ScheduleUpdateRequest.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BulkUpsertRequestUpdate.new(
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


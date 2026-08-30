# PinterestSdkClient::BulkDownloadCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_filter** | [**BulkDownloadCampaignFilter**](BulkDownloadCampaignFilter.md) |  | [optional] |
| **entity_ids** | **Array&lt;String&gt;** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] |
| **entity_types** | [**Array&lt;BulkEntityType&gt;**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] |
| **output_format** | [**BulkOutputFormat**](BulkOutputFormat.md) |  | [optional] |
| **updated_since** | **String** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BulkDownloadCreate.new(
  campaign_filter: null,
  entity_ids: null,
  entity_types: [&quot;CAMPAIGN&quot;,&quot;AD_GROUP&quot;],
  output_format: null,
  updated_since: 1622848072
)
```


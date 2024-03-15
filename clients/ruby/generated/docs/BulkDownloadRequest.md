# PinterestSdkClient::BulkDownloadRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **entity_types** | [**Array&lt;BulkEntityType&gt;**](BulkEntityType.md) | All entity types specified will be downloaded. Fewer types result in faster downloads. | [optional] |
| **entity_ids** | **Array&lt;String&gt;** | All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded. | [optional] |
| **updated_since** | **String** | Unix UTC timestamp to retrieve all entities that have changed since this time. | [optional] |
| **campaign_filter** | [**BulkDownloadRequestCampaignFilter**](BulkDownloadRequestCampaignFilter.md) |  | [optional] |
| **output_format** | [**BulkOutputFormat**](BulkOutputFormat.md) |  | [optional][default to &#39;JSON&#39;] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BulkDownloadRequest.new(
  entity_types: [&quot;CAMPAIGN&quot;,&quot;AD_GROUP&quot;],
  entity_ids: null,
  updated_since: 1622848072,
  campaign_filter: null,
  output_format: null
)
```


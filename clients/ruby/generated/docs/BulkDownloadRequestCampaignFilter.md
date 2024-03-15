# PinterestSdkClient::BulkDownloadRequestCampaignFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **start_time** | **String** | Unix UTC timestamp. | [optional] |
| **end_time** | **String** | Unix UTC timestamp. | [optional] |
| **name** | **String** | Campaign name | [optional] |
| **campaign_status** | [**Array&lt;CampaignSummaryStatus&gt;**](CampaignSummaryStatus.md) |  | [optional] |
| **objective_type** | [**Array&lt;ObjectiveType&gt;**](ObjectiveType.md) |  | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BulkDownloadRequestCampaignFilter.new(
  start_time: 1622848072,
  end_time: 1622848072,
  name: campaign name,
  campaign_status: null,
  objective_type: null
)
```


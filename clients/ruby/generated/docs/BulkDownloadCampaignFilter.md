# PinterestSdkClient::BulkDownloadCampaignFilter

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_status** | [**Array&lt;SummaryStatus&gt;**](SummaryStatus.md) |  | [optional] |
| **end_time** | **String** | Unix UTC timestamp. | [optional] |
| **name** | **String** | Campaign name | [optional] |
| **objective_type** | [**Array&lt;ConversionObjectiveType&gt;**](ConversionObjectiveType.md) |  | [optional] |
| **start_time** | **String** | Unix UTC timestamp. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::BulkDownloadCampaignFilter.new(
  campaign_status: null,
  end_time: 1622848072,
  name: campaign name,
  objective_type: null,
  start_time: 1622848072
)
```


# PinterestSdkClient::AdGroupsAnalyticsMetrics

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_group_id** | **String** | The ID of the ad group that this metrics belongs to. Returned as long as aggregate_report_rows is not true. | [optional] |
| **date** | **Date** | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdGroupsAnalyticsMetrics.new(
  ad_group_id: null,
  date: null
)
```


# PinterestSdkClient::AdsAnalyticsCreateAsyncRequestAllOf1

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **columns** | [**Array&lt;ReportingColumnAsync&gt;**](ReportingColumnAsync.md) | Metric and entity columns |  |
| **level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report |  |
| **report_format** | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting report data | [optional][default to &#39;JSON&#39;] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdsAnalyticsCreateAsyncRequestAllOf1.new(
  columns: null,
  level: CAMPAIGN,
  report_format: null
)
```


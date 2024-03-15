# PinterestSdkClient::CreateMMMReportRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **report_name** | **String** | Name of the Marketing Mix Modeling (MMM) report |  |
| **start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
| **end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
| **granularity** | **String** | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. |  |
| **level** | **String** | Level of the report |  |
| **targeting_types** | [**Array&lt;MMMReportingTargetingType&gt;**](MMMReportingTargetingType.md) | List of targeting types |  |
| **columns** | [**Array&lt;MMMReportingColumn&gt;**](MMMReportingColumn.md) | Metric and entity columns |  |
| **countries** | [**Array&lt;TargetingAdvertiserCountry&gt;**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::CreateMMMReportRequest.new(
  report_name: null,
  start_date: 2020-12-20,
  end_date: 2020-12-20,
  granularity: null,
  level: null,
  targeting_types: [&quot;GENDER&quot;],
  columns: null,
  countries: null
)
```


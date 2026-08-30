# PinterestSdkClient::MMMReportCreate

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **advertiser_ids** | **Array&lt;String&gt;** | Advertiser IDs for multi-advertiser report | [optional] |
| **columns** | [**Array&lt;MMMReportingColumn&gt;**](MMMReportingColumn.md) | Metric and entity columns |  |
| **countries** | [**Array&lt;TargetingAdvertiserCountry&gt;**](TargetingAdvertiserCountry.md) | A List of countries for filtering | [optional] |
| **custom_column_ids** | **Array&lt;String&gt;** | List of custom column IDs | [optional] |
| **end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
| **granularity** | [**MMMReportGranularity**](MMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. |  |
| **level** | [**MMMReportLevel**](MMMReportLevel.md) | Level of the report |  |
| **report_name** | **String** | Name of the Marketing Mix Modeling (MMM) report |  |
| **start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
| **targeting_types** | [**Array&lt;MMMReportingTargetingType&gt;**](MMMReportingTargetingType.md) | List of targeting types |  |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::MMMReportCreate.new(
  advertiser_ids: null,
  columns: null,
  countries: null,
  custom_column_ids: null,
  end_date: 2020-12-20,
  granularity: null,
  level: null,
  report_name: null,
  start_date: 2020-12-20,
  targeting_types: [&quot;GENDER&quot;]
)
```


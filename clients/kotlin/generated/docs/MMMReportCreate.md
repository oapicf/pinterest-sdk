
# MMMReportCreate

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **columns** | [**kotlin.collections.List&lt;MMMReportingColumn&gt;**](MMMReportingColumn.md) | Metric and entity columns |  |
| **endDate** | **kotlin.String** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
| **granularity** | [**MMMReportGranularity**](MMMReportGranularity.md) |   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. |  |
| **level** | [**MMMReportLevel**](MMMReportLevel.md) | Level of the report |  |
| **reportName** | **kotlin.String** | Name of the Marketing Mix Modeling (MMM) report |  |
| **startDate** | **kotlin.String** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
| **targetingTypes** | [**kotlin.collections.List&lt;MMMReportingTargetingType&gt;**](MMMReportingTargetingType.md) | List of targeting types |  |
| **advertiserIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | Advertiser IDs for multi-advertiser report |  [optional] |
| **countries** | [**kotlin.collections.List&lt;TargetingAdvertiserCountry&gt;**](TargetingAdvertiserCountry.md) | A List of countries for filtering |  [optional] |
| **customColumnIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | List of custom column IDs |  [optional] |




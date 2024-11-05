
# CreateMMMReportRequest

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **reportName** | **kotlin.String** | Name of the Marketing Mix Modeling (MMM) report |  |
| **startDate** | **kotlin.String** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
| **endDate** | **kotlin.String** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
| **granularity** | [**inline**](#Granularity) | DAY - metrics are broken down daily.&lt;br&gt; WEEK - metrics are broken down weekly. |  |
| **level** | [**inline**](#Level) | Level of the report |  |
| **targetingTypes** | [**kotlin.collections.List&lt;MMMReportingTargetingType&gt;**](MMMReportingTargetingType.md) | List of targeting types |  |
| **columns** | [**kotlin.collections.List&lt;MMMReportingColumn&gt;**](MMMReportingColumn.md) | Metric and entity columns |  |
| **countries** | [**kotlin.collections.List&lt;TargetingAdvertiserCountry&gt;**](TargetingAdvertiserCountry.md) | A List of countries for filtering |  [optional] |


<a id="Granularity"></a>
## Enum: granularity
| Name | Value |
| ---- | ----- |
| granularity | DAY, WEEK |


<a id="Level"></a>
## Enum: level
| Name | Value |
| ---- | ----- |
| level | CAMPAIGN_TARGETING, AD_GROUP_TARGETING |




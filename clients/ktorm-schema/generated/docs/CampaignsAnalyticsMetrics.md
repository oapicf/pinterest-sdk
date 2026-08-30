
# Table `CampaignsAnalyticsMetrics`
(mapped from: CampaignsAnalyticsMetrics)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**CAMPAIGN_ID** | CAMPAIGN_ID | text |  | **kotlin.String** | The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true. |  [optional]
**DATE** | DATE | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) |  [optional]





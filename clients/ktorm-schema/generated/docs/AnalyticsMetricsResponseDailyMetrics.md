
# Table `AnalyticsMetricsResponse_daily_metrics`
(mapped from: AnalyticsMetricsResponseDailyMetrics)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**dataStatus** | data_status | text |  | [**data_status**](#DataStatus) | Metrics availablity, e.g., \&quot;READY\&quot;. |  [optional]
**date** | date | text |  | **kotlin.String** | Metrics date (UTC): YYYY-MM-DD. |  [optional]
**metrics** | metrics | blob |  | [**kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | The metric name and daily value for each requested metric |  [optional]






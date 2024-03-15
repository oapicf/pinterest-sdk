
# Table `AnalyticsDailyMetrics`
(mapped from: AnalyticsDailyMetrics)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**dataStatus** | data_status | long |  | [**DataStatus**](DataStatus.md) |  |  [optional] [foreignkey]
**date** | date | text |  | **kotlin.String** | Metrics date (UTC): YYYY-MM-DD. |  [optional]
**metrics** | metrics | blob |  | [**kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | The metric name and daily value for each requested metric |  [optional]






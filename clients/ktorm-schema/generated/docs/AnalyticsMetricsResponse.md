
# Table `AnalyticsMetricsResponse`
(mapped from: AnalyticsMetricsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**summaryMetrics** | summary_metrics | blob |  | [**kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | The metric name and value over the requested period for each requested metric |  [optional]
**dailyMetrics** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AnalyticsDailyMetrics&gt;**](AnalyticsDailyMetrics.md) | Array with the requested daily metric records |  [optional]



# **Table `AnalyticsMetricsResponseAnalyticsDailyMetrics`**
(mapped from: AnalyticsMetricsResponseAnalyticsDailyMetrics)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
analyticsMetricsResponse | analyticsMetricsResponse | long | | kotlin.Long | Primary Key | *one*
analyticsDailyMetrics | analyticsDailyMetrics | long | | kotlin.Long | Foreign Key | *many*




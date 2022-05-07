
# Table `AnalyticsMetricsResponse`
(mapped from: AnalyticsMetricsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**dailyMetrics** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AnalyticsMetricsResponseDailyMetrics&gt;**](AnalyticsMetricsResponseDailyMetrics.md) | Array with the requested daily metric records |  [optional]
**summaryMetrics** | summary_metrics | blob |  | [**kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | The metric name and value over the requested period for each requested metric |  [optional]


# **Table `AnalyticsMetricsResponseAnalyticsMetricsResponseDailyMetrics`**
(mapped from: AnalyticsMetricsResponseAnalyticsMetricsResponseDailyMetrics)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
analyticsMetricsResponse | analyticsMetricsResponse | long | | kotlin.Long | Primary Key | *one*
analyticsMetricsResponseDailyMetrics | analyticsMetricsResponseDailyMetrics | long | | kotlin.Long | Foreign Key | *many*





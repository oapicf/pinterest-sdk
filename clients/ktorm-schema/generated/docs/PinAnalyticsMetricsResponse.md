
# Table `PinAnalyticsMetricsResponse`
(mapped from: PinAnalyticsMetricsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**dailyMetrics** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinAnalyticsDailyMetrics&gt;**](PinAnalyticsDailyMetrics.md) | Array with the requested daily metric records |  [optional]
**lifetimeMetrics** | lifetime_metrics | blob |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.Int&gt;** | The lifetime metric name and value. |  [optional]
**summaryMetrics** | summary_metrics | blob |  | [**kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | The metric name and value over the requested period for each requested metric |  [optional]


# **Table `PinAnalyticsMetricsResponsePinAnalyticsDailyMetrics`**
(mapped from: PinAnalyticsMetricsResponsePinAnalyticsDailyMetrics)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinAnalyticsMetricsResponse | pinAnalyticsMetricsResponse | long | | kotlin.Long | Primary Key | *one*
pinAnalyticsDailyMetrics | pinAnalyticsDailyMetrics | long | | kotlin.Long | Foreign Key | *many*






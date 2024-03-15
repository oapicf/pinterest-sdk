
# Table `PinAnalyticsMetricsResponse`
(mapped from: PinAnalyticsMetricsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**lifetimeMetrics** | lifetime_metrics | blob |  | **kotlin.collections.Map&lt;kotlin.String, kotlin.Int&gt;** | The lifetime metric name and value. |  [optional]
**dailyMetrics** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PinAnalyticsMetricsResponseDailyMetricsInner&gt;**](PinAnalyticsMetricsResponseDailyMetricsInner.md) | Array with the requested daily metric records |  [optional]
**summaryMetrics** | summary_metrics | blob |  | [**kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | The metric name and value over the requested period for each requested metric |  [optional]



# **Table `PinAnalyticsMetricsResponsePinAnalyticsMetricsResponseDailyMetricsInner`**
(mapped from: PinAnalyticsMetricsResponsePinAnalyticsMetricsResponseDailyMetricsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
pinAnalyticsMetricsResponse | pinAnalyticsMetricsResponse | long | | kotlin.Long | Primary Key | *one*
pinAnalyticsMetricsResponseDailyMetricsInner | pinAnalyticsMetricsResponseDailyMetricsInner | long | | kotlin.Long | Foreign Key | *many*





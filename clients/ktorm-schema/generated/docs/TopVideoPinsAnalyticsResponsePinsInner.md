
# Table `TopVideoPinsAnalyticsResponse_pins_inner`
(mapped from: TopVideoPinsAnalyticsResponsePinsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**metrics** | metrics | blob |  | [**kotlin.collections.Map&lt;kotlin.String, java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | The metric name and daily value for each requested metric |  [optional]
**dataStatus** | data_status | blob |  | [**kotlin.collections.Map&lt;kotlin.String, DataStatus&gt;**](DataStatus.md) |  |  [optional]
**pinId** | pin_id | text |  | **kotlin.String** | The pin id |  [optional]






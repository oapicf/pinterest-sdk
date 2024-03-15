
# Table `AdsAnalyticsResponse_inner`
(mapped from: AdsAnalyticsResponseInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**AD_ID** | AD_ID | text NOT NULL |  | **kotlin.String** | The ID of the ad that this metrics belongs to. | 
**DATE** | DATE | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) |  [optional]





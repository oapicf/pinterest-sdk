
# Table `AdAccountAnalyticsResponse_inner`
(mapped from: AdAccountAnalyticsResponseInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**AD_ACCOUNT_ID** | AD_ACCOUNT_ID | text NOT NULL |  | **kotlin.String** | The ID of the advertiser that this metrics belongs to. | 
**DATE** | DATE | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) |  [optional]





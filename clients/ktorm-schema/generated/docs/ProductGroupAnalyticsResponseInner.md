
# Table `ProductGroupAnalyticsResponse_inner`
(mapped from: ProductGroupAnalyticsResponseInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**PRODUCT_GROUP_ID** | PRODUCT_GROUP_ID | text NOT NULL |  | **kotlin.String** | The ID of the product group that this metrics belongs to. | 
**DATE** | DATE | date |  | [**java.time.LocalDate**](java.time.LocalDate.md) | Current metrics date. Only returned when granularity is a time-based value (&#x60;DAY&#x60;, &#x60;HOUR&#x60;, &#x60;WEEK&#x60;, &#x60;MONTH&#x60;) |  [optional]





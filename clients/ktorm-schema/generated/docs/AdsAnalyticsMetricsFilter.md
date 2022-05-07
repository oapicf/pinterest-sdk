
# Table `AdsAnalyticsMetricsFilter`
(mapped from: AdsAnalyticsMetricsFilter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**field** | field | long |  | [**AdsAnalyticsFilterColumn**](AdsAnalyticsFilterColumn.md) |  |  [optional] [foreignkey]
**operator** | operator | long |  | [**AdsAnalyticsFilterOperator**](AdsAnalyticsFilterOperator.md) |  |  [optional] [foreignkey]
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | List of values for filtering |  [optional]




# **Table `AdsAnalyticsMetricsFilterPropertyValues`**
(mapped from: AdsAnalyticsMetricsFilterPropertyValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsMetricsFilter | adsAnalyticsMetricsFilter | long | | kotlin.Long | Primary Key | *one*
propertyValues | propertyValues | decimal | | java.math.BigDecimal | Foreign Key | *many*




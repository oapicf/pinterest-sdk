
# Table `AdsAnalyticsMetricsFilter`
(mapped from: AdsAnalyticsMetricsFilter)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**field** | field | long NOT NULL |  | [**AdsAnalyticsFilterColumn**](AdsAnalyticsFilterColumn.md) |  |  [foreignkey]
**operator** | operator | long NOT NULL |  | [**AdsAnalyticsFilterOperator**](AdsAnalyticsFilterOperator.md) |  |  [foreignkey]
**propertyValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;java.math.BigDecimal&gt;**](java.math.BigDecimal.md) | List of values for filtering | 




# **Table `AdsAnalyticsMetricsFilterPropertyValues`**
(mapped from: AdsAnalyticsMetricsFilterPropertyValues)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsMetricsFilter | adsAnalyticsMetricsFilter | long | | kotlin.Long | Primary Key | *one*
propertyValues | propertyValues | decimal | | java.math.BigDecimal | Foreign Key | *many*




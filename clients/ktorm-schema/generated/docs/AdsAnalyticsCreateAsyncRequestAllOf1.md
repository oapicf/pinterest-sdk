
# Table `AdsAnalyticsCreateAsyncRequest_allOf_1`
(mapped from: AdsAnalyticsCreateAsyncRequestAllOf1)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**columns** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ReportingColumnAsync&gt;**](ReportingColumnAsync.md) | Metric and entity columns | 
**level** | level | long NOT NULL |  | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report |  [foreignkey]
**reportFormat** | report_format | long |  | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting report data |  [optional] [foreignkey]


# **Table `AdsAnalyticsCreateAsyncRequestAllOf1ReportingColumnAsync`**
(mapped from: AdsAnalyticsCreateAsyncRequestAllOf1ReportingColumnAsync)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequestAllOf1 | adsAnalyticsCreateAsyncRequestAllOf1 | long | | kotlin.Long | Primary Key | *one*
reportingColumnAsync | reportingColumnAsync | long | | kotlin.Long | Foreign Key | *many*






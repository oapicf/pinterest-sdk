
# Table `AdsAnalyticsCreateAsyncRequest_allOf`
(mapped from: AdsAnalyticsCreateAsyncRequestAllOf)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**startDate** | start_date | text NOT NULL |  | **kotlin.String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**endDate** | end_date | text NOT NULL |  | **kotlin.String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**granularity** | granularity | long NOT NULL |  | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly |  [foreignkey]
**clickWindowDays** | click_window_days | long |  | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional] [foreignkey]
**engagementWindowDays** | engagement_window_days | long |  | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional] [foreignkey]
**viewWindowDays** | view_window_days | long |  | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. |  [optional] [foreignkey]
**conversionReportTime** | conversion_report_time | long |  | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  [optional] [foreignkey]
**attributionTypes** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report |  [optional]









# **Table `AdsAnalyticsCreateAsyncRequestAllOfConversionReportAttributionType`**
(mapped from: AdsAnalyticsCreateAsyncRequestAllOfConversionReportAttributionType)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
adsAnalyticsCreateAsyncRequestAllOf | adsAnalyticsCreateAsyncRequestAllOf | long | | kotlin.Long | Primary Key | *one*
conversionReportAttributionType | conversionReportAttributionType | long | | kotlin.Long | Foreign Key | *many*




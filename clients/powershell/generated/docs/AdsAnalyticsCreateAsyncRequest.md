# AdsAnalyticsCreateAsyncRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**EndDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**Granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**ClickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**EngagementWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**ViewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**ConversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to "TIME_OF_AD_ACTION"]
**AttributionTypes** | [**ConversionReportAttributionType[]**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] 
**CampaignIds** | **String[]** | List of campaign ids | [optional] 
**CampaignStatuses** | [**CampaignSummaryStatus[]**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**CampaignObjectiveTypes** | [**ObjectiveType[]**](ObjectiveType.md) | List of values for filtering. [&quot;&quot;WEB_SESSIONS&quot;&quot;] in BETA. | [optional] 
**AdGroupIds** | **String[]** | List of ad group ids | [optional] 
**AdGroupStatuses** | [**AdGroupSummaryStatus[]**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**AdIds** | **String[]** | List of ad ids [This parameter is no supported for Product Item Level Reports] | [optional] 
**AdStatuses** | [**PinPromotionSummaryStatus[]**](PinPromotionSummaryStatus.md) | List of values for filtering [This parameter is not supported for Product Item Level Reports] | [optional] 
**ProductGroupIds** | **String[]** | List of product group ids | [optional] 
**ProductGroupStatuses** | [**ProductGroupSummaryStatus[]**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**ProductItemIds** | **String[]** | List of product item ids | [optional] 
**TargetingTypes** | [**AdsAnalyticsTargetingType[]**](AdsAnalyticsTargetingType.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] 
**MetricsFilters** | [**AdsAnalyticsMetricsFilter[]**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 
**Columns** | [**ReportingColumnAsync[]**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. | 
**Level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | 
**ReportFormat** | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. | [optional] [default to "JSON"]

## Examples

- Prepare the resource
```powershell
$AdsAnalyticsCreateAsyncRequest = Initialize-PSOpenAPIToolsAdsAnalyticsCreateAsyncRequest  -StartDate 2020-12-20 `
 -EndDate 2020-12-20 `
 -Granularity null `
 -ClickWindowDays null `
 -EngagementWindowDays null `
 -ViewWindowDays null `
 -ConversionReportTime null `
 -AttributionTypes null `
 -CampaignIds [&quot;12345678&quot;] `
 -CampaignStatuses [&quot;RUNNING&quot;,&quot;PAUSED&quot;] `
 -CampaignObjectiveTypes [&quot;AWARENESS&quot;,&quot;VIDEO_VIEW&quot;] `
 -AdGroupIds [&quot;12345678&quot;] `
 -AdGroupStatuses [&quot;RUNNING&quot;,&quot;PAUSED&quot;] `
 -AdIds [&quot;12345678&quot;] `
 -AdStatuses [&quot;APPROVED&quot;,&quot;PAUSED&quot;] `
 -ProductGroupIds [&quot;12345678&quot;] `
 -ProductGroupStatuses [&quot;RUNNING&quot;,&quot;PAUSED&quot;] `
 -ProductItemIds [&quot;12345678&quot;] `
 -TargetingTypes null `
 -MetricsFilters null `
 -Columns null `
 -Level null `
 -ReportFormat null
```

- Convert the resource to JSON
```powershell
$AdsAnalyticsCreateAsyncRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


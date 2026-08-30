# AdsAnalyticsCreateAsyncRequest
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AdGroupIds** | **String[]** | List of ad group ids | [optional] 
**AdGroupStatuses** | [**AdGroupSummaryStatus[]**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**AdIds** | **String[]** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] 
**AdStatuses** | [**PinPromotionSummaryStatus[]**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] 
**AttributionTypes** | [**ConversionReportAttributionType[]**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional] 
**CampaignBrandLabel** | **String** | Campaign brand label for filtering. | [optional] 
**CampaignCustomLabel** | **String** | Campaign custom label for filtering. | [optional] 
**CampaignIds** | **String[]** | List of campaign ids | [optional] 
**CampaignObjectiveTypes** | [**CampaignObjectiveType[]**](CampaignObjectiveType.md) | List of values for filtering. [&quot;&quot;WEB_SESSIONS&quot;&quot;] is in BETA. | [optional] 
**CampaignStatuses** | [**CampaignSummaryStatus[]**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**ClickWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] 
**Columns** | [**ReportingColumnAsync[]**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] 
**CombineTargetingTypes** | **Boolean** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to $false]
**ConversionReportTime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Date dimension for conversion metrics. | [optional] 
**CustomConversionEventMetrics** | [**CustomConversionEventMetrics[]**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] 
**EndDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**EndHour** | **Int32** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] 
**EngagementWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. | [optional] 
**Granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | 
**Level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | [optional] 
**MetricsFilters** | [**AdsAnalyticsMetricsFilter[]**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 
**PrimarySort** | [**PrimarySort**](PrimarySort.md) |  | [optional] 
**ProductGroupIds** | **String[]** | List of product group ids | [optional] 
**ProductGroupStatuses** | [**ProductGroupSummaryStatus[]**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**ProductItemIds** | **String[]** | List of product item ids | [optional] 
**ReportFormat** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] 
**ReportingTimezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. | [optional] 
**StartDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**StartHour** | **Int32** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] 
**TargetingTypes** | [**AdAdsAnalyticsAsyncTargetingTypes[]**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] 
**ViewWindowDays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] 

## Examples

- Prepare the resource
```powershell
$AdsAnalyticsCreateAsyncRequest = Initialize-PSOpenAPIToolsAdsAnalyticsCreateAsyncRequest  -AdGroupIds null `
 -AdGroupStatuses null `
 -AdIds null `
 -AdStatuses null `
 -AttributionTypes null `
 -CampaignBrandLabel null `
 -CampaignCustomLabel null `
 -CampaignIds null `
 -CampaignObjectiveTypes null `
 -CampaignStatuses null `
 -ClickWindowDays null `
 -Columns null `
 -CombineTargetingTypes null `
 -ConversionReportTime null `
 -CustomConversionEventMetrics null `
 -EndDate null `
 -EndHour null `
 -EngagementWindowDays null `
 -Granularity null `
 -Level null `
 -MetricsFilters null `
 -PrimarySort null `
 -ProductGroupIds null `
 -ProductGroupStatuses null `
 -ProductItemIds null `
 -ReportFormat null `
 -ReportingTimezone null `
 -StartDate null `
 -StartHour null `
 -TargetingTypes null `
 -ViewWindowDays null
```

- Convert the resource to JSON
```powershell
$AdsAnalyticsCreateAsyncRequest | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


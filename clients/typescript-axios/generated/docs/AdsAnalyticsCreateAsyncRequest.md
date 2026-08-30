# AdsAnalyticsCreateAsyncRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ad_group_ids** | **Array&lt;string&gt;** | List of ad group ids | [optional] [default to undefined]
**ad_group_statuses** | [**Array&lt;AdGroupSummaryStatus&gt;**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] [default to undefined]
**ad_ids** | **Array&lt;string&gt;** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] [default to undefined]
**ad_statuses** | [**Array&lt;PinPromotionSummaryStatus&gt;**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] [default to undefined]
**attribution_types** | [**Array&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional] [default to undefined]
**campaign_brand_label** | **string** | Campaign brand label for filtering. | [optional] [default to undefined]
**campaign_custom_label** | **string** | Campaign custom label for filtering. | [optional] [default to undefined]
**campaign_ids** | **Array&lt;string&gt;** | List of campaign ids | [optional] [default to undefined]
**campaign_objective_types** | [**Array&lt;CampaignObjectiveType&gt;**](CampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. | [optional] [default to undefined]
**campaign_statuses** | [**Array&lt;CampaignSummaryStatus&gt;**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] [default to undefined]
**click_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] [default to undefined]
**columns** | [**Array&lt;ReportingColumnAsync&gt;**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] [default to undefined]
**combine_targeting_types** | **boolean** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional] [default to false]
**conversion_report_time** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Date dimension for conversion metrics. | [optional] [default to undefined]
**custom_conversion_event_metrics** | [**Array&lt;CustomConversionEventMetrics&gt;**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] [default to undefined]
**end_date** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | [default to undefined]
**end_hour** | **number** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] [default to undefined]
**engagement_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. | [optional] [default to undefined]
**granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. | [default to undefined]
**level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | [optional] [default to undefined]
**metrics_filters** | [**Array&lt;AdsAnalyticsMetricsFilter&gt;**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] [default to undefined]
**primary_sort** | [**PrimarySort**](PrimarySort.md) |  | [optional] [default to undefined]
**product_group_ids** | **Array&lt;string&gt;** | List of product group ids | [optional] [default to undefined]
**product_group_statuses** | [**Array&lt;ProductGroupSummaryStatus&gt;**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] [default to undefined]
**product_item_ids** | **Array&lt;string&gt;** | List of product item ids | [optional] [default to undefined]
**report_format** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] [default to undefined]
**reporting_timezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. | [optional] [default to undefined]
**start_date** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | [default to undefined]
**start_hour** | **number** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] [default to undefined]
**targeting_types** | [**Array&lt;AdAdsAnalyticsAsyncTargetingTypes&gt;**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] [default to undefined]
**view_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] [default to undefined]

## Example

```typescript
import { AdsAnalyticsCreateAsyncRequest } from './api';

const instance: AdsAnalyticsCreateAsyncRequest = {
    ad_group_ids,
    ad_group_statuses,
    ad_ids,
    ad_statuses,
    attribution_types,
    campaign_brand_label,
    campaign_custom_label,
    campaign_ids,
    campaign_objective_types,
    campaign_statuses,
    click_window_days,
    columns,
    combine_targeting_types,
    conversion_report_time,
    custom_conversion_event_metrics,
    end_date,
    end_hour,
    engagement_window_days,
    granularity,
    level,
    metrics_filters,
    primary_sort,
    product_group_ids,
    product_group_statuses,
    product_item_ids,
    report_format,
    reporting_timezone,
    start_date,
    start_hour,
    targeting_types,
    view_window_days,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

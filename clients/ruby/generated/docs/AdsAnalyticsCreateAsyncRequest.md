# PinterestSdkClient::AdsAnalyticsCreateAsyncRequest

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **ad_group_ids** | **Array&lt;String&gt;** | List of ad group ids | [optional] |
| **ad_group_statuses** | [**Array&lt;AdGroupSummaryStatus&gt;**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] |
| **ad_ids** | **Array&lt;String&gt;** | List of ad ids. This parameter is not supported for Product Item level reports. | [optional] |
| **ad_statuses** | [**Array&lt;PinPromotionSummaryStatus&gt;**](PinPromotionSummaryStatus.md) | List of values for filtering. This parameter is not supported for Product Item level reports. | [optional] |
| **attribution_types** | [**Array&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md) | List of attribution types for the conversion report. | [optional] |
| **campaign_brand_label** | **String** | Campaign brand label for filtering. | [optional] |
| **campaign_custom_label** | **String** | Campaign custom label for filtering. | [optional] |
| **campaign_ids** | **Array&lt;String&gt;** | List of campaign ids | [optional] |
| **campaign_objective_types** | [**Array&lt;CampaignObjectiveType&gt;**](CampaignObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. | [optional] |
| **campaign_statuses** | [**Array&lt;CampaignSummaryStatus&gt;**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] |
| **click_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. | [optional] |
| **columns** | [**Array&lt;ReportingColumnAsync&gt;**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. | [optional] |
| **combine_targeting_types** | **Boolean** | Determines if the targeting types included in the request should be consolidated into a single breakdown. | [optional][default to false] |
| **conversion_report_time** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | Date dimension for conversion metrics. | [optional] |
| **custom_conversion_event_metrics** | [**Array&lt;CustomConversionEventMetrics&gt;**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] |
| **end_date** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
| **end_hour** | **Integer** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. | [optional] |
| **engagement_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. | [optional] |
| **granularity** | [**Granularity**](Granularity.md) |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. |  |
| **level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | [optional] |
| **metrics_filters** | [**Array&lt;AdsAnalyticsMetricsFilter&gt;**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] |
| **primary_sort** | [**PrimarySort**](PrimarySort.md) |  | [optional] |
| **product_group_ids** | **Array&lt;String&gt;** | List of product group ids | [optional] |
| **product_group_statuses** | [**Array&lt;ProductGroupSummaryStatus&gt;**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] |
| **product_item_ids** | **Array&lt;String&gt;** | List of product item ids | [optional] |
| **report_format** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] |
| **reporting_timezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. | [optional] |
| **start_date** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
| **start_hour** | **Integer** | Which hour of the start date to begin the report. Only allowed for hourly reports. | [optional] |
| **targeting_types** | [**Array&lt;AdAdsAnalyticsAsyncTargetingTypes&gt;**](AdAdsAnalyticsAsyncTargetingTypes.md) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. | [optional] |
| **view_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. | [optional] |

## Example

```ruby
require 'pinterest_sdk'

instance = PinterestSdkClient::AdsAnalyticsCreateAsyncRequest.new(
  ad_group_ids: null,
  ad_group_statuses: null,
  ad_ids: null,
  ad_statuses: null,
  attribution_types: null,
  campaign_brand_label: null,
  campaign_custom_label: null,
  campaign_ids: null,
  campaign_objective_types: null,
  campaign_statuses: null,
  click_window_days: null,
  columns: null,
  combine_targeting_types: null,
  conversion_report_time: null,
  custom_conversion_event_metrics: null,
  end_date: null,
  end_hour: null,
  engagement_window_days: null,
  granularity: null,
  level: null,
  metrics_filters: null,
  primary_sort: null,
  product_group_ids: null,
  product_group_statuses: null,
  product_item_ids: null,
  report_format: null,
  reporting_timezone: null,
  start_date: null,
  start_hour: null,
  targeting_types: null,
  view_window_days: null
)
```


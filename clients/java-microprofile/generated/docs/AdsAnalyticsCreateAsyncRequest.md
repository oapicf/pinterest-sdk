

# AdsAnalyticsCreateAsyncRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**adGroupIds** | **List&lt;String&gt;** | List of ad group ids |  [optional] |
|**adGroupStatuses** | **List&lt;AdGroupSummaryStatus&gt;** | List of values for filtering |  [optional] |
|**adIds** | **List&lt;String&gt;** | List of ad ids. This parameter is not supported for Product Item level reports. |  [optional] |
|**adStatuses** | **List&lt;PinPromotionSummaryStatus&gt;** | List of values for filtering. This parameter is not supported for Product Item level reports. |  [optional] |
|**attributionTypes** | **List&lt;ConversionReportAttributionType&gt;** | List of attribution types for the conversion report. |  [optional] |
|**campaignBrandLabel** | **String** | Campaign brand label for filtering. |  [optional] |
|**campaignCustomLabel** | **String** | Campaign custom label for filtering. |  [optional] |
|**campaignIds** | **List&lt;String&gt;** | List of campaign ids |  [optional] |
|**campaignObjectiveTypes** | **List&lt;CampaignObjectiveType&gt;** | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] is in BETA. |  [optional] |
|**campaignStatuses** | **List&lt;CampaignSummaryStatus&gt;** | List of status values for filtering |  [optional] |
|**clickWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for a pin click action. |  [optional] |
|**columns** | **List&lt;ReportingColumnAsync&gt;** | Metric and entity columns. Pin promotion and ad related columns are not supported for Product Item level reports. |  [optional] |
|**combineTargetingTypes** | **Boolean** | Determines if the targeting types included in the request should be consolidated into a single breakdown. |  [optional] |
|**conversionReportTime** | **ConversionReportTimeType** | Date dimension for conversion metrics. |  [optional] |
|**customConversionEventMetrics** | [**List&lt;CustomConversionEventMetrics&gt;**](CustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report |  [optional] |
|**endDate** | **String** | Metric report end date (UTC). Format: YYYY-MM-DD |  |
|**endHour** | **Integer** | Which hour of the end date to stop the report (inclusive). Only allowed for hourly reports. |  [optional] |
|**engagementWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for an engagement action. |  [optional] |
|**granularity** | **Granularity** |   TOTAL - metrics are aggregated over the specified date range.   DAY - metrics are broken down daily.   HOUR - metrics are broken down hourly.   WEEKLY - metrics are broken down weekly.   MONTHLY - metrics are broken down monthly. |  |
|**level** | **MetricsReportingLevel** | Level of the report |  [optional] |
|**metricsFilters** | [**List&lt;AdsAnalyticsMetricsFilter&gt;**](AdsAnalyticsMetricsFilter.md) | List of metrics filters |  [optional] |
|**primarySort** | **PrimarySort** |  |  [optional] |
|**productGroupIds** | **List&lt;String&gt;** | List of product group ids |  [optional] |
|**productGroupStatuses** | **List&lt;ProductGroupSummaryStatus&gt;** | List of values for filtering |  [optional] |
|**productItemIds** | **List&lt;String&gt;** | List of product item ids |  [optional] |
|**reportFormat** | **DataOutputFormat** |  |  [optional] |
|**reportingTimezone** | **ReportingTimeZone** | Specify the timezone to be applied for the reporting. |  [optional] |
|**startDate** | **String** | Metric report start date (UTC). Format: YYYY-MM-DD |  |
|**startHour** | **Integer** | Which hour of the start date to begin the report. Only allowed for hourly reports. |  [optional] |
|**targetingTypes** | **List&lt;AdAdsAnalyticsAsyncTargetingTypes&gt;** | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. |  [optional] |
|**viewWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for a view action. |  [optional] |




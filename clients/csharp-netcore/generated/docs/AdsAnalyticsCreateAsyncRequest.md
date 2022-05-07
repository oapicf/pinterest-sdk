# Org.OpenAPITools.Model.AdsAnalyticsCreateAsyncRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**StartDate** | **string** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**EndDate** | **string** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**Granularity** | **Granularity** | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**ClickWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**EngagementWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to 30]
**ViewWindowDays** | **ConversionAttributionWindowDays** | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to 1]
**ConversionReportTime** | **ConversionReportTimeType** | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to "TIME_OF_AD_ACTION"]
**AttributionTypes** | [**List&lt;ConversionReportAttributionType&gt;**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] 
**Columns** | [**List&lt;ReportingColumnAsync&gt;**](ReportingColumnAsync.md) | Metric and entity columns | 
**Level** | **MetricsReportingLevel** | Level of the report | 
**ReportFormat** | **DataOutputFormat** | Specification for formatting report data | [optional] [default to "JSON"]
**CampaignIds** | **List&lt;string&gt;** | List of campaign ids | [optional] 
**CampaignStatuses** | [**List&lt;CampaignSummaryStatus&gt;**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**CampaignObjectiveTypes** | [**List&lt;ObjectiveType&gt;**](ObjectiveType.md) | List of values for filtering | [optional] 
**AdGroupIds** | **List&lt;string&gt;** | List of ad group ids | [optional] 
**AdGroupStatuses** | [**List&lt;AdGroupSummaryStatus&gt;**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**AdIds** | **List&lt;string&gt;** | List of ad ids | [optional] 
**AdStatuses** | [**List&lt;PinPromotionSummaryStatus&gt;**](PinPromotionSummaryStatus.md) | List of values for filtering | [optional] 
**ProductGroupIds** | **List&lt;string&gt;** | List of product group ids | [optional] 
**ProductGroupStatuses** | [**List&lt;ProductGroupSummaryStatus&gt;**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**ProductItemIds** | **List&lt;string&gt;** | List of product item ids | [optional] 
**TargetingTypes** | [**List&lt;AdsAnalyticsTargetingType&gt;**](AdsAnalyticsTargetingType.md) | List of targeting types | [optional] 
**MetricsFilters** | [**List&lt;AdsAnalyticsMetricsFilter&gt;**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


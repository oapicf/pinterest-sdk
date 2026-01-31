# AdsAnalyticsCreateAsyncRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attribution_types** | [**List[ConversionReportAttributionType]**](ConversionReportAttributionType.md) | List of types of attribution for the conversion report | [optional] 
**click_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ConversionAttributionWindowDays.NUMBER_30]
**conversion_report_time** | [**ConversionReportTimeType**](ConversionReportTimeType.md) | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. | [optional] [default to 'TIME_OF_AD_ACTION']
**end_date** | **str** | Metric report end date (UTC). Format: YYYY-MM-DD | 
**engagement_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. | [optional] [default to ConversionAttributionWindowDays.NUMBER_30]
**granularity** | [**Granularity**](Granularity.md) | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**start_date** | **str** | Metric report start date (UTC). Format: YYYY-MM-DD | 
**view_window_days** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. | [optional] [default to ConversionAttributionWindowDays.NUMBER_1]
**campaign_ids** | **List[str]** | List of campaign ids | [optional] 
**campaign_statuses** | [**List[CampaignSummaryStatus]**](CampaignSummaryStatus.md) | List of status values for filtering | [optional] 
**campaign_objective_types** | [**List[ObjectiveType]**](ObjectiveType.md) | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA. | [optional] 
**campaign_brand_label** | **str** | Campaign brand label for filtering. | [optional] 
**ad_group_ids** | **List[str]** | List of ad group ids | [optional] 
**ad_group_statuses** | [**List[AdGroupSummaryStatus]**](AdGroupSummaryStatus.md) | List of values for filtering | [optional] 
**ad_ids** | **List[str]** | List of ad ids [This parameter is no supported for Product Item Level Reports] | [optional] 
**ad_statuses** | [**List[PinPromotionSummaryStatus]**](PinPromotionSummaryStatus.md) | List of values for filtering [This parameter is not supported for Product Item Level Reports] | [optional] 
**product_group_ids** | **List[str]** | List of product group ids | [optional] 
**product_group_statuses** | [**List[ProductGroupSummaryStatus]**](ProductGroupSummaryStatus.md) | List of values for filtering | [optional] 
**product_item_ids** | **List[str]** | List of product item ids | [optional] 
**targeting_types** | **List[str]** | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AUDIENCE_MULTIPLIER\&quot;] is only available in CAMPAIGN_TARGETING level. [\&quot;MEDIA_TYPE\&quot;] is only available in PRODUCT_ITEM_TARGETING level. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. | [optional] 
**metrics_filters** | [**List[AdsAnalyticsMetricsFilter]**](AdsAnalyticsMetricsFilter.md) | List of metrics filters | [optional] 
**columns** | [**List[ReportingColumnAsync]**](ReportingColumnAsync.md) | Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. | 
**combine_targeting_types** | **bool** | Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&amp;US. This feature is currently in BETA and is not available to all users. | [optional] [default to False]
**custom_conversion_event_metrics** | [**List[AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics]**](AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report | [optional] 
**end_hour** | **int** | Which hour of the end date to stop the report (inclusive). For example, with an end_date of &#39;2020-01-01&#39; and end_hour of &#39;15&#39;, the report will contain metrics up to &#39;2020-01-01 14:59:59&#39;. The entire day will be included if no end hour is provided. Only allowed for hourly reports. | [optional] 
**level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) | Level of the report | 
**primary_sort** | **str** | Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests. | [optional] 
**report_format** | [**DataOutputFormat**](DataOutputFormat.md) | Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. | [optional] [default to 'JSON']
**reporting_timezone** | [**ReportingTimeZone**](ReportingTimeZone.md) | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. | [optional] 
**start_hour** | **int** | Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports. | [optional] 

## Example

```python
from pinterestsdk.models.ads_analytics_create_async_request import AdsAnalyticsCreateAsyncRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AdsAnalyticsCreateAsyncRequest from a JSON string
ads_analytics_create_async_request_instance = AdsAnalyticsCreateAsyncRequest.from_json(json)
# print the JSON string representation of the object
print(AdsAnalyticsCreateAsyncRequest.to_json())

# convert the object into a dict
ads_analytics_create_async_request_dict = ads_analytics_create_async_request_instance.to_dict()
# create an instance of AdsAnalyticsCreateAsyncRequest from a dict
ads_analytics_create_async_request_from_dict = AdsAnalyticsCreateAsyncRequest.from_dict(ads_analytics_create_async_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



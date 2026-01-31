

# AdsAnalyticsCreateAsyncRequest

The class is defined in **[AdsAnalyticsCreateAsyncRequest.java](../../src/main/java/org/openapitools/model/AdsAnalyticsCreateAsyncRequest.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributionTypes** | `List&lt;ConversionReportAttributionType&gt;` | List of types of attribution for the conversion report |  [optional property]
**clickWindowDays** | `ConversionAttributionWindowDays` | Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional property]
**conversionReportTime** | `ConversionReportTimeType` | The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. |  [optional property]
**endDate** | `String` | Metric report end date (UTC). Format: YYYY-MM-DD | 
**engagementWindowDays** | `ConversionAttributionWindowDays` | Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;30&#x60; days. |  [optional property]
**granularity** | `Granularity` | TOTAL - metrics are aggregated over the specified date range.&lt;br&gt; DAY - metrics are broken down daily.&lt;br&gt; HOUR - metrics are broken down hourly.&lt;br&gt;WEEKLY - metrics are broken down weekly.&lt;br&gt;MONTHLY - metrics are broken down monthly | 
**startDate** | `String` | Metric report start date (UTC). Format: YYYY-MM-DD | 
**viewWindowDays** | `ConversionAttributionWindowDays` | Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to &#x60;1&#x60; day. |  [optional property]
**campaignIds** | `List&lt;String&gt;` | List of campaign ids |  [optional property]
**campaignStatuses** | `List&lt;CampaignSummaryStatus&gt;` | List of status values for filtering |  [optional property]
**campaignObjectiveTypes** | `List&lt;ObjectiveType&gt;` | List of values for filtering. [\&quot;WEB_SESSIONS\&quot;] in BETA. |  [optional property]
**campaignBrandLabel** | `String` | Campaign brand label for filtering. |  [optional property]
**adGroupIds** | `List&lt;String&gt;` | List of ad group ids |  [optional property]
**adGroupStatuses** | `List&lt;AdGroupSummaryStatus&gt;` | List of values for filtering |  [optional property]
**adIds** | `List&lt;String&gt;` | List of ad ids [This parameter is no supported for Product Item Level Reports] |  [optional property]
**adStatuses** | `List&lt;PinPromotionSummaryStatus&gt;` | List of values for filtering [This parameter is not supported for Product Item Level Reports] |  [optional property]
**productGroupIds** | `List&lt;String&gt;` | List of product group ids |  [optional property]
**productGroupStatuses** | `List&lt;ProductGroupSummaryStatus&gt;` | List of values for filtering |  [optional property]
**productItemIds** | `List&lt;String&gt;` | List of product item ids |  [optional property]
**targetingTypes** | [**List&lt;TargetingTypesEnum&gt;**](#List&lt;TargetingTypesEnum&gt;) | List of targeting types. Requires &#x60;level&#x60; to be a value ending in &#x60;_TARGETING&#x60;. [\&quot;AUDIENCE_MULTIPLIER\&quot;] is only available in CAMPAIGN_TARGETING level. [\&quot;MEDIA_TYPE\&quot;] is only available in PRODUCT_ITEM_TARGETING level. [\&quot;AGE_BUCKET_AND_GENDER\&quot;] is in BETA and not yet available to all users. |  [optional property]
**metricsFilters** | [`List&lt;AdsAnalyticsMetricsFilter&gt;`](AdsAnalyticsMetricsFilter.md) | List of metrics filters |  [optional property]
**columns** | `List&lt;ReportingColumnAsync&gt;` | Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports. | 
**combineTargetingTypes** | `Boolean` | Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&amp;US. This feature is currently in BETA and is not available to all users. |  [optional property]
**customConversionEventMetrics** | [`List&lt;AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics&gt;`](AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.md) | List of advertiser-defined custom conversion event metrics to include in the report |  [optional property]
**endHour** | `Integer` | Which hour of the end date to stop the report (inclusive). For example, with an end_date of &#39;2020-01-01&#39; and end_hour of &#39;15&#39;, the report will contain metrics up to &#39;2020-01-01 14:59:59&#39;. The entire day will be included if no end hour is provided. Only allowed for hourly reports. |  [optional property]
**level** | `MetricsReportingLevel` | Level of the report | 
**primarySort** | [**PrimarySortEnum**](#PrimarySortEnum) | Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests. |  [optional property]
**reportFormat** | `DataOutputFormat` | Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0. |  [optional property]
**reportingTimezone** | `ReportingTimeZone` | Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users. |  [optional property]
**startHour** | `Integer` | Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports. |  [optional property]




















## List&lt;TargetingTypesEnum&gt;

Name | Value
---- | -----
KEYWORD | `"KEYWORD"`
APPTYPE | `"APPTYPE"`
GENDER | `"GENDER"`
LOCATION | `"LOCATION"`
PLACEMENT | `"PLACEMENT"`
COUNTRY | `"COUNTRY"`
TARGETED_INTEREST | `"TARGETED_INTEREST"`
PINNER_INTEREST | `"PINNER_INTEREST"`
AUDIENCE_INCLUDE | `"AUDIENCE_INCLUDE"`
GEO | `"GEO"`
AGE_BUCKET | `"AGE_BUCKET"`
REGION | `"REGION"`
MEDIA_TYPE | `"MEDIA_TYPE"`
AGE_BUCKET_AND_GENDER | `"AGE_BUCKET_AND_GENDER"`
AUDIENCE_MULTIPLIER | `"AUDIENCE_MULTIPLIER"`
CREATIVE_ENHANCEMENTS | `"CREATIVE_ENHANCEMENTS"`
LOCAL_ADS_STORE_CODE | `"LOCAL_ADS_STORE_CODE"`







## PrimarySortEnum

Name | Value
---- | -----
BY_ID | `"BY_ID"`
BY_DATE | `"BY_DATE"`






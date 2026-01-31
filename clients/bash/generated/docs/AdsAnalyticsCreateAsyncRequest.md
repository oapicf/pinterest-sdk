# AdsAnalyticsCreateAsyncRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributionUnderscoretypes** | [**array[ConversionReportAttributionType]**](ConversionReportAttributionType.md) |  | [optional] [default to null]
**clickUnderscorewindowUnderscoredays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) |  | [optional] [default to 30]
**conversionUnderscorereportUnderscoretime** | [**ConversionReportTimeType**](ConversionReportTimeType.md) |  | [optional] [default to TIME_OF_AD_ACTION]
**endUnderscoredate** | **string** |  | [default to null]
**engagementUnderscorewindowUnderscoredays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) |  | [optional] [default to 30]
**granularity** | [**Granularity**](Granularity.md) |  | [default to null]
**startUnderscoredate** | **string** |  | [default to null]
**viewUnderscorewindowUnderscoredays** | [**ConversionAttributionWindowDays**](ConversionAttributionWindowDays.md) |  | [optional] [default to 1]
**campaignUnderscoreids** | **array[string]** |  | [optional] [default to null]
**campaignUnderscorestatuses** | [**array[CampaignSummaryStatus]**](CampaignSummaryStatus.md) |  | [optional] [default to null]
**campaignUnderscoreobjectiveUnderscoretypes** | [**array[ObjectiveType]**](ObjectiveType.md) |  | [optional] [default to null]
**campaignUnderscorebrandUnderscorelabel** | **string** |  | [optional] [default to null]
**adUnderscoregroupUnderscoreids** | **array[string]** |  | [optional] [default to null]
**adUnderscoregroupUnderscorestatuses** | [**array[AdGroupSummaryStatus]**](AdGroupSummaryStatus.md) |  | [optional] [default to null]
**adUnderscoreids** | **array[string]** |  | [optional] [default to null]
**adUnderscorestatuses** | [**array[PinPromotionSummaryStatus]**](PinPromotionSummaryStatus.md) |  | [optional] [default to null]
**productUnderscoregroupUnderscoreids** | **array[string]** |  | [optional] [default to null]
**productUnderscoregroupUnderscorestatuses** | [**array[ProductGroupSummaryStatus]**](ProductGroupSummaryStatus.md) |  | [optional] [default to null]
**productUnderscoreitemUnderscoreids** | **array[string]** |  | [optional] [default to null]
**targetingUnderscoretypes** | **array[string]** |  | [optional] [default to null]
**metricsUnderscorefilters** | [**array[AdsAnalyticsMetricsFilter]**](AdsAnalyticsMetricsFilter.md) |  | [optional] [default to null]
**columns** | [**array[ReportingColumnAsync]**](ReportingColumnAsync.md) |  | [default to null]
**combineUnderscoretargetingUnderscoretypes** | **boolean** |  | [optional] [default to false]
**customUnderscoreconversionUnderscoreeventUnderscoremetrics** | [**array[AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics]**](AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.md) |  | [optional] [default to null]
**endUnderscorehour** | **integer** |  | [optional] [default to null]
**level** | [**MetricsReportingLevel**](MetricsReportingLevel.md) |  | [default to null]
**primaryUnderscoresort** | **string** |  | [optional] [default to null]
**reportUnderscoreformat** | [**DataOutputFormat**](DataOutputFormat.md) |  | [optional] [default to JSON]
**reportingUnderscoretimezone** | [**ReportingTimeZone**](ReportingTimeZone.md) |  | [optional] [default to null]
**startUnderscorehour** | **integer** |  | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



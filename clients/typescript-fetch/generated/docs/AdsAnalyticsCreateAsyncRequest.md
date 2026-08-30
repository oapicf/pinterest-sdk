
# AdsAnalyticsCreateAsyncRequest


## Properties

Name | Type
------------ | -------------
`adGroupIds` | Array&lt;string&gt;
`adGroupStatuses` | [Array&lt;AdGroupSummaryStatus&gt;](AdGroupSummaryStatus.md)
`adIds` | Array&lt;string&gt;
`adStatuses` | [Array&lt;PinPromotionSummaryStatus&gt;](PinPromotionSummaryStatus.md)
`attributionTypes` | [Array&lt;ConversionReportAttributionType&gt;](ConversionReportAttributionType.md)
`campaignBrandLabel` | string
`campaignCustomLabel` | string
`campaignIds` | Array&lt;string&gt;
`campaignObjectiveTypes` | [Array&lt;CampaignObjectiveType&gt;](CampaignObjectiveType.md)
`campaignStatuses` | [Array&lt;CampaignSummaryStatus&gt;](CampaignSummaryStatus.md)
`clickWindowDays` | [ConversionAttributionWindowDays](ConversionAttributionWindowDays.md)
`columns` | [Array&lt;ReportingColumnAsync&gt;](ReportingColumnAsync.md)
`combineTargetingTypes` | boolean
`conversionReportTime` | [ConversionReportTimeType](ConversionReportTimeType.md)
`customConversionEventMetrics` | [Array&lt;CustomConversionEventMetrics&gt;](CustomConversionEventMetrics.md)
`endDate` | string
`endHour` | number
`engagementWindowDays` | [ConversionAttributionWindowDays](ConversionAttributionWindowDays.md)
`granularity` | [Granularity](Granularity.md)
`level` | [MetricsReportingLevel](MetricsReportingLevel.md)
`metricsFilters` | [Array&lt;AdsAnalyticsMetricsFilter&gt;](AdsAnalyticsMetricsFilter.md)
`primarySort` | [PrimarySort](PrimarySort.md)
`productGroupIds` | Array&lt;string&gt;
`productGroupStatuses` | [Array&lt;ProductGroupSummaryStatus&gt;](ProductGroupSummaryStatus.md)
`productItemIds` | Array&lt;string&gt;
`reportFormat` | [DataOutputFormat](DataOutputFormat.md)
`reportingTimezone` | [ReportingTimeZone](ReportingTimeZone.md)
`startDate` | string
`startHour` | number
`targetingTypes` | [Array&lt;AdAdsAnalyticsAsyncTargetingTypes&gt;](AdAdsAnalyticsAsyncTargetingTypes.md)
`viewWindowDays` | [ConversionAttributionWindowDays](ConversionAttributionWindowDays.md)

## Example

```typescript
import type { AdsAnalyticsCreateAsyncRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "adGroupIds": null,
  "adGroupStatuses": null,
  "adIds": null,
  "adStatuses": null,
  "attributionTypes": null,
  "campaignBrandLabel": null,
  "campaignCustomLabel": null,
  "campaignIds": null,
  "campaignObjectiveTypes": null,
  "campaignStatuses": null,
  "clickWindowDays": null,
  "columns": null,
  "combineTargetingTypes": null,
  "conversionReportTime": null,
  "customConversionEventMetrics": null,
  "endDate": null,
  "endHour": null,
  "engagementWindowDays": null,
  "granularity": null,
  "level": null,
  "metricsFilters": null,
  "primarySort": null,
  "productGroupIds": null,
  "productGroupStatuses": null,
  "productItemIds": null,
  "reportFormat": null,
  "reportingTimezone": null,
  "startDate": null,
  "startHour": null,
  "targetingTypes": null,
  "viewWindowDays": null,
} satisfies AdsAnalyticsCreateAsyncRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdsAnalyticsCreateAsyncRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# AdsAnalyticsCreateAsyncRequest


## Properties

Name | Type
------------ | -------------
`startDate` | string
`endDate` | string
`granularity` | [Granularity](Granularity.md)
`clickWindowDays` | [ConversionAttributionWindowDays](ConversionAttributionWindowDays.md)
`engagementWindowDays` | [ConversionAttributionWindowDays](ConversionAttributionWindowDays.md)
`viewWindowDays` | [ConversionAttributionWindowDays](ConversionAttributionWindowDays.md)
`conversionReportTime` | [ConversionReportTimeType](ConversionReportTimeType.md)
`attributionTypes` | [Array&lt;ConversionReportAttributionType&gt;](ConversionReportAttributionType.md)
`campaignIds` | Array&lt;string&gt;
`campaignStatuses` | [Array&lt;CampaignSummaryStatus&gt;](CampaignSummaryStatus.md)
`campaignObjectiveTypes` | [Array&lt;ObjectiveType&gt;](ObjectiveType.md)
`adGroupIds` | Array&lt;string&gt;
`adGroupStatuses` | [Array&lt;AdGroupSummaryStatus&gt;](AdGroupSummaryStatus.md)
`adIds` | Array&lt;string&gt;
`adStatuses` | [Array&lt;PinPromotionSummaryStatus&gt;](PinPromotionSummaryStatus.md)
`productGroupIds` | Array&lt;string&gt;
`productGroupStatuses` | [Array&lt;ProductGroupSummaryStatus&gt;](ProductGroupSummaryStatus.md)
`productItemIds` | Array&lt;string&gt;
`targetingTypes` | [Array&lt;AdsAnalyticsTargetingType&gt;](AdsAnalyticsTargetingType.md)
`metricsFilters` | [Array&lt;AdsAnalyticsMetricsFilter&gt;](AdsAnalyticsMetricsFilter.md)
`columns` | [Array&lt;ReportingColumnAsync&gt;](ReportingColumnAsync.md)
`level` | [MetricsReportingLevel](MetricsReportingLevel.md)
`reportFormat` | [DataOutputFormat](DataOutputFormat.md)
`primarySort` | string
`startHour` | number
`endHour` | number

## Example

```typescript
import type { AdsAnalyticsCreateAsyncRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "startDate": 2020-12-20,
  "endDate": 2020-12-20,
  "granularity": null,
  "clickWindowDays": null,
  "engagementWindowDays": null,
  "viewWindowDays": null,
  "conversionReportTime": null,
  "attributionTypes": null,
  "campaignIds": ["12345678"],
  "campaignStatuses": ["RUNNING","PAUSED"],
  "campaignObjectiveTypes": ["AWARENESS","VIDEO_VIEW"],
  "adGroupIds": ["12345678"],
  "adGroupStatuses": ["RUNNING","PAUSED"],
  "adIds": ["12345678"],
  "adStatuses": ["APPROVED","PAUSED"],
  "productGroupIds": ["12345678"],
  "productGroupStatuses": ["RUNNING","PAUSED"],
  "productItemIds": ["12345678"],
  "targetingTypes": null,
  "metricsFilters": null,
  "columns": null,
  "level": null,
  "reportFormat": null,
  "primarySort": BY_ID,
  "startHour": null,
  "endHour": null,
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




# AdsAnalyticsCreateAsyncRequest


## Properties

Name | Type
------------ | -------------
`attributionTypes` | [Array&lt;ConversionReportAttributionType&gt;](ConversionReportAttributionType.md)
`clickWindowDays` | [ConversionAttributionWindowDays](ConversionAttributionWindowDays.md)
`conversionReportTime` | [ConversionReportTimeType](ConversionReportTimeType.md)
`endDate` | string
`engagementWindowDays` | [ConversionAttributionWindowDays](ConversionAttributionWindowDays.md)
`granularity` | [Granularity](Granularity.md)
`startDate` | string
`viewWindowDays` | [ConversionAttributionWindowDays](ConversionAttributionWindowDays.md)
`campaignIds` | Array&lt;string&gt;
`campaignStatuses` | [Array&lt;CampaignSummaryStatus&gt;](CampaignSummaryStatus.md)
`campaignObjectiveTypes` | [Array&lt;ObjectiveType&gt;](ObjectiveType.md)
`campaignBrandLabel` | string
`adGroupIds` | Array&lt;string&gt;
`adGroupStatuses` | [Array&lt;AdGroupSummaryStatus&gt;](AdGroupSummaryStatus.md)
`adIds` | Array&lt;string&gt;
`adStatuses` | [Array&lt;PinPromotionSummaryStatus&gt;](PinPromotionSummaryStatus.md)
`productGroupIds` | Array&lt;string&gt;
`productGroupStatuses` | [Array&lt;ProductGroupSummaryStatus&gt;](ProductGroupSummaryStatus.md)
`productItemIds` | Array&lt;string&gt;
`targetingTypes` | Array&lt;string&gt;
`metricsFilters` | [Array&lt;AdsAnalyticsMetricsFilter&gt;](AdsAnalyticsMetricsFilter.md)
`columns` | [Array&lt;ReportingColumnAsync&gt;](ReportingColumnAsync.md)
`combineTargetingTypes` | boolean
`customConversionEventMetrics` | [Array&lt;AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics&gt;](AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics.md)
`endHour` | number
`level` | [MetricsReportingLevel](MetricsReportingLevel.md)
`primarySort` | string
`reportFormat` | [DataOutputFormat](DataOutputFormat.md)
`reportingTimezone` | [ReportingTimeZone](ReportingTimeZone.md)
`startHour` | number

## Example

```typescript
import type { AdsAnalyticsCreateAsyncRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "attributionTypes": null,
  "clickWindowDays": null,
  "conversionReportTime": null,
  "endDate": 2020-12-20,
  "engagementWindowDays": null,
  "granularity": null,
  "startDate": 2020-12-20,
  "viewWindowDays": null,
  "campaignIds": ["12345678"],
  "campaignStatuses": ["RUNNING","PAUSED"],
  "campaignObjectiveTypes": ["AWARENESS"],
  "campaignBrandLabel": Brand,
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
  "combineTargetingTypes": false,
  "customConversionEventMetrics": null,
  "endHour": null,
  "level": null,
  "primarySort": BY_ID,
  "reportFormat": null,
  "reportingTimezone": null,
  "startHour": null,
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



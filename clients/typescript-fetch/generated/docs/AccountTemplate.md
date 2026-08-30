
# AccountTemplate


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`adAccountIds` | Array&lt;string&gt;
`adeColumns` | Array&lt;string&gt;
`attributionType` | any
`clickWindowDays` | number
`columns` | [Array&lt;ReportingColumn&gt;](ReportingColumn.md)
`conversionReportTimeType` | [ConversionReportTimeType](ConversionReportTimeType.md)
`creationSource` | [CreationSource](CreationSource.md)
`customColumnIds` | Array&lt;string&gt;
`displayMetadata` | string
`engagementWindowDays` | number
`filtersJson` | string
`granularity` | [Granularity](Granularity.md)
`id` | string
`ingestionSources` | [Array&lt;IngestionSource&gt;](IngestionSource.md)
`isDefault` | boolean
`isDeleted` | boolean
`isOwnedByUser` | boolean
`isScheduled` | boolean
`name` | string
`reportEndRelativeDaysInPast` | number
`reportFormat` | [DataOutputFormat](DataOutputFormat.md)
`reportLevel` | [MetricsReportingLevel](MetricsReportingLevel.md)
`reportStartRelativeDaysInPast` | number
`reportingTimeZone` | [ReportingTimeZone](ReportingTimeZone.md)
`sortBy` | any
`type` | string
`updatedTime` | number
`userId` | string
`viewWindowDays` | number

## Example

```typescript
import type { AccountTemplate } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": null,
  "adAccountIds": null,
  "adeColumns": ["ADE_COST_PER_ACTION-download_picture"],
  "attributionType": ADVERTISER_LEVEL,
  "clickWindowDays": null,
  "columns": null,
  "conversionReportTimeType": null,
  "creationSource": null,
  "customColumnIds": null,
  "displayMetadata": null,
  "engagementWindowDays": null,
  "filtersJson": null,
  "granularity": null,
  "id": null,
  "ingestionSources": null,
  "isDefault": false,
  "isDeleted": null,
  "isOwnedByUser": null,
  "isScheduled": null,
  "name": null,
  "reportEndRelativeDaysInPast": null,
  "reportFormat": null,
  "reportLevel": null,
  "reportStartRelativeDaysInPast": null,
  "reportingTimeZone": null,
  "sortBy": null,
  "type": null,
  "updatedTime": null,
  "userId": null,
  "viewWindowDays": null,
} satisfies AccountTemplate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AccountTemplate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



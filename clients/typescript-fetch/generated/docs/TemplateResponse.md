
# TemplateResponse

Template fields

## Properties

Name | Type
------------ | -------------
`id` | string
`adAccountId` | string
`adAccountIds` | Array&lt;string&gt;
`userId` | string
`name` | string
`reportStartRelativeDaysInPast` | number
`reportEndRelativeDaysInPast` | number
`dateRange` | [TemplateResponseDateRange](TemplateResponseDateRange.md)
`reportLevel` | [MetricsReportingLevel](MetricsReportingLevel.md)
`reportFormat` | [DataOutputFormat](DataOutputFormat.md)
`columns` | Array&lt;string&gt;
`granularity` | [Granularity](Granularity.md)
`viewWindowDays` | number
`clickWindowDays` | number
`engagementWindowDays` | number
`conversionReportTimeType` | string
`filtersJson` | string
`isOwnedByUser` | boolean
`isScheduled` | boolean
`creationSource` | string
`isDeleted` | boolean
`updatedTime` | number
`customColumnIds` | Array&lt;string&gt;
`type` | string
`ingestionSources` | Array&lt;string&gt;

## Example

```typescript
import type { TemplateResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 6739202847590,
  "adAccountId": 547664674848,
  "adAccountIds": ["547664674848"],
  "userId": 784762938748396,
  "name": Week over week spend,
  "reportStartRelativeDaysInPast": 7,
  "reportEndRelativeDaysInPast": 7,
  "dateRange": null,
  "reportLevel": null,
  "reportFormat": null,
  "columns": ["SPEND_IN_DOLLAR"],
  "granularity": null,
  "viewWindowDays": 7,
  "clickWindowDays": 7,
  "engagementWindowDays": 7,
  "conversionReportTimeType": TIME_OF_AD_ACTION,
  "filtersJson": [{"field": "SPEND_IN_DOLLAR", "operator": "=", "value": 100}],
  "isOwnedByUser": true,
  "isScheduled": true,
  "creationSource": ADS_MANAGER_REPORT_BUILDER,
  "isDeleted": false,
  "updatedTime": 1432744744,
  "customColumnIds": ["1597252063"],
  "type": BULK,
  "ingestionSources": null,
} satisfies TemplateResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TemplateResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



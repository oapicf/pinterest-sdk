
# TemplateResponse

Template fields

## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`adAccountIds` | Array&lt;string&gt;
`clickWindowDays` | number
`columns` | Array&lt;string&gt;
`conversionReportTimeType` | string
`creationSource` | string
`customColumnIds` | Array&lt;string&gt;
`dateRange` | [TemplateResponseDateRange](TemplateResponseDateRange.md)
`engagementWindowDays` | number
`filtersJson` | string
`granularity` | [Granularity](Granularity.md)
`id` | string
`ingestionSources` | Array&lt;string&gt;
`isDeleted` | boolean
`isOwnedByUser` | boolean
`isScheduled` | boolean
`name` | string
`reportEndRelativeDaysInPast` | number
`reportFormat` | [DataOutputFormat](DataOutputFormat.md)
`reportLevel` | [MetricsReportingLevel](MetricsReportingLevel.md)
`reportStartRelativeDaysInPast` | number
`type` | string
`updatedTime` | number
`userId` | string
`viewWindowDays` | number

## Example

```typescript
import type { TemplateResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 547664674848,
  "adAccountIds": ["547664674848"],
  "clickWindowDays": 7,
  "columns": ["SPEND_IN_DOLLAR"],
  "conversionReportTimeType": TIME_OF_AD_ACTION,
  "creationSource": ADS_MANAGER_REPORT_BUILDER,
  "customColumnIds": ["1597252063"],
  "dateRange": null,
  "engagementWindowDays": 7,
  "filtersJson": [{"field": "SPEND_IN_DOLLAR", "operator": "=", "value": 100}],
  "granularity": null,
  "id": 6739202847590,
  "ingestionSources": null,
  "isDeleted": false,
  "isOwnedByUser": true,
  "isScheduled": true,
  "name": Week over week spend,
  "reportEndRelativeDaysInPast": 7,
  "reportFormat": null,
  "reportLevel": null,
  "reportStartRelativeDaysInPast": 7,
  "type": BULK,
  "updatedTime": 1432744744,
  "userId": 784762938748396,
  "viewWindowDays": 7,
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



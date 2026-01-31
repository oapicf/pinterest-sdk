
# CreateMMMReportRequest


## Properties

Name | Type
------------ | -------------
`countries` | [Array&lt;TargetingAdvertiserCountry&gt;](TargetingAdvertiserCountry.md)
`columns` | [Array&lt;MMMReportingColumn&gt;](MMMReportingColumn.md)
`endDate` | string
`granularity` | string
`level` | string
`reportName` | string
`startDate` | string
`targetingTypes` | [Array&lt;MMMReportingTargetingType&gt;](MMMReportingTargetingType.md)

## Example

```typescript
import type { CreateMMMReportRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "countries": null,
  "columns": null,
  "endDate": 2020-12-20,
  "granularity": null,
  "level": null,
  "reportName": null,
  "startDate": 2020-12-20,
  "targetingTypes": ["GENDER"],
} satisfies CreateMMMReportRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateMMMReportRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



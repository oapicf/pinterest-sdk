
# CreateMMMReportRequest


## Properties

Name | Type
------------ | -------------
`countries` | [Array&lt;TargetingAdvertiserCountry&gt;](TargetingAdvertiserCountry.md)
`reportName` | string
`startDate` | string
`endDate` | string
`granularity` | string
`level` | string
`targetingTypes` | [Array&lt;MMMReportingTargetingType&gt;](MMMReportingTargetingType.md)
`columns` | [Array&lt;MMMReportingColumn&gt;](MMMReportingColumn.md)

## Example

```typescript
import type { CreateMMMReportRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "countries": null,
  "reportName": null,
  "startDate": 2020-12-20,
  "endDate": 2020-12-20,
  "granularity": null,
  "level": null,
  "targetingTypes": ["GENDER"],
  "columns": null,
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



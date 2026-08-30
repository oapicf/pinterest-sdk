
# MMMReportCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`advertiserIds` | Array&lt;string&gt;
`columns` | [Array&lt;MMMReportingColumn&gt;](MMMReportingColumn.md)
`countries` | [Array&lt;TargetingAdvertiserCountry&gt;](TargetingAdvertiserCountry.md)
`customColumnIds` | Array&lt;string&gt;
`endDate` | string
`granularity` | [MMMReportGranularity](MMMReportGranularity.md)
`level` | [MMMReportLevel](MMMReportLevel.md)
`reportName` | string
`startDate` | string
`targetingTypes` | [Array&lt;MMMReportingTargetingType&gt;](MMMReportingTargetingType.md)

## Example

```typescript
import type { MMMReportCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "advertiserIds": null,
  "columns": null,
  "countries": null,
  "customColumnIds": null,
  "endDate": 2020-12-20,
  "granularity": null,
  "level": null,
  "reportName": null,
  "startDate": 2020-12-20,
  "targetingTypes": ["GENDER"],
} satisfies MMMReportCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as MMMReportCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# ConversionProductReportRequest

Request for a brand, category, SKU report

## Properties

Name | Type
------------ | -------------
`adGroupIds` | Array&lt;string&gt;
`campaignIds` | Array&lt;string&gt;
`campaignObjectiveTypes` | [Array&lt;ObjectiveType&gt;](ObjectiveType.md)
`clickWindowDays` | [ConversionAttributionWindowDays](ConversionAttributionWindowDays.md)
`columns` | [Array&lt;ConversionProductReportingColumn&gt;](ConversionProductReportingColumn.md)
`conversionProductAttributionType` | string
`conversionProductBreakdown` | string
`conversionReportTime` | [ConversionReportTimeType](ConversionReportTimeType.md)
`endDate` | string
`granularity` | string
`level` | string
`productSkuIds` | Array&lt;string&gt;
`reportName` | string
`startDate` | string
`viewWindowDays` | [ConversionAttributionWindowDays](ConversionAttributionWindowDays.md)

## Example

```typescript
import type { ConversionProductReportRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "adGroupIds": ["12345678"],
  "campaignIds": ["12345678"],
  "campaignObjectiveTypes": null,
  "clickWindowDays": null,
  "columns": null,
  "conversionProductAttributionType": null,
  "conversionProductBreakdown": null,
  "conversionReportTime": null,
  "endDate": 2024-04-23,
  "granularity": null,
  "level": null,
  "productSkuIds": ["WBC45678","WBC45679"],
  "reportName": null,
  "startDate": 2024-03-17,
  "viewWindowDays": null,
} satisfies ConversionProductReportRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionProductReportRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



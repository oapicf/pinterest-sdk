
# EventQualityScore

Schema for GET Conversion EQS response.

## Properties

Name | Type
------------ | -------------
`ingestionSource` | [IngestionSourceOptions](IngestionSourceOptions.md)
`lookbackPeriod` | [LookbackPeriodOptions](LookbackPeriodOptions.md)
`overallStatus` | [OverallStatusOptions](OverallStatusOptions.md)
`qualityComponents` | [QualityComponents](QualityComponents.md)
`sourcePlatform` | [SourcePlatformOptions](SourcePlatformOptions.md)

## Example

```typescript
import type { EventQualityScore } from ''

// TODO: Update the object below with actual values
const example = {
  "ingestionSource": null,
  "lookbackPeriod": null,
  "overallStatus": null,
  "qualityComponents": null,
  "sourcePlatform": null,
} satisfies EventQualityScore

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as EventQualityScore
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# OptimizationGoalMetadataConversionTagV3GoalMetadata


## Properties

Name | Type
------------ | -------------
`attributionWindows` | [OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows](OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows.md)
`conversionEvent` | string
`conversionTagId` | string
`cpaGoalValueInMicroCurrency` | string
`isRoasOptimized` | boolean
`learningModeType` | string
`reportingEvent` | string

## Example

```typescript
import type { OptimizationGoalMetadataConversionTagV3GoalMetadata } from ''

// TODO: Update the object below with actual values
const example = {
  "attributionWindows": null,
  "conversionEvent": null,
  "conversionTagId": null,
  "cpaGoalValueInMicroCurrency": null,
  "isRoasOptimized": null,
  "learningModeType": ACTIVE,
  "reportingEvent": INITIATE_CHECKOUT,
} satisfies OptimizationGoalMetadataConversionTagV3GoalMetadata

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OptimizationGoalMetadataConversionTagV3GoalMetadata
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



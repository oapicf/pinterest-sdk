
# BidFloorSpec


## Properties

Name | Type
------------ | -------------
`billableEvent` | [ActionType](ActionType.md)
`countries` | [Array&lt;Country&gt;](Country.md)
`creativeType` | [CreativeType](CreativeType.md)
`currency` | [Currency](Currency.md)
`objectiveType` | [ObjectiveType](ObjectiveType.md)
`optimizationGoalMetadata` | [OptimizationGoalMetadata](OptimizationGoalMetadata.md)

## Example

```typescript
import type { BidFloorSpec } from ''

// TODO: Update the object below with actual values
const example = {
  "billableEvent": null,
  "countries": null,
  "creativeType": null,
  "currency": null,
  "objectiveType": null,
  "optimizationGoalMetadata": null,
} satisfies BidFloorSpec

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BidFloorSpec
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



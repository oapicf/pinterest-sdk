
# CampaignPlanningPointEstimate

A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.

## Properties

Name | Type
------------ | -------------
`budget` | number
`doubleY` | number
`maxY` | number
`minY` | number
`y` | number

## Example

```typescript
import type { CampaignPlanningPointEstimate } from ''

// TODO: Update the object below with actual values
const example = {
  "budget": 5000000,
  "doubleY": 10.68,
  "maxY": 2000,
  "minY": 1000,
  "y": 1500,
} satisfies CampaignPlanningPointEstimate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignPlanningPointEstimate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



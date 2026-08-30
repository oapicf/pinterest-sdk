
# CampaignPlanningCurveEstimate


## Properties

Name | Type
------------ | -------------
`estimationType` | [CampaignPlanningEstimationType](CampaignPlanningEstimationType.md)
`points` | [Array&lt;CampaignPlanningPointEstimate&gt;](CampaignPlanningPointEstimate.md)

## Example

```typescript
import type { CampaignPlanningCurveEstimate } from ''

// TODO: Update the object below with actual values
const example = {
  "estimationType": IMPRESSION,
  "points": null,
} satisfies CampaignPlanningCurveEstimate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignPlanningCurveEstimate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



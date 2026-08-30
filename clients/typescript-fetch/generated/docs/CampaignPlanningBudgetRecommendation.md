
# CampaignPlanningBudgetRecommendation

Budget recommendation response containing recommended budget, estimated days, and point estimations.

## Properties

Name | Type
------------ | -------------
`budgetRecommendation` | number
`experimentCampaignBudgetRecommendation` | [Array&lt;CampaignPlanningExperimentBudgetRecommendation&gt;](CampaignPlanningExperimentBudgetRecommendation.md)
`lifetimeDaysRecommendation` | number
`pointEstimations` | [Array&lt;CampaignPlanningBudgetRecommendationPoint&gt;](CampaignPlanningBudgetRecommendationPoint.md)

## Example

```typescript
import type { CampaignPlanningBudgetRecommendation } from ''

// TODO: Update the object below with actual values
const example = {
  "budgetRecommendation": 5000000,
  "experimentCampaignBudgetRecommendation": null,
  "lifetimeDaysRecommendation": 30,
  "pointEstimations": null,
} satisfies CampaignPlanningBudgetRecommendation

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignPlanningBudgetRecommendation
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# CampaignPlanningExperimentBudgetRecommendation

Experimental budget recommendation for a single experiment version.

## Properties

Name | Type
------------ | -------------
`budgetRecommendation` | number
`lifetimeDaysRecommendation` | number
`pointEstimations` | [Array&lt;CampaignPlanningBudgetRecommendationPoint&gt;](CampaignPlanningBudgetRecommendationPoint.md)
`versionId` | string

## Example

```typescript
import type { CampaignPlanningExperimentBudgetRecommendation } from ''

// TODO: Update the object below with actual values
const example = {
  "budgetRecommendation": 5500000,
  "lifetimeDaysRecommendation": 35,
  "pointEstimations": null,
  "versionId": null,
} satisfies CampaignPlanningExperimentBudgetRecommendation

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignPlanningExperimentBudgetRecommendation
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



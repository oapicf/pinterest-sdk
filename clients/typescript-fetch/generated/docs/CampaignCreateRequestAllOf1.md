
# CampaignCreateRequestAllOf1


## Properties

Name | Type
------------ | -------------
`bidOptions` | [CampaignBidOptionsCreate](CampaignBidOptionsCreate.md)
`intendedPromotionType` | [IntendedPromotionType](IntendedPromotionType.md)
`isAutomatedCampaign` | boolean
`isCampaignBudgetOptimization` | boolean
`isFlexibleDailyBudgets` | boolean
`isLtvOptimized` | boolean
`isPerformancePlus` | boolean
`isTopOfSearch` | boolean
`objectiveType` | [ObjectiveType](ObjectiveType.md)
`status` | [EntityStatus](EntityStatus.md)

## Example

```typescript
import type { CampaignCreateRequestAllOf1 } from ''

// TODO: Update the object below with actual values
const example = {
  "bidOptions": null,
  "intendedPromotionType": null,
  "isAutomatedCampaign": null,
  "isCampaignBudgetOptimization": null,
  "isFlexibleDailyBudgets": null,
  "isLtvOptimized": null,
  "isPerformancePlus": null,
  "isTopOfSearch": null,
  "objectiveType": null,
  "status": null,
} satisfies CampaignCreateRequestAllOf1

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignCreateRequestAllOf1
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



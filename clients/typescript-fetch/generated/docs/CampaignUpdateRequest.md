
# CampaignUpdateRequest


## Properties

Name | Type
------------ | -------------
`bidOptions` | [CampaignBidOptionsUpdate](CampaignBidOptionsUpdate.md)
`intendedPromotionType` | [IntendedPromotionType](IntendedPromotionType.md)
`isLtvOptimized` | boolean
`isPerformancePlus` | boolean
`isTopOfSearch` | boolean
`objectiveType` | [ObjectiveType](ObjectiveType.md)
`adAccountId` | string
`dailySpendCap` | number
`defaultAdGroupBudgetInMicroCurrency` | number
`endTime` | number
`id` | string
`isAutomatedCampaign` | boolean
`isCampaignBudgetOptimization` | boolean
`isFlexibleDailyBudgets` | boolean
`lifetimeSpendCap` | number
`name` | string
`orderLineId` | string
`startTime` | number
`status` | [EntityStatus](EntityStatus.md)
`trackingUrls` | object

## Example

```typescript
import type { CampaignUpdateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "bidOptions": null,
  "intendedPromotionType": null,
  "isLtvOptimized": null,
  "isPerformancePlus": null,
  "isTopOfSearch": null,
  "objectiveType": null,
  "adAccountId": 549755885175,
  "dailySpendCap": 1432744744,
  "defaultAdGroupBudgetInMicroCurrency": null,
  "endTime": 1644023526,
  "id": 549755885175,
  "isAutomatedCampaign": null,
  "isCampaignBudgetOptimization": null,
  "isFlexibleDailyBudgets": null,
  "lifetimeSpendCap": 1432744744,
  "name": ACME Tools,
  "orderLineId": 549755885175,
  "startTime": 1580865126,
  "status": null,
  "trackingUrls": null,
} satisfies CampaignUpdateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignUpdateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



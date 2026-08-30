
# CampaignCreateRequest


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
`adAccountId` | string
`dailySpendCap` | number
`defaultAdGroupBudgetInMicroCurrency` | number
`endTime` | number
`lifetimeSpendCap` | number
`name` | string
`orderLineId` | string
`startTime` | number
`trackingUrls` | object

## Example

```typescript
import type { CampaignCreateRequest } from ''

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
  "adAccountId": 549755885175,
  "dailySpendCap": 1432744744,
  "defaultAdGroupBudgetInMicroCurrency": null,
  "endTime": 1644023526,
  "lifetimeSpendCap": 1432744744,
  "name": ACME Tools,
  "orderLineId": 549755885175,
  "startTime": 1580865126,
  "trackingUrls": null,
} satisfies CampaignCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



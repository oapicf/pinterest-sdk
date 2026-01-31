
# CampaignCreateRequest


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`dailySpendCap` | number
`endTime` | number
`isAutomatedCampaign` | boolean
`isFlexibleDailyBudgets` | boolean
`lifetimeSpendCap` | number
`name` | string
`orderLineId` | string
`startTime` | number
`status` | [EntityStatus](EntityStatus.md)
`trackingUrls` | [TrackingUrls](TrackingUrls.md)
`defaultAdGroupBudgetInMicroCurrency` | number
`isCampaignBudgetOptimization` | boolean
`bidOptions` | [CampaignBidOptionsCreate](CampaignBidOptionsCreate.md)
`isPerformancePlus` | boolean
`objectiveType` | [ObjectiveType](ObjectiveType.md)

## Example

```typescript
import type { CampaignCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 549755885175,
  "dailySpendCap": 1432744744,
  "endTime": 1644023526,
  "isAutomatedCampaign": true,
  "isFlexibleDailyBudgets": true,
  "lifetimeSpendCap": 1432744744,
  "name": ACME Tools,
  "orderLineId": 549755885175,
  "startTime": 1580865126,
  "status": null,
  "trackingUrls": null,
  "defaultAdGroupBudgetInMicroCurrency": 0,
  "isCampaignBudgetOptimization": true,
  "bidOptions": null,
  "isPerformancePlus": true,
  "objectiveType": null,
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



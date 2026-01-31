
# CampaignResponse


## Properties

Name | Type
------------ | -------------
`id` | string
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
`bidOptions` | [CampaignBidOptions](CampaignBidOptions.md)
`createdTime` | number
`isCampaignBudgetOptimization` | boolean
`isPerformancePlus` | boolean
`objectiveType` | [ObjectiveType](ObjectiveType.md)
`summaryStatus` | [CampaignSummaryStatus](CampaignSummaryStatus.md)
`type` | string
`updatedTime` | number

## Example

```typescript
import type { CampaignResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 549755885175,
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
  "bidOptions": null,
  "createdTime": 1432744744,
  "isCampaignBudgetOptimization": true,
  "isPerformancePlus": true,
  "objectiveType": null,
  "summaryStatus": null,
  "type": campaign,
  "updatedTime": 1432744744,
} satisfies CampaignResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



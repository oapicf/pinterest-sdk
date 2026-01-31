
# CampaignResponse


## Properties

Name | Type
------------ | -------------
`id` | string
`adAccountId` | string
`name` | string
`status` | [EntityStatus](EntityStatus.md)
`lifetimeSpendCap` | number
`dailySpendCap` | number
`orderLineId` | string
`trackingUrls` | [TrackingUrls](TrackingUrls.md)
`startTime` | number
`endTime` | number
`isFlexibleDailyBudgets` | boolean
`objectiveType` | [ObjectiveType](ObjectiveType.md)
`createdTime` | number
`updatedTime` | number
`type` | string
`isCampaignBudgetOptimization` | boolean
`summaryStatus` | [CampaignSummaryStatus](CampaignSummaryStatus.md)

## Example

```typescript
import type { CampaignResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 549755885175,
  "adAccountId": 549755885175,
  "name": ACME Tools,
  "status": null,
  "lifetimeSpendCap": 1432744744,
  "dailySpendCap": 1432744744,
  "orderLineId": 549755885175,
  "trackingUrls": null,
  "startTime": 1580865126,
  "endTime": 1644023526,
  "isFlexibleDailyBudgets": true,
  "objectiveType": null,
  "createdTime": 1432744744,
  "updatedTime": 1432744744,
  "type": campaign,
  "isCampaignBudgetOptimization": true,
  "summaryStatus": null,
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



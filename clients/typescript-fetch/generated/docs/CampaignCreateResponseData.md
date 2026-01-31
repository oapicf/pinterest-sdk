
# CampaignCreateResponseData


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
`id` | string
`bidOptions` | [CampaignBidOptions](CampaignBidOptions.md)
`createdTime` | number
`isPerformancePlus` | boolean
`objectiveType` | [ObjectiveType](ObjectiveType.md)
`summaryStatus` | [CampaignSummaryStatus](CampaignSummaryStatus.md)
`type` | string
`updatedTime` | number

## Example

```typescript
import type { CampaignCreateResponseData } from ''

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
  "id": 549755885175,
  "bidOptions": null,
  "createdTime": 1432744744,
  "isPerformancePlus": true,
  "objectiveType": null,
  "summaryStatus": null,
  "type": campaign,
  "updatedTime": 1432744744,
} satisfies CampaignCreateResponseData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignCreateResponseData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



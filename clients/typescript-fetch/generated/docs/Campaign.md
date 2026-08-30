
# Campaign


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`bidOptions` | [CampaignBidOptions](CampaignBidOptions.md)
`createdTime` | number
`dailySpendCap` | number
`defaultAdGroupBudgetInMicroCurrency` | number
`endTime` | number
`id` | string
`intendedPromotionType` | [IntendedPromotionType](IntendedPromotionType.md)
`isAutomatedCampaign` | boolean
`isCampaignBudgetOptimization` | boolean
`isCarting` | boolean
`isFlexibleDailyBudgets` | boolean
`isLtvOptimized` | boolean
`isPerformancePlus` | boolean
`isTopOfSearch` | boolean
`lifetimeSpendCap` | number
`name` | string
`objectiveType` | [CampaignObjectiveType](CampaignObjectiveType.md)
`orderLineId` | string
`performancePlusCampaignSettings` | [PerformancePlusCampaignSettings](PerformancePlusCampaignSettings.md)
`startTime` | number
`status` | [EntityStatus](EntityStatus.md)
`summaryStatus` | [SummaryStatus](SummaryStatus.md)
`trackingUrls` | [TrackingUrls](TrackingUrls.md)
`type` | string
`updatedTime` | number

## Example

```typescript
import type { Campaign } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 549755885175,
  "bidOptions": null,
  "createdTime": 1432744744,
  "dailySpendCap": 1432744744,
  "defaultAdGroupBudgetInMicroCurrency": 0,
  "endTime": 1644023526,
  "id": 549755885175,
  "intendedPromotionType": null,
  "isAutomatedCampaign": true,
  "isCampaignBudgetOptimization": true,
  "isCarting": true,
  "isFlexibleDailyBudgets": true,
  "isLtvOptimized": true,
  "isPerformancePlus": true,
  "isTopOfSearch": true,
  "lifetimeSpendCap": 1432744744,
  "name": ACME Tools,
  "objectiveType": null,
  "orderLineId": 549755885175,
  "performancePlusCampaignSettings": null,
  "startTime": 1580865126,
  "status": null,
  "summaryStatus": null,
  "trackingUrls": null,
  "type": campaign,
  "updatedTime": 1432744744,
} satisfies Campaign

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Campaign
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



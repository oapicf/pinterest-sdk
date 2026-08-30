
# CampaignCreateItem

Single campaign create item with create-specific defaults.

## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`appId` | string
`appPlatform` | [MobileAppPlatform](MobileAppPlatform.md)
`bidOptions` | [CampaignBidOptions](CampaignBidOptions.md)
`dailySpendCap` | number
`defaultAdGroupBudgetInMicroCurrency` | number
`endTime` | number
`intendedPromotionType` | [IntendedPromotionType](IntendedPromotionType.md)
`isAutomatedCampaign` | boolean
`isCampaignBudgetOptimization` | boolean
`isFlexibleDailyBudgets` | boolean
`isLtvOptimized` | boolean
`isPerformancePlus` | boolean
`isTopOfSearch` | boolean
`lifetimeSpendCap` | number
`name` | string
`objectiveType` | [ConversionObjectiveType](ConversionObjectiveType.md)
`orderLineId` | string
`startTime` | number
`status` | [EntityStatus](EntityStatus.md)
`trackingUrls` | [TrackingUrls](TrackingUrls.md)

## Example

```typescript
import type { CampaignCreateItem } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 549755885175,
  "appId": 429047995,
  "appPlatform": IOS,
  "bidOptions": null,
  "dailySpendCap": 1432744744,
  "defaultAdGroupBudgetInMicroCurrency": 0,
  "endTime": 1644023526,
  "intendedPromotionType": null,
  "isAutomatedCampaign": true,
  "isCampaignBudgetOptimization": true,
  "isFlexibleDailyBudgets": true,
  "isLtvOptimized": true,
  "isPerformancePlus": true,
  "isTopOfSearch": true,
  "lifetimeSpendCap": 1432744744,
  "name": ACME Tools,
  "objectiveType": null,
  "orderLineId": 549755885175,
  "startTime": 1580865126,
  "status": null,
  "trackingUrls": null,
} satisfies CampaignCreateItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignCreateItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



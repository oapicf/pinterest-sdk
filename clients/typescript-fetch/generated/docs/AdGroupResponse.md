
# AdGroupResponse


## Properties

Name | Type
------------ | -------------
`autoTargetingEnabled` | boolean
`bidInMicroCurrency` | number
`bidStrategyType` | string
`billableEvent` | [ActionType](ActionType.md)
`budgetInMicroCurrency` | number
`budgetType` | [BudgetType](BudgetType.md)
`campaignId` | string
`endTime` | number
`isCreativeOptimization` | boolean
`lifetimeFrequencyCap` | number
`name` | string
`optimizationGoalMetadata` | [OptimizationGoalMetadata](OptimizationGoalMetadata.md)
`pacingDeliveryType` | [PacingDeliveryType](PacingDeliveryType.md)
`placementGroup` | [PlacementGroupType](PlacementGroupType.md)
`promotionApplicationLevel` | string
`promotionId` | string
`startTime` | number
`status` | [EntityStatus](EntityStatus.md)
`targetingSpec` | [TargetingSpec](TargetingSpec.md)
`targetingTemplateIds` | Array&lt;string&gt;
`trackingUrls` | [TrackingUrls](TrackingUrls.md)
`adAccountId` | string
`bidMultiplier` | number
`conversionLearningModeType` | string
`createdTime` | number
`dcaAssets` | any
`feedProfileId` | string
`id` | string
`summaryStatus` | [AdGroupSummaryStatus](AdGroupSummaryStatus.md)
`type` | string
`updatedTime` | number

## Example

```typescript
import type { AdGroupResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "autoTargetingEnabled": true,
  "bidInMicroCurrency": 5000000,
  "bidStrategyType": MAX_BID,
  "billableEvent": null,
  "budgetInMicroCurrency": 5000000,
  "budgetType": null,
  "campaignId": 626736533506,
  "endTime": 5705424000,
  "isCreativeOptimization": true,
  "lifetimeFrequencyCap": 100,
  "name": Ad Group For Pin: 687195905986,
  "optimizationGoalMetadata": null,
  "pacingDeliveryType": null,
  "placementGroup": null,
  "promotionApplicationLevel": ITEM,
  "promotionId": 7834020347906,
  "startTime": 5686848000,
  "status": null,
  "targetingSpec": null,
  "targetingTemplateIds": null,
  "trackingUrls": null,
  "adAccountId": 549755885175,
  "bidMultiplier": 1,
  "conversionLearningModeType": ACTIVE,
  "createdTime": 1476477189,
  "dcaAssets": null,
  "feedProfileId": 626736533506,
  "id": 2680060704746,
  "summaryStatus": null,
  "type": null,
  "updatedTime": 1476477189,
} satisfies AdGroupResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdGroupResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



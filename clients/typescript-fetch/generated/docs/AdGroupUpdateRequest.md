
# AdGroupUpdateRequest


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
`bidMultiplier` | number
`id` | string

## Example

```typescript
import type { AdGroupUpdateRequest } from ''

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
  "bidMultiplier": 1,
  "id": 2680060704746,
} satisfies AdGroupUpdateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdGroupUpdateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



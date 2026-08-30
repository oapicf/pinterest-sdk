
# AdGroupCreateRequest


## Properties

Name | Type
------------ | -------------
`autoTargetingEnabled` | boolean
`bidMultiplier` | number
`budgetType` | [BudgetType](BudgetType.md)
`pacingDeliveryType` | [PacingDeliveryType](PacingDeliveryType.md)
`bidInMicroCurrency` | number
`bidStrategyType` | [BidStrategyType](BidStrategyType.md)
`billableEvent` | [ActionType](ActionType.md)
`budgetInMicroCurrency` | number
`campaignId` | string
`endTime` | number
`isCreativeOptimization` | boolean
`lifetimeFrequencyCap` | number
`name` | string
`optimizationGoalMetadata` | object
`placementGroup` | [PlacementGroupType](PlacementGroupType.md)
`promotionApplicationLevel` | string
`promotionId` | string
`promotionIds` | Array&lt;string&gt;
`startTime` | number
`status` | [EntityStatus](EntityStatus.md)
`targetingSpec` | [TargetingSpec](TargetingSpec.md)
`targetingTemplateIds` | Array&lt;string&gt;
`trackingUrls` | object

## Example

```typescript
import type { AdGroupCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "autoTargetingEnabled": null,
  "bidMultiplier": null,
  "budgetType": null,
  "pacingDeliveryType": null,
  "bidInMicroCurrency": 5000000,
  "bidStrategyType": null,
  "billableEvent": null,
  "budgetInMicroCurrency": 5000000,
  "campaignId": 626736533506,
  "endTime": 5705424000,
  "isCreativeOptimization": true,
  "lifetimeFrequencyCap": 100,
  "name": Ad Group For Pin: 687195905986,
  "optimizationGoalMetadata": null,
  "placementGroup": null,
  "promotionApplicationLevel": ITEM,
  "promotionId": 7834020347906,
  "promotionIds": ["7834020347906","7834020347907"],
  "startTime": 5686848000,
  "status": null,
  "targetingSpec": null,
  "targetingTemplateIds": null,
  "trackingUrls": null,
} satisfies AdGroupCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdGroupCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



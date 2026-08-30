
# AdGroupUpdateBatchUpdate


## Properties

Name | Type
------------ | -------------
`autoTargetingEnabled` | boolean
`bidInMicroCurrency` | number
`bidMultiplier` | number
`bidStrategyType` | [BidStrategyType](BidStrategyType.md)
`billableEvent` | [ActionType](ActionType.md)
`budgetInMicroCurrency` | number
`budgetType` | [BudgetType](BudgetType.md)
`campaignId` | string
`customerSegmentId` | string
`endTime` | number
`extFeatures` | [AdgroupTrackingFeatures](AdgroupTrackingFeatures.md)
`feedProfileId` | string
`id` | string
`isCreativeOptimization` | boolean
`isLocalInventory` | boolean
`lifetimeFrequencyCap` | number
`localInventoryRadiusInMiles` | number
`name` | string
`optimizationGoalMetadata` | [NullableOptimizationGoalMetadata](NullableOptimizationGoalMetadata.md)
`pacingDeliveryType` | [PacingDeliveryType](PacingDeliveryType.md)
`performancePlusCampaignSettings` | [PerformancePlusCampaignSettings](PerformancePlusCampaignSettings.md)
`placementGroup` | [PlacementGroupType](PlacementGroupType.md)
`placementTrafficType` | [PlacementTrafficType](PlacementTrafficType.md)
`promotionApplicationLevel` | [PromotionApplicationLevel](PromotionApplicationLevel.md)
`promotionId` | string
`promotionIds` | Array&lt;string&gt;
`startTime` | number
`status` | [EntityStatus](EntityStatus.md)
`targetingSpec` | [TargetingSpecOptimal](TargetingSpecOptimal.md)
`targetingSpecOperations` | [Array&lt;TargetingSpecOperations&gt;](TargetingSpecOperations.md)
`targetingTemplateIds` | Array&lt;string&gt;
`trackingUrls` | [AdGroupTrackingURLs](AdGroupTrackingURLs.md)

## Example

```typescript
import type { AdGroupUpdateBatchUpdate } from ''

// TODO: Update the object below with actual values
const example = {
  "autoTargetingEnabled": null,
  "bidInMicroCurrency": null,
  "bidMultiplier": null,
  "bidStrategyType": null,
  "billableEvent": null,
  "budgetInMicroCurrency": null,
  "budgetType": null,
  "campaignId": null,
  "customerSegmentId": null,
  "endTime": null,
  "extFeatures": null,
  "feedProfileId": null,
  "id": null,
  "isCreativeOptimization": null,
  "isLocalInventory": null,
  "lifetimeFrequencyCap": null,
  "localInventoryRadiusInMiles": null,
  "name": null,
  "optimizationGoalMetadata": null,
  "pacingDeliveryType": null,
  "performancePlusCampaignSettings": null,
  "placementGroup": null,
  "placementTrafficType": null,
  "promotionApplicationLevel": ITEM,
  "promotionId": null,
  "promotionIds": null,
  "startTime": null,
  "status": null,
  "targetingSpec": null,
  "targetingSpecOperations": null,
  "targetingTemplateIds": null,
  "trackingUrls": null,
} satisfies AdGroupUpdateBatchUpdate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdGroupUpdateBatchUpdate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



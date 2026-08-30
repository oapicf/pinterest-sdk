
# AdGroup


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`bidInMicroCurrency` | number
`bidStrategyType` | [BidStrategyType](BidStrategyType.md)
`billableEvent` | [ActionType](ActionType.md)
`budgetInMicroCurrency` | number
`campaignId` | string
`conversionLearningModeType` | [ConversionLearningModeType](ConversionLearningModeType.md)
`createdTime` | number
`customerSegmentId` | string
`dcaAssets` | any
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
`performancePlusCampaignSettings` | [PerformancePlusCampaignSettings](PerformancePlusCampaignSettings.md)
`placementGroup` | [PlacementGroupType](PlacementGroupType.md)
`placementTrafficType` | [PlacementTrafficType](PlacementTrafficType.md)
`promotionApplicationLevel` | [PromotionApplicationLevel](PromotionApplicationLevel.md)
`promotionId` | string
`promotionIds` | Array&lt;string&gt;
`startTime` | number
`status` | [EntityStatus](EntityStatus.md)
`summaryStatus` | [SummaryStatus](SummaryStatus.md)
`targetingSpec` | [TargetingSpecOptimal](TargetingSpecOptimal.md)
`targetingTemplateIds` | Array&lt;string&gt;
`trackingUrls` | [AdGroupTrackingURLs](AdGroupTrackingURLs.md)
`type` | string
`updatedTime` | number
`autoTargetingEnabled` | boolean
`bidMultiplier` | number
`budgetType` | [BudgetType](BudgetType.md)
`pacingDeliveryType` | [PacingDeliveryType](PacingDeliveryType.md)

## Example

```typescript
import type { AdGroup } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": null,
  "bidInMicroCurrency": null,
  "bidStrategyType": null,
  "billableEvent": null,
  "budgetInMicroCurrency": null,
  "campaignId": null,
  "conversionLearningModeType": null,
  "createdTime": null,
  "customerSegmentId": null,
  "dcaAssets": null,
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
  "performancePlusCampaignSettings": null,
  "placementGroup": null,
  "placementTrafficType": null,
  "promotionApplicationLevel": ITEM,
  "promotionId": null,
  "promotionIds": null,
  "startTime": null,
  "status": null,
  "summaryStatus": null,
  "targetingSpec": null,
  "targetingTemplateIds": null,
  "trackingUrls": null,
  "type": null,
  "updatedTime": null,
  "autoTargetingEnabled": null,
  "bidMultiplier": null,
  "budgetType": null,
  "pacingDeliveryType": null,
} satisfies AdGroup

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdGroup
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



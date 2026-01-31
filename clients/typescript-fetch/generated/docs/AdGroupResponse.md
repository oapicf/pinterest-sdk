
# AdGroupResponse


## Properties

Name | Type
------------ | -------------
`name` | string
`status` | [EntityStatus](EntityStatus.md)
`budgetInMicroCurrency` | number
`bidInMicroCurrency` | number
`optimizationGoalMetadata` | [OptimizationGoalMetadata](OptimizationGoalMetadata.md)
`budgetType` | [BudgetType](BudgetType.md)
`startTime` | number
`endTime` | number
`targetingSpec` | [TargetingSpec](TargetingSpec.md)
`lifetimeFrequencyCap` | number
`trackingUrls` | [TrackingUrls](TrackingUrls.md)
`autoTargetingEnabled` | boolean
`placementGroup` | [PlacementGroupType](PlacementGroupType.md)
`pacingDeliveryType` | [PacingDeliveryType](PacingDeliveryType.md)
`campaignId` | string
`billableEvent` | [ActionType](ActionType.md)
`bidStrategyType` | string
`targetingTemplateIds` | Array&lt;string&gt;
`id` | string
`adAccountId` | string
`createdTime` | number
`updatedTime` | number
`type` | string
`conversionLearningModeType` | string
`summaryStatus` | [AdGroupSummaryStatus](AdGroupSummaryStatus.md)
`feedProfileId` | string
`dcaAssets` | any

## Example

```typescript
import type { AdGroupResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "name": Ad Group For Pin: 687195905986,
  "status": null,
  "budgetInMicroCurrency": 5000000,
  "bidInMicroCurrency": 5000000,
  "optimizationGoalMetadata": null,
  "budgetType": null,
  "startTime": 5686848000,
  "endTime": 5705424000,
  "targetingSpec": null,
  "lifetimeFrequencyCap": 100,
  "trackingUrls": null,
  "autoTargetingEnabled": true,
  "placementGroup": null,
  "pacingDeliveryType": null,
  "campaignId": 626736533506,
  "billableEvent": null,
  "bidStrategyType": MAX_BID,
  "targetingTemplateIds": null,
  "id": 2680060704746,
  "adAccountId": 549755885175,
  "createdTime": 1476477189,
  "updatedTime": 1476477189,
  "type": null,
  "conversionLearningModeType": ACTIVE,
  "summaryStatus": null,
  "feedProfileId": 626736533506,
  "dcaAssets": null,
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



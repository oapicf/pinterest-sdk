
# AdGroupDeliveryEstimates

Ad group configuration for delivery estimates.

## Properties

Name | Type
------------ | -------------
`autoTargetingEnabled` | boolean
`creativeTypes` | [Array&lt;AdGroupAudienceSizingCreativeTypes&gt;](AdGroupAudienceSizingCreativeTypes.md)
`keywords` | [Array&lt;AdGroupDeliveryEstimatesKeywordsItems&gt;](AdGroupDeliveryEstimatesKeywordsItems.md)
`monthlyFrequencyCap` | number
`optimizationGoalMetadata` | [OptimizationGoalMetadata](OptimizationGoalMetadata.md)
`optimizationType` | [OptimizationType](OptimizationType.md)
`placementGroup` | [PlacementGroupType](PlacementGroupType.md)
`productGroupIds` | Array&lt;string&gt;
`targetingSpec` | [TargetingSpecOptimal](TargetingSpecOptimal.md)

## Example

```typescript
import type { AdGroupDeliveryEstimates } from ''

// TODO: Update the object below with actual values
const example = {
  "autoTargetingEnabled": null,
  "creativeTypes": null,
  "keywords": null,
  "monthlyFrequencyCap": null,
  "optimizationGoalMetadata": null,
  "optimizationType": null,
  "placementGroup": null,
  "productGroupIds": null,
  "targetingSpec": null,
} satisfies AdGroupDeliveryEstimates

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdGroupDeliveryEstimates
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



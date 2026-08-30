
# BulkCampaignDeliveryEstimatesItem

Delivery estimate result for a single campaign within a bulk request.

## Properties

Name | Type
------------ | -------------
`adgroupAudienceSizes` | [Array&lt;CampaignPlanningAdGroupAudienceSize&gt;](CampaignPlanningAdGroupAudienceSize.md)
`conversionRate` | number
`conversionRates` | [Array&lt;CampaignPlanningConversionRate&gt;](CampaignPlanningConversionRate.md)
`curves` | [Array&lt;CampaignPlanningCurveEstimate&gt;](CampaignPlanningCurveEstimate.md)
`derivedMetrics` | [CampaignDeliveryEstimatesDerivedMetrics](CampaignDeliveryEstimatesDerivedMetrics.md)
`errors` | [Array&lt;CampaignPlanningResponseError&gt;](CampaignPlanningResponseError.md)
`estimateId` | string
`maxPotentialSpend` | number

## Example

```typescript
import type { BulkCampaignDeliveryEstimatesItem } from ''

// TODO: Update the object below with actual values
const example = {
  "adgroupAudienceSizes": null,
  "conversionRate": 2.32600002288818,
  "conversionRates": null,
  "curves": null,
  "derivedMetrics": null,
  "errors": null,
  "estimateId": db1b0d75-4386-4db3-8a85-e5725d4dff51,
  "maxPotentialSpend": 50000000,
} satisfies BulkCampaignDeliveryEstimatesItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BulkCampaignDeliveryEstimatesItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



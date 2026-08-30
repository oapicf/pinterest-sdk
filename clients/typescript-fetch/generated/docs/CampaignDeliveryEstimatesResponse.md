
# CampaignDeliveryEstimatesResponse

Delivery estimates response for a campaign.

## Properties

Name | Type
------------ | -------------
`curves` | [Array&lt;CampaignPlanningCurveEstimate&gt;](CampaignPlanningCurveEstimate.md)
`derivedMetrics` | [CampaignDeliveryEstimatesDerivedMetrics](CampaignDeliveryEstimatesDerivedMetrics.md)
`maxPotentialSpend` | number

## Example

```typescript
import type { CampaignDeliveryEstimatesResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "curves": null,
  "derivedMetrics": null,
  "maxPotentialSpend": 50000000,
} satisfies CampaignDeliveryEstimatesResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignDeliveryEstimatesResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



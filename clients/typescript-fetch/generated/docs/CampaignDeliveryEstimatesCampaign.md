
# CampaignDeliveryEstimatesCampaign

Campaign configuration for delivery estimates.

## Properties

Name | Type
------------ | -------------
`adGroups` | [Array&lt;AdGroupDeliveryEstimates&gt;](AdGroupDeliveryEstimates.md)
`budgetDurationType` | [BudgetDurationType](BudgetDurationType.md)
`dailySpendCap` | number
`endDate` | string
`lifetimeSpendCap` | number
`objectiveType` | [DeliveryEstimateObjectiveType](DeliveryEstimateObjectiveType.md)
`startDate` | string

## Example

```typescript
import type { CampaignDeliveryEstimatesCampaign } from ''

// TODO: Update the object below with actual values
const example = {
  "adGroups": null,
  "budgetDurationType": FIXED_DAILY,
  "dailySpendCap": 50000000,
  "endDate": null,
  "lifetimeSpendCap": 500000000,
  "objectiveType": null,
  "startDate": null,
} satisfies CampaignDeliveryEstimatesCampaign

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignDeliveryEstimatesCampaign
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



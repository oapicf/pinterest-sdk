
# CampaignPlanningConversionRate

Conversion rate estimate for a specific conversion event and attribution window combination.

## Properties

Name | Type
------------ | -------------
`attributionWindows` | [CampaignPlanningConversionAttribution](CampaignPlanningConversionAttribution.md)
`conversionEvent` | [CampaignPlanningConversionEvent](CampaignPlanningConversionEvent.md)
`conversionRate` | number

## Example

```typescript
import type { CampaignPlanningConversionRate } from ''

// TODO: Update the object below with actual values
const example = {
  "attributionWindows": null,
  "conversionEvent": null,
  "conversionRate": 2.32600002288818,
} satisfies CampaignPlanningConversionRate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignPlanningConversionRate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



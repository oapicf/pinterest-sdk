
# CampaignPlanningConversionAttribution

Attribution windows for a conversion event.

## Properties

Name | Type
------------ | -------------
`clickWindowDays` | [CampaignPlanningConversionAttributionWindowDays](CampaignPlanningConversionAttributionWindowDays.md)
`engagementWindowDays` | [CampaignPlanningConversionAttributionWindowDays](CampaignPlanningConversionAttributionWindowDays.md)
`viewWindowDays` | [CampaignPlanningConversionAttributionWindowDays](CampaignPlanningConversionAttributionWindowDays.md)

## Example

```typescript
import type { CampaignPlanningConversionAttribution } from ''

// TODO: Update the object below with actual values
const example = {
  "clickWindowDays": null,
  "engagementWindowDays": null,
  "viewWindowDays": null,
} satisfies CampaignPlanningConversionAttribution

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignPlanningConversionAttribution
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



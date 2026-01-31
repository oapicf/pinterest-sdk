
# CampaignBidOptionsCreate

Object describing the campaign level bid multipliers.

## Properties

Name | Type
------------ | -------------
`appTypeMultipliers` | [AppTypeMultipliers](AppTypeMultipliers.md)
`audienceMultipliers` | [CampaignAudienceMultipliers](CampaignAudienceMultipliers.md)
`placementMultipliers` | [PlacementMultipliers](PlacementMultipliers.md)

## Example

```typescript
import type { CampaignBidOptionsCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "appTypeMultipliers": null,
  "audienceMultipliers": null,
  "placementMultipliers": null,
} satisfies CampaignBidOptionsCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignBidOptionsCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



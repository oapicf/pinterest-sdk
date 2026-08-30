
# CampaignBidOptions

Object describing the campaign level bid multipliers.

## Properties

Name | Type
------------ | -------------
`ageBucketMultipliers` | [AgeBucketMultipliers](AgeBucketMultipliers.md)
`appTypeMultipliers` | [AppTypeMultipliers](AppTypeMultipliers.md)
`audienceMultipliers` | [CampaignAudienceMultipliers](CampaignAudienceMultipliers.md)
`freqBidMultiplierTimeWindow` | [FreqBidMultiplierTimeWindow](FreqBidMultiplierTimeWindow.md)
`frequencyMultipliers` | [FrequencyMultipliers](FrequencyMultipliers.md)
`genderMultipliers` | [GenderMultipliers](GenderMultipliers.md)
`placementMultipliers` | [PlacementMultipliers](PlacementMultipliers.md)

## Example

```typescript
import type { CampaignBidOptions } from ''

// TODO: Update the object below with actual values
const example = {
  "ageBucketMultipliers": null,
  "appTypeMultipliers": null,
  "audienceMultipliers": null,
  "freqBidMultiplierTimeWindow": null,
  "frequencyMultipliers": null,
  "genderMultipliers": null,
  "placementMultipliers": null,
} satisfies CampaignBidOptions

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CampaignBidOptions
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



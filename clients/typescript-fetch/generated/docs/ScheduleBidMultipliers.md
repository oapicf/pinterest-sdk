
# ScheduleBidMultipliers

The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.

## Properties

Name | Type
------------ | -------------
`ageBucketMultipliers` | [BidOptionsAgeBucketMultipliers](BidOptionsAgeBucketMultipliers.md)
`appTypeMultipliers` | [BidOptionsAppTypeMultipliers](BidOptionsAppTypeMultipliers.md)
`audienceMultipliers` | [Array&lt;BidOptionsAudienceMultipliers&gt;](BidOptionsAudienceMultipliers.md)
`genderMultipliers` | [BidOptionsGenderMultipliers](BidOptionsGenderMultipliers.md)
`placementMultipliers` | [BidOptionsPlacementMultipliers](BidOptionsPlacementMultipliers.md)

## Example

```typescript
import type { ScheduleBidMultipliers } from ''

// TODO: Update the object below with actual values
const example = {
  "ageBucketMultipliers": null,
  "appTypeMultipliers": null,
  "audienceMultipliers": null,
  "genderMultipliers": null,
  "placementMultipliers": null,
} satisfies ScheduleBidMultipliers

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ScheduleBidMultipliers
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



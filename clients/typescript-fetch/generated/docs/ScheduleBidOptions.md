
# ScheduleBidOptions

Object describing the schedule level bid level changes.

## Properties

Name | Type
------------ | -------------
`ageBucketMultipliers` | [ScheduleAgeBucketMultipliers](ScheduleAgeBucketMultipliers.md)
`appTypeMultipliers` | [ScheduleAppTypeMultipliers](ScheduleAppTypeMultipliers.md)
`audienceMultipliers` | [ScheduleAudienceMultipliers](ScheduleAudienceMultipliers.md)
`genderMultipliers` | [ScheduleBidOptionsGenderMultipliers](ScheduleBidOptionsGenderMultipliers.md)
`placementMultipliers` | [ScheduleBidOptionsPlacementMultipliers](ScheduleBidOptionsPlacementMultipliers.md)

## Example

```typescript
import type { ScheduleBidOptions } from ''

// TODO: Update the object below with actual values
const example = {
  "ageBucketMultipliers": null,
  "appTypeMultipliers": null,
  "audienceMultipliers": null,
  "genderMultipliers": null,
  "placementMultipliers": null,
} satisfies ScheduleBidOptions

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ScheduleBidOptions
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



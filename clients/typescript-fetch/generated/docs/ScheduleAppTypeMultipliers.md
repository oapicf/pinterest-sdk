
# ScheduleAppTypeMultipliers

This represents a mapping from app type targeting criteria to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.

## Properties

Name | Type
------------ | -------------
`aPPTYPE` | [TargetingSpecAppType](TargetingSpecAppType.md)

## Example

```typescript
import type { ScheduleAppTypeMultipliers } from ''

// TODO: Update the object below with actual values
const example = {
  "aPPTYPE": null,
} satisfies ScheduleAppTypeMultipliers

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ScheduleAppTypeMultipliers
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



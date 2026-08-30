
# BidOptionsAppTypeMultipliers

This represents a mapping from app type targeting criteria to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All app type multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.

## Properties

Name | Type
------------ | -------------
`androidMobile` | number
`androidTablet` | number
`ipad` | number
`iphone` | number
`web` | number
`webMobile` | number

## Example

```typescript
import type { BidOptionsAppTypeMultipliers } from ''

// TODO: Update the object below with actual values
const example = {
  "androidMobile": null,
  "androidTablet": null,
  "ipad": null,
  "iphone": null,
  "web": null,
  "webMobile": null,
} satisfies BidOptionsAppTypeMultipliers

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BidOptionsAppTypeMultipliers
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



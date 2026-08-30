
# BidOptionsAgeBucketMultipliers

This represents a mapping from age bucket to a bid price change value.  Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All age bucket multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.

## Properties

Name | Type
------------ | -------------
`_1824` | number
`_2534` | number
`_3544` | number
`_4549` | number
`_5054` | number
`_5564` | number
`_65` | number

## Example

```typescript
import type { BidOptionsAgeBucketMultipliers } from ''

// TODO: Update the object below with actual values
const example = {
  "_1824": null,
  "_2534": null,
  "_3544": null,
  "_4549": null,
  "_5054": null,
  "_5564": null,
  "_65": null,
} satisfies BidOptionsAgeBucketMultipliers

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BidOptionsAgeBucketMultipliers
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



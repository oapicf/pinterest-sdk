
# BidFloorCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`bidFloorSpecs` | [Array&lt;BidFloorSpec&gt;](BidFloorSpec.md)
`targetingSpec` | [TargetingSpecOptimal](TargetingSpecOptimal.md)

## Example

```typescript
import type { BidFloorCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "bidFloorSpecs": null,
  "targetingSpec": null,
} satisfies BidFloorCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BidFloorCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



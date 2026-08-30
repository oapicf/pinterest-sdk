
# OrderLineMutationResult


## Properties

Name | Type
------------ | -------------
`errors` | [Array&lt;OrderLineMutationError&gt;](OrderLineMutationError.md)
`orderLine` | [Array&lt;OrderLine&gt;](OrderLine.md)

## Example

```typescript
import type { OrderLineMutationResult } from ''

// TODO: Update the object below with actual values
const example = {
  "errors": null,
  "orderLine": null,
} satisfies OrderLineMutationResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as OrderLineMutationResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



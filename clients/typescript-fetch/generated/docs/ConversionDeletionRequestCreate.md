
# ConversionDeletionRequestCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`deletionTargets` | [ConversionDeletionRequestTargets](ConversionDeletionRequestTargets.md)

## Example

```typescript
import type { ConversionDeletionRequestCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "deletionTargets": null,
} satisfies ConversionDeletionRequestCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ConversionDeletionRequestCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



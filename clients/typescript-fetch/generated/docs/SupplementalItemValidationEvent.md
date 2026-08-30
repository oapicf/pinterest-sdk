
# SupplementalItemValidationEvent

Item validation event

## Properties

Name | Type
------------ | -------------
`attribute` | string
`code` | number
`message` | string

## Example

```typescript
import type { SupplementalItemValidationEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "attribute": price,
  "code": 113,
  "message": Some supplemental item data was not published due to incorrect formatting,
} satisfies SupplementalItemValidationEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SupplementalItemValidationEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



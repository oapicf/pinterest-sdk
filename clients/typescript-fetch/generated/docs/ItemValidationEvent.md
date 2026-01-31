
# ItemValidationEvent

Object describing an item validation event

## Properties

Name | Type
------------ | -------------
`attribute` | string
`code` | number
`message` | string

## Example

```typescript
import type { ItemValidationEvent } from ''

// TODO: Update the object below with actual values
const example = {
  "attribute": title,
  "code": 106,
  "message": Title is missing from product metadata.,
} satisfies ItemValidationEvent

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ItemValidationEvent
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



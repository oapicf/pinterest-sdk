
# BoardSectionUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties

Name | Type
------------ | -------------
`id` | string
`name` | string

## Example

```typescript
import type { BoardSectionUpdateWithRequiredBody } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 549755885175,
  "name": Salads,
} satisfies BoardSectionUpdateWithRequiredBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BoardSectionUpdateWithRequiredBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



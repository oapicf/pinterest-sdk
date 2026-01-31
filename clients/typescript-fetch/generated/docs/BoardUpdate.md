
# BoardUpdate

Board fields for updates

## Properties

Name | Type
------------ | -------------
`name` | string
`description` | string
`privacy` | string

## Example

```typescript
import type { BoardUpdate } from ''

// TODO: Update the object below with actual values
const example = {
  "name": Summer Recipes,
  "description": My favorite summer recipes,
  "privacy": null,
} satisfies BoardUpdate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BoardUpdate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



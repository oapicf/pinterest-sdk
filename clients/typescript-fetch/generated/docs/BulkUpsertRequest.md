
# BulkUpsertRequest

Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.

## Properties

Name | Type
------------ | -------------
`create` | [BulkUpsertRequestCreate](BulkUpsertRequestCreate.md)
`update` | [BulkUpsertRequestUpdate](BulkUpsertRequestUpdate.md)

## Example

```typescript
import type { BulkUpsertRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "create": null,
  "update": null,
} satisfies BulkUpsertRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BulkUpsertRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



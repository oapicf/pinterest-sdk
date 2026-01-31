
# BulkUpsertStatusResponse

ID of the bulk request.

## Properties

Name | Type
------------ | -------------
`status` | [BulkUpsertStatus](BulkUpsertStatus.md)
`resultUrl` | string

## Example

```typescript
import type { BulkUpsertStatusResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "status": null,
  "resultUrl": https://pinterest-waterloo.s3.us-east-1.amazonaws.com/bulk_framework/AD_ENTITY_UPSERT/549763856637-1659122537-0b4d77d3-f620-48ce-bec9-616106afb8d4/(...),
} satisfies BulkUpsertStatusResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BulkUpsertStatusResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



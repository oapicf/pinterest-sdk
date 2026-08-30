
# BulkJobData

Bulk request result data.

## Properties

Name | Type
------------ | -------------
`resultUrl` | string
`status` | [BulkRequestStatus](BulkRequestStatus.md)
`workloadId` | number

## Example

```typescript
import type { BulkJobData } from ''

// TODO: Update the object below with actual values
const example = {
  "resultUrl": null,
  "status": null,
  "workloadId": null,
} satisfies BulkJobData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BulkJobData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



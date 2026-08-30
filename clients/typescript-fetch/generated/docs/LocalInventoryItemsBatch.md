
# LocalInventoryItemsBatch

Unified model for local inventory items batch operation

## Properties

Name | Type
------------ | -------------
`batchId` | string
`completedTime` | Date
`createdTime` | Date
`operationResults` | [Array&lt;SupplementalOperationResult&gt;](SupplementalOperationResult.md)
`status` | [SupplementalItemBatchOperationStatus](SupplementalItemBatchOperationStatus.md)

## Example

```typescript
import type { LocalInventoryItemsBatch } from ''

// TODO: Update the object below with actual values
const example = {
  "batchId": 66753b9bb65c46c49bd,
  "completedTime": 2022-03-14T15:16:34Z,
  "createdTime": 2022-03-14T15:15:22Z,
  "operationResults": null,
  "status": null,
} satisfies LocalInventoryItemsBatch

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LocalInventoryItemsBatch
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



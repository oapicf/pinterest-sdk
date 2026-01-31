
# CatalogsRetailItemsBatch

Object describing the catalogs retail items batch

## Properties

Name | Type
------------ | -------------
`batchId` | string
`catalogType` | [CatalogsType](CatalogsType.md)
`completedTime` | Date
`createdTime` | Date
`items` | [Array&lt;ItemProcessingRecord&gt;](ItemProcessingRecord.md)
`status` | [BatchOperationStatus](BatchOperationStatus.md)

## Example

```typescript
import type { CatalogsRetailItemsBatch } from ''

// TODO: Update the object below with actual values
const example = {
  "batchId": 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e,
  "catalogType": null,
  "completedTime": null,
  "createdTime": null,
  "items": null,
  "status": null,
} satisfies CatalogsRetailItemsBatch

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsRetailItemsBatch
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



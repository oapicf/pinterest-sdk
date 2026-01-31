
# CatalogsItemsBatch

Object describing the catalogs items batch

## Properties

Name | Type
------------ | -------------
`catalogType` | [CatalogsType](CatalogsType.md)
`batchId` | string
`createdTime` | Date
`completedTime` | Date
`status` | [BatchOperationStatus](BatchOperationStatus.md)
`items` | [Array&lt;CreativeAssetsProcessingRecord&gt;](CreativeAssetsProcessingRecord.md)

## Example

```typescript
import type { CatalogsItemsBatch } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": null,
  "batchId": 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e,
  "createdTime": null,
  "completedTime": null,
  "status": null,
  "items": null,
} satisfies CatalogsItemsBatch

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsItemsBatch
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



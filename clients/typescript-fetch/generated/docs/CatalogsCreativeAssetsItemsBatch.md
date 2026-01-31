
# CatalogsCreativeAssetsItemsBatch

Object describing the catalogs creative assets items batch

## Properties

Name | Type
------------ | -------------
`batchId` | string
`createdTime` | Date
`completedTime` | Date
`status` | [BatchOperationStatus](BatchOperationStatus.md)
`catalogType` | [CatalogsType](CatalogsType.md)
`items` | [Array&lt;CreativeAssetsProcessingRecord&gt;](CreativeAssetsProcessingRecord.md)

## Example

```typescript
import type { CatalogsCreativeAssetsItemsBatch } from ''

// TODO: Update the object below with actual values
const example = {
  "batchId": 595953100599279259-66753b9bb65c46c49bd8503b27fecf9e,
  "createdTime": null,
  "completedTime": null,
  "status": null,
  "catalogType": null,
  "items": null,
} satisfies CatalogsCreativeAssetsItemsBatch

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsCreativeAssetsItemsBatch
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



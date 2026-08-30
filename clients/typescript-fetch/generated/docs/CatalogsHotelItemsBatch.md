
# CatalogsHotelItemsBatch

Object describing the catalogs hotel items batch. If specified, you must provide all properties.

## Properties

Name | Type
------------ | -------------
`batchId` | string
`catalogType` | string
`completedTime` | Date
`createdTime` | Date
`items` | [Array&lt;HotelProcessingRecord&gt;](HotelProcessingRecord.md)
`status` | [BatchOperationStatus](BatchOperationStatus.md)

## Example

```typescript
import type { CatalogsHotelItemsBatch } from ''

// TODO: Update the object below with actual values
const example = {
  "batchId": 595953100599279259,
  "catalogType": null,
  "completedTime": 2024-01-01T20:20Z,
  "createdTime": 2024-01-01T20:10:40Z,
  "items": null,
  "status": null,
} satisfies CatalogsHotelItemsBatch

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsHotelItemsBatch
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



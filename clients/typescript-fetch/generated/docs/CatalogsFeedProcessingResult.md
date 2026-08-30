
# CatalogsFeedProcessingResult


## Properties

Name | Type
------------ | -------------
`createdAt` | Date
`id` | string
`ingestionDetails` | [CatalogsFeedIngestionDetails](CatalogsFeedIngestionDetails.md)
`productCounts` | [CatalogsFeedProductCounts](CatalogsFeedProductCounts.md)
`status` | [CatalogsFeedProcessingStatus](CatalogsFeedProcessingStatus.md)
`updatedAt` | Date
`validationDetails` | [CatalogsFeedValidationDetails](CatalogsFeedValidationDetails.md)
`videoCounts` | [CatalogsFeedVideoCounts](CatalogsFeedVideoCounts.md)

## Example

```typescript
import type { CatalogsFeedProcessingResult } from ''

// TODO: Update the object below with actual values
const example = {
  "createdAt": 2022-03-14T15:15:22Z,
  "id": 864344156814050986,
  "ingestionDetails": null,
  "productCounts": null,
  "status": null,
  "updatedAt": 2022-03-14T15:16:34Z,
  "validationDetails": null,
  "videoCounts": null,
} satisfies CatalogsFeedProcessingResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsFeedProcessingResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



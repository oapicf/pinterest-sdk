
# CatalogsFeedIngestion


## Properties

Name | Type
------------ | -------------
`createdAt` | Date
`feedId` | string
`id` | string
`status` | [CatalogsFeedProcessingStatus](CatalogsFeedProcessingStatus.md)

## Example

```typescript
import type { CatalogsFeedIngestion } from ''

// TODO: Update the object below with actual values
const example = {
  "createdAt": 2022-03-14T15:15:22Z,
  "feedId": 2680059592705,
  "id": 2680059592705,
  "status": null,
} satisfies CatalogsFeedIngestion

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsFeedIngestion
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



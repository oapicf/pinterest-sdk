
# CatalogsFeedIngestionDetails


## Properties

Name | Type
------------ | -------------
`errors` | [CatalogsFeedIngestionErrors](CatalogsFeedIngestionErrors.md)
`info` | [CatalogsFeedIngestionInfo](CatalogsFeedIngestionInfo.md)
`warnings` | [CatalogsFeedIngestionWarnings](CatalogsFeedIngestionWarnings.md)

## Example

```typescript
import type { CatalogsFeedIngestionDetails } from ''

// TODO: Update the object below with actual values
const example = {
  "errors": null,
  "info": null,
  "warnings": null,
} satisfies CatalogsFeedIngestionDetails

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsFeedIngestionDetails
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# CatalogsListProductsByFeedBasedFilter

Request object to list products for a given feed_id and product group filter.

## Properties

Name | Type
------------ | -------------
`feedId` | string
`filters` | [CatalogsProductGroupFilters](CatalogsProductGroupFilters.md)

## Example

```typescript
import type { CatalogsListProductsByFeedBasedFilter } from ''

// TODO: Update the object below with actual values
const example = {
  "feedId": 2680059592705,
  "filters": null,
} satisfies CatalogsListProductsByFeedBasedFilter

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsListProductsByFeedBasedFilter
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



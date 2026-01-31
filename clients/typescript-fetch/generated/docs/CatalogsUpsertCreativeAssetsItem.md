
# CatalogsUpsertCreativeAssetsItem

A creative assets item to be upserted.

## Properties

Name | Type
------------ | -------------
`attributes` | [CatalogsCreativeAssetsAttributes](CatalogsCreativeAssetsAttributes.md)
`creativeAssetsId` | string
`operation` | string

## Example

```typescript
import type { CatalogsUpsertCreativeAssetsItem } from ''

// TODO: Update the object below with actual values
const example = {
  "attributes": null,
  "creativeAssetsId": DS0294-M,
  "operation": null,
} satisfies CatalogsUpsertCreativeAssetsItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsUpsertCreativeAssetsItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



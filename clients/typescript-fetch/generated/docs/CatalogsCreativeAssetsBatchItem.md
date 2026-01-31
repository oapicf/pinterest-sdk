
# CatalogsCreativeAssetsBatchItem

Creative assets batch item

## Properties

Name | Type
------------ | -------------
`attributes` | [CatalogsUpdatableCreativeAssetsAttributes](CatalogsUpdatableCreativeAssetsAttributes.md)
`creativeAssetsId` | string
`operation` | string

## Example

```typescript
import type { CatalogsCreativeAssetsBatchItem } from ''

// TODO: Update the object below with actual values
const example = {
  "attributes": null,
  "creativeAssetsId": DS0294-M,
  "operation": null,
} satisfies CatalogsCreativeAssetsBatchItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsCreativeAssetsBatchItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# GetBusinessAssetsResponseCatalogInfo

An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals \'CATALOG\'.

## Properties

Name | Type
------------ | -------------
`catalogType` | string
`id` | string
`name` | string

## Example

```typescript
import type { GetBusinessAssetsResponseCatalogInfo } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogType": PRODUCT,
  "id": 4836859046874,
  "name": Canada Catalog,
} satisfies GetBusinessAssetsResponseCatalogInfo

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as GetBusinessAssetsResponseCatalogInfo
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



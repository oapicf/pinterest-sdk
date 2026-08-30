
# BusinessAssets


## Properties

Name | Type
------------ | -------------
`assetGroupInfo` | [AssetGroupBinding](AssetGroupBinding.md)
`assetId` | string
`assetType` | [AssetTypeResponse](AssetTypeResponse.md)
`permissions` | Array&lt;string&gt;
`catalogInfo` | [CatalogBinding](CatalogBinding.md)

## Example

```typescript
import type { BusinessAssets } from ''

// TODO: Update the object below with actual values
const example = {
  "assetGroupInfo": null,
  "assetId": 549755885175,
  "assetType": null,
  "permissions": [FINANCE_MANAGER, CATALOGS_MANAGER, AUDIENCE_MANAGER],
  "catalogInfo": null,
} satisfies BusinessAssets

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BusinessAssets
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



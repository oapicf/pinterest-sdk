
# GetBusinessAssetsResponse

An object containing the permissions a business has on the asset.

## Properties

Name | Type
------------ | -------------
`assetGroupInfo` | [AssetGroupBinding](AssetGroupBinding.md)
`assetId` | string
`assetType` | string
`catalogInfo` | [GetBusinessAssetsResponseCatalogInfo](GetBusinessAssetsResponseCatalogInfo.md)

## Example

```typescript
import type { GetBusinessAssetsResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "assetGroupInfo": null,
  "assetId": 549755885175,
  "assetType": AD_ACCOUNT,
  "catalogInfo": null,
} satisfies GetBusinessAssetsResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as GetBusinessAssetsResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# AssetIdPermissions

An object containing the permissions a business member has on the asset.

## Properties

Name | Type
------------ | -------------
`assetId` | string
`assetType` | string
`permissions` | Array&lt;string&gt;
`assetGroupInfo` | [AssetGroupBinding](AssetGroupBinding.md)

## Example

```typescript
import type { AssetIdPermissions } from ''

// TODO: Update the object below with actual values
const example = {
  "assetId": 549755885175,
  "assetType": AD_ACCOUNT,
  "permissions": ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"],
  "assetGroupInfo": null,
} satisfies AssetIdPermissions

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AssetIdPermissions
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



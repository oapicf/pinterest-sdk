
# DeletePartnerAssetAccessResult

The terminated asset access.

## Properties

Name | Type
------------ | -------------
`assetId` | string
`assetType` | string
`isSharedPartner` | boolean
`partnerId` | string
`permissions` | Array&lt;string&gt;

## Example

```typescript
import type { DeletePartnerAssetAccessResult } from ''

// TODO: Update the object below with actual values
const example = {
  "assetId": null,
  "assetType": null,
  "isSharedPartner": null,
  "partnerId": null,
  "permissions": ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"],
} satisfies DeletePartnerAssetAccessResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as DeletePartnerAssetAccessResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



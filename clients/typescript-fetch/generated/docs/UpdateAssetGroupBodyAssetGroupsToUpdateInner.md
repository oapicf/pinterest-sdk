
# UpdateAssetGroupBodyAssetGroupsToUpdateInner


## Properties

Name | Type
------------ | -------------
`assetGroupId` | string
`name` | string
`description` | string
`assetGroupTypes` | [Array&lt;AssetGroupType&gt;](AssetGroupType.md)
`assetsToAdd` | Array&lt;string&gt;
`assetsToRemove` | Array&lt;string&gt;

## Example

```typescript
import type { UpdateAssetGroupBodyAssetGroupsToUpdateInner } from ''

// TODO: Update the object below with actual values
const example = {
  "assetGroupId": 666791336903426391,
  "name": Canada Ad Accounts,
  "description": Asset groups that has ad accounts shared in Canada,
  "assetGroupTypes": ["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"],
  "assetsToAdd": null,
  "assetsToRemove": null,
} satisfies UpdateAssetGroupBodyAssetGroupsToUpdateInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UpdateAssetGroupBodyAssetGroupsToUpdateInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



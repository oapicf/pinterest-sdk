
# AssetGroupUpdateItemReadOrUpdateItem


## Properties

Name | Type
------------ | -------------
`assetGroupId` | string
`assetGroupTypes` | [Array&lt;AssetGroupType&gt;](AssetGroupType.md)
`assetsToAdd` | Array&lt;string&gt;
`assetsToRemove` | Array&lt;string&gt;
`description` | string
`name` | string

## Example

```typescript
import type { AssetGroupUpdateItemReadOrUpdateItem } from ''

// TODO: Update the object below with actual values
const example = {
  "assetGroupId": null,
  "assetGroupTypes": ["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"],
  "assetsToAdd": null,
  "assetsToRemove": null,
  "description": null,
  "name": null,
} satisfies AssetGroupUpdateItemReadOrUpdateItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AssetGroupUpdateItemReadOrUpdateItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



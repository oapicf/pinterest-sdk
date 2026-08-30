
# AssetGroupModificationReadOrUpdate


## Properties

Name | Type
------------ | -------------
`assetGroupsToUpdate` | [Array&lt;AssetGroupUpdateItemReadOrUpdateItem&gt;](AssetGroupUpdateItemReadOrUpdateItem.md)
`exceptions` | [Array&lt;AssetGroupUpdateError&gt;](AssetGroupUpdateError.md)
`updatedAssetGroups` | [Array&lt;AssetGroupBinding&gt;](AssetGroupBinding.md)

## Example

```typescript
import type { AssetGroupModificationReadOrUpdate } from ''

// TODO: Update the object below with actual values
const example = {
  "assetGroupsToUpdate": null,
  "exceptions": null,
  "updatedAssetGroups": null,
} satisfies AssetGroupModificationReadOrUpdate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AssetGroupModificationReadOrUpdate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



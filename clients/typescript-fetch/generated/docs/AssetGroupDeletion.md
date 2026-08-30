
# AssetGroupDeletion


## Properties

Name | Type
------------ | -------------
`deletedAssetGroups` | Array&lt;string&gt;
`exceptions` | [Array&lt;AssetGroupDeleteError&gt;](AssetGroupDeleteError.md)

## Example

```typescript
import type { AssetGroupDeletion } from ''

// TODO: Update the object below with actual values
const example = {
  "deletedAssetGroups": null,
  "exceptions": null,
} satisfies AssetGroupDeletion

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AssetGroupDeletion
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



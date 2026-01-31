
# DeleteAssetGroupBody

Request body used to delete asset groups

## Properties

Name | Type
------------ | -------------
`assetGroupsToDelete` | Array&lt;string&gt;

## Example

```typescript
import type { DeleteAssetGroupBody } from ''

// TODO: Update the object below with actual values
const example = {
  "assetGroupsToDelete": ["666791336903426391","666791336903426392"],
} satisfies DeleteAssetGroupBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as DeleteAssetGroupBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



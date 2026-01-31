
# CreateAssetGroupBody


## Properties

Name | Type
------------ | -------------
`assetGroupName` | string
`assetGroupDescription` | string
`assetGroupTypes` | [Array&lt;AssetGroupType&gt;](AssetGroupType.md)

## Example

```typescript
import type { CreateAssetGroupBody } from ''

// TODO: Update the object below with actual values
const example = {
  "assetGroupName": Canada Ad Accounts,
  "assetGroupDescription": Asset groups that has ad accounts shared in Canada,
  "assetGroupTypes": ["BRAND","LOCATION_OR_LANGUAGE","PRODUCT_LINE","OTHER"],
} satisfies CreateAssetGroupBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateAssetGroupBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



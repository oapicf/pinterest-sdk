
# CreateAssetAccessRequestItem


## Properties

Name | Type
------------ | -------------
`assetIdToPermissions` | { [key: string]: Array&lt;Permissions&gt;; }
`partnerId` | string

## Example

```typescript
import type { CreateAssetAccessRequestItem } from ''

// TODO: Update the object below with actual values
const example = {
  "assetIdToPermissions": {"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},
  "partnerId": null,
} satisfies CreateAssetAccessRequestItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateAssetAccessRequestItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



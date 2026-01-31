
# UpdateAssetGroupResponse


## Properties

Name | Type
------------ | -------------
`updatedAssetGroups` | [Array&lt;AssetGroupBinding&gt;](AssetGroupBinding.md)
`exceptions` | [Array&lt;UpdateAssetGroupResponseExceptionsInner&gt;](UpdateAssetGroupResponseExceptionsInner.md)

## Example

```typescript
import type { UpdateAssetGroupResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "updatedAssetGroups": null,
  "exceptions": null,
} satisfies UpdateAssetGroupResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UpdateAssetGroupResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



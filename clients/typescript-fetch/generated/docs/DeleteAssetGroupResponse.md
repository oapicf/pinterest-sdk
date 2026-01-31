
# DeleteAssetGroupResponse


## Properties

Name | Type
------------ | -------------
`deletedAssetGroups` | Array&lt;string&gt;
`exceptions` | [Array&lt;DeleteAssetGroupResponseExceptionsInner&gt;](DeleteAssetGroupResponseExceptionsInner.md)

## Example

```typescript
import type { DeleteAssetGroupResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "deletedAssetGroups": null,
  "exceptions": null,
} satisfies DeleteAssetGroupResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as DeleteAssetGroupResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



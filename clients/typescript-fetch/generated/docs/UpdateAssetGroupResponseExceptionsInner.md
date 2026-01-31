
# UpdateAssetGroupResponseExceptionsInner


## Properties

Name | Type
------------ | -------------
`assetGroupId` | string
`code` | number
`message` | string

## Example

```typescript
import type { UpdateAssetGroupResponseExceptionsInner } from ''

// TODO: Update the object below with actual values
const example = {
  "assetGroupId": 666791336903426391,
  "code": 29,
  "message": You are not permitted to access that resource.,
} satisfies UpdateAssetGroupResponseExceptionsInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UpdateAssetGroupResponseExceptionsInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



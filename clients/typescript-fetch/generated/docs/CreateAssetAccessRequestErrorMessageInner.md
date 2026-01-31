
# CreateAssetAccessRequestErrorMessageInner


## Properties

Name | Type
------------ | -------------
`code` | number
`messages` | Array&lt;string&gt;

## Example

```typescript
import type { CreateAssetAccessRequestErrorMessageInner } from ''

// TODO: Update the object below with actual values
const example = {
  "code": 2932,
  "messages": ["Invalid asset id: 549760723247","Invalid asset id: 546760723248"],
} satisfies CreateAssetAccessRequestErrorMessageInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateAssetAccessRequestErrorMessageInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



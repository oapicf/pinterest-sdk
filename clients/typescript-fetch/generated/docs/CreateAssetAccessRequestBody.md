
# CreateAssetAccessRequestBody

An object containing a list of all the asset access requests

## Properties

Name | Type
------------ | -------------
`assetRequests` | [Array&lt;CreateAssetAccessRequestBodyAssetRequestsInner&gt;](CreateAssetAccessRequestBodyAssetRequestsInner.md)

## Example

```typescript
import type { CreateAssetAccessRequestBody } from ''

// TODO: Update the object below with actual values
const example = {
  "assetRequests": null,
} satisfies CreateAssetAccessRequestBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateAssetAccessRequestBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



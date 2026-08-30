
# CreateAssetAccessRequestResponse


## Properties

Name | Type
------------ | -------------
`exceptions` | [Array&lt;AssetAccessRequestError&gt;](AssetAccessRequestError.md)
`invites` | { [key: string]: string; }

## Example

```typescript
import type { CreateAssetAccessRequestResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "exceptions": null,
  "invites": {"766456567741825556":"5349280584552211583","733242520489967216":"5349280584552211845"},
} satisfies CreateAssetAccessRequestResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateAssetAccessRequestResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



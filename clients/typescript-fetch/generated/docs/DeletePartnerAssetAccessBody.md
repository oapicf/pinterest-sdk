
# DeletePartnerAssetAccessBody

An object with a list of partner asset accesses to delete.

## Properties

Name | Type
------------ | -------------
`accesses` | [Array&lt;DeletePartnerAssetAccessItem&gt;](DeletePartnerAssetAccessItem.md)

## Example

```typescript
import type { DeletePartnerAssetAccessBody } from ''

// TODO: Update the object below with actual values
const example = {
  "accesses": null,
} satisfies DeletePartnerAssetAccessBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as DeletePartnerAssetAccessBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



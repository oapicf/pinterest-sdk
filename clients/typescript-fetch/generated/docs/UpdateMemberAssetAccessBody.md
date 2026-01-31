
# UpdateMemberAssetAccessBody

An object with a list of all the new accesses.

## Properties

Name | Type
------------ | -------------
`accesses` | [Array&lt;UpdateMemberAssetAccessBodyAccessesInner&gt;](UpdateMemberAssetAccessBodyAccessesInner.md)

## Example

```typescript
import type { UpdateMemberAssetAccessBody } from ''

// TODO: Update the object below with actual values
const example = {
  "accesses": null,
} satisfies UpdateMemberAssetAccessBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UpdateMemberAssetAccessBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



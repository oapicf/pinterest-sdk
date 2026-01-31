
# UpdatePartnerAssetAccessBodyAccessesInner


## Properties

Name | Type
------------ | -------------
`assetId` | string
`partnerId` | string
`permissions` | [Array&lt;Permissions&gt;](Permissions.md)

## Example

```typescript
import type { UpdatePartnerAssetAccessBodyAccessesInner } from ''

// TODO: Update the object below with actual values
const example = {
  "assetId": 549755885175,
  "partnerId": 1234567890123,
  "permissions": ["ANALYST","ADMIN"],
} satisfies UpdatePartnerAssetAccessBodyAccessesInner

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UpdatePartnerAssetAccessBodyAccessesInner
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



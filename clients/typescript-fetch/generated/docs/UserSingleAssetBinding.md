
# UserSingleAssetBinding

An object containing the permissions a business member/partner has on the asset.

## Properties

Name | Type
------------ | -------------
`permissions` | Array&lt;string&gt;
`user` | [BusinessAccessUserSummary](BusinessAccessUserSummary.md)

## Example

```typescript
import type { UserSingleAssetBinding } from ''

// TODO: Update the object below with actual values
const example = {
  "permissions": ["FINANCE_MANAGER","CATALOGS_MANAGER","AUDIENCE_MANAGER"],
  "user": null,
} satisfies UserSingleAssetBinding

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UserSingleAssetBinding
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



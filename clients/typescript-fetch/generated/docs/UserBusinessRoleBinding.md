
# UserBusinessRoleBinding


## Properties

Name | Type
------------ | -------------
`assetsSummary` | [BusinessMemberAssetsSummary](BusinessMemberAssetsSummary.md)
`businessRoles` | Array&lt;string&gt;
`createdByBusiness` | [BusinessAccessUserSummary](BusinessAccessUserSummary.md)
`createdByUser` | [BusinessAccessUserSummary](BusinessAccessUserSummary.md)
`createdTime` | number
`id` | string
`isSharedPartner` | boolean
`user` | [BusinessAccessUserSummary](BusinessAccessUserSummary.md)

## Example

```typescript
import type { UserBusinessRoleBinding } from ''

// TODO: Update the object below with actual values
const example = {
  "assetsSummary": null,
  "businessRoles": ["BIZ_ADMIN"],
  "createdByBusiness": null,
  "createdByUser": null,
  "createdTime": 1646767577816,
  "id": 383791336903426391,
  "isSharedPartner": false,
  "user": null,
} satisfies UserBusinessRoleBinding

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UserBusinessRoleBinding
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



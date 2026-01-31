
# InviteResponse


## Properties

Name | Type
------------ | -------------
`id` | string
`inviteData` | [BaseInviteDataResponseInviteData](BaseInviteDataResponseInviteData.md)
`isReceivedInvite` | boolean
`user` | [BusinessAccessUserSummary](BusinessAccessUserSummary.md)
`assetsSummary` | [InviteAssetsSummary](InviteAssetsSummary.md)
`businessRoles` | Array&lt;string&gt;
`createdByBusiness` | object
`createdByUser` | object
`createdTime` | number

## Example

```typescript
import type { InviteResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 383791336903426391,
  "inviteData": null,
  "isReceivedInvite": null,
  "user": null,
  "assetsSummary": null,
  "businessRoles": ["BIZ_ADMIN"],
  "createdByBusiness": null,
  "createdByUser": null,
  "createdTime": 1646767577816,
} satisfies InviteResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as InviteResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



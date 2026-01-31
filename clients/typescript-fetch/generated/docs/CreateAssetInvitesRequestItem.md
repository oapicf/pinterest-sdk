
# CreateAssetInvitesRequestItem

Object declaring an asset role update to an invite.

## Properties

Name | Type
------------ | -------------
`inviteId` | string
`inviteType` | [InviteType](InviteType.md)
`assetIdToPermissions` | { [key: string]: Array&lt;Permissions&gt;; }

## Example

```typescript
import type { CreateAssetInvitesRequestItem } from ''

// TODO: Update the object below with actual values
const example = {
  "inviteId": 1234567890123,
  "inviteType": null,
  "assetIdToPermissions": {"549760723247":["ANALYST"],"549760723248":["ANALYST","ADMIN"],"809944451643622187":["PROFILE_PUBLISHER"]},
} satisfies CreateAssetInvitesRequestItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateAssetInvitesRequestItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



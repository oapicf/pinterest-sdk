
# InviteBusinessRoleBinding

An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.

## Properties

Name | Type
------------ | -------------
`createdByBusinessId` | string
`createdByUserId` | string
`id` | string
`inviteData` | [InviteDataResponse](InviteDataResponse.md)
`isReceivedInvite` | boolean
`user` | [BusinessAccessUserSummary](BusinessAccessUserSummary.md)

## Example

```typescript
import type { InviteBusinessRoleBinding } from ''

// TODO: Update the object below with actual values
const example = {
  "createdByBusinessId": 1234567890123,
  "createdByUserId": 1234567890123,
  "id": 383791336903426391,
  "inviteData": null,
  "isReceivedInvite": null,
  "user": null,
} satisfies InviteBusinessRoleBinding

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as InviteBusinessRoleBinding
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



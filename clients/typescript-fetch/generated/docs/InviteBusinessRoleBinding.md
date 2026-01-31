
# InviteBusinessRoleBinding


## Properties

Name | Type
------------ | -------------
`id` | string
`inviteData` | [BaseInviteDataResponseInviteData](BaseInviteDataResponseInviteData.md)
`isReceivedInvite` | boolean
`user` | object
`createdByBusinessId` | string
`createdByUserId` | string

## Example

```typescript
import type { InviteBusinessRoleBinding } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 383791336903426391,
  "inviteData": null,
  "isReceivedInvite": null,
  "user": null,
  "createdByBusinessId": 1234567890123,
  "createdByUserId": 1234567890123,
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



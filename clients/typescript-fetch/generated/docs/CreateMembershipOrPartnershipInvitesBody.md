
# CreateMembershipOrPartnershipInvitesBody

Body to be used on path to send Members or Partners Invite or Request

## Properties

Name | Type
------------ | -------------
`businessRole` | [BusinessRoleForInvite](BusinessRoleForInvite.md)
`inviteType` | [InviteType](InviteType.md)
`members` | Array&lt;string&gt;
`partners` | Array&lt;string&gt;

## Example

```typescript
import type { CreateMembershipOrPartnershipInvitesBody } from ''

// TODO: Update the object below with actual values
const example = {
  "businessRole": BIZ_ADMIN,
  "inviteType": null,
  "members": ["business0101","user@business.com"],
  "partners": ["809944451643622187","766456567741825556"],
} satisfies CreateMembershipOrPartnershipInvitesBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateMembershipOrPartnershipInvitesBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



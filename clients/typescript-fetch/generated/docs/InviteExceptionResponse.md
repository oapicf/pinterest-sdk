
# InviteExceptionResponse

An exception object if there is an error performing the action. Will only be provided if there is an error.

## Properties

Name | Type
------------ | -------------
`code` | number
`inviteOrRequestId` | string
`message` | string
`usersOrPartnerIds` | Array&lt;string&gt;

## Example

```typescript
import type { InviteExceptionResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "code": 403,
  "inviteOrRequestId": 383791336903426391,
  "message": You hit the maximum number of pending invites allowed.,
  "usersOrPartnerIds": ["businessMember0101","business+member@business.com"],
} satisfies InviteExceptionResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as InviteExceptionResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



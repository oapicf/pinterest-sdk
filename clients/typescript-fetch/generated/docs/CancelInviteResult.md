
# CancelInviteResult


## Properties

Name | Type
------------ | -------------
`id` | string
`inviteData` | [InviteDataResponse](InviteDataResponse.md)
`isReceivedInvite` | boolean
`user` | [CancelInviteResultUser](CancelInviteResultUser.md)

## Example

```typescript
import type { CancelInviteResult } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "inviteData": null,
  "isReceivedInvite": null,
  "user": null,
} satisfies CancelInviteResult

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CancelInviteResult
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



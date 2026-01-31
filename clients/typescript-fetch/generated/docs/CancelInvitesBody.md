
# CancelInvitesBody

Request body used to cancel invites

## Properties

Name | Type
------------ | -------------
`inviteIds` | Array&lt;string&gt;

## Example

```typescript
import type { CancelInvitesBody } from ''

// TODO: Update the object below with actual values
const example = {
  "inviteIds": ["1234567890123456789","1122334455667788991"],
} satisfies CancelInvitesBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CancelInvitesBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



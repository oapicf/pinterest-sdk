
# AuthRespondInvitesBody

An object with a list of all the invites the user would like to respond to and the action to take.

## Properties

Name | Type
------------ | -------------
`invites` | [Array&lt;AuthRespondInvitesBodyInvitesInner&gt;](AuthRespondInvitesBodyInvitesInner.md)

## Example

```typescript
import type { AuthRespondInvitesBody } from ''

// TODO: Update the object below with actual values
const example = {
  "invites": null,
} satisfies AuthRespondInvitesBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AuthRespondInvitesBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



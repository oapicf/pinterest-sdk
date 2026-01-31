
# DeleteInvitesResultsResponseArrayItemsInnerException

An exception object if there is an error performing the cancellation. It will only be provided if there is an error.

## Properties

Name | Type
------------ | -------------
`inviteId` | string
`message` | string

## Example

```typescript
import type { DeleteInvitesResultsResponseArrayItemsInnerException } from ''

// TODO: Update the object below with actual values
const example = {
  "inviteId": null,
  "message": Business Invite request cannot be performed on current invitation status.,
} satisfies DeleteInvitesResultsResponseArrayItemsInnerException

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as DeleteInvitesResultsResponseArrayItemsInnerException
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# DeleteInvitesResultsResponseArray

Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id

## Properties

Name | Type
------------ | -------------
`items` | [Array&lt;DeleteInvitesResultsResponseArrayItemsInner&gt;](DeleteInvitesResultsResponseArrayItemsInner.md)

## Example

```typescript
import type { DeleteInvitesResultsResponseArray } from ''

// TODO: Update the object below with actual values
const example = {
  "items": null,
} satisfies DeleteInvitesResultsResponseArray

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as DeleteInvitesResultsResponseArray
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



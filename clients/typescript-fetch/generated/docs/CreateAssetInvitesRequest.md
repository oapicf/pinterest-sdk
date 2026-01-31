
# CreateAssetInvitesRequest

Request body for updating asset roles for existing invites.

## Properties

Name | Type
------------ | -------------
`invites` | [Array&lt;CreateAssetInvitesRequestItem&gt;](CreateAssetInvitesRequestItem.md)

## Example

```typescript
import type { CreateAssetInvitesRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "invites": null,
} satisfies CreateAssetInvitesRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateAssetInvitesRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



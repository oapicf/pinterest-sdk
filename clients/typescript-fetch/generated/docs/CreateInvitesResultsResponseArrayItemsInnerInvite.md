
# CreateInvitesResultsResponseArrayItemsInnerInvite

An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.

## Properties

Name | Type
------------ | -------------
`id` | string
`user` | [BusinessAccessUserSummary](BusinessAccessUserSummary.md)

## Example

```typescript
import type { CreateInvitesResultsResponseArrayItemsInnerInvite } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 383791336903426391,
  "user": null,
} satisfies CreateInvitesResultsResponseArrayItemsInnerInvite

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateInvitesResultsResponseArrayItemsInnerInvite
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



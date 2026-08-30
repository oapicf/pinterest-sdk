
# DeleteBusinessMembershipBody

List of members with role to delete.

## Properties

Name | Type
------------ | -------------
`members` | [Array&lt;DeleteBusinessMembershipMember&gt;](DeleteBusinessMembershipMember.md)

## Example

```typescript
import type { DeleteBusinessMembershipBody } from ''

// TODO: Update the object below with actual values
const example = {
  "members": null,
} satisfies DeleteBusinessMembershipBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as DeleteBusinessMembershipBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



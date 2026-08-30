
# InviteActionResultItem

An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).

## Properties

Name | Type
------------ | -------------
`exception` | [InviteExceptionResponse](InviteExceptionResponse.md)
`invite` | [InviteBusinessRoleBinding](InviteBusinessRoleBinding.md)

## Example

```typescript
import type { InviteActionResultItem } from ''

// TODO: Update the object below with actual values
const example = {
  "exception": null,
  "invite": null,
} satisfies InviteActionResultItem

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as InviteActionResultItem
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



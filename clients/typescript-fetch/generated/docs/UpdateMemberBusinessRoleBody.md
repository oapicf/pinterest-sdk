
# UpdateMemberBusinessRoleBody

Single instance of a business member to have its role updated

## Properties

Name | Type
------------ | -------------
`businessRole` | [BusinessRoleForMembers](BusinessRoleForMembers.md)
`memberId` | string

## Example

```typescript
import type { UpdateMemberBusinessRoleBody } from ''

// TODO: Update the object below with actual values
const example = {
  "businessRole": null,
  "memberId": 140943737684417,
} satisfies UpdateMemberBusinessRoleBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as UpdateMemberBusinessRoleBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# BusinessMembershipMember

A business member identified by `member_id` with their `business_role` in the business.

## Properties

Name | Type
------------ | -------------
`businessRole` | [BusinessRoleForMembers](BusinessRoleForMembers.md)
`memberId` | string

## Example

```typescript
import type { BusinessMembershipMember } from ''

// TODO: Update the object below with actual values
const example = {
  "businessRole": null,
  "memberId": 140943737684417,
} satisfies BusinessMembershipMember

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BusinessMembershipMember
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



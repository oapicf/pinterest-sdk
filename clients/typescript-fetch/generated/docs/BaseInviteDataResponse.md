
# BaseInviteDataResponse


## Properties

Name | Type
------------ | -------------
`id` | string
`inviteData` | [BaseInviteDataResponseInviteData](BaseInviteDataResponseInviteData.md)
`isReceivedInvite` | boolean
`user` | [BusinessAccessUserSummary](BusinessAccessUserSummary.md)

## Example

```typescript
import type { BaseInviteDataResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 383791336903426391,
  "inviteData": null,
  "isReceivedInvite": null,
  "user": null,
} satisfies BaseInviteDataResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BaseInviteDataResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



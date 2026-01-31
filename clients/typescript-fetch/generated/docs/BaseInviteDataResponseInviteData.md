
# BaseInviteDataResponseInviteData

Metadata for the invite/request.

## Properties

Name | Type
------------ | -------------
`inviteExpiration` | number
`inviteStatus` | string
`inviteType` | string
`lastUpdatedTime` | number
`sentAt` | number

## Example

```typescript
import type { BaseInviteDataResponseInviteData } from ''

// TODO: Update the object below with actual values
const example = {
  "inviteExpiration": 1709748104775,
  "inviteStatus": PENDING,
  "inviteType": MEMBER_INVITE,
  "lastUpdatedTime": 1646767577816,
  "sentAt": 1646767577816,
} satisfies BaseInviteDataResponseInviteData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as BaseInviteDataResponseInviteData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# Account

User account model containing properties related to a user\'s account.

## Properties

Name | Type
------------ | -------------
`about` | string
`accountType` | [UserAccountType](UserAccountType.md)
`boardCount` | number
`businessName` | string
`followerCount` | number
`followingCount` | number
`id` | string
`monthlyViews` | number
`pinCount` | number
`profileImage` | string
`username` | string
`websiteUrl` | string

## Example

```typescript
import type { Account } from ''

// TODO: Update the object below with actual values
const example = {
  "about": null,
  "accountType": null,
  "boardCount": 14,
  "businessName": null,
  "followerCount": 10,
  "followingCount": 347,
  "id": 2783136121146311751,
  "monthlyViews": 163,
  "pinCount": 339,
  "profileImage": null,
  "username": null,
  "websiteUrl": null,
} satisfies Account

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Account
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



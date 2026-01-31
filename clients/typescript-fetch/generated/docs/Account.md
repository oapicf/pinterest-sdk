
# Account


## Properties

Name | Type
------------ | -------------
`accountType` | string
`id` | string
`profileImage` | string
`websiteUrl` | string
`username` | string
`about` | string
`businessName` | string
`boardCount` | number
`pinCount` | number
`followerCount` | number
`followingCount` | number
`monthlyViews` | number

## Example

```typescript
import type { Account } from ''

// TODO: Update the object below with actual values
const example = {
  "accountType": null,
  "id": 2783136121146311751,
  "profileImage": null,
  "websiteUrl": null,
  "username": null,
  "about": null,
  "businessName": null,
  "boardCount": 14,
  "pinCount": 339,
  "followerCount": 10,
  "followingCount": 347,
  "monthlyViews": 163,
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



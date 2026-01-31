
# AdAccount


## Properties

Name | Type
------------ | -------------
`id` | string
`name` | string
`owner` | [AdAccountOwner](AdAccountOwner.md)
`country` | [Country](Country.md)
`currency` | [Currency](Currency.md)
`permissions` | [Array&lt;BusinessAccessRole&gt;](BusinessAccessRole.md)
`createdTime` | number
`updatedTime` | number

## Example

```typescript
import type { AdAccount } from ''

// TODO: Update the object below with actual values
const example = {
  "id": null,
  "name": null,
  "owner": null,
  "country": null,
  "currency": null,
  "permissions": null,
  "createdTime": 1451431341,
  "updatedTime": 1451431341,
} satisfies AdAccount

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdAccount
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



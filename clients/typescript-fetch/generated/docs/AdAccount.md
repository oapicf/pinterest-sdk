
# AdAccount


## Properties

Name | Type
------------ | -------------
`country` | [Country](Country.md)
`createdTime` | number
`currency` | [Currency](Currency.md)
`id` | string
`name` | string
`owner` | [AdAccountOwner](AdAccountOwner.md)
`permissions` | [Array&lt;BusinessAccessRole&gt;](BusinessAccessRole.md)
`timeZone` | string
`updatedTime` | number

## Example

```typescript
import type { AdAccount } from ''

// TODO: Update the object below with actual values
const example = {
  "country": null,
  "createdTime": null,
  "currency": null,
  "id": null,
  "name": null,
  "owner": null,
  "permissions": null,
  "timeZone": America/Los_Angeles,
  "updatedTime": null,
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



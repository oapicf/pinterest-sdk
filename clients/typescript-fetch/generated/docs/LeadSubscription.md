
# LeadSubscription


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`apiVersion` | string
`createdTime` | number
`cryptographicAlgorithm` | string
`cryptographicKey` | string
`id` | string
`leadFormId` | string
`userAccountId` | string
`webhookUrl` | string

## Example

```typescript
import type { LeadSubscription } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": null,
  "apiVersion": null,
  "createdTime": null,
  "cryptographicAlgorithm": null,
  "cryptographicKey": null,
  "id": null,
  "leadFormId": null,
  "userAccountId": null,
  "webhookUrl": null,
} satisfies LeadSubscription

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LeadSubscription
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



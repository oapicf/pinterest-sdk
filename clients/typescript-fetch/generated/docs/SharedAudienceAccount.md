
# SharedAudienceAccount


## Properties

Name | Type
------------ | -------------
`accountId` | string
`accountName` | string
`accountType` | string
`sharedOnTimestamp` | number

## Example

```typescript
import type { SharedAudienceAccount } from ''

// TODO: Update the object below with actual values
const example = {
  "accountId": 549755885175,
  "accountName": Home Depot USA,
  "accountType": null,
  "sharedOnTimestamp": 1677003860,
} satisfies SharedAudienceAccount

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SharedAudienceAccount
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# AdAccountsAudienceUpdate

Resource create or update operation model.

## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`audienceType` | [AudienceType](AudienceType.md)
`description` | string
`name` | string
`operationType` | [AudienceUpdateOperationType](AudienceUpdateOperationType.md)
`rule` | [AdAccountsAudienceRule](AdAccountsAudienceRule.md)

## Example

```typescript
import type { AdAccountsAudienceUpdate } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": null,
  "audienceType": null,
  "description": null,
  "name": null,
  "operationType": null,
  "rule": null,
} satisfies AdAccountsAudienceUpdate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdAccountsAudienceUpdate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



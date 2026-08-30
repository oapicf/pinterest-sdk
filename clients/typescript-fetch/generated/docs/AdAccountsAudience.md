
# AdAccountsAudience


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`audienceType` | [AudienceType](AudienceType.md)
`createdByCompanyName` | string
`createdTimestamp` | number
`description` | string
`id` | string
`isNca` | boolean
`name` | string
`rule` | [AdAccountsAudienceRule](AdAccountsAudienceRule.md)
`size` | number
`status` | [AudienceStatus](AudienceStatus.md)
`type` | string
`updatedTimestamp` | number

## Example

```typescript
import type { AdAccountsAudience } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": null,
  "audienceType": null,
  "createdByCompanyName": null,
  "createdTimestamp": null,
  "description": null,
  "id": null,
  "isNca": null,
  "name": null,
  "rule": null,
  "size": null,
  "status": null,
  "type": null,
  "updatedTimestamp": null,
} satisfies AdAccountsAudience

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AdAccountsAudience
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



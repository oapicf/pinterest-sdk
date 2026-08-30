
# Audience


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`audienceType` | [PinnerListType](PinnerListType.md)
`createdByCompanyName` | string
`createdTimestamp` | number
`description` | string
`id` | string
`isNca` | boolean
`name` | string
`rule` | [AudienceRule](AudienceRule.md)
`size` | number
`status` | [AudienceStatus](AudienceStatus.md)
`type` | string
`updatedTimestamp` | number

## Example

```typescript
import type { Audience } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 549755885175,
  "audienceType": null,
  "createdByCompanyName": Pinterest,
  "createdTimestamp": 1451431341,
  "description": People who love making quilts.,
  "id": 1234,
  "isNca": null,
  "name": ACME Tools,
  "rule": null,
  "size": 1000,
  "status": null,
  "type": audience,
  "updatedTimestamp": 1451431341,
} satisfies Audience

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as Audience
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# Audience


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`id` | string
`name` | string
`audienceType` | string
`description` | string
`rule` | [AudienceRule](AudienceRule.md)
`size` | number
`status` | string
`type` | string
`createdTimestamp` | number
`updatedTimestamp` | number

## Example

```typescript
import type { Audience } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 549755885175,
  "id": 1234,
  "name": ACME Tools,
  "audienceType": null,
  "description": People who love making quilts.,
  "rule": null,
  "size": 1000,
  "status": null,
  "type": audience,
  "createdTimestamp": 1451431341,
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



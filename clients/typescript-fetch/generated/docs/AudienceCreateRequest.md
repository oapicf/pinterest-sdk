
# AudienceCreateRequest


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`name` | string
`rule` | [AudienceRule](AudienceRule.md)
`audienceType` | [AudienceType](AudienceType.md)
`description` | string

## Example

```typescript
import type { AudienceCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 549755885175,
  "name": string,
  "rule": null,
  "audienceType": null,
  "description": string,
} satisfies AudienceCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AudienceCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



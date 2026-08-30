
# AppsflyerAudienceSyncCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`containerId` | string
`urlAdidSha256` | string
`urlEmailSha256` | string

## Example

```typescript
import type { AppsflyerAudienceSyncCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "containerId": null,
  "urlAdidSha256": null,
  "urlEmailSha256": null,
} satisfies AppsflyerAudienceSyncCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as AppsflyerAudienceSyncCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



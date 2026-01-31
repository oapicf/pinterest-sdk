
# IntegrationLog

Schema for log sent from an integration application.

## Properties

Name | Type
------------ | -------------
`clientTimestamp` | number
`eventType` | string
`logLevel` | string
`externalBusinessId` | string
`advertiserId` | string
`merchantId` | string
`tagId` | string
`feedProfileId` | string
`message` | string
`appVersionNumber` | string
`platformVersionNumber` | string
`error` | [IntegrationLogClientError](IntegrationLogClientError.md)
`request` | [IntegrationLogClientRequest](IntegrationLogClientRequest.md)

## Example

```typescript
import type { IntegrationLog } from ''

// TODO: Update the object below with actual values
const example = {
  "clientTimestamp": null,
  "eventType": null,
  "logLevel": null,
  "externalBusinessId": null,
  "advertiserId": null,
  "merchantId": null,
  "tagId": null,
  "feedProfileId": null,
  "message": null,
  "appVersionNumber": null,
  "platformVersionNumber": null,
  "error": null,
  "request": null,
} satisfies IntegrationLog

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IntegrationLog
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# IntegrationLog

Schema for log sent from an integration application.

## Properties

Name | Type
------------ | -------------
`advertiserId` | string
`appVersionNumber` | string
`clientTimestamp` | number
`error` | [IntegrationLogClientError](IntegrationLogClientError.md)
`eventType` | [IntegrationLogEventType](IntegrationLogEventType.md)
`externalBusinessId` | string
`feedProfileId` | string
`logLevel` | [IntegrationLogLevel](IntegrationLogLevel.md)
`merchantId` | string
`message` | string
`platformVersionNumber` | string
`request` | [IntegrationLogClientRequest](IntegrationLogClientRequest.md)
`tagId` | string

## Example

```typescript
import type { IntegrationLog } from ''

// TODO: Update the object below with actual values
const example = {
  "advertiserId": null,
  "appVersionNumber": null,
  "clientTimestamp": null,
  "error": null,
  "eventType": null,
  "externalBusinessId": null,
  "feedProfileId": null,
  "logLevel": null,
  "merchantId": null,
  "message": null,
  "platformVersionNumber": null,
  "request": null,
  "tagId": null,
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



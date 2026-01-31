
# IntegrationLogClientRequest

HTTP request details included in the log sent by the client.

## Properties

Name | Type
------------ | -------------
`method` | string
`host` | string
`path` | string
`requestHeaders` | { [key: string]: string; }
`responseHeaders` | { [key: string]: string; }
`responseStatusCode` | number

## Example

```typescript
import type { IntegrationLogClientRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "method": null,
  "host": null,
  "path": null,
  "requestHeaders": null,
  "responseHeaders": null,
  "responseStatusCode": null,
} satisfies IntegrationLogClientRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IntegrationLogClientRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



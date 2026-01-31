
# IntegrationLogsRequest

Batch of logs sent from an integration application.

## Properties

Name | Type
------------ | -------------
`logs` | [Array&lt;IntegrationLog&gt;](IntegrationLog.md)

## Example

```typescript
import type { IntegrationLogsRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "logs": null,
} satisfies IntegrationLogsRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IntegrationLogsRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



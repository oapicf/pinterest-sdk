
# IntegrationLogsInvalidLogResponse

Schema describing the response when a log has invalid fields.

## Properties

Name | Type
------------ | -------------
`rejectedLogs` | [Array&lt;IntegrationLogsInvalidLogResponseRejectedLogsInner&gt;](IntegrationLogsInvalidLogResponseRejectedLogsInner.md)

## Example

```typescript
import type { IntegrationLogsInvalidLogResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "rejectedLogs": null,
} satisfies IntegrationLogsInvalidLogResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IntegrationLogsInvalidLogResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



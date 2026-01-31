
# IntegrationLogClientError

System error details included in the log sent by the client.

## Properties

Name | Type
------------ | -------------
`cause` | string
`columnNumber` | number
`fileName` | string
`lineNumber` | number
`message` | string
`messageDetail` | string
`name` | string
`number` | number
`stackTrace` | string

## Example

```typescript
import type { IntegrationLogClientError } from ''

// TODO: Update the object below with actual values
const example = {
  "cause": null,
  "columnNumber": null,
  "fileName": null,
  "lineNumber": null,
  "message": null,
  "messageDetail": null,
  "name": null,
  "number": null,
  "stackTrace": null,
} satisfies IntegrationLogClientError

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as IntegrationLogClientError
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



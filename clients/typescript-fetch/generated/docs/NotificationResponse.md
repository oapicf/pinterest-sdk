
# NotificationResponse


## Properties

Name | Type
------------ | -------------
`success` | boolean
`receivedAt` | number
`errorMsg` | string

## Example

```typescript
import type { NotificationResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "success": false,
  "receivedAt": 1677003860,
  "errorMsg": null,
} satisfies NotificationResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as NotificationResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



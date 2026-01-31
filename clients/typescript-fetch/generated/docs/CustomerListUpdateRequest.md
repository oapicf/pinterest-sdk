
# CustomerListUpdateRequest


## Properties

Name | Type
------------ | -------------
`records` | string
`operationType` | [UserListOperationType](UserListOperationType.md)
`exceptions` | [Exception](.md)

## Example

```typescript
import type { CustomerListUpdateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "records": email2@pinterest.com,email6@pinterest.com,,
  "operationType": null,
  "exceptions": null,
} satisfies CustomerListUpdateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CustomerListUpdateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



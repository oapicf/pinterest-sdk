
# CustomerListUploadCreateRequest


## Properties

Name | Type
------------ | -------------
`operation` | [UserListOperationType](UserListOperationType.md)
`totalParts` | number

## Example

```typescript
import type { CustomerListUploadCreateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "operation": null,
  "totalParts": 2,
} satisfies CustomerListUploadCreateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CustomerListUploadCreateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# CustomerListRequest


## Properties

Name | Type
------------ | -------------
`name` | string
`records` | string
`listType` | [UserListType](UserListType.md)
`exceptions` | object

## Example

```typescript
import type { CustomerListRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "name": The Glengarry Glen Ross leads,
  "records": email1@pinterest.com,email2@pinterest.com,..<more records>,
  "listType": null,
  "exceptions": null,
} satisfies CustomerListRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CustomerListRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



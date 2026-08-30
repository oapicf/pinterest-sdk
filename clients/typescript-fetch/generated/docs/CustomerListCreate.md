
# CustomerListCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`isNca` | boolean
`listType` | [UserListType](UserListType.md)
`name` | string
`records` | string
`recordsV2` | [Array&lt;CustomerListRecordRow&gt;](CustomerListRecordRow.md)

## Example

```typescript
import type { CustomerListCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "isNca": null,
  "listType": null,
  "name": The Glengarry Glen Ross leads,
  "records": email1@pinterest.com,email2@pinterest.com,..<more records>,
  "recordsV2": null,
} satisfies CustomerListCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CustomerListCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



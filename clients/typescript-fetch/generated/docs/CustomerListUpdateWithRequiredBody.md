
# CustomerListUpdateWithRequiredBody

Resource create or update operation model with required body fields (no OptionalProperties).

## Properties

Name | Type
------------ | -------------
`operationType` | [UserListOperationType](UserListOperationType.md)
`records` | string
`recordsV2` | [Array&lt;CustomerListRecordRow&gt;](CustomerListRecordRow.md)

## Example

```typescript
import type { CustomerListUpdateWithRequiredBody } from ''

// TODO: Update the object below with actual values
const example = {
  "operationType": null,
  "records": email1@pinterest.com,email2@pinterest.com,..<more records>,
  "recordsV2": null,
} satisfies CustomerListUpdateWithRequiredBody

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CustomerListUpdateWithRequiredBody
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



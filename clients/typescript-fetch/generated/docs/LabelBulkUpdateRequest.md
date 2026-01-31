
# LabelBulkUpdateRequest


## Properties

Name | Type
------------ | -------------
`id` | string
`status` | string
`value` | string

## Example

```typescript
import type { LabelBulkUpdateRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "id": 1106385754497,
  "status": ARCHIVED,
  "value": null,
} satisfies LabelBulkUpdateRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as LabelBulkUpdateRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



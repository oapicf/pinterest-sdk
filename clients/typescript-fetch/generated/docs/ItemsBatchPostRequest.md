
# ItemsBatchPostRequest


## Properties

Name | Type
------------ | -------------
`catalogId` | string
`catalogType` | string
`country` | [Country](Country.md)
`items` | [Array&lt;ItemDeleteBatchRecord&gt;](ItemDeleteBatchRecord.md)
`language` | string
`operation` | [BatchOperation](BatchOperation.md)

## Example

```typescript
import type { ItemsBatchPostRequest } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": 2680059592705,
  "catalogType": null,
  "country": null,
  "items": null,
  "language": null,
  "operation": null,
} satisfies ItemsBatchPostRequest

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as ItemsBatchPostRequest
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



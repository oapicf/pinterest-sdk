
# CustomerListUpload


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`creationTime` | number
`customerListId` | string
`errorCounts` | [Array&lt;ErrorDetail&gt;](ErrorDetail.md)
`id` | string
`operation` | [UserListOperationType](UserListOperationType.md)
`recordCounts` | [RecordCounts](RecordCounts.md)
`state` | [WorkloadState](WorkloadState.md)
`updatedTime` | number

## Example

```typescript
import type { CustomerListUpload } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 9876543210,
  "creationTime": 1728606435,
  "customerListId": 59854745824,
  "errorCounts": [{"error_code":42,"message":"Invalid email","count":20}],
  "id": 1234567890,
  "operation": null,
  "recordCounts": null,
  "state": RUNNING,
  "updatedTime": 1728606435,
} satisfies CustomerListUpload

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CustomerListUpload
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



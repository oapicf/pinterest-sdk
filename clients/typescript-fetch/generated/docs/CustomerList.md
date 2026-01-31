
# CustomerList


## Properties

Name | Type
------------ | -------------
`adAccountId` | string
`createdTime` | number
`id` | string
`name` | string
`numBatches` | number
`numRemovedUserRecords` | number
`numUploadedUserRecords` | number
`status` | string
`type` | string
`updatedTime` | number
`exceptions` | object

## Example

```typescript
import type { CustomerList } from ''

// TODO: Update the object below with actual values
const example = {
  "adAccountId": 549756359984,
  "createdTime": 1452208622,
  "id": 643,
  "name": The Glengarry Glen Ross leads,
  "numBatches": 2,
  "numRemovedUserRecords": 0,
  "numUploadedUserRecords": 11,
  "status": PROCESSING,
  "type": customerlist,
  "updatedTime": 1461269616,
  "exceptions": null,
} satisfies CustomerList

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CustomerList
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



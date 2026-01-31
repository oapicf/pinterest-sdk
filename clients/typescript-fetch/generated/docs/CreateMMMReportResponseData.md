
# CreateMMMReportResponseData


## Properties

Name | Type
------------ | -------------
`reportStatus` | [BulkReportingJobStatus](BulkReportingJobStatus.md)
`token` | string
`message` | string
`status` | string

## Example

```typescript
import type { CreateMMMReportResponseData } from ''

// TODO: Update the object below with actual values
const example = {
  "reportStatus": null,
  "token": null,
  "message": null,
  "status": success,
} satisfies CreateMMMReportResponseData

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CreateMMMReportResponseData
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



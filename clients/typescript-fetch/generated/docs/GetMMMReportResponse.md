
# GetMMMReportResponse


## Properties

Name | Type
------------ | -------------
`code` | number
`data` | [GetMMMReportResponseData](GetMMMReportResponseData.md)
`message` | string
`status` | string

## Example

```typescript
import type { GetMMMReportResponse } from ''

// TODO: Update the object below with actual values
const example = {
  "code": 0,
  "data": null,
  "message": ok,
  "status": success,
} satisfies GetMMMReportResponse

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as GetMMMReportResponse
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



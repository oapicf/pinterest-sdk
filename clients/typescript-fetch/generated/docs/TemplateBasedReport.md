
# TemplateBasedReport


## Properties

Name | Type
------------ | -------------
`message` | string
`reportStatus` | [BulkReportingJobStatus](BulkReportingJobStatus.md)
`templateId` | string
`token` | string

## Example

```typescript
import type { TemplateBasedReport } from ''

// TODO: Update the object below with actual values
const example = {
  "message": null,
  "reportStatus": null,
  "templateId": null,
  "token": null,
} satisfies TemplateBasedReport

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as TemplateBasedReport
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



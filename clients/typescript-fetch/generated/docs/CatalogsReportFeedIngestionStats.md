
# CatalogsReportFeedIngestionStats


## Properties

Name | Type
------------ | -------------
`reportType` | string
`catalogId` | string
`code` | number
`codeLabel` | string
`message` | string
`occurrences` | number
`severity` | string

## Example

```typescript
import type { CatalogsReportFeedIngestionStats } from ''

// TODO: Update the object below with actual values
const example = {
  "reportType": null,
  "catalogId": null,
  "code": 112,
  "codeLabel": AVAILABILITY_INVALID,
  "message": null,
  "occurrences": 10,
  "severity": null,
} satisfies CatalogsReportFeedIngestionStats

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsReportFeedIngestionStats
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



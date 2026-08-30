
# CatalogsReportStats

Diagnostics aggregated numbers

## Properties

Name | Type
------------ | -------------
`catalogId` | string
`code` | number
`codeLabel` | string
`message` | string
`occurrences` | number
`reportType` | string
`severity` | string
`ineligibleForAds` | boolean
`ineligibleForOrganic` | boolean

## Example

```typescript
import type { CatalogsReportStats } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": null,
  "code": null,
  "codeLabel": SPAM,
  "message": null,
  "occurrences": 10,
  "reportType": null,
  "severity": null,
  "ineligibleForAds": true,
  "ineligibleForOrganic": true,
} satisfies CatalogsReportStats

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsReportStats
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



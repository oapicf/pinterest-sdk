
# CatalogsReportDistributionStats


## Properties

Name | Type
------------ | -------------
`catalogId` | string
`code` | number
`codeLabel` | string
`ineligibleForAds` | boolean
`ineligibleForOrganic` | boolean
`message` | string
`occurrences` | number
`reportType` | string

## Example

```typescript
import type { CatalogsReportDistributionStats } from ''

// TODO: Update the object below with actual values
const example = {
  "catalogId": null,
  "code": null,
  "codeLabel": SPAM,
  "ineligibleForAds": true,
  "ineligibleForOrganic": true,
  "message": null,
  "occurrences": 10,
  "reportType": null,
} satisfies CatalogsReportDistributionStats

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as CatalogsReportDistributionStats
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



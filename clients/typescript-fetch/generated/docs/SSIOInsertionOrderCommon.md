
# SSIOInsertionOrderCommon


## Properties

Name | Type
------------ | -------------
`agencyLink` | string
`billingContactEmail` | string
`billingContactFirstname` | string
`billingContactLastname` | string
`budgetAmount` | number
`endDate` | string
`mediaContactEmail` | string
`mediaContactFirstname` | string
`mediaContactLastname` | string
`poNumber` | string
`startDate` | string
`userEmail` | string

## Example

```typescript
import type { SSIOInsertionOrderCommon } from ''

// TODO: Update the object below with actual values
const example = {
  "agencyLink": null,
  "billingContactEmail": test@example,
  "billingContactFirstname": null,
  "billingContactLastname": null,
  "budgetAmount": 5000000,
  "endDate": 2020-12-20,
  "mediaContactEmail": test@example,
  "mediaContactFirstname": null,
  "mediaContactLastname": null,
  "poNumber": null,
  "startDate": 2020-12-20,
  "userEmail": test@example,
} satisfies SSIOInsertionOrderCommon

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SSIOInsertionOrderCommon
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)




# SSIOInsertionOrderCommon


## Properties

Name | Type
------------ | -------------
`startDate` | string
`endDate` | string
`poNumber` | string
`budgetAmount` | number
`billingContactFirstname` | string
`billingContactLastname` | string
`billingContactEmail` | string
`mediaContactFirstname` | string
`mediaContactLastname` | string
`mediaContactEmail` | string
`agencyLink` | string
`userEmail` | string

## Example

```typescript
import type { SSIOInsertionOrderCommon } from ''

// TODO: Update the object below with actual values
const example = {
  "startDate": 2020-12-20,
  "endDate": 2020-12-20,
  "poNumber": null,
  "budgetAmount": 5000000,
  "billingContactFirstname": null,
  "billingContactLastname": null,
  "billingContactEmail": test@example,
  "mediaContactFirstname": null,
  "mediaContactLastname": null,
  "mediaContactEmail": test@example,
  "agencyLink": null,
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



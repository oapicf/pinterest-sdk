
# SSIOInsertionOrderUpdate

Resource create or update operation model.

## Properties

Name | Type
------------ | -------------
`adsManagerOrderLineId` | string
`agencyLink` | string
`billingContactEmail` | string
`billingContactFirstname` | string
`billingContactLastname` | string
`budgetAmount` | number
`endDate` | string
`mediaContactEmail` | string
`mediaContactFirstname` | string
`mediaContactLastname` | string
`oracleLineId` | string
`poNumber` | string
`salesforceOrderId` | string
`salesforceOrderLineId` | string
`startDate` | string
`userEmail` | string

## Example

```typescript
import type { SSIOInsertionOrderUpdate } from ''

// TODO: Update the object below with actual values
const example = {
  "adsManagerOrderLineId": null,
  "agencyLink": null,
  "billingContactEmail": null,
  "billingContactFirstname": null,
  "billingContactLastname": null,
  "budgetAmount": null,
  "endDate": null,
  "mediaContactEmail": null,
  "mediaContactFirstname": null,
  "mediaContactLastname": null,
  "oracleLineId": null,
  "poNumber": null,
  "salesforceOrderId": null,
  "salesforceOrderLineId": null,
  "startDate": null,
  "userEmail": null,
} satisfies SSIOInsertionOrderUpdate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SSIOInsertionOrderUpdate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



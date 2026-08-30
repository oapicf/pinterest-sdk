
# SSIOInsertionOrderCreate

Resource create operation model.

## Properties

Name | Type
------------ | -------------
`acceptedTermsId` | string
`acceptedTermsTime` | number
`agencyLink` | string
`billingContactEmail` | string
`billingContactFirstname` | string
`billingContactLastname` | string
`billtoBillingAddressId` | string
`billtoBusinessAddressId` | string
`billtoCompanyId` | string
`budgetAmount` | number
`currencyInfo` | [Currency](Currency.md)
`endDate` | string
`estimatedMonthlySpend` | number
`mediaContactEmail` | string
`mediaContactFirstname` | string
`mediaContactLastname` | string
`orderLineType` | [SSIOOrderLineType](SSIOOrderLineType.md)
`orderName` | string
`pmpId` | string
`poNumber` | string
`startDate` | string
`userEmail` | string

## Example

```typescript
import type { SSIOInsertionOrderCreate } from ''

// TODO: Update the object below with actual values
const example = {
  "acceptedTermsId": null,
  "acceptedTermsTime": null,
  "agencyLink": null,
  "billingContactEmail": null,
  "billingContactFirstname": null,
  "billingContactLastname": null,
  "billtoBillingAddressId": null,
  "billtoBusinessAddressId": null,
  "billtoCompanyId": null,
  "budgetAmount": null,
  "currencyInfo": null,
  "endDate": null,
  "estimatedMonthlySpend": null,
  "mediaContactEmail": null,
  "mediaContactFirstname": null,
  "mediaContactLastname": null,
  "orderLineType": null,
  "orderName": null,
  "pmpId": null,
  "poNumber": null,
  "startDate": null,
  "userEmail": null,
} satisfies SSIOInsertionOrderCreate

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SSIOInsertionOrderCreate
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)



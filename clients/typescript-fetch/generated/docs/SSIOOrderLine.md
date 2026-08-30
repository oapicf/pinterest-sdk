
# SSIOOrderLine

A Salesforce SSIO order line.

## Properties

Name | Type
------------ | -------------
`acceptedTermsId` | string
`acceptedTermsTime` | string
`adsManagerOrderLineId` | string
`agencyLink` | string
`billToCompanyName` | string
`billingContactEmail` | string
`billingContactFirstname` | string
`billingContactLastname` | string
`budgetAmount` | number
`currencyInfo` | [Currency](Currency.md)
`endDate` | Date
`estimatedMonthlySpend` | number
`lastModifiedDateTime` | string
`mediaContactEmail` | string
`mediaContactFirstname` | string
`mediaContactLastname` | string
`orderName` | string
`pinOrderId` | string
`pmpName` | string
`poNumber` | string
`salesforceOrderLineId` | string
`startDate` | Date

## Example

```typescript
import type { SSIOOrderLine } from ''

// TODO: Update the object below with actual values
const example = {
  "acceptedTermsId": null,
  "acceptedTermsTime": 2020-10-06T13:07:04.000Z,
  "adsManagerOrderLineId": null,
  "agencyLink": ,
  "billToCompanyName": Home Depot Inc.,
  "billingContactEmail": mail@test.com,
  "billingContactFirstname": Mary,
  "billingContactLastname": Smith,
  "budgetAmount": 5000000,
  "currencyInfo": null,
  "endDate": null,
  "estimatedMonthlySpend": null,
  "lastModifiedDateTime": 2020-10-06T13:07:04.000Z,
  "mediaContactEmail": mail@test.com,
  "mediaContactFirstname": John,
  "mediaContactLastname": Doe,
  "orderName": null,
  "pinOrderId": null,
  "pmpName": null,
  "poNumber": null,
  "salesforceOrderLineId": null,
  "startDate": null,
} satisfies SSIOOrderLine

console.log(example)

// Convert the instance to a JSON string
const exampleJSON: string = JSON.stringify(example)
console.log(exampleJSON)

// Parse the JSON string back to an object
const exampleParsed = JSON.parse(exampleJSON) as SSIOOrderLine
console.log(exampleParsed)
```

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


